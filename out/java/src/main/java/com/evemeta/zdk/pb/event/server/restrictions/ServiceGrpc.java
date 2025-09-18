package com.evemeta.zdk.pb.event.server.restrictions;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "event.restrictions.public.server.v1.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.CountRequest,
      com.evemeta.zdk.pb.event.server.restrictions.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.evemeta.zdk.pb.event.server.restrictions.CountRequest.class,
      responseType = com.evemeta.zdk.pb.event.server.restrictions.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.CountRequest,
      com.evemeta.zdk.pb.event.server.restrictions.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.CountRequest, com.evemeta.zdk.pb.event.server.restrictions.CountResponse> getCountMethod;
    if ((getCountMethod = ServiceGrpc.getCountMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCountMethod = ServiceGrpc.getCountMethod) == null) {
          ServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.event.server.restrictions.CountRequest, com.evemeta.zdk.pb.event.server.restrictions.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.event.server.restrictions.CountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.event.server.restrictions.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.RangeRequest,
      com.evemeta.zdk.pb.event.server.restrictions.RangeResponse> getRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Range",
      requestType = com.evemeta.zdk.pb.event.server.restrictions.RangeRequest.class,
      responseType = com.evemeta.zdk.pb.event.server.restrictions.RangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.RangeRequest,
      com.evemeta.zdk.pb.event.server.restrictions.RangeResponse> getRangeMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.RangeRequest, com.evemeta.zdk.pb.event.server.restrictions.RangeResponse> getRangeMethod;
    if ((getRangeMethod = ServiceGrpc.getRangeMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRangeMethod = ServiceGrpc.getRangeMethod) == null) {
          ServiceGrpc.getRangeMethod = getRangeMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.event.server.restrictions.RangeRequest, com.evemeta.zdk.pb.event.server.restrictions.RangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Range"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.event.server.restrictions.RangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.event.server.restrictions.RangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Range"))
              .build();
        }
      }
    }
    return getRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.SelectRequest,
      com.evemeta.zdk.pb.event.server.restrictions.SelectResponse> getSelectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Select",
      requestType = com.evemeta.zdk.pb.event.server.restrictions.SelectRequest.class,
      responseType = com.evemeta.zdk.pb.event.server.restrictions.SelectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.SelectRequest,
      com.evemeta.zdk.pb.event.server.restrictions.SelectResponse> getSelectMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.SelectRequest, com.evemeta.zdk.pb.event.server.restrictions.SelectResponse> getSelectMethod;
    if ((getSelectMethod = ServiceGrpc.getSelectMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getSelectMethod = ServiceGrpc.getSelectMethod) == null) {
          ServiceGrpc.getSelectMethod = getSelectMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.event.server.restrictions.SelectRequest, com.evemeta.zdk.pb.event.server.restrictions.SelectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Select"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.event.server.restrictions.SelectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.event.server.restrictions.SelectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Select"))
              .build();
        }
      }
    }
    return getSelectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.CreateRequest,
      com.evemeta.zdk.pb.event.server.restrictions.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.evemeta.zdk.pb.event.server.restrictions.CreateRequest.class,
      responseType = com.evemeta.zdk.pb.event.server.restrictions.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.CreateRequest,
      com.evemeta.zdk.pb.event.server.restrictions.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.CreateRequest, com.evemeta.zdk.pb.event.server.restrictions.CreateResponse> getCreateMethod;
    if ((getCreateMethod = ServiceGrpc.getCreateMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateMethod = ServiceGrpc.getCreateMethod) == null) {
          ServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.event.server.restrictions.CreateRequest, com.evemeta.zdk.pb.event.server.restrictions.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.event.server.restrictions.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.event.server.restrictions.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest,
      com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest.class,
      responseType = com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest,
      com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest, com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ServiceGrpc.getDeleteMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getDeleteMethod = ServiceGrpc.getDeleteMethod) == null) {
          ServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest, com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse.getDefaultInstance()))
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
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingV2Stub>() {
        @java.lang.Override
        public ServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ServiceBlockingV2Stub.newStub(factory, channel);
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
     * Count represents a procedure that retrieves the total number of restrictions based on a specific query.
     * </pre>
     */
    default void count(com.evemeta.zdk.pb.event.server.restrictions.CountRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of restrictions based on a specific query.
     * </pre>
     */
    default void range(com.evemeta.zdk.pb.event.server.restrictions.RangeRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.RangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific restrictions based on a specific query.
     * </pre>
     */
    default void select(com.evemeta.zdk.pb.event.server.restrictions.SelectRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.SelectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create represents a procedure that creates a new restriction.
     * </pre>
     */
    default void create(com.evemeta.zdk.pb.event.server.restrictions.CreateRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.CreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete represents a procedure that deletes a specific restriction based on its unique identifier.
     * </pre>
     */
    default void delete(com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse> responseObserver) {
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
     * Count represents a procedure that retrieves the total number of restrictions based on a specific query.
     * </pre>
     */
    public void count(com.evemeta.zdk.pb.event.server.restrictions.CountRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of restrictions based on a specific query.
     * </pre>
     */
    public void range(com.evemeta.zdk.pb.event.server.restrictions.RangeRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.RangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific restrictions based on a specific query.
     * </pre>
     */
    public void select(com.evemeta.zdk.pb.event.server.restrictions.SelectRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.SelectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSelectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create represents a procedure that creates a new restriction.
     * </pre>
     */
    public void create(com.evemeta.zdk.pb.event.server.restrictions.CreateRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.CreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete represents a procedure that deletes a specific restriction based on its unique identifier.
     * </pre>
     */
    public void delete(com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Service.
   */
  public static final class ServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ServiceBlockingV2Stub> {
    private ServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Count represents a procedure that retrieves the total number of restrictions based on a specific query.
     * </pre>
     */
    public com.evemeta.zdk.pb.event.server.restrictions.CountResponse count(com.evemeta.zdk.pb.event.server.restrictions.CountRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of restrictions based on a specific query.
     * </pre>
     */
    public com.evemeta.zdk.pb.event.server.restrictions.RangeResponse range(com.evemeta.zdk.pb.event.server.restrictions.RangeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific restrictions based on a specific query.
     * </pre>
     */
    public com.evemeta.zdk.pb.event.server.restrictions.SelectResponse select(com.evemeta.zdk.pb.event.server.restrictions.SelectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSelectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create represents a procedure that creates a new restriction.
     * </pre>
     */
    public com.evemeta.zdk.pb.event.server.restrictions.CreateResponse create(com.evemeta.zdk.pb.event.server.restrictions.CreateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete represents a procedure that deletes a specific restriction based on its unique identifier.
     * </pre>
     */
    public com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse delete(com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Service.
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
     * Count represents a procedure that retrieves the total number of restrictions based on a specific query.
     * </pre>
     */
    public com.evemeta.zdk.pb.event.server.restrictions.CountResponse count(com.evemeta.zdk.pb.event.server.restrictions.CountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of restrictions based on a specific query.
     * </pre>
     */
    public com.evemeta.zdk.pb.event.server.restrictions.RangeResponse range(com.evemeta.zdk.pb.event.server.restrictions.RangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific restrictions based on a specific query.
     * </pre>
     */
    public com.evemeta.zdk.pb.event.server.restrictions.SelectResponse select(com.evemeta.zdk.pb.event.server.restrictions.SelectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSelectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create represents a procedure that creates a new restriction.
     * </pre>
     */
    public com.evemeta.zdk.pb.event.server.restrictions.CreateResponse create(com.evemeta.zdk.pb.event.server.restrictions.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete represents a procedure that deletes a specific restriction based on its unique identifier.
     * </pre>
     */
    public com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse delete(com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest request) {
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
     * Count represents a procedure that retrieves the total number of restrictions based on a specific query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.event.server.restrictions.CountResponse> count(
        com.evemeta.zdk.pb.event.server.restrictions.CountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Range represents a procedure that retrieves a chunk of restrictions based on a specific query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.event.server.restrictions.RangeResponse> range(
        com.evemeta.zdk.pb.event.server.restrictions.RangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Select represents a procedure that retrieves specific restrictions based on a specific query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.event.server.restrictions.SelectResponse> select(
        com.evemeta.zdk.pb.event.server.restrictions.SelectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSelectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create represents a procedure that creates a new restriction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.event.server.restrictions.CreateResponse> create(
        com.evemeta.zdk.pb.event.server.restrictions.CreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete represents a procedure that deletes a specific restriction based on its unique identifier.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse> delete(
        com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COUNT = 0;
  private static final int METHODID_RANGE = 1;
  private static final int METHODID_SELECT = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_DELETE = 4;

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
          serviceImpl.count((com.evemeta.zdk.pb.event.server.restrictions.CountRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.CountResponse>) responseObserver);
          break;
        case METHODID_RANGE:
          serviceImpl.range((com.evemeta.zdk.pb.event.server.restrictions.RangeRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.RangeResponse>) responseObserver);
          break;
        case METHODID_SELECT:
          serviceImpl.select((com.evemeta.zdk.pb.event.server.restrictions.SelectRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.SelectResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.evemeta.zdk.pb.event.server.restrictions.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.CreateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse>) responseObserver);
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
              com.evemeta.zdk.pb.event.server.restrictions.CountRequest,
              com.evemeta.zdk.pb.event.server.restrictions.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.event.server.restrictions.RangeRequest,
              com.evemeta.zdk.pb.event.server.restrictions.RangeResponse>(
                service, METHODID_RANGE)))
        .addMethod(
          getSelectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.event.server.restrictions.SelectRequest,
              com.evemeta.zdk.pb.event.server.restrictions.SelectResponse>(
                service, METHODID_SELECT)))
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.event.server.restrictions.CreateRequest,
              com.evemeta.zdk.pb.event.server.restrictions.CreateResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evemeta.zdk.pb.event.server.restrictions.DeleteRequest,
              com.evemeta.zdk.pb.event.server.restrictions.DeleteResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.evemeta.zdk.pb.event.server.restrictions.Services.getDescriptor();
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
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
