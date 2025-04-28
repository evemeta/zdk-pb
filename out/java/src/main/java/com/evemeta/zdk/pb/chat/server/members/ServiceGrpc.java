package com.evemeta.zdk.pb.chat.server.members;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.2)",
    comments = "Source: chat/members/public/server/v1/services.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "chat.members.public.server.v1.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.CountRequest,
      com.evemeta.zdk.pb.chat.server.members.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.evemeta.zdk.pb.chat.server.members.CountRequest.class,
      responseType = com.evemeta.zdk.pb.chat.server.members.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.CountRequest,
      com.evemeta.zdk.pb.chat.server.members.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.CountRequest, com.evemeta.zdk.pb.chat.server.members.CountResponse> getCountMethod;
    if ((getCountMethod = ServiceGrpc.getCountMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCountMethod = ServiceGrpc.getCountMethod) == null) {
          ServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.chat.server.members.CountRequest, com.evemeta.zdk.pb.chat.server.members.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.CountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.RangeRequest,
      com.evemeta.zdk.pb.chat.server.members.RangeResponse> getRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Range",
      requestType = com.evemeta.zdk.pb.chat.server.members.RangeRequest.class,
      responseType = com.evemeta.zdk.pb.chat.server.members.RangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.RangeRequest,
      com.evemeta.zdk.pb.chat.server.members.RangeResponse> getRangeMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.RangeRequest, com.evemeta.zdk.pb.chat.server.members.RangeResponse> getRangeMethod;
    if ((getRangeMethod = ServiceGrpc.getRangeMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRangeMethod = ServiceGrpc.getRangeMethod) == null) {
          ServiceGrpc.getRangeMethod = getRangeMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.chat.server.members.RangeRequest, com.evemeta.zdk.pb.chat.server.members.RangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Range"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.RangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.RangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Range"))
              .build();
        }
      }
    }
    return getRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.SelectRequest,
      com.evemeta.zdk.pb.chat.server.members.SelectResponse> getSelectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Select",
      requestType = com.evemeta.zdk.pb.chat.server.members.SelectRequest.class,
      responseType = com.evemeta.zdk.pb.chat.server.members.SelectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.SelectRequest,
      com.evemeta.zdk.pb.chat.server.members.SelectResponse> getSelectMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.SelectRequest, com.evemeta.zdk.pb.chat.server.members.SelectResponse> getSelectMethod;
    if ((getSelectMethod = ServiceGrpc.getSelectMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getSelectMethod = ServiceGrpc.getSelectMethod) == null) {
          ServiceGrpc.getSelectMethod = getSelectMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.chat.server.members.SelectRequest, com.evemeta.zdk.pb.chat.server.members.SelectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Select"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.SelectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.SelectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Select"))
              .build();
        }
      }
    }
    return getSelectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.KickRequest,
      com.evemeta.zdk.pb.chat.server.members.KickResponse> getKickMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Kick",
      requestType = com.evemeta.zdk.pb.chat.server.members.KickRequest.class,
      responseType = com.evemeta.zdk.pb.chat.server.members.KickResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.KickRequest,
      com.evemeta.zdk.pb.chat.server.members.KickResponse> getKickMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.KickRequest, com.evemeta.zdk.pb.chat.server.members.KickResponse> getKickMethod;
    if ((getKickMethod = ServiceGrpc.getKickMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getKickMethod = ServiceGrpc.getKickMethod) == null) {
          ServiceGrpc.getKickMethod = getKickMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.chat.server.members.KickRequest, com.evemeta.zdk.pb.chat.server.members.KickResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Kick"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.KickRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.KickResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Kick"))
              .build();
        }
      }
    }
    return getKickMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.MuteRequest,
      com.evemeta.zdk.pb.chat.server.members.MuteResponse> getMuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mute",
      requestType = com.evemeta.zdk.pb.chat.server.members.MuteRequest.class,
      responseType = com.evemeta.zdk.pb.chat.server.members.MuteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.MuteRequest,
      com.evemeta.zdk.pb.chat.server.members.MuteResponse> getMuteMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.MuteRequest, com.evemeta.zdk.pb.chat.server.members.MuteResponse> getMuteMethod;
    if ((getMuteMethod = ServiceGrpc.getMuteMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getMuteMethod = ServiceGrpc.getMuteMethod) == null) {
          ServiceGrpc.getMuteMethod = getMuteMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.chat.server.members.MuteRequest, com.evemeta.zdk.pb.chat.server.members.MuteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.MuteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.MuteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Mute"))
              .build();
        }
      }
    }
    return getMuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.UnmuteRequest,
      com.evemeta.zdk.pb.chat.server.members.UnmuteResponse> getUnmuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unmute",
      requestType = com.evemeta.zdk.pb.chat.server.members.UnmuteRequest.class,
      responseType = com.evemeta.zdk.pb.chat.server.members.UnmuteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.UnmuteRequest,
      com.evemeta.zdk.pb.chat.server.members.UnmuteResponse> getUnmuteMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.UnmuteRequest, com.evemeta.zdk.pb.chat.server.members.UnmuteResponse> getUnmuteMethod;
    if ((getUnmuteMethod = ServiceGrpc.getUnmuteMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getUnmuteMethod = ServiceGrpc.getUnmuteMethod) == null) {
          ServiceGrpc.getUnmuteMethod = getUnmuteMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.chat.server.members.UnmuteRequest, com.evemeta.zdk.pb.chat.server.members.UnmuteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unmute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.UnmuteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.UnmuteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Unmute"))
              .build();
        }
      }
    }
    return getUnmuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.BlockRequest,
      com.evemeta.zdk.pb.chat.server.members.BlockResponse> getBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Block",
      requestType = com.evemeta.zdk.pb.chat.server.members.BlockRequest.class,
      responseType = com.evemeta.zdk.pb.chat.server.members.BlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.BlockRequest,
      com.evemeta.zdk.pb.chat.server.members.BlockResponse> getBlockMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.BlockRequest, com.evemeta.zdk.pb.chat.server.members.BlockResponse> getBlockMethod;
    if ((getBlockMethod = ServiceGrpc.getBlockMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getBlockMethod = ServiceGrpc.getBlockMethod) == null) {
          ServiceGrpc.getBlockMethod = getBlockMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.chat.server.members.BlockRequest, com.evemeta.zdk.pb.chat.server.members.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Block"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.BlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.BlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Block"))
              .build();
        }
      }
    }
    return getBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.UnblockRequest,
      com.evemeta.zdk.pb.chat.server.members.UnblockResponse> getUnblockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unblock",
      requestType = com.evemeta.zdk.pb.chat.server.members.UnblockRequest.class,
      responseType = com.evemeta.zdk.pb.chat.server.members.UnblockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.UnblockRequest,
      com.evemeta.zdk.pb.chat.server.members.UnblockResponse> getUnblockMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.chat.server.members.UnblockRequest, com.evemeta.zdk.pb.chat.server.members.UnblockResponse> getUnblockMethod;
    if ((getUnblockMethod = ServiceGrpc.getUnblockMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getUnblockMethod = ServiceGrpc.getUnblockMethod) == null) {
          ServiceGrpc.getUnblockMethod = getUnblockMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.chat.server.members.UnblockRequest, com.evemeta.zdk.pb.chat.server.members.UnblockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unblock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.UnblockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.chat.server.members.UnblockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Unblock"))
              .build();
        }
      }
    }
    return getUnblockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceStub>() {
        @java.lang.Override
        public ServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceStub(channel, callOptions);
        }
      };
    return ServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub>() {
        @java.lang.Override
        public ServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub>() {
        @java.lang.Override
        public ServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Count represents a procedure that retrieves the total number of members based on a specific query.
     * </pre>
     */
    default void count(com.evemeta.zdk.pb.chat.server.members.CountRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of members based on a specific query.
     * </pre>
     */
    default void range(com.evemeta.zdk.pb.chat.server.members.RangeRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.RangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific members based on a specific query.
     * </pre>
     */
    default void select(com.evemeta.zdk.pb.chat.server.members.SelectRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.SelectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Kick represents a procedure that forcefully removes a member from a chat for a specific reason.
     * </pre>
     */
    default void kick(com.evemeta.zdk.pb.chat.server.members.KickRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.KickResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKickMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mute represents a procedure that silences a member for a specified duration or indefinitely.
     * </pre>
     */
    default void mute(com.evemeta.zdk.pb.chat.server.members.MuteRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.MuteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unmute represents a procedure that restores communication privileges for a previously muted member.
     * </pre>
     */
    default void unmute(com.evemeta.zdk.pb.chat.server.members.UnmuteRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.UnmuteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnmuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Block represents a procedure that forcefully removes a member from a chat and prevents them from participating for a specified duration or indefinitely.
     * </pre>
     */
    default void block(com.evemeta.zdk.pb.chat.server.members.BlockRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.BlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unblock represents a procedure that restores access privileges for a previously blocked member.
     * </pre>
     */
    default void unblock(com.evemeta.zdk.pb.chat.server.members.UnblockRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.UnblockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnblockMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Service.
   */
  public static abstract class ServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Service.
   */
  public static final class ServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceStub> {
    private ServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Count represents a procedure that retrieves the total number of members based on a specific query.
     * </pre>
     */
    public void count(com.evemeta.zdk.pb.chat.server.members.CountRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of members based on a specific query.
     * </pre>
     */
    public void range(com.evemeta.zdk.pb.chat.server.members.RangeRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.RangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific members based on a specific query.
     * </pre>
     */
    public void select(com.evemeta.zdk.pb.chat.server.members.SelectRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.SelectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSelectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Kick represents a procedure that forcefully removes a member from a chat for a specific reason.
     * </pre>
     */
    public void kick(com.evemeta.zdk.pb.chat.server.members.KickRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.KickResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKickMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mute represents a procedure that silences a member for a specified duration or indefinitely.
     * </pre>
     */
    public void mute(com.evemeta.zdk.pb.chat.server.members.MuteRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.MuteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unmute represents a procedure that restores communication privileges for a previously muted member.
     * </pre>
     */
    public void unmute(com.evemeta.zdk.pb.chat.server.members.UnmuteRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.UnmuteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnmuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Block represents a procedure that forcefully removes a member from a chat and prevents them from participating for a specified duration or indefinitely.
     * </pre>
     */
    public void block(com.evemeta.zdk.pb.chat.server.members.BlockRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.BlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unblock represents a procedure that restores access privileges for a previously blocked member.
     * </pre>
     */
    public void unblock(com.evemeta.zdk.pb.chat.server.members.UnblockRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.UnblockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnblockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Service.
   */
  public static final class ServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceBlockingStub> {
    private ServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Count represents a procedure that retrieves the total number of members based on a specific query.
     * </pre>
     */
    public com.evemeta.zdk.pb.chat.server.members.CountResponse count(com.evemeta.zdk.pb.chat.server.members.CountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of members based on a specific query.
     * </pre>
     */
    public com.evemeta.zdk.pb.chat.server.members.RangeResponse range(com.evemeta.zdk.pb.chat.server.members.RangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific members based on a specific query.
     * </pre>
     */
    public com.evemeta.zdk.pb.chat.server.members.SelectResponse select(com.evemeta.zdk.pb.chat.server.members.SelectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSelectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Kick represents a procedure that forcefully removes a member from a chat for a specific reason.
     * </pre>
     */
    public com.evemeta.zdk.pb.chat.server.members.KickResponse kick(com.evemeta.zdk.pb.chat.server.members.KickRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKickMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mute represents a procedure that silences a member for a specified duration or indefinitely.
     * </pre>
     */
    public com.evemeta.zdk.pb.chat.server.members.MuteResponse mute(com.evemeta.zdk.pb.chat.server.members.MuteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unmute represents a procedure that restores communication privileges for a previously muted member.
     * </pre>
     */
    public com.evemeta.zdk.pb.chat.server.members.UnmuteResponse unmute(com.evemeta.zdk.pb.chat.server.members.UnmuteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnmuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Block represents a procedure that forcefully removes a member from a chat and prevents them from participating for a specified duration or indefinitely.
     * </pre>
     */
    public com.evemeta.zdk.pb.chat.server.members.BlockResponse block(com.evemeta.zdk.pb.chat.server.members.BlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unblock represents a procedure that restores access privileges for a previously blocked member.
     * </pre>
     */
    public com.evemeta.zdk.pb.chat.server.members.UnblockResponse unblock(com.evemeta.zdk.pb.chat.server.members.UnblockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnblockMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Service.
   */
  public static final class ServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceFutureStub> {
    private ServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Count represents a procedure that retrieves the total number of members based on a specific query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.chat.server.members.CountResponse> count(
        com.evemeta.zdk.pb.chat.server.members.CountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of members based on a specific query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.chat.server.members.RangeResponse> range(
        com.evemeta.zdk.pb.chat.server.members.RangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific members based on a specific query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.chat.server.members.SelectResponse> select(
        com.evemeta.zdk.pb.chat.server.members.SelectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSelectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Kick represents a procedure that forcefully removes a member from a chat for a specific reason.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.chat.server.members.KickResponse> kick(
        com.evemeta.zdk.pb.chat.server.members.KickRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKickMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mute represents a procedure that silences a member for a specified duration or indefinitely.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.chat.server.members.MuteResponse> mute(
        com.evemeta.zdk.pb.chat.server.members.MuteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unmute represents a procedure that restores communication privileges for a previously muted member.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.chat.server.members.UnmuteResponse> unmute(
        com.evemeta.zdk.pb.chat.server.members.UnmuteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnmuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Block represents a procedure that forcefully removes a member from a chat and prevents them from participating for a specified duration or indefinitely.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.chat.server.members.BlockResponse> block(
        com.evemeta.zdk.pb.chat.server.members.BlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unblock represents a procedure that restores access privileges for a previously blocked member.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.chat.server.members.UnblockResponse> unblock(
        com.evemeta.zdk.pb.chat.server.members.UnblockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnblockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COUNT = 0;
  private static final int METHODID_RANGE = 1;
  private static final int METHODID_SELECT = 2;
  private static final int METHODID_KICK = 3;
  private static final int METHODID_MUTE = 4;
  private static final int METHODID_UNMUTE = 5;
  private static final int METHODID_BLOCK = 6;
  private static final int METHODID_UNBLOCK = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COUNT:
          serviceImpl.count((com.evemeta.zdk.pb.chat.server.members.CountRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.CountResponse>) responseObserver);
          break;
        case METHODID_RANGE:
          serviceImpl.range((com.evemeta.zdk.pb.chat.server.members.RangeRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.RangeResponse>) responseObserver);
          break;
        case METHODID_SELECT:
          serviceImpl.select((com.evemeta.zdk.pb.chat.server.members.SelectRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.SelectResponse>) responseObserver);
          break;
        case METHODID_KICK:
          serviceImpl.kick((com.evemeta.zdk.pb.chat.server.members.KickRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.KickResponse>) responseObserver);
          break;
        case METHODID_MUTE:
          serviceImpl.mute((com.evemeta.zdk.pb.chat.server.members.MuteRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.MuteResponse>) responseObserver);
          break;
        case METHODID_UNMUTE:
          serviceImpl.unmute((com.evemeta.zdk.pb.chat.server.members.UnmuteRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.UnmuteResponse>) responseObserver);
          break;
        case METHODID_BLOCK:
          serviceImpl.block((com.evemeta.zdk.pb.chat.server.members.BlockRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.BlockResponse>) responseObserver);
          break;
        case METHODID_UNBLOCK:
          serviceImpl.unblock((com.evemeta.zdk.pb.chat.server.members.UnblockRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.chat.server.members.UnblockResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.chat.server.members.CountRequest,
              com.evemeta.zdk.pb.chat.server.members.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.chat.server.members.RangeRequest,
              com.evemeta.zdk.pb.chat.server.members.RangeResponse>(
                service, METHODID_RANGE)))
        .addMethod(
          getSelectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.chat.server.members.SelectRequest,
              com.evemeta.zdk.pb.chat.server.members.SelectResponse>(
                service, METHODID_SELECT)))
        .addMethod(
          getKickMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.chat.server.members.KickRequest,
              com.evemeta.zdk.pb.chat.server.members.KickResponse>(
                service, METHODID_KICK)))
        .addMethod(
          getMuteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.chat.server.members.MuteRequest,
              com.evemeta.zdk.pb.chat.server.members.MuteResponse>(
                service, METHODID_MUTE)))
        .addMethod(
          getUnmuteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.chat.server.members.UnmuteRequest,
              com.evemeta.zdk.pb.chat.server.members.UnmuteResponse>(
                service, METHODID_UNMUTE)))
        .addMethod(
          getBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.chat.server.members.BlockRequest,
              com.evemeta.zdk.pb.chat.server.members.BlockResponse>(
                service, METHODID_BLOCK)))
        .addMethod(
          getUnblockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.chat.server.members.UnblockRequest,
              com.evemeta.zdk.pb.chat.server.members.UnblockResponse>(
                service, METHODID_UNBLOCK)))
        .build();
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.evemeta.zdk.pb.chat.server.members.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service");
    }
  }

  private static final class ServiceFileDescriptorSupplier
      extends ServiceBaseDescriptorSupplier {
    ServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMethodDescriptorSupplier
      extends ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceFileDescriptorSupplier())
              .addMethod(getCountMethod())
              .addMethod(getRangeMethod())
              .addMethod(getSelectMethod())
              .addMethod(getKickMethod())
              .addMethod(getMuteMethod())
              .addMethod(getUnmuteMethod())
              .addMethod(getBlockMethod())
              .addMethod(getUnblockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
