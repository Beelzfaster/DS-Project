package SmartBuildingGRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import org.DS.garyproject.SmartBuildingGRPC.Empty;
import org.DS.garyproject.SmartBuildingGRPC.booleanRequest;
import org.DS.garyproject.SmartBuildingGRPC.booleanResponse;
import org.DS.garyproject.SmartBuildingGRPC.cameraResponse;
import org.DS.garyproject.SmartBuildingGRPC.stringRequest;
import org.DS.garyproject.SmartBuildingGRPC.stringResponse;
import org.DS.garyproject.SmartBuildingGRPC.valueRequest;
import org.DS.garyproject.SmartBuildingGRPC.valueResponse;

import io.grpc.stub.StreamObserver;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Securitycamera.proto")
public final class SecuritycameraServiceGrpc {

  private SecuritycameraServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartBuildingGRPC.SecuritycameraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.Empty,
      SmartBuildingGRPC.Securitycamera.cameraResponse> getInitialApplianceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialAppliance",
      requestType = SmartBuildingGRPC.Securitycamera.Empty.class,
      responseType = SmartBuildingGRPC.Securitycamera.cameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.Empty,
      SmartBuildingGRPC.Securitycamera.cameraResponse> getInitialApplianceMethod() {
    io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.Empty, SmartBuildingGRPC.Securitycamera.cameraResponse> getInitialApplianceMethod;
    if ((getInitialApplianceMethod = SecuritycameraServiceGrpc.getInitialApplianceMethod) == null) {
      synchronized (SecuritycameraServiceGrpc.class) {
        if ((getInitialApplianceMethod = SecuritycameraServiceGrpc.getInitialApplianceMethod) == null) {
          SecuritycameraServiceGrpc.getInitialApplianceMethod = getInitialApplianceMethod = 
              io.grpc.MethodDescriptor.<SmartBuildingGRPC.Securitycamera.Empty, SmartBuildingGRPC.Securitycamera.cameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.SecuritycameraService", "initialAppliance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuildingGRPC.Securitycamera.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuildingGRPC.Securitycamera.cameraResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecuritycameraServiceMethodDescriptorSupplier("initialAppliance"))
                  .build();
          }
        }
     }
     return getInitialApplianceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.valueRequest,
      SmartBuildingGRPC.Securitycamera.valueResponse> getChangeCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeCamera",
      requestType = SmartBuildingGRPC.Securitycamera.valueRequest.class,
      responseType = SmartBuildingGRPC.Securitycamera.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.valueRequest,
      SmartBuildingGRPC.Securitycamera.valueResponse> getChangeCameraMethod() {
    io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.valueRequest, SmartBuildingGRPC.Securitycamera.valueResponse> getChangeCameraMethod;
    if ((getChangeCameraMethod = SecuritycameraServiceGrpc.getChangeCameraMethod) == null) {
      synchronized (SecuritycameraServiceGrpc.class) {
        if ((getChangeCameraMethod = SecuritycameraServiceGrpc.getChangeCameraMethod) == null) {
          SecuritycameraServiceGrpc.getChangeCameraMethod = getChangeCameraMethod = 
              io.grpc.MethodDescriptor.<SmartBuildingGRPC.Securitycamera.valueRequest, SmartBuildingGRPC.Securitycamera.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.SecuritycameraService", "changeCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuildingGRPC.Securitycamera.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuildingGRPC.Securitycamera.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecuritycameraServiceMethodDescriptorSupplier("changeCamera"))
                  .build();
          }
        }
     }
     return getChangeCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.valueRequest,
      SmartBuildingGRPC.Securitycamera.valueResponse> getChangeVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeVolume",
      requestType = SmartBuildingGRPC.Securitycamera.valueRequest.class,
      responseType = SmartBuildingGRPC.Securitycamera.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.valueRequest,
      SmartBuildingGRPC.Securitycamera.valueResponse> getChangeVolumeMethod() {
    io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.valueRequest, SmartBuildingGRPC.Securitycamera.valueResponse> getChangeVolumeMethod;
    if ((getChangeVolumeMethod = SecuritycameraServiceGrpc.getChangeVolumeMethod) == null) {
      synchronized (SecuritycameraServiceGrpc.class) {
        if ((getChangeVolumeMethod = SecuritycameraServiceGrpc.getChangeVolumeMethod) == null) {
          SecuritycameraServiceGrpc.getChangeVolumeMethod = getChangeVolumeMethod = 
              io.grpc.MethodDescriptor.<SmartBuildingGRPC.Securitycamera.valueRequest, SmartBuildingGRPC.Securitycamera.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.SecuritycameraService", "changeVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuildingGRPC.Securitycamera.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuildingGRPC.Securitycamera.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecuritycameraServiceMethodDescriptorSupplier("changeVolume"))
                  .build();
          }
        }
     }
     return getChangeVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.booleanRequest,
      SmartBuildingGRPC.Securitycamera.booleanResponse> getOnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "onOff",
      requestType = SmartBuildingGRPC.Securitycamera.booleanRequest.class,
      responseType = SmartBuildingGRPC.Securitycamera.booleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.booleanRequest,
      SmartBuildingGRPC.Securitycamera.booleanResponse> getOnOffMethod() {
    io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.booleanRequest, SmartBuildingGRPC.Securitycamera.booleanResponse> getOnOffMethod;
    if ((getOnOffMethod = SecuritycameraServiceGrpc.getOnOffMethod) == null) {
      synchronized (SecuritycameraServiceGrpc.class) {
        if ((getOnOffMethod = SecuritycameraServiceGrpc.getOnOffMethod) == null) {
          SecuritycameraServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<SmartBuildingGRPC.Securitycamera.booleanRequest, SmartBuildingGRPC.Securitycamera.booleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.SecuritycameraService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuildingGRPC.Securitycamera.booleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuildingGRPC.Securitycamera.booleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecuritycameraServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.stringRequest,
      SmartBuildingGRPC.Securitycamera.stringResponse> getChangeApplianceNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeApplianceName",
      requestType = SmartBuildingGRPC.Securitycamera.stringRequest.class,
      responseType = SmartBuildingGRPC.Securitycamera.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.stringRequest,
      SmartBuildingGRPC.Securitycamera.stringResponse> getChangeApplianceNameMethod() {
    io.grpc.MethodDescriptor<SmartBuildingGRPC.Securitycamera.stringRequest, SmartBuildingGRPC.Securitycamera.stringResponse> getChangeApplianceNameMethod;
    if ((getChangeApplianceNameMethod = SecuritycameraServiceGrpc.getChangeApplianceNameMethod) == null) {
      synchronized (SecuritycameraServiceGrpc.class) {
        if ((getChangeApplianceNameMethod = SecuritycameraServiceGrpc.getChangeApplianceNameMethod) == null) {
          SecuritycameraServiceGrpc.getChangeApplianceNameMethod = getChangeApplianceNameMethod = 
              io.grpc.MethodDescriptor.<SmartBuildingGRPC.Securitycamera.stringRequest, SmartBuildingGRPC.Securitycamera.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.SecuritycameraService", "changeApplianceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuildingGRPC.Securitycamera.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SmartBuildingGRPC.Securitycamera.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecuritycameraServiceMethodDescriptorSupplier("changeApplianceName"))
                  .build();
          }
        }
     }
     return getChangeApplianceNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecuritycameraServiceStub newStub(io.grpc.Channel channel) {
    return new SecuritycameraServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecuritycameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecuritycameraServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecuritycameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecuritycameraServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SecuritycameraServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialAppliance(SmartBuildingGRPC.Securitycamera.Empty request,
        io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.cameraResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialApplianceMethod(), responseObserver);
    }

    /**
     */
    public void changeCamera(SmartBuildingGRPC.Securitycamera.valueRequest request,
        io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeCameraMethod(), responseObserver);
    }

    /**
     */
    public void changeVolume(SmartBuildingGRPC.Securitycamera.valueRequest request,
        io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeVolumeMethod(), responseObserver);
    }

    /**
     */
    public void onOff(SmartBuildingGRPC.Securitycamera.booleanRequest request,
        io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.booleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changeApplianceName(SmartBuildingGRPC.Securitycamera.stringRequest request,
        io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.stringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeApplianceNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialApplianceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SmartBuildingGRPC.Securitycamera.Empty,
                SmartBuildingGRPC.Securitycamera.cameraResponse>(
                  this, METHODID_INITIAL_APPLIANCE)))
          .addMethod(
            getChangeCameraMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                SmartBuildingGRPC.Securitycamera.valueRequest,
                SmartBuildingGRPC.Securitycamera.valueResponse>(
                  this, METHODID_CHANGE_CAMERA)))
          .addMethod(
            getChangeVolumeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                SmartBuildingGRPC.Securitycamera.valueRequest,
                SmartBuildingGRPC.Securitycamera.valueResponse>(
                  this, METHODID_CHANGE_VOLUME)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SmartBuildingGRPC.Securitycamera.booleanRequest,
                SmartBuildingGRPC.Securitycamera.booleanResponse>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangeApplianceNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SmartBuildingGRPC.Securitycamera.stringRequest,
                SmartBuildingGRPC.Securitycamera.stringResponse>(
                  this, METHODID_CHANGE_APPLIANCE_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class SecuritycameraServiceStub extends io.grpc.stub.AbstractStub<SecuritycameraServiceStub> {
    private SecuritycameraServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecuritycameraServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritycameraServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecuritycameraServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialAppliance(SmartBuildingGRPC.Securitycamera.Empty request,
        io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.cameraResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialApplianceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeCamera(SmartBuildingGRPC.Securitycamera.valueRequest request,
        io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeCameraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeVolume(SmartBuildingGRPC.Securitycamera.valueRequest request,
        io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onOff(SmartBuildingGRPC.Securitycamera.booleanRequest request,
        io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.booleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeApplianceName(SmartBuildingGRPC.Securitycamera.stringRequest request,
        io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.stringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeApplianceNameMethod(), getCallOptions()), request, responseObserver);
    }

	public void changeVolume(valueRequest req, StreamObserver<valueResponse> response) {
		// TODO Auto-generated method stub
		
	}

	public void changeCamera(stringRequest req, StreamObserver<stringResponse> response) {
		// TODO Auto-generated method stub
		
	}
  }

  /**
   */
  public static final class SecuritycameraServiceBlockingStub extends io.grpc.stub.AbstractStub<SecuritycameraServiceBlockingStub> {
    private SecuritycameraServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecuritycameraServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritycameraServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecuritycameraServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public SmartBuildingGRPC.Securitycamera.cameraResponse initialAppliance(SmartBuildingGRPC.Securitycamera.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialApplianceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<SmartBuildingGRPC.Securitycamera.valueResponse> changeCamera(
        SmartBuildingGRPC.Securitycamera.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeCameraMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<SmartBuildingGRPC.Securitycamera.valueResponse> changeVolume(
        SmartBuildingGRPC.Securitycamera.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public SmartBuildingGRPC.Securitycamera.booleanResponse onOff(SmartBuildingGRPC.Securitycamera.booleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public SmartBuildingGRPC.Securitycamera.stringResponse changeApplianceName(SmartBuildingGRPC.Securitycamera.stringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeApplianceNameMethod(), getCallOptions(), request);
    }

	public cameraResponse initialAppliance(Empty req) {
		// TODO Auto-generated method stub
		return null;
	}

	public booleanResponse onOff(booleanRequest req) {
		// TODO Auto-generated method stub
		return null;
	}
  }

  /**
   */
  public static final class SecuritycameraServiceFutureStub extends io.grpc.stub.AbstractStub<SecuritycameraServiceFutureStub> {
    private SecuritycameraServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecuritycameraServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecuritycameraServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecuritycameraServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SmartBuildingGRPC.Securitycamera.cameraResponse> initialAppliance(
        SmartBuildingGRPC.Securitycamera.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialApplianceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SmartBuildingGRPC.Securitycamera.booleanResponse> onOff(
        SmartBuildingGRPC.Securitycamera.booleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SmartBuildingGRPC.Securitycamera.stringResponse> changeApplianceName(
        SmartBuildingGRPC.Securitycamera.stringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeApplianceNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_APPLIANCE = 0;
  private static final int METHODID_CHANGE_CAMERA = 1;
  private static final int METHODID_CHANGE_VOLUME = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_APPLIANCE_NAME = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecuritycameraServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecuritycameraServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_APPLIANCE:
          serviceImpl.initialAppliance((SmartBuildingGRPC.Securitycamera.Empty) request,
              (io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.cameraResponse>) responseObserver);
          break;
        case METHODID_CHANGE_CAMERA:
          serviceImpl.changeCamera((SmartBuildingGRPC.Securitycamera.valueRequest) request,
              (io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.valueResponse>) responseObserver);
          break;
        case METHODID_CHANGE_VOLUME:
          serviceImpl.changeVolume((SmartBuildingGRPC.Securitycamera.valueRequest) request,
              (io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.valueResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((SmartBuildingGRPC.Securitycamera.booleanRequest) request,
              (io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.booleanResponse>) responseObserver);
          break;
        case METHODID_CHANGE_APPLIANCE_NAME:
          serviceImpl.changeApplianceName((SmartBuildingGRPC.Securitycamera.stringRequest) request,
              (io.grpc.stub.StreamObserver<SmartBuildingGRPC.Securitycamera.stringResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SecuritycameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecuritycameraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SmartBuildingGRPC.Securitycamera.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecuritycameraService");
    }
  }

  private static final class SecuritycameraServiceFileDescriptorSupplier
      extends SecuritycameraServiceBaseDescriptorSupplier {
    SecuritycameraServiceFileDescriptorSupplier() {}
  }

  private static final class SecuritycameraServiceMethodDescriptorSupplier
      extends SecuritycameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecuritycameraServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SecuritycameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecuritycameraServiceFileDescriptorSupplier())
              .addMethod(getInitialApplianceMethod())
              .addMethod(getChangeCameraMethod())
              .addMethod(getChangeVolumeMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeApplianceNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
