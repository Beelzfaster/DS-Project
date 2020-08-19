package GRPC;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import org.DS.garyproject.SmartBuildingGRPC.Empty;
import org.DS.garyproject.SmartBuildingGRPC.ProjectorServiceGrpc.ProjectorServiceImplBase;
import org.DS.garyproject.SmartBuildingGRPC.booleanRequest;
import org.DS.garyproject.SmartBuildingGRPC.booleanResponse;
import org.DS.garyproject.SmartBuildingGRPC.projectorResponse;
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
import Models.Projector;

import io.grpc.stub.StreamObserver;

public class ProjectorServer extends ProjectorServiceImplBase{
	
	private static final Logger logger = Logger.getLogger(HeatingServer.class.getName());
	public Projector myProjector = new Projector();
	public static int projectorPort;
	
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
			if (event.getName().equals("Projector")) {
				System.out.println("Found Projector port: " + event.getInfo().getPort());
				try {
					projectorPort = event.getInfo().getPort();
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
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void startGRPC(int portNumber) throws IOException, InterruptedException {
		ProjectorServer projectorServer = new ProjectorServer();
		Server server = ServerBuilder.forPort(portNumber).addService(projectorServer).build().start();

		logger.info("ProjectorServer started, listening on " + portNumber);

		server.awaitTermination();
	}
	
	

	@Override
	public void initialAppliance(Empty request, StreamObserver<projectorResponse> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Receiving initial appliance request for Projector ");
		String status;
		
		if(myProjector.isOn()) {
			status = "On";
		}
		else {
			status = "Off";
		}
		String aName = myProjector.getApplianceName();
		String aStatus = status;
		Integer aVolume = myProjector.getVolume();
		Integer aChannel = myProjector.getChannel();
		
		projectorResponse response = projectorResponse.newBuilder().setAname(aName).setStatus(aStatus).setVolume(aVolume).setChannel(aChannel).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeVolume(valueRequest request, StreamObserver<valueResponse> responseObserver) {
		// TODO Auto-generated method stub
		int currentVolume = myProjector.getVolume();
		int volume = request.getLength();
		int newVolume = currentVolume + volume;
		
		System.out.println("Receiving volume for Projector: " + volume);
		
		if(newVolume <= 100 && newVolume >= 0) {
			myProjector.setVolume(newVolume);
			valueResponse response = valueResponse.newBuilder().setLength(myProjector.getVolume()).build();
			
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
		else {
			valueResponse response = valueResponse.newBuilder().setLength(myProjector.getVolume()).build();
			
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
		
	}

	@Override
	public void changeChannel(valueRequest request, StreamObserver<valueResponse> responseObserver) {
		// TODO Auto-generated method stub
		int currentChannel = myProjector.getChannel();
		int channel = request.getLength();
		int newChannel = currentChannel + channel;
		
		if(newChannel <= 30 && newChannel >= 1) {
			myProjector.setChannel(newChannel);
		}
		else {
			valueResponse response = valueResponse.newBuilder().setLength(myProjector.getChannel()).build();
			
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
		
	}

	@Override
	public void onOff(booleanRequest request, StreamObserver<booleanResponse> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Receiving information about On/Off for Projector");
		Boolean onOff = request.getMsg();
		myProjector.setOn(onOff);
		
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

		myProjector.setApplianceName(name);
		 
		stringResponse response = stringResponse.newBuilder().setText(name).build();
		System.out.println("Response "+response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}


}
