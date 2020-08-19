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
    comments = "Source: Projector.proto")
public final class ProjectorServiceGrpc {

  private ProjectorServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartBuildingGRPC.ProjectorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.Empty,
      org.DS.garyproject.SmartBuildingGRPC.projectorResponse> getInitialApplianceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialAppliance",
      requestType = org.DS.garyproject.SmartBuildingGRPC.Empty.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.projectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.Empty,
      org.DS.garyproject.SmartBuildingGRPC.projectorResponse> getInitialApplianceMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.Empty, org.DS.garyproject.SmartBuildingGRPC.projectorResponse> getInitialApplianceMethod;
    if ((getInitialApplianceMethod = ProjectorServiceGrpc.getInitialApplianceMethod) == null) {
      synchronized (ProjectorServiceGrpc.class) {
        if ((getInitialApplianceMethod = ProjectorServiceGrpc.getInitialApplianceMethod) == null) {
          ProjectorServiceGrpc.getInitialApplianceMethod = getInitialApplianceMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.Empty, org.DS.garyproject.SmartBuildingGRPC.projectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.ProjectorService", "initialAppliance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.projectorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorServiceMethodDescriptorSupplier("initialAppliance"))
                  .build();
          }
        }
     }
     return getInitialApplianceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest,
      org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeVolume",
      requestType = org.DS.garyproject.SmartBuildingGRPC.valueRequest.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest,
      org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeVolumeMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest, org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeVolumeMethod;
    if ((getChangeVolumeMethod = ProjectorServiceGrpc.getChangeVolumeMethod) == null) {
      synchronized (ProjectorServiceGrpc.class) {
        if ((getChangeVolumeMethod = ProjectorServiceGrpc.getChangeVolumeMethod) == null) {
          ProjectorServiceGrpc.getChangeVolumeMethod = getChangeVolumeMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.valueRequest, org.DS.garyproject.SmartBuildingGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.ProjectorService", "changeVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorServiceMethodDescriptorSupplier("changeVolume"))
                  .build();
          }
        }
     }
     return getChangeVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest,
      org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeChannel",
      requestType = org.DS.garyproject.SmartBuildingGRPC.valueRequest.class,
      responseType = org.DS.garyproject.SmartBuildingGRPC.valueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest,
      org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeChannelMethod() {
    io.grpc.MethodDescriptor<org.DS.garyproject.SmartBuildingGRPC.valueRequest, org.DS.garyproject.SmartBuildingGRPC.valueResponse> getChangeChannelMethod;
    if ((getChangeChannelMethod = ProjectorServiceGrpc.getChangeChannelMethod) == null) {
      synchronized (ProjectorServiceGrpc.class) {
        if ((getChangeChannelMethod = ProjectorServiceGrpc.getChangeChannelMethod) == null) {
          ProjectorServiceGrpc.getChangeChannelMethod = getChangeChannelMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.valueRequest, org.DS.garyproject.SmartBuildingGRPC.valueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.ProjectorService", "changeChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.valueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.valueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorServiceMethodDescriptorSupplier("changeChannel"))
                  .build();
          }
        }
     }
     return getChangeChannelMethod;
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
    if ((getOnOffMethod = ProjectorServiceGrpc.getOnOffMethod) == null) {
      synchronized (ProjectorServiceGrpc.class) {
        if ((getOnOffMethod = ProjectorServiceGrpc.getOnOffMethod) == null) {
          ProjectorServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.booleanRequest, org.DS.garyproject.SmartBuildingGRPC.booleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.ProjectorService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.booleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.booleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorServiceMethodDescriptorSupplier("onOff"))
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
    if ((getChangeApplianceNameMethod = ProjectorServiceGrpc.getChangeApplianceNameMethod) == null) {
      synchronized (ProjectorServiceGrpc.class) {
        if ((getChangeApplianceNameMethod = ProjectorServiceGrpc.getChangeApplianceNameMethod) == null) {
          ProjectorServiceGrpc.getChangeApplianceNameMethod = getChangeApplianceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.garyproject.SmartBuildingGRPC.stringRequest, org.DS.garyproject.SmartBuildingGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.ProjectorService", "changeApplianceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.garyproject.SmartBuildingGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorServiceMethodDescriptorSupplier("changeApplianceName"))
                  .build();
          }
        }
     }
     return getChangeApplianceNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectorServiceStub newStub(io.grpc.Channel channel) {
    return new ProjectorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProjectorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProjectorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProjectorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialAppliance(org.DS.garyproject.SmartBuildingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.projectorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialApplianceMethod(), responseObserver);
    }

    /**
     */
    public void changeVolume(org.DS.garyproject.SmartBuildingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeVolumeMethod(), responseObserver);
    }

    /**
     */
    public void changeChannel(org.DS.garyproject.SmartBuildingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeChannelMethod(), responseObserver);
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

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialApplianceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.Empty,
                org.DS.garyproject.SmartBuildingGRPC.projectorResponse>(
                  this, METHODID_INITIAL_APPLIANCE)))
          .addMethod(
            getChangeVolumeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.valueRequest,
                org.DS.garyproject.SmartBuildingGRPC.valueResponse>(
                  this, METHODID_CHANGE_VOLUME)))
          .addMethod(
            getChangeChannelMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.garyproject.SmartBuildingGRPC.valueRequest,
                org.DS.garyproject.SmartBuildingGRPC.valueResponse>(
                  this, METHODID_CHANGE_CHANNEL)))
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
          .build();
    }
  }

  /**
   */
  public static final class ProjectorServiceStub extends io.grpc.stub.AbstractStub<ProjectorServiceStub> {
    private ProjectorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectorServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialAppliance(org.DS.garyproject.SmartBuildingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.projectorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialApplianceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeVolume(org.DS.garyproject.SmartBuildingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeChannel(org.DS.garyproject.SmartBuildingGRPC.valueRequest request,
        io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeChannelMethod(), getCallOptions()), request, responseObserver);
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
  }

  /**
   */
  public static final class ProjectorServiceBlockingStub extends io.grpc.stub.AbstractStub<ProjectorServiceBlockingStub> {
    private ProjectorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.garyproject.SmartBuildingGRPC.projectorResponse initialAppliance(org.DS.garyproject.SmartBuildingGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialApplianceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.garyproject.SmartBuildingGRPC.valueResponse> changeVolume(
        org.DS.garyproject.SmartBuildingGRPC.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.garyproject.SmartBuildingGRPC.valueResponse> changeChannel(
        org.DS.garyproject.SmartBuildingGRPC.valueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeChannelMethod(), getCallOptions(), request);
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
  public static final class ProjectorServiceFutureStub extends io.grpc.stub.AbstractStub<ProjectorServiceFutureStub> {
    private ProjectorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.garyproject.SmartBuildingGRPC.projectorResponse> initialAppliance(
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
  private static final int METHODID_CHANGE_VOLUME = 1;
  private static final int METHODID_CHANGE_CHANNEL = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_APPLIANCE_NAME = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_APPLIANCE:
          serviceImpl.initialAppliance((org.DS.garyproject.SmartBuildingGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.projectorResponse>) responseObserver);
          break;
        case METHODID_CHANGE_VOLUME:
          serviceImpl.changeVolume((org.DS.garyproject.SmartBuildingGRPC.valueRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.garyproject.SmartBuildingGRPC.valueResponse>) responseObserver);
          break;
        case METHODID_CHANGE_CHANNEL:
          serviceImpl.changeChannel((org.DS.garyproject.SmartBuildingGRPC.valueRequest) request,
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProjectorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.garyproject.SmartBuildingGRPC.ProjectorServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectorService");
    }
  }

  private static final class ProjectorServiceFileDescriptorSupplier
      extends ProjectorServiceBaseDescriptorSupplier {
    ProjectorServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectorServiceMethodDescriptorSupplier
      extends ProjectorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectorServiceFileDescriptorSupplier())
              .addMethod(getInitialApplianceMethod())
              .addMethod(getChangeVolumeMethod())
              .addMethod(getChangeChannelMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeApplianceNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
