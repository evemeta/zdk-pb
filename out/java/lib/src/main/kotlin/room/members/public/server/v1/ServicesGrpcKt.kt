package room.members.`public`.server.v1

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import room.members.`public`.server.v1.ServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * room.members.public.server.v1.Service.
 */
public object ServiceGrpcKt {
  public const val SERVICE_NAME: String = ServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = ServiceGrpc.getServiceDescriptor()

  public val countMethod: MethodDescriptor<Procedures.CountRequest, Procedures.CountResponse>
    @JvmStatic
    get() = ServiceGrpc.getCountMethod()

  public val rangeMethod: MethodDescriptor<Procedures.RangeRequest, Procedures.RangeResponse>
    @JvmStatic
    get() = ServiceGrpc.getRangeMethod()

  public val selectMethod: MethodDescriptor<Procedures.SelectRequest, Procedures.SelectResponse>
    @JvmStatic
    get() = ServiceGrpc.getSelectMethod()

  public val kickMethod: MethodDescriptor<Procedures.KickRequest, Procedures.KickResponse>
    @JvmStatic
    get() = ServiceGrpc.getKickMethod()

  /**
   * A stub for issuing RPCs to a(n) room.members.public.server.v1.Service service as suspending
   * coroutines.
   */
  @StubFor(ServiceGrpc::class)
  public class ServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions): ServiceCoroutineStub =
        ServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: Procedures.CountRequest, headers: Metadata = Metadata()):
        Procedures.CountResponse = unaryRpc(
      channel,
      ServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun range(request: Procedures.RangeRequest, headers: Metadata = Metadata()):
        Procedures.RangeResponse = unaryRpc(
      channel,
      ServiceGrpc.getRangeMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun select(request: Procedures.SelectRequest, headers: Metadata = Metadata()):
        Procedures.SelectResponse = unaryRpc(
      channel,
      ServiceGrpc.getSelectMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun kick(request: Procedures.KickRequest, headers: Metadata = Metadata()):
        Procedures.KickResponse = unaryRpc(
      channel,
      ServiceGrpc.getKickMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the room.members.public.server.v1.Service service based on Kotlin
   * coroutines.
   */
  public abstract class ServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for room.members.public.server.v1.Service.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: Procedures.CountRequest): Procedures.CountResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method room.members.public.server.v1.Service.Count is unimplemented"))

    /**
     * Returns the response to an RPC for room.members.public.server.v1.Service.Range.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun range(request: Procedures.RangeRequest): Procedures.RangeResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method room.members.public.server.v1.Service.Range is unimplemented"))

    /**
     * Returns the response to an RPC for room.members.public.server.v1.Service.Select.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun select(request: Procedures.SelectRequest): Procedures.SelectResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method room.members.public.server.v1.Service.Select is unimplemented"))

    /**
     * Returns the response to an RPC for room.members.public.server.v1.Service.Kick.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun kick(request: Procedures.KickRequest): Procedures.KickResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method room.members.public.server.v1.Service.Kick is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceGrpc.getRangeMethod(),
      implementation = ::range
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceGrpc.getSelectMethod(),
      implementation = ::select
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ServiceGrpc.getKickMethod(),
      implementation = ::kick
    )).build()
  }
}
