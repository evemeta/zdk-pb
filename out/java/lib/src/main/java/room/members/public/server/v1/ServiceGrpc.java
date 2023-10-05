package room.members.public.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: room/members/public/server/v1/services.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final String SERVICE_NAME = "room.members.public.server.v1.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.CountRequest,
      room.members.public.server.v1.Procedures.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = room.members.public.server.v1.Procedures.CountRequest.class,
      responseType = room.members.public.server.v1.Procedures.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.CountRequest,
      room.members.public.server.v1.Procedures.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.CountRequest, room.members.public.server.v1.Procedures.CountResponse> getCountMethod;
    if ((getCountMethod = ServiceGrpc.getCountMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCountMethod = ServiceGrpc.getCountMethod) == null) {
          ServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<room.members.public.server.v1.Procedures.CountRequest, room.members.public.server.v1.Procedures.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.CountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.RangeRequest,
      room.members.public.server.v1.Procedures.RangeResponse> getRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Range",
      requestType = room.members.public.server.v1.Procedures.RangeRequest.class,
      responseType = room.members.public.server.v1.Procedures.RangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.RangeRequest,
      room.members.public.server.v1.Procedures.RangeResponse> getRangeMethod() {
    io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.RangeRequest, room.members.public.server.v1.Procedures.RangeResponse> getRangeMethod;
    if ((getRangeMethod = ServiceGrpc.getRangeMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRangeMethod = ServiceGrpc.getRangeMethod) == null) {
          ServiceGrpc.getRangeMethod = getRangeMethod =
              io.grpc.MethodDescriptor.<room.members.public.server.v1.Procedures.RangeRequest, room.members.public.server.v1.Procedures.RangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Range"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.RangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.RangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Range"))
              .build();
        }
      }
    }
    return getRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.SelectRequest,
      room.members.public.server.v1.Procedures.SelectResponse> getSelectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Select",
      requestType = room.members.public.server.v1.Procedures.SelectRequest.class,
      responseType = room.members.public.server.v1.Procedures.SelectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.SelectRequest,
      room.members.public.server.v1.Procedures.SelectResponse> getSelectMethod() {
    io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.SelectRequest, room.members.public.server.v1.Procedures.SelectResponse> getSelectMethod;
    if ((getSelectMethod = ServiceGrpc.getSelectMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getSelectMethod = ServiceGrpc.getSelectMethod) == null) {
          ServiceGrpc.getSelectMethod = getSelectMethod =
              io.grpc.MethodDescriptor.<room.members.public.server.v1.Procedures.SelectRequest, room.members.public.server.v1.Procedures.SelectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Select"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.SelectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.SelectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Select"))
              .build();
        }
      }
    }
    return getSelectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.KickRequest,
      room.members.public.server.v1.Procedures.KickResponse> getKickMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Kick",
      requestType = room.members.public.server.v1.Procedures.KickRequest.class,
      responseType = room.members.public.server.v1.Procedures.KickResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.KickRequest,
      room.members.public.server.v1.Procedures.KickResponse> getKickMethod() {
    io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.KickRequest, room.members.public.server.v1.Procedures.KickResponse> getKickMethod;
    if ((getKickMethod = ServiceGrpc.getKickMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getKickMethod = ServiceGrpc.getKickMethod) == null) {
          ServiceGrpc.getKickMethod = getKickMethod =
              io.grpc.MethodDescriptor.<room.members.public.server.v1.Procedures.KickRequest, room.members.public.server.v1.Procedures.KickResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Kick"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.KickRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.KickResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Kick"))
              .build();
        }
      }
    }
    return getKickMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.CreateStreamRequest,
      room.members.public.server.v1.Procedures.CreateStreamResponse> getCreateStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStream",
      requestType = room.members.public.server.v1.Procedures.CreateStreamRequest.class,
      responseType = room.members.public.server.v1.Procedures.CreateStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.CreateStreamRequest,
      room.members.public.server.v1.Procedures.CreateStreamResponse> getCreateStreamMethod() {
    io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.CreateStreamRequest, room.members.public.server.v1.Procedures.CreateStreamResponse> getCreateStreamMethod;
    if ((getCreateStreamMethod = ServiceGrpc.getCreateStreamMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateStreamMethod = ServiceGrpc.getCreateStreamMethod) == null) {
          ServiceGrpc.getCreateStreamMethod = getCreateStreamMethod =
              io.grpc.MethodDescriptor.<room.members.public.server.v1.Procedures.CreateStreamRequest, room.members.public.server.v1.Procedures.CreateStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.CreateStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.CreateStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CreateStream"))
              .build();
        }
      }
    }
    return getCreateStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.UpdateStreamRequest,
      room.members.public.server.v1.Procedures.UpdateStreamResponse> getUpdateStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStream",
      requestType = room.members.public.server.v1.Procedures.UpdateStreamRequest.class,
      responseType = room.members.public.server.v1.Procedures.UpdateStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.UpdateStreamRequest,
      room.members.public.server.v1.Procedures.UpdateStreamResponse> getUpdateStreamMethod() {
    io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.UpdateStreamRequest, room.members.public.server.v1.Procedures.UpdateStreamResponse> getUpdateStreamMethod;
    if ((getUpdateStreamMethod = ServiceGrpc.getUpdateStreamMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getUpdateStreamMethod = ServiceGrpc.getUpdateStreamMethod) == null) {
          ServiceGrpc.getUpdateStreamMethod = getUpdateStreamMethod =
              io.grpc.MethodDescriptor.<room.members.public.server.v1.Procedures.UpdateStreamRequest, room.members.public.server.v1.Procedures.UpdateStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.UpdateStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.UpdateStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("UpdateStream"))
              .build();
        }
      }
    }
    return getUpdateStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.DeleteStreamRequest,
      room.members.public.server.v1.Procedures.DeleteStreamResponse> getDeleteStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStream",
      requestType = room.members.public.server.v1.Procedures.DeleteStreamRequest.class,
      responseType = room.members.public.server.v1.Procedures.DeleteStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.DeleteStreamRequest,
      room.members.public.server.v1.Procedures.DeleteStreamResponse> getDeleteStreamMethod() {
    io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.DeleteStreamRequest, room.members.public.server.v1.Procedures.DeleteStreamResponse> getDeleteStreamMethod;
    if ((getDeleteStreamMethod = ServiceGrpc.getDeleteStreamMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getDeleteStreamMethod = ServiceGrpc.getDeleteStreamMethod) == null) {
          ServiceGrpc.getDeleteStreamMethod = getDeleteStreamMethod =
              io.grpc.MethodDescriptor.<room.members.public.server.v1.Procedures.DeleteStreamRequest, room.members.public.server.v1.Procedures.DeleteStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.DeleteStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.DeleteStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("DeleteStream"))
              .build();
        }
      }
    }
    return getDeleteStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.CreateRestrictionRequest,
      room.members.public.server.v1.Procedures.CreateRestrictionResponse> getCreateRestrictionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRestriction",
      requestType = room.members.public.server.v1.Procedures.CreateRestrictionRequest.class,
      responseType = room.members.public.server.v1.Procedures.CreateRestrictionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.CreateRestrictionRequest,
      room.members.public.server.v1.Procedures.CreateRestrictionResponse> getCreateRestrictionMethod() {
    io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.CreateRestrictionRequest, room.members.public.server.v1.Procedures.CreateRestrictionResponse> getCreateRestrictionMethod;
    if ((getCreateRestrictionMethod = ServiceGrpc.getCreateRestrictionMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateRestrictionMethod = ServiceGrpc.getCreateRestrictionMethod) == null) {
          ServiceGrpc.getCreateRestrictionMethod = getCreateRestrictionMethod =
              io.grpc.MethodDescriptor.<room.members.public.server.v1.Procedures.CreateRestrictionRequest, room.members.public.server.v1.Procedures.CreateRestrictionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRestriction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.CreateRestrictionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.CreateRestrictionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CreateRestriction"))
              .build();
        }
      }
    }
    return getCreateRestrictionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.DeleteRestrictionRequest,
      room.members.public.server.v1.Procedures.DeleteRestrictionResponse> getDeleteRestrictionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRestriction",
      requestType = room.members.public.server.v1.Procedures.DeleteRestrictionRequest.class,
      responseType = room.members.public.server.v1.Procedures.DeleteRestrictionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.DeleteRestrictionRequest,
      room.members.public.server.v1.Procedures.DeleteRestrictionResponse> getDeleteRestrictionMethod() {
    io.grpc.MethodDescriptor<room.members.public.server.v1.Procedures.DeleteRestrictionRequest, room.members.public.server.v1.Procedures.DeleteRestrictionResponse> getDeleteRestrictionMethod;
    if ((getDeleteRestrictionMethod = ServiceGrpc.getDeleteRestrictionMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getDeleteRestrictionMethod = ServiceGrpc.getDeleteRestrictionMethod) == null) {
          ServiceGrpc.getDeleteRestrictionMethod = getDeleteRestrictionMethod =
              io.grpc.MethodDescriptor.<room.members.public.server.v1.Procedures.DeleteRestrictionRequest, room.members.public.server.v1.Procedures.DeleteRestrictionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRestriction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.DeleteRestrictionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.members.public.server.v1.Procedures.DeleteRestrictionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("DeleteRestriction"))
              .build();
        }
      }
    }
    return getDeleteRestrictionMethod;
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
    default void count(room.members.public.server.v1.Procedures.CountRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of members based on a specific query.
     * </pre>
     */
    default void range(room.members.public.server.v1.Procedures.RangeRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.RangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific members based on a specific query.
     * </pre>
     */
    default void select(room.members.public.server.v1.Procedures.SelectRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.SelectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Kick represents a procedure that forcefully removes a member from a room for a specific reason.
     * </pre>
     */
    default void kick(room.members.public.server.v1.Procedures.KickRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.KickResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKickMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateStream todo;
     * </pre>
     */
    default void createStream(room.members.public.server.v1.Procedures.CreateStreamRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.CreateStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateStream todo;
     * </pre>
     */
    default void updateStream(room.members.public.server.v1.Procedures.UpdateStreamRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.UpdateStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteStream todo;
     * </pre>
     */
    default void deleteStream(room.members.public.server.v1.Procedures.DeleteStreamRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.DeleteStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateRestriction todo;
     * </pre>
     */
    default void createRestriction(room.members.public.server.v1.Procedures.CreateRestrictionRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.CreateRestrictionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRestrictionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRestriction todo;
     * </pre>
     */
    default void deleteRestriction(room.members.public.server.v1.Procedures.DeleteRestrictionRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.DeleteRestrictionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRestrictionMethod(), responseObserver);
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
    public void count(room.members.public.server.v1.Procedures.CountRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of members based on a specific query.
     * </pre>
     */
    public void range(room.members.public.server.v1.Procedures.RangeRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.RangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific members based on a specific query.
     * </pre>
     */
    public void select(room.members.public.server.v1.Procedures.SelectRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.SelectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSelectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Kick represents a procedure that forcefully removes a member from a room for a specific reason.
     * </pre>
     */
    public void kick(room.members.public.server.v1.Procedures.KickRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.KickResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKickMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateStream todo;
     * </pre>
     */
    public void createStream(room.members.public.server.v1.Procedures.CreateStreamRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.CreateStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateStream todo;
     * </pre>
     */
    public void updateStream(room.members.public.server.v1.Procedures.UpdateStreamRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.UpdateStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteStream todo;
     * </pre>
     */
    public void deleteStream(room.members.public.server.v1.Procedures.DeleteStreamRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.DeleteStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateRestriction todo;
     * </pre>
     */
    public void createRestriction(room.members.public.server.v1.Procedures.CreateRestrictionRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.CreateRestrictionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRestrictionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRestriction todo;
     * </pre>
     */
    public void deleteRestriction(room.members.public.server.v1.Procedures.DeleteRestrictionRequest request,
        io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.DeleteRestrictionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRestrictionMethod(), getCallOptions()), request, responseObserver);
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
    public room.members.public.server.v1.Procedures.CountResponse count(room.members.public.server.v1.Procedures.CountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of members based on a specific query.
     * </pre>
     */
    public room.members.public.server.v1.Procedures.RangeResponse range(room.members.public.server.v1.Procedures.RangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific members based on a specific query.
     * </pre>
     */
    public room.members.public.server.v1.Procedures.SelectResponse select(room.members.public.server.v1.Procedures.SelectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSelectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Kick represents a procedure that forcefully removes a member from a room for a specific reason.
     * </pre>
     */
    public room.members.public.server.v1.Procedures.KickResponse kick(room.members.public.server.v1.Procedures.KickRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKickMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateStream todo;
     * </pre>
     */
    public room.members.public.server.v1.Procedures.CreateStreamResponse createStream(room.members.public.server.v1.Procedures.CreateStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateStream todo;
     * </pre>
     */
    public room.members.public.server.v1.Procedures.UpdateStreamResponse updateStream(room.members.public.server.v1.Procedures.UpdateStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteStream todo;
     * </pre>
     */
    public room.members.public.server.v1.Procedures.DeleteStreamResponse deleteStream(room.members.public.server.v1.Procedures.DeleteStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateRestriction todo;
     * </pre>
     */
    public room.members.public.server.v1.Procedures.CreateRestrictionResponse createRestriction(room.members.public.server.v1.Procedures.CreateRestrictionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRestrictionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRestriction todo;
     * </pre>
     */
    public room.members.public.server.v1.Procedures.DeleteRestrictionResponse deleteRestriction(room.members.public.server.v1.Procedures.DeleteRestrictionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRestrictionMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<room.members.public.server.v1.Procedures.CountResponse> count(
        room.members.public.server.v1.Procedures.CountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of members based on a specific query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.members.public.server.v1.Procedures.RangeResponse> range(
        room.members.public.server.v1.Procedures.RangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific members based on a specific query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.members.public.server.v1.Procedures.SelectResponse> select(
        room.members.public.server.v1.Procedures.SelectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSelectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Kick represents a procedure that forcefully removes a member from a room for a specific reason.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.members.public.server.v1.Procedures.KickResponse> kick(
        room.members.public.server.v1.Procedures.KickRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKickMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateStream todo;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.members.public.server.v1.Procedures.CreateStreamResponse> createStream(
        room.members.public.server.v1.Procedures.CreateStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStreamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateStream todo;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.members.public.server.v1.Procedures.UpdateStreamResponse> updateStream(
        room.members.public.server.v1.Procedures.UpdateStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStreamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteStream todo;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.members.public.server.v1.Procedures.DeleteStreamResponse> deleteStream(
        room.members.public.server.v1.Procedures.DeleteStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStreamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateRestriction todo;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.members.public.server.v1.Procedures.CreateRestrictionResponse> createRestriction(
        room.members.public.server.v1.Procedures.CreateRestrictionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRestrictionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRestriction todo;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.members.public.server.v1.Procedures.DeleteRestrictionResponse> deleteRestriction(
        room.members.public.server.v1.Procedures.DeleteRestrictionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRestrictionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COUNT = 0;
  private static final int METHODID_RANGE = 1;
  private static final int METHODID_SELECT = 2;
  private static final int METHODID_KICK = 3;
  private static final int METHODID_CREATE_STREAM = 4;
  private static final int METHODID_UPDATE_STREAM = 5;
  private static final int METHODID_DELETE_STREAM = 6;
  private static final int METHODID_CREATE_RESTRICTION = 7;
  private static final int METHODID_DELETE_RESTRICTION = 8;

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
          serviceImpl.count((room.members.public.server.v1.Procedures.CountRequest) request,
              (io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.CountResponse>) responseObserver);
          break;
        case METHODID_RANGE:
          serviceImpl.range((room.members.public.server.v1.Procedures.RangeRequest) request,
              (io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.RangeResponse>) responseObserver);
          break;
        case METHODID_SELECT:
          serviceImpl.select((room.members.public.server.v1.Procedures.SelectRequest) request,
              (io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.SelectResponse>) responseObserver);
          break;
        case METHODID_KICK:
          serviceImpl.kick((room.members.public.server.v1.Procedures.KickRequest) request,
              (io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.KickResponse>) responseObserver);
          break;
        case METHODID_CREATE_STREAM:
          serviceImpl.createStream((room.members.public.server.v1.Procedures.CreateStreamRequest) request,
              (io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.CreateStreamResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STREAM:
          serviceImpl.updateStream((room.members.public.server.v1.Procedures.UpdateStreamRequest) request,
              (io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.UpdateStreamResponse>) responseObserver);
          break;
        case METHODID_DELETE_STREAM:
          serviceImpl.deleteStream((room.members.public.server.v1.Procedures.DeleteStreamRequest) request,
              (io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.DeleteStreamResponse>) responseObserver);
          break;
        case METHODID_CREATE_RESTRICTION:
          serviceImpl.createRestriction((room.members.public.server.v1.Procedures.CreateRestrictionRequest) request,
              (io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.CreateRestrictionResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESTRICTION:
          serviceImpl.deleteRestriction((room.members.public.server.v1.Procedures.DeleteRestrictionRequest) request,
              (io.grpc.stub.StreamObserver<room.members.public.server.v1.Procedures.DeleteRestrictionResponse>) responseObserver);
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
              room.members.public.server.v1.Procedures.CountRequest,
              room.members.public.server.v1.Procedures.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.members.public.server.v1.Procedures.RangeRequest,
              room.members.public.server.v1.Procedures.RangeResponse>(
                service, METHODID_RANGE)))
        .addMethod(
          getSelectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.members.public.server.v1.Procedures.SelectRequest,
              room.members.public.server.v1.Procedures.SelectResponse>(
                service, METHODID_SELECT)))
        .addMethod(
          getKickMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.members.public.server.v1.Procedures.KickRequest,
              room.members.public.server.v1.Procedures.KickResponse>(
                service, METHODID_KICK)))
        .addMethod(
          getCreateStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.members.public.server.v1.Procedures.CreateStreamRequest,
              room.members.public.server.v1.Procedures.CreateStreamResponse>(
                service, METHODID_CREATE_STREAM)))
        .addMethod(
          getUpdateStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.members.public.server.v1.Procedures.UpdateStreamRequest,
              room.members.public.server.v1.Procedures.UpdateStreamResponse>(
                service, METHODID_UPDATE_STREAM)))
        .addMethod(
          getDeleteStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.members.public.server.v1.Procedures.DeleteStreamRequest,
              room.members.public.server.v1.Procedures.DeleteStreamResponse>(
                service, METHODID_DELETE_STREAM)))
        .addMethod(
          getCreateRestrictionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.members.public.server.v1.Procedures.CreateRestrictionRequest,
              room.members.public.server.v1.Procedures.CreateRestrictionResponse>(
                service, METHODID_CREATE_RESTRICTION)))
        .addMethod(
          getDeleteRestrictionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.members.public.server.v1.Procedures.DeleteRestrictionRequest,
              room.members.public.server.v1.Procedures.DeleteRestrictionResponse>(
                service, METHODID_DELETE_RESTRICTION)))
        .build();
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return room.members.public.server.v1.Services.getDescriptor();
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
    private final String methodName;

    ServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getCreateStreamMethod())
              .addMethod(getUpdateStreamMethod())
              .addMethod(getDeleteStreamMethod())
              .addMethod(getCreateRestrictionMethod())
              .addMethod(getDeleteRestrictionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
