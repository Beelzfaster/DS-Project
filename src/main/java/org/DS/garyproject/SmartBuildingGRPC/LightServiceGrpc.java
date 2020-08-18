package org.DS.garyproject.SmartBuildingGRPC;

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

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Light.proto")
public final class LightServiceGrpc {

  private LightServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartBuildingGRPC.LightService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.Empty,
      org.DS.garyproject.SmartBuildingGRPC.lightResponse> getInitialDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialDevice",
      requestType = org.DS.garyproject.SmartBuildingGRPC.Empty.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.lightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.Empty,
      org.DS.garyproject.SmartBuildingGRPC.lightResponse> getInitialDeviceMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.Empty, org.DS.garyproject.SmartBuildingGRPC.lightResponse> getInitialDeviceMethod;
    if ((getInitialDeviceMethod = LightServiceGrpc.getInitialDeviceMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getInitialDeviceMethod = LightServiceGrpc.getInitialDeviceMethod) == null) {
          LightServiceGrpc.getInitialDeviceMethod = getInitialDeviceMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.Empty, org.DS.garyproject.SmartBuildingGRPC.lightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.LightService", "initialDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.lightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("initialDevice"))
                  .build();
          }
        }
     }
     return getInitialDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest,
      org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeBrightnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeBrightness",
      requestType = org.DS.garyproject.SmartBuildingGRPC.valueRequest.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest,
      org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeBrightnessMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest, org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeBrightnessMethod;
    if ((getChangeBrightnessMethod = LightServiceGrpc.getChangeBrightnessMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getChangeBrightnessMethod = LightServiceGrpc.getChangeBrightnessMethod) == null) {
          LightServiceGrpc.getChangeBrightnessMethod = getChangeBrightnessMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.valueRequest, org.DS.garyproject.SmartBuildingGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.LightService", "changeBrightness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("changeBrightness"))
                  .build();
          }
        }
     }
     return getChangeBrightnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.booleanRequest,
      org.DS.garyproject.SmartBuildingGRPC.booleanResponse> getOnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "onOff",
      requestType = org.DS.garyproject.SmartBuildingGRPC.booleanRequest.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.booleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.booleanRequest,
      org.DS.garyproject.SmartBuildingGRPC.booleanResponse> getOnOffMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.booleanRequest, org.DS.garyproject.SmartBuildingGRPC.booleanResponse> getOnOffMethod;
    if ((getOnOffMethod = LightServiceGrpc.getOnOffMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getOnOffMethod = LightServiceGrpc.getOnOffMethod) == null) {
          LightServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.booleanRequest, org.DS.garyproject.SmartBuildingGRPC.booleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.LightService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.booleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.booleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.stringRequest,
      org.DS.garyproject.SmartBuildingGRPC.stringResponse> getChangeDeviceNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeDeviceName",
      requestType = org.DS.garyproject.SmartBuildingGRPC.stringRequest.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.stringRequest,
      org.DS.garyproject.SmartBuildingGRPC.stringResponse> getChangeDeviceNameMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.stringRequest, org.DS.garyproject.SmartBuildingGRPC.stringResponse> getChangeDeviceNameMethod;
    if ((getChangeDeviceNameMethod = LightServiceGrpc.getChangeDeviceNameMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getChangeDeviceNameMethod = LightServiceGrpc.getChangeDeviceNameMethod) == null) {
          LightServiceGrpc.getChangeDeviceNameMethod = getChangeDeviceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.stringRequest, org.DS.garyproject.SmartBuildingGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.LightService", "changeDeviceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("changeDeviceName"))
                  .build();
          }
        }
     }
     return getChangeDeviceNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightServiceStub newStub(io.grpc.Channel channel) {
    return new LightServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LightServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LightServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LightServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialDevice(org.DS.garyproject.SmartBuildingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.lightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialDeviceMethod(), responseObserver);
    }

    /**
     */
    public void changeBrightness(org.DS.garyproject.SmartBuildingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeBrightnessMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.garyproject.SmartBuildingGRPC.booleanRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.booleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changeDeviceName(org.DS.garyproject.SmartBuildingGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.stringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeDeviceNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.Empty,
                org.DS.garyproject.SmartBuildingGRPC.lightResponse>(
                  this, METHODID_INITIAL_DEVICE)))
          .addMethod(
            getChangeBrightnessMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.valueRequest,
                org.DS.garyproject.SmartBuildingGRPC.valueResponse>(
                  this, METHODID_CHANGE_BRIGHTNESS)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.booleanRequest,
                org.DS.garyproject.SmartBuildingGRPC.booleanResponse>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangeDeviceNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.stringRequest,
                org.DS.garyproject.SmartBuildingGRPC.stringResponse>(
                  this, METHODID_CHANGE_DEVICE_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class LightServiceStub extends io.grpc.stub.AbstractStub<LightServiceStub> {
    private LightServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialDevice(org.DS.garyproject.SmartBuildingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.lightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeBrightness(org.DS.garyproject.SmartBuildingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeBrightnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onOff(org.DS.garyproject.SmartBuildingGRPC.booleanRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.booleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeDeviceName(org.DS.garyproject.SmartBuildingGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.stringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeDeviceNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LightServiceBlockingStub extends io.grpc.stub.AbstractStub<LightServiceBlockingStub> {
    private LightServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.garyproject.SmartBuildingGRPC.lightResponse initialDevice(org.DS.garyproject.SmartBuildingGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.garyproject.SmartBuildingGRPC.valueResponse> changeBrightness(
        org.DS.garyproject.SmartBuildingGRPC.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeBrightnessMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.garyproject.SmartBuildingGRPC.booleanResponse onOff(org.DS.garyproject.SmartBuildingGRPC.booleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.garyproject.SmartBuildingGRPC.stringResponse changeDeviceName(org.DS.garyproject.SmartBuildingGRPC.stringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeDeviceNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LightServiceFutureStub extends io.grpc.stub.AbstractStub<LightServiceFutureStub> {
    private LightServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.garyproject.SmartBuildingGRPC.lightResponse> initialDevice(
        org.DS.garyproject.SmartBuildingGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.garyproject.SmartBuildingGRPC.booleanResponse> onOff(
        org.DS.garyproject.SmartBuildingGRPC.booleanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.garyproject.SmartBuildingGRPC.stringResponse> changeDeviceName(
        org.DS.garyproject.SmartBuildingGRPC.stringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeDeviceNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_DEVICE = 0;
  private static final int METHODID_CHANGE_BRIGHTNESS = 1;
  private static final int METHODID_ON_OFF = 2;
  private static final int METHODID_CHANGE_DEVICE_NAME = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LightServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LightServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_DEVICE:
          serviceImpl.initialDevice((org.DS.garyproject.SmartBuildingGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.lightResponse>) responseObserver);
          break;
        case METHODID_CHANGE_BRIGHTNESS:
          serviceImpl.changeBrightness((org.DS.garyproject.SmartBuildingGRPC.valueRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.garyproject.SmartBuildingGRPC.booleanRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.booleanResponse>) responseObserver);
          break;
        case METHODID_CHANGE_DEVICE_NAME:
          serviceImpl.changeDeviceName((org.DS.garyproject.SmartBuildingGRPC.stringRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.stringResponse>) responseObserver);
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

  private static abstract class LightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.garyproject.SmartBuildingGRPC.LightServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightService");
    }
  }

  private static final class LightServiceFileDescriptorSupplier
      extends LightServiceBaseDescriptorSupplier {
    LightServiceFileDescriptorSupplier() {}
  }

  private static final class LightServiceMethodDescriptorSupplier
      extends LightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightServiceFileDescriptorSupplier())
              .addMethod(getInitialDeviceMethod())
              .addMethod(getChangeBrightnessMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeDeviceNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
