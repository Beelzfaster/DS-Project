package GRPC;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import org.DS.garyproject.SmartBuildingGRPC.Empty;
import org.DS.garyproject.SmartBuildingGRPC.HeatingServiceGrpc.HeatingServiceImplBase;
import org.DS.garyproject.SmartBuildingGRPC.booleanRequest;
import org.DS.garyproject.SmartBuildingGRPC.booleanResponse;
import org.DS.garyproject.SmartBuildingGRPC.heatingResponse;
import org.DS.garyproject.SmartBuildingGRPC.stringRequest;
import org.DS.garyproject.SmartBuildingGRPC.stringResponse;
import org.DS.garyproject.SmartBuildingGRPC.valueRequest;
import org.DS.garyproject.SmartBuildingGRPC.valueResponse;

import io.grpc.stub.StreamObserver;

import com.google.protobuf.Int32ValueOrBuilder;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import Models.Heating;

public class HeatingServer extends HeatingServiceImplBase{
	private static final Logger logger = Logger.getLogger(HeatingServer.class.getName());
	public Heating myHeating = new Heating();
	public static int heatingPort;
	
	private static class SampleListener implements ServiceListener {

		public void serviceAdded(ServiceEvent event) {
			System.out.println("Service added: " + event.getInfo());

		}

		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Service removed: " + event.getInfo());
		}

		public void serviceResolved(ServiceEvent event) {
			System.out.println("Service resolved: " + event.getInfo());
			System.out.println("Get Name: " + event.getName() + " PORT: " + event.getInfo().getPort());

			// Start GRPC server with discovered device
			if (event.getName().equals("Heating")) {
				System.out.println("Found Heating port: " + event.getInfo().getPort());
				try {
					heatingPort = event.getInfo().getPort();
					startGRPC(event.getInfo().getPort());
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		startDiscovery();
	}

	public static void startDiscovery() throws IOException, InterruptedException {
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			// Add a service listener
			jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
			System.out.println("Listening");
			// Wait a bit
			Thread.sleep(30000);
		} 
		catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void startGRPC(int portNumber) throws IOException, InterruptedException {
		HeatingServer heatingServer = new HeatingServer();
		Server server = ServerBuilder.forPort(portNumber).addService(heatingServer).build().start();

		logger.info("Heating Server started, listening on " + portNumber);

		server.awaitTermination();
	}

	@Override
	public void initialAppliance(Empty request, StreamObserver<heatingResponse> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Receiving initial appliance request for TV ");
		String status;
		
		if(myHeating.isOn()) {
			status = "On";
		}
		else {
			status = "Off";
		}
		
		String aName = myHeating.getApplianceName();
		String aStatus = status;
		Integer aTemperature = myHeating.getTemperature();
		Integer aSpeed = myHeating.getSpeed();
		
		heatingResponse response = heatingResponse.newBuilder().setAname(aName).setStatus(aStatus).setTemperature(aTemperature).setSpeed(aSpeed).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
	}

	@Override
	public void changeTemperature(valueRequest request, StreamObserver<valueResponse> responseObserver) {
		// TODO Auto-generated method stub
		int currentTemperature = myHeating.getTemperature();
		int temperature = request.getLength();
		int newTemperature = currentTemperature + temperature;
		
		System.out.println("Receiving new temperature for Heating: " + temperature);
		if(newTemperature<=35 && newTemperature >= 0) {
			myHeating.setTemperature(newTemperature);
			valueResponse response = valueResponse.newBuilder().setLength(myHeating.getTemperature()).build();
			
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
		else {
			valueResponse response = valueResponse.newBuilder().setLength(myHeating.getTemperature()).build();
			
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
		
	}

	@Override
	public void changeSpeed(valueRequest request, StreamObserver<valueResponse> responseObserver) {
		// TODO Auto-generated method stub
		int currentSpeed = myHeating.getSpeed();
		int speed = request.getLength();
		int newSpeed = currentSpeed + speed;
		
		System.out.println("Receiving fan speed for Heating: " + speed);
		if(newSpeed <= 10 && newSpeed >= 1) {
			myHeating.setSpeed(newSpeed);
		}
		else {
			valueResponse response = valueResponse.newBuilder().setLength(myHeating.getSpeed()).build();
			
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
		
	}

	@Override
	public void onOff(booleanRequest request, StreamObserver<booleanResponse> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Receiving information about On/Off for Heating");
		Boolean onOff = request.getMsg();
		myHeating.setOn(onOff);
		
		//print out
		booleanResponse response = booleanResponse.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeApplianceName(stringRequest request, StreamObserver<stringResponse> responseObserver) {
		// TODO Auto-generated method stub
		String name = request.getText();
		System.out.println("Changing projector name to "+name);

		myHeating.setApplianceName(name);
		 
		stringResponse response = stringResponse.newBuilder().setText(name).build();
		System.out.println("Response "+response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	 public StreamObserver<stringRequest> changeDeviceNameStream(final StreamObserver<stringResponse> responseObserver){
		return new StreamObserver<stringRequest>() {

			@Override
			public void onNext(stringRequest value) {
				// TODO Auto-generated method stub
				System.out.println("Next text value " + value.getText());
				stringResponse resp = stringResponse.newBuilder().setText(value.getText()).build();
				responseObserver.onNext(resp);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				responseObserver.onCompleted();
			}
			
		};
		 
	 }
	
}
