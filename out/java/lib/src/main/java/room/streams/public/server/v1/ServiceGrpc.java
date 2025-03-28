package room.streams.public.server.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: room/streams/public/server/v1/services.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final String SERVICE_NAME = "room.streams.public.server.v1.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.CountRequest,
      room.streams.public.server.v1.Procedures.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = room.streams.public.server.v1.Procedures.CountRequest.class,
      responseType = room.streams.public.server.v1.Procedures.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.CountRequest,
      room.streams.public.server.v1.Procedures.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.CountRequest, room.streams.public.server.v1.Procedures.CountResponse> getCountMethod;
    if ((getCountMethod = ServiceGrpc.getCountMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCountMethod = ServiceGrpc.getCountMethod) == null) {
          ServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<room.streams.public.server.v1.Procedures.CountRequest, room.streams.public.server.v1.Procedures.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.CountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.RangeRequest,
      room.streams.public.server.v1.Procedures.RangeResponse> getRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Range",
      requestType = room.streams.public.server.v1.Procedures.RangeRequest.class,
      responseType = room.streams.public.server.v1.Procedures.RangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.RangeRequest,
      room.streams.public.server.v1.Procedures.RangeResponse> getRangeMethod() {
    io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.RangeRequest, room.streams.public.server.v1.Procedures.RangeResponse> getRangeMethod;
    if ((getRangeMethod = ServiceGrpc.getRangeMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRangeMethod = ServiceGrpc.getRangeMethod) == null) {
          ServiceGrpc.getRangeMethod = getRangeMethod =
              io.grpc.MethodDescriptor.<room.streams.public.server.v1.Procedures.RangeRequest, room.streams.public.server.v1.Procedures.RangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Range"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.RangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.RangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Range"))
              .build();
        }
      }
    }
    return getRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.SelectRequest,
      room.streams.public.server.v1.Procedures.SelectResponse> getSelectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Select",
      requestType = room.streams.public.server.v1.Procedures.SelectRequest.class,
      responseType = room.streams.public.server.v1.Procedures.SelectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.SelectRequest,
      room.streams.public.server.v1.Procedures.SelectResponse> getSelectMethod() {
    io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.SelectRequest, room.streams.public.server.v1.Procedures.SelectResponse> getSelectMethod;
    if ((getSelectMethod = ServiceGrpc.getSelectMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getSelectMethod = ServiceGrpc.getSelectMethod) == null) {
          ServiceGrpc.getSelectMethod = getSelectMethod =
              io.grpc.MethodDescriptor.<room.streams.public.server.v1.Procedures.SelectRequest, room.streams.public.server.v1.Procedures.SelectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Select"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.SelectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.SelectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Select"))
              .build();
        }
      }
    }
    return getSelectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.CreateRequest,
      room.streams.public.server.v1.Procedures.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = room.streams.public.server.v1.Procedures.CreateRequest.class,
      responseType = room.streams.public.server.v1.Procedures.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.CreateRequest,
      room.streams.public.server.v1.Procedures.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.CreateRequest, room.streams.public.server.v1.Procedures.CreateResponse> getCreateMethod;
    if ((getCreateMethod = ServiceGrpc.getCreateMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateMethod = ServiceGrpc.getCreateMethod) == null) {
          ServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<room.streams.public.server.v1.Procedures.CreateRequest, room.streams.public.server.v1.Procedures.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.UpdateRequest,
      room.streams.public.server.v1.Procedures.UpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = room.streams.public.server.v1.Procedures.UpdateRequest.class,
      responseType = room.streams.public.server.v1.Procedures.UpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.UpdateRequest,
      room.streams.public.server.v1.Procedures.UpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.UpdateRequest, room.streams.public.server.v1.Procedures.UpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = ServiceGrpc.getUpdateMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getUpdateMethod = ServiceGrpc.getUpdateMethod) == null) {
          ServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<room.streams.public.server.v1.Procedures.UpdateRequest, room.streams.public.server.v1.Procedures.UpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.UpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.DeleteRequest,
      room.streams.public.server.v1.Procedures.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = room.streams.public.server.v1.Procedures.DeleteRequest.class,
      responseType = room.streams.public.server.v1.Procedures.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.DeleteRequest,
      room.streams.public.server.v1.Procedures.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<room.streams.public.server.v1.Procedures.DeleteRequest, room.streams.public.server.v1.Procedures.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ServiceGrpc.getDeleteMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getDeleteMethod = ServiceGrpc.getDeleteMethod) == null) {
          ServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<room.streams.public.server.v1.Procedures.DeleteRequest, room.streams.public.server.v1.Procedures.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.streams.public.server.v1.Procedures.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
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
     * Count represents a procedure that retrieves the total number of streams based on a specific query.
     * </pre>
     */
    default void count(room.streams.public.server.v1.Procedures.CountRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of streams based on a specific query.
     * </pre>
     */
    default void range(room.streams.public.server.v1.Procedures.RangeRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.RangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific streams based on a specific query.
     * </pre>
     */
    default void select(room.streams.public.server.v1.Procedures.SelectRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.SelectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create represents a procedure that creates a new stream.
     * </pre>
     */
    default void create(room.streams.public.server.v1.Procedures.CreateRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.CreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update represents a procedure that updates a specific stream based on its unique identifier.
     * </pre>
     */
    default void update(room.streams.public.server.v1.Procedures.UpdateRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.UpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete represents a procedure that deletes a specific stream based on its unique identifier.
     * </pre>
     */
    default void delete(room.streams.public.server.v1.Procedures.DeleteRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
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
     * Count represents a procedure that retrieves the total number of streams based on a specific query.
     * </pre>
     */
    public void count(room.streams.public.server.v1.Procedures.CountRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of streams based on a specific query.
     * </pre>
     */
    public void range(room.streams.public.server.v1.Procedures.RangeRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.RangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific streams based on a specific query.
     * </pre>
     */
    public void select(room.streams.public.server.v1.Procedures.SelectRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.SelectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSelectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create represents a procedure that creates a new stream.
     * </pre>
     */
    public void create(room.streams.public.server.v1.Procedures.CreateRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.CreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update represents a procedure that updates a specific stream based on its unique identifier.
     * </pre>
     */
    public void update(room.streams.public.server.v1.Procedures.UpdateRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.UpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete represents a procedure that deletes a specific stream based on its unique identifier.
     * </pre>
     */
    public void delete(room.streams.public.server.v1.Procedures.DeleteRequest request,
        io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
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
     * Count represents a procedure that retrieves the total number of streams based on a specific query.
     * </pre>
     */
    public room.streams.public.server.v1.Procedures.CountResponse count(room.streams.public.server.v1.Procedures.CountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of streams based on a specific query.
     * </pre>
     */
    public room.streams.public.server.v1.Procedures.RangeResponse range(room.streams.public.server.v1.Procedures.RangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific streams based on a specific query.
     * </pre>
     */
    public room.streams.public.server.v1.Procedures.SelectResponse select(room.streams.public.server.v1.Procedures.SelectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSelectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create represents a procedure that creates a new stream.
     * </pre>
     */
    public room.streams.public.server.v1.Procedures.CreateResponse create(room.streams.public.server.v1.Procedures.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update represents a procedure that updates a specific stream based on its unique identifier.
     * </pre>
     */
    public room.streams.public.server.v1.Procedures.UpdateResponse update(room.streams.public.server.v1.Procedures.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete represents a procedure that deletes a specific stream based on its unique identifier.
     * </pre>
     */
    public room.streams.public.server.v1.Procedures.DeleteResponse delete(room.streams.public.server.v1.Procedures.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
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
     * Count represents a procedure that retrieves the total number of streams based on a specific query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.streams.public.server.v1.Procedures.CountResponse> count(
        room.streams.public.server.v1.Procedures.CountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of streams based on a specific query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.streams.public.server.v1.Procedures.RangeResponse> range(
        room.streams.public.server.v1.Procedures.RangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific streams based on a specific query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.streams.public.server.v1.Procedures.SelectResponse> select(
        room.streams.public.server.v1.Procedures.SelectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSelectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create represents a procedure that creates a new stream.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.streams.public.server.v1.Procedures.CreateResponse> create(
        room.streams.public.server.v1.Procedures.CreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update represents a procedure that updates a specific stream based on its unique identifier.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.streams.public.server.v1.Procedures.UpdateResponse> update(
        room.streams.public.server.v1.Procedures.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete represents a procedure that deletes a specific stream based on its unique identifier.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.streams.public.server.v1.Procedures.DeleteResponse> delete(
        room.streams.public.server.v1.Procedures.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COUNT = 0;
  private static final int METHODID_RANGE = 1;
  private static final int METHODID_SELECT = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_DELETE = 5;

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
          serviceImpl.count((room.streams.public.server.v1.Procedures.CountRequest) request,
              (io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.CountResponse>) responseObserver);
          break;
        case METHODID_RANGE:
          serviceImpl.range((room.streams.public.server.v1.Procedures.RangeRequest) request,
              (io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.RangeResponse>) responseObserver);
          break;
        case METHODID_SELECT:
          serviceImpl.select((room.streams.public.server.v1.Procedures.SelectRequest) request,
              (io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.SelectResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((room.streams.public.server.v1.Procedures.CreateRequest) request,
              (io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.CreateResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((room.streams.public.server.v1.Procedures.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.UpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((room.streams.public.server.v1.Procedures.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<room.streams.public.server.v1.Procedures.DeleteResponse>) responseObserver);
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
              room.streams.public.server.v1.Procedures.CountRequest,
              room.streams.public.server.v1.Procedures.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.streams.public.server.v1.Procedures.RangeRequest,
              room.streams.public.server.v1.Procedures.RangeResponse>(
                service, METHODID_RANGE)))
        .addMethod(
          getSelectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.streams.public.server.v1.Procedures.SelectRequest,
              room.streams.public.server.v1.Procedures.SelectResponse>(
                service, METHODID_SELECT)))
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.streams.public.server.v1.Procedures.CreateRequest,
              room.streams.public.server.v1.Procedures.CreateResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.streams.public.server.v1.Procedures.UpdateRequest,
              room.streams.public.server.v1.Procedures.UpdateResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              room.streams.public.server.v1.Procedures.DeleteRequest,
              room.streams.public.server.v1.Procedures.DeleteResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return room.streams.public.server.v1.Services.getDescriptor();
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
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
