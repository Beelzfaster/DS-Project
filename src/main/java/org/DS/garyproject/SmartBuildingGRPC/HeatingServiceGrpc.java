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
    comments = "Source: Heating.proto")
public final class HeatingServiceGrpc {

  private HeatingServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartBuildingGRPC.HeatingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.Empty,
      org.DS.garyproject.SmartBuildingGRPC.heatingResponse> getInitialApplianceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialAppliance",
      requestType = org.DS.garyproject.SmartBuildingGRPC.Empty.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.heatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.Empty,
      org.DS.garyproject.SmartBuildingGRPC.heatingResponse> getInitialApplianceMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.Empty, org.DS.garyproject.SmartBuildingGRPC.heatingResponse> getInitialApplianceMethod;
    if ((getInitialApplianceMethod = HeatingServiceGrpc.getInitialApplianceMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getInitialApplianceMethod = HeatingServiceGrpc.getInitialApplianceMethod) == null) {
          HeatingServiceGrpc.getInitialApplianceMethod = getInitialApplianceMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.Empty, org.DS.garyproject.SmartBuildingGRPC.heatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "initialAppliance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.heatingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("initialAppliance"))
                  .build();
          }
        }
     }
     return getInitialApplianceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest,
      org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeTemperature",
      requestType = org.DS.garyproject.SmartBuildingGRPC.valueRequest.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest,
      org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeTemperatureMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest, org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeTemperatureMethod;
    if ((getChangeTemperatureMethod = HeatingServiceGrpc.getChangeTemperatureMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getChangeTemperatureMethod = HeatingServiceGrpc.getChangeTemperatureMethod) == null) {
          HeatingServiceGrpc.getChangeTemperatureMethod = getChangeTemperatureMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.valueRequest, org.DS.garyproject.SmartBuildingGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "changeTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("changeTemperature"))
                  .build();
          }
        }
     }
     return getChangeTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest,
      org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeSpeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeSpeed",
      requestType = org.DS.garyproject.SmartBuildingGRPC.valueRequest.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest,
      org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeSpeedMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest, org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeSpeedMethod;
    if ((getChangeSpeedMethod = HeatingServiceGrpc.getChangeSpeedMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getChangeSpeedMethod = HeatingServiceGrpc.getChangeSpeedMethod) == null) {
          HeatingServiceGrpc.getChangeSpeedMethod = getChangeSpeedMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.valueRequest, org.DS.garyproject.SmartBuildingGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "changeSpeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("changeSpeed"))
                  .build();
          }
        }
     }
     return getChangeSpeedMethod;
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
    if ((getOnOffMethod = HeatingServiceGrpc.getOnOffMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getOnOffMethod = HeatingServiceGrpc.getOnOffMethod) == null) {
          HeatingServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.booleanRequest, org.DS.garyproject.SmartBuildingGRPC.booleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.booleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.booleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.stringRequest,
      org.DS.garyproject.SmartBuildingGRPC.stringResponse> getChangeApplianceNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeApplianceName",
      requestType = org.DS.garyproject.SmartBuildingGRPC.stringRequest.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.stringRequest,
      org.DS.garyproject.SmartBuildingGRPC.stringResponse> getChangeApplianceNameMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.stringRequest, org.DS.garyproject.SmartBuildingGRPC.stringResponse> getChangeApplianceNameMethod;
    if ((getChangeApplianceNameMethod = HeatingServiceGrpc.getChangeApplianceNameMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getChangeApplianceNameMethod = HeatingServiceGrpc.getChangeApplianceNameMethod) == null) {
          HeatingServiceGrpc.getChangeApplianceNameMethod = getChangeApplianceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.stringRequest, org.DS.garyproject.SmartBuildingGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "changeApplianceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("changeApplianceName"))
                  .build();
          }
        }
     }
     return getChangeApplianceNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.stringRequest,
      org.DS.garyproject.SmartBuildingGRPC.stringResponse> getChangeApplianceNameStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeApplianceNameStream",
      requestType = org.DS.garyproject.SmartBuildingGRPC.stringRequest.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.stringRequest,
      org.DS.garyproject.SmartBuildingGRPC.stringResponse> getChangeApplianceNameStreamMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.stringRequest, org.DS.garyproject.SmartBuildingGRPC.stringResponse> getChangeApplianceNameStreamMethod;
    if ((getChangeApplianceNameStreamMethod = HeatingServiceGrpc.getChangeApplianceNameStreamMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getChangeApplianceNameStreamMethod = HeatingServiceGrpc.getChangeApplianceNameStreamMethod) == null) {
          HeatingServiceGrpc.getChangeApplianceNameStreamMethod = getChangeApplianceNameStreamMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.stringRequest, org.DS.garyproject.SmartBuildingGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "changeApplianceNameStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("changeApplianceNameStream"))
                  .build();
          }
        }
     }
     return getChangeApplianceNameStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeatingServiceStub newStub(io.grpc.Channel channel) {
    return new HeatingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeatingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeatingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeatingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeatingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HeatingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialAppliance(org.DS.garyproject.SmartBuildingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.heatingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialApplianceMethod(), responseObserver);
    }

    /**
     */
    public void changeTemperature(org.DS.garyproject.SmartBuildingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeTemperatureMethod(), responseObserver);
    }

    /**
     */
    public void changeSpeed(org.DS.garyproject.SmartBuildingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeSpeedMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.garyproject.SmartBuildingGRPC.booleanRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.booleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changeApplianceName(org.DS.garyproject.SmartBuildingGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.stringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeApplianceNameMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.stringRequest> changeApplianceNameStream(
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.stringResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChangeApplianceNameStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialApplianceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.Empty,
                org.DS.garyproject.SmartBuildingGRPC.heatingResponse>(
                  this, METHODID_INITIAL_APPLIANCE)))
          .addMethod(
            getChangeTemperatureMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.valueRequest,
                org.DS.garyproject.SmartBuildingGRPC.valueResponse>(
                  this, METHODID_CHANGE_TEMPERATURE)))
          .addMethod(
            getChangeSpeedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.valueRequest,
                org.DS.garyproject.SmartBuildingGRPC.valueResponse>(
                  this, METHODID_CHANGE_SPEED)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.booleanRequest,
                org.DS.garyproject.SmartBuildingGRPC.booleanResponse>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangeApplianceNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.stringRequest,
                org.DS.garyproject.SmartBuildingGRPC.stringResponse>(
                  this, METHODID_CHANGE_APPLIANCE_NAME)))
          .addMethod(
            getChangeApplianceNameStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.stringRequest,
                org.DS.garyproject.SmartBuildingGRPC.stringResponse>(
                  this, METHODID_CHANGE_APPLIANCE_NAME_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class HeatingServiceStub extends io.grpc.stub.AbstractStub<HeatingServiceStub> {
    private HeatingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialAppliance(org.DS.garyproject.SmartBuildingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.heatingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialApplianceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeTemperature(org.DS.garyproject.SmartBuildingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeSpeed(org.DS.garyproject.SmartBuildingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeSpeedMethod(), getCallOptions()), request, responseObserver);
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
    public void changeApplianceName(org.DS.garyproject.SmartBuildingGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.stringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeApplianceNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.stringRequest> changeApplianceNameStream(
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.stringResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getChangeApplianceNameStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HeatingServiceBlockingStub extends io.grpc.stub.AbstractStub<HeatingServiceBlockingStub> {
    private HeatingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.garyproject.SmartBuildingGRPC.heatingResponse initialAppliance(org.DS.garyproject.SmartBuildingGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialApplianceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.garyproject.SmartBuildingGRPC.valueResponse> changeTemperature(
        org.DS.garyproject.SmartBuildingGRPC.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeTemperatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.garyproject.SmartBuildingGRPC.valueResponse> changeSpeed(
        org.DS.garyproject.SmartBuildingGRPC.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeSpeedMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.garyproject.SmartBuildingGRPC.booleanResponse onOff(org.DS.garyproject.SmartBuildingGRPC.booleanRequest request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.garyproject.SmartBuildingGRPC.stringResponse changeApplianceName(org.DS.garyproject.SmartBuildingGRPC.stringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeApplianceNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeatingServiceFutureStub extends io.grpc.stub.AbstractStub<HeatingServiceFutureStub> {
    private HeatingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.garyproject.SmartBuildingGRPC.heatingResponse> initialAppliance(
        org.DS.garyproject.SmartBuildingGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialApplianceMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.DS.garyproject.SmartBuildingGRPC.stringResponse> changeApplianceName(
        org.DS.garyproject.SmartBuildingGRPC.stringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeApplianceNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_APPLIANCE = 0;
  private static final int METHODID_CHANGE_TEMPERATURE = 1;
  private static final int METHODID_CHANGE_SPEED = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_APPLIANCE_NAME = 4;
  private static final int METHODID_CHANGE_APPLIANCE_NAME_STREAM = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeatingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeatingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_APPLIANCE:
          serviceImpl.initialAppliance((org.DS.garyproject.SmartBuildingGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.heatingResponse>) responseObserver);
          break;
        case METHODID_CHANGE_TEMPERATURE:
          serviceImpl.changeTemperature((org.DS.garyproject.SmartBuildingGRPC.valueRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse>) responseObserver);
          break;
        case METHODID_CHANGE_SPEED:
          serviceImpl.changeSpeed((org.DS.garyproject.SmartBuildingGRPC.valueRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.garyproject.SmartBuildingGRPC.booleanRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.booleanResponse>) responseObserver);
          break;
        case METHODID_CHANGE_APPLIANCE_NAME:
          serviceImpl.changeApplianceName((org.DS.garyproject.SmartBuildingGRPC.stringRequest) request,
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
        case METHODID_CHANGE_APPLIANCE_NAME_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.changeApplianceNameStream(
              (io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.stringResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeatingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.garyproject.SmartBuildingGRPC.HeatingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeatingService");
    }
  }

  private static final class HeatingServiceFileDescriptorSupplier
      extends HeatingServiceBaseDescriptorSupplier {
    HeatingServiceFileDescriptorSupplier() {}
  }

  private static final class HeatingServiceMethodDescriptorSupplier
      extends HeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeatingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeatingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeatingServiceFileDescriptorSupplier())
              .addMethod(getInitialApplianceMethod())
              .addMethod(getChangeTemperatureMethod())
              .addMethod(getChangeSpeedMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeApplianceNameMethod())
              .addMethod(getChangeApplianceNameStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
