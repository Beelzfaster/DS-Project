package GRPC;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import org.DS.garyproject.SmartBuildingGRPC.Empty;
import org.DS.garyproject.SmartBuildingGRPC.LightServiceGrpc.LightServiceImplBase;
import org.DS.garyproject.SmartBuildingGRPC.booleanRequest;
import org.DS.garyproject.SmartBuildingGRPC.booleanResponse;
import org.DS.garyproject.SmartBuildingGRPC.lightResponse;
import org.DS.garyproject.SmartBuildingGRPC.stringRequest;
import org.DS.garyproject.SmartBuildingGRPC.stringResponse;
import org.DS.garyproject.SmartBuildingGRPC.valueRequest;
import org.DS.garyproject.SmartBuildingGRPC.valueResponse;

import io.grpc.stub.StreamObserver;

import com.google.protobuf.Int32ValueOrBuilder;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import Models.Light;

public class LightServer extends LightServiceImplBase{
	private static final Logger logger = Logger.getLogger(LightServer.class.getName());
	public Light myLight = new Light();
	public static int lightPort;

	@Override
	public void initialAppliance(Empty request, StreamObserver<lightResponse> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Receiving initial appliance request for Lights");
		String status;
		
		if(myLight.isOn()) {
			  status ="On";
		}
		else {
			  status ="Off";

		}
		String aName = myLight.getApplianceName();
		String aStatus = status;
		Integer aBrightness = myLight.getBrightness();
		
		//print out
		lightResponse response = lightResponse.newBuilder().setAname(aName).setStatus(aStatus).setBrightness(aBrightness).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void changeBrightness(valueRequest request, StreamObserver<valueResponse> responseObserver) {//start changeBrightness method
		// TODO Auto-generated method stub
		int currentBrightness= myLight.getBrightness();
		int changeBrightness = request.getLength();
		
		System.out.println("Receiving new brightness for lights");
		int newBrightness = currentBrightness + changeBrightness;
		if(newBrightness > 100 || newBrightness < 0 ) {//start if
			System.out.println("Brightness cannot exceed 100 or be less than 0: " + newBrightness);
			System.out.println("The current brightness is set to: " + myLight.getBrightness());
			
			//print out
			valueResponse response = valueResponse.newBuilder().setLength(myLight.getBrightness()).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}//end if
		else {//start else
			System.out.println("The updated brightness level is: " + newBrightness);
			myLight.setBrightness(newBrightness);
			
			//print out
			valueResponse response = valueResponse.newBuilder().setLength(newBrightness).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}//end else
		
	}//end changeBrightness method

	@Override
	public void onOff(booleanRequest request, StreamObserver<booleanResponse> responseObserver) {//start onOff method
		// TODO Auto-generated method stub
		System.out.println("Receiving information about On/Off for Lights");
		Boolean onOff = request.getMsg();
		myLight.setOn(onOff);
		
		//print out
		booleanResponse response = booleanResponse.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}//end onOff method

	@Override
	public void changeApplianceName(stringRequest request, StreamObserver<stringResponse> responseObserver) {
		// TODO Auto-generated method stub
		String name = request.getText();
		System.out.println("Changing lamp name to "+name);

		myLight.setApplianceName(name);
		 
		stringResponse response = stringResponse.newBuilder().setText(name).build();
		System.out.println("Response "+response.getText());
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
	

}
