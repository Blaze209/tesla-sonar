package ti;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.apollographql.apollo3.exception.SubscriptionOperationException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.plaid.internal.EnumC4419g;
import ii.r;
import ii.v;
import ii.w;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import ji.HttpHeader;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import ui.m;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005*\u0001K\u0018\u00002\u00020\u0001:\u0001&B\u007f\b\u0002\u0012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012*\u0010\u0013\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001f\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$R*\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R8\u0010\u0013\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u000205098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020>0=8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lti/e;", "Lri/a;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "serverUrl", "", "Lji/d;", "headers", "Lti/d;", "webSocketEngine", "", "idleTimeoutMillis", "Lti/g$a;", "protocolFactory", "Lkotlin/Function3;", "", "", "reopenWhen", "<init>", "(Lwn0/l;Ljava/util/List;Lti/d;JLti/g$a;Lwn0/q;)V", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Ljn0/h0;", "g", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lii/v$a;", "D", "Lii/f;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lii/g;", "a", "(Lii/f;)Lkotlinx/coroutines/flow/Flow;", "dispose", "()V", "Lwn0/l;", "b", "Ljava/util/List;", "c", "Lti/d;", DateTokenConverter.CONVERTER_KEY, "J", "e", "Lti/g$a;", "f", "Lwn0/q;", "Lkotlinx/coroutines/channels/Channel;", "Lui/f;", "Lkotlinx/coroutines/channels/Channel;", "messages", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lui/d;", "h", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "mutableEvents", "Lkotlinx/coroutines/flow/SharedFlow;", IntegerTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/StateFlow;", "", "j", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "subscriptionCount", "Lpi/c;", "k", "Lpi/c;", "backgroundDispatcher", "l", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "ti/e$i", "m", "Lti/e$i;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class e implements ri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Continuation<? super String>, Object> serverUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> headers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ti.d webSocketEngine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long idleTimeoutMillis;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ti.g.a protocolFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q<Throwable, Long, Continuation<? super Boolean>, Object> reopenWhen;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Channel<ui.f> messages;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<ui.d> mutableEvents;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final SharedFlow<ui.d> events;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Integer> subscriptionCount;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final pi.c backgroundDispatcher;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final i listener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$1", f = "WebSocketNetworkTransport.kt", i = {0}, l = {98}, m = "invokeSuspend", n = {"$this$use$iv"}, s = {"L$0"})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f114545n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f114546o;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f114546o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Closeable closeable;
            h0 h0Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f114545n;
            Throwable th2 = null;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f114546o;
                pi.c cVar = e.this.backgroundDispatcher;
                e eVar = e.this;
                try {
                    this.f114546o = cVar;
                    this.f114545n = 1;
                    if (eVar.g(coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    closeable = cVar;
                } catch (Throwable th3) {
                    th = th3;
                    closeable = cVar;
                    th2 = th;
                    h0Var = null;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.f114546o;
                try {
                    t.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    h0Var = null;
                }
            }
            h0Var = h0.f84049a;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th5) {
                    if (th2 == null) {
                        th2 = th5;
                    } else {
                        jn0.g.a(th2, th5);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
            s.h(h0Var);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\n\u001a\u00020\u00002\u001e\u0010\u0005\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001c\u001a\u00020\u00002*\u0010\u001b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R.\u0010\u0005\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010(R:\u0010\u001b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010)¨\u0006*"}, d2 = {"Lti/e$b;", "", "<init>", "()V", "", "serverUrl", "e", "(Ljava/lang/String;)Lti/e$b;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "f", "(Lwn0/l;)Lti/e$b;", "Lti/d;", "webSocketEngine", "g", "(Lti/d;)Lti/e$b;", "", "idleTimeoutMillis", "b", "(J)Lti/e$b;", "Lti/g$a;", "protocolFactory", "c", "(Lti/g$a;)Lti/e$b;", "Lkotlin/Function3;", "", "", "reopenWhen", DateTokenConverter.CONVERTER_KEY, "(Lwn0/q;)Lti/e$b;", "Lti/e;", "a", "()Lti/e;", "Lwn0/l;", "", "Lji/d;", "Ljava/util/List;", "headers", "Lti/d;", "Ljava/lang/Long;", "Lti/g$a;", "Lwn0/q;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private wn0.l<? super Continuation<? super String>, ? extends Object> serverUrl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private List<HttpHeader> headers = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private ti.d webSocketEngine;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Long idleTimeoutMillis;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private ti.g.a protocolFactory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private q<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> reopenWhen;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$Builder$serverUrl$1$1", f = "WebSocketNetworkTransport.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.l<Continuation<? super String>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f114554n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ String f114555o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f114555o = str;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f114555o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f114554n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return this.f114555o;
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super String> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        public final e a() {
            wn0.l<? super Continuation<? super String>, ? extends Object> lVar = this.serverUrl;
            if (lVar == null) {
                throw new IllegalStateException("No serverUrl specified");
            }
            List<HttpHeader> list = this.headers;
            ti.d aVar = this.webSocketEngine;
            if (aVar == null) {
                aVar = new ti.a();
            }
            Long l11 = this.idleTimeoutMillis;
            long jLongValue = l11 != null ? l11.longValue() : 60000L;
            ti.g.a aVar2 = this.protocolFactory;
            if (aVar2 == null) {
                aVar2 = new ti.b.a(0L, null, null, 7, null);
            }
            return new e(lVar, list, aVar, jLongValue, aVar2, this.reopenWhen, null);
        }

        public final b b(long idleTimeoutMillis) {
            this.idleTimeoutMillis = Long.valueOf(idleTimeoutMillis);
            return this;
        }

        public final b c(ti.g.a protocolFactory) {
            s.k(protocolFactory, "protocolFactory");
            this.protocolFactory = protocolFactory;
            return this;
        }

        public final b d(q<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> reopenWhen) {
            this.reopenWhen = reopenWhen;
            return this;
        }

        public final b e(String serverUrl) {
            s.k(serverUrl, "serverUrl");
            this.serverUrl = new a(serverUrl, null);
            return this;
        }

        public final b f(wn0.l<? super Continuation<? super String>, ? extends Object> serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public final b g(ti.d webSocketEngine) {
            s.k(webSocketEngine, "webSocketEngine");
            this.webSocketEngine = webSocketEngine;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements Flow<ui.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f114556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ii.f f114557b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f114558a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ii.f f114559b;

            /* JADX INFO: renamed from: ti.e$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2", f = "WebSocketNetworkTransport.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C2442a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f114560n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f114561o;

                public C2442a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f114560n = obj;
                    this.f114561o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, ii.f fVar) {
                this.f114558a = flowCollector;
                this.f114559b = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C2442a c2442a;
                if (continuation instanceof C2442a) {
                    c2442a = (C2442a) continuation;
                    int i11 = c2442a.f114561o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2442a.f114561o = i11 - Integer.MIN_VALUE;
                    } else {
                        c2442a = new C2442a(continuation);
                    }
                } else {
                    c2442a = new C2442a(continuation);
                }
                Object obj2 = c2442a.f114560n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c2442a.f114561o;
                if (i12 == 0) {
                    t.b(obj2);
                    FlowCollector flowCollector = this.f114558a;
                    ui.d dVar = (ui.d) obj;
                    if (s.f(dVar.getId(), this.f114559b.getRequestUuid().toString()) || dVar.getId() == null) {
                        c2442a.f114561o = 1;
                        if (flowCollector.emit(obj, c2442a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj2);
                }
                return h0.f84049a;
            }
        }

        public c(Flow flow, ii.f fVar) {
            this.f114556a = flow;
            this.f114557b = fVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super ui.d> flowCollector, Continuation continuation) {
            Object objCollect = this.f114556a.collect(new a(flowCollector, this.f114557b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d<D> implements Flow<ii.g<D>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f114563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pi.d f114564b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f114565a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pi.d f114566b;

            /* JADX INFO: renamed from: ti.e$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2", f = "WebSocketNetworkTransport.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C2443a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f114567n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f114568o;

                public C2443a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f114567n = obj;
                    this.f114568o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, pi.d dVar) {
                this.f114565a = flowCollector;
                this.f114566b = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C2443a c2443a;
                if (continuation instanceof C2443a) {
                    c2443a = (C2443a) continuation;
                    int i11 = c2443a.f114568o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2443a.f114568o = i11 - Integer.MIN_VALUE;
                    } else {
                        c2443a = new C2443a(continuation);
                    }
                } else {
                    c2443a = new C2443a(continuation);
                }
                Object obj2 = c2443a.f114567n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c2443a.f114568o;
                if (i12 == 0) {
                    t.b(obj2);
                    FlowCollector flowCollector = this.f114565a;
                    if (!this.f114566b.getIsEmptyPayload()) {
                        c2443a.f114568o = 1;
                        if (flowCollector.emit(obj, c2443a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj2);
                }
                return h0.f84049a;
            }
        }

        public d(Flow flow, pi.d dVar) {
            this.f114563a = flow;
            this.f114564b = dVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f114563a.collect(new a(flowCollector, this.f114564b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* JADX INFO: renamed from: ti.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class C2444e<D> implements Flow<ii.g<D>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f114570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ii.f f114571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pi.d f114572c;

        /* JADX INFO: renamed from: ti.e$e$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f114573a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ii.f f114574b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pi.d f114575c;

            /* JADX INFO: renamed from: ti.e$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2", f = "WebSocketNetworkTransport.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C2445a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f114576n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f114577o;

                public C2445a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f114576n = obj;
                    this.f114577o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, ii.f fVar, pi.d dVar) {
                this.f114573a = flowCollector;
                this.f114574b = fVar;
                this.f114575c = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C2445a c2445a;
                if (continuation instanceof C2445a) {
                    c2445a = (C2445a) continuation;
                    int i11 = c2445a.f114577o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2445a.f114577o = i11 - Integer.MIN_VALUE;
                    } else {
                        c2445a = new C2445a(continuation);
                    }
                } else {
                    c2445a = new C2445a(continuation);
                }
                Object obj2 = c2445a.f114576n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c2445a.f114577o;
                if (i12 == 0) {
                    t.b(obj2);
                    FlowCollector flowCollector = this.f114573a;
                    ui.d dVar = (ui.d) obj;
                    if (!(dVar instanceof ui.j)) {
                        if (dVar instanceof ui.i) {
                            throw new SubscriptionOperationException(this.f114574b.f().name(), ((ui.i) dVar).a());
                        }
                        if (dVar instanceof ui.g) {
                            throw new ApolloNetworkException("Network error while executing " + this.f114574b.f().name(), ((ui.g) dVar).getCause());
                        }
                        if (!(dVar instanceof ui.b ? true : dVar instanceof ui.h ? true : dVar instanceof ui.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException(("Unexpected event " + dVar).toString());
                    }
                    Map<String, ? extends Object> mapA = ((ui.j) dVar).a();
                    r.c cVarA = this.f114574b.getExecutionContext().a(ii.k.INSTANCE);
                    s.h(cVarA);
                    ii.k kVar = (ii.k) cVarA;
                    Pair pairA = pi.e.a(mapA) ? x.a(this.f114575c.f(mapA), ii.a.a(kVar, this.f114575c.c())) : x.a(mapA, kVar);
                    ii.g gVarB = w.a(this.f114574b.f(), mi.a.b((Map) pairA.a()), (ii.k) pairA.b()).b().f(this.f114574b.getRequestUuid()).b();
                    if (!this.f114575c.getHasNext()) {
                        this.f114575c.j();
                    }
                    c2445a.f114577o = 1;
                    if (flowCollector.emit(gVarB, c2445a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj2);
                }
                return h0.f84049a;
            }
        }

        public C2444e(Flow flow, ii.f fVar, pi.d dVar) {
            this.f114570a = flow;
            this.f114571b = fVar;
            this.f114572c = dVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f114570a.collect(new a(flowCollector, this.f114571b, this.f114572c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lii/v$a;", "D", "Lkotlinx/coroutines/flow/FlowCollector;", "Lui/d;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$1", f = "WebSocketNetworkTransport.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<FlowCollector<? super ui.d>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f114579n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ii.f<D> f114581p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ii.f<D> fVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f114581p = fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new f(this.f114581p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f114579n;
            if (i11 == 0) {
                t.b(obj);
                Channel channel = e.this.messages;
                ui.l lVar = new ui.l(this.f114581p);
                this.f114579n = 1;
                if (channel.send(lVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super ui.d> flowCollector, Continuation<? super h0> continuation) {
            return ((f) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lii/v$a;", "D", "Lkotlinx/coroutines/flow/FlowCollector;", "Lui/d;", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lui/d;)Z"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$3", f = "WebSocketNetworkTransport.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, EnumC4419g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements q<FlowCollector<? super ui.d>, ui.d, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f114582n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f114583o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f114584p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ii.f<D> f114585q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ii.f<D> fVar, Continuation<? super g> continuation) {
            super(3, continuation);
            this.f114585q = fVar;
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super ui.d> flowCollector, ui.d dVar, Continuation<? super Boolean> continuation) {
            g gVar = new g(this.f114585q, continuation);
            gVar.f114583o = flowCollector;
            gVar.f114584p = dVar;
            return gVar.invokeSuspend(h0.f84049a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L27;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f114582n
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                jn0.t.b(r8)
                goto L76
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                jn0.t.b(r8)
                goto L83
            L1f:
                jn0.t.b(r8)
                java.lang.Object r8 = r7.f114583o
                kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                java.lang.Object r1 = r7.f114584p
                ui.d r1 = (ui.d) r1
                boolean r5 = r1 instanceof ui.h
                if (r5 == 0) goto L2f
                goto L83
            L2f:
                boolean r5 = r1 instanceof ui.b
                if (r5 == 0) goto L34
                goto L83
            L34:
                boolean r5 = r1 instanceof ui.g
                r6 = 0
                if (r5 == 0) goto L44
                r7.f114583o = r6
                r7.f114582n = r4
                java.lang.Object r8 = r8.emit(r1, r7)
                if (r8 != r0) goto L83
                goto L82
            L44:
                boolean r3 = r1 instanceof ui.e
                if (r3 == 0) goto L78
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Received general error while executing operation "
                r8.append(r0)
                ii.f<D> r0 = r7.f114585q
                ii.v r0 = r0.f()
                java.lang.String r0 = r0.name()
                r8.append(r0)
                java.lang.String r0 = ": "
                r8.append(r0)
                ui.e r1 = (ui.e) r1
                java.util.Map r0 = r1.a()
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                java.io.PrintStream r0 = java.lang.System.out
                r0.println(r8)
            L76:
                r3 = r4
                goto L83
            L78:
                r7.f114583o = r6
                r7.f114582n = r2
                java.lang.Object r8 = r8.emit(r1, r7)
                if (r8 != r0) goto L76
            L82:
                return r0
            L83:
                java.lang.Boolean r8 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ti.e.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lii/v$a;", "D", "Lkotlinx/coroutines/flow/FlowCollector;", "Lii/g;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$execute$6", f = "WebSocketNetworkTransport.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
    static final class h<D> extends SuspendLambda implements q<FlowCollector<? super ii.g<D>>, Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f114586n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ii.f<D> f114588p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ii.f<D> fVar, Continuation<? super h> continuation) {
            super(3, continuation);
            this.f114588p = fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f114586n;
            if (i11 == 0) {
                t.b(obj);
                Channel channel = e.this.messages;
                m mVar = new m(this.f114588p);
                this.f114586n = 1;
                if (channel.send(mVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.q
        public final Object invoke(FlowCollector<? super ii.g<D>> flowCollector, Throwable th2, Continuation<? super h0> continuation) {
            return e.this.new h(this.f114588p, continuation).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"ti/e$i", "Lti/g$b;", "", "id", "", "", StatusResponse.PAYLOAD, "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/util/Map;)V", "a", "c", "(Ljava/lang/String;)V", "b", "(Ljava/util/Map;)V", "", "cause", "e", "(Ljava/lang/Throwable;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class i implements ti.g.b {
        i() {
        }

        @Override // ti.g.b
        public void a(String id2, Map<String, ? extends Object> payload) {
            s.k(id2, "id");
            e.this.messages.mo85trySendJP2dKIU(new ui.i(id2, payload));
        }

        @Override // ti.g.b
        public void b(Map<String, ? extends Object> payload) {
            e.this.messages.mo85trySendJP2dKIU(new ui.e(payload));
        }

        @Override // ti.g.b
        public void c(String id2) {
            s.k(id2, "id");
            e.this.messages.mo85trySendJP2dKIU(new ui.h(id2));
        }

        @Override // ti.g.b
        public void d(String id2, Map<String, ? extends Object> payload) {
            s.k(id2, "id");
            s.k(payload, "payload");
            e.this.messages.mo85trySendJP2dKIU(new ui.j(id2, payload));
        }

        @Override // ti.g.b
        public void e(Throwable cause) {
            s.k(cause, "cause");
            e.this.messages.mo85trySendJP2dKIU(new ui.g(cause));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport", f = "WebSocketNetworkTransport.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8}, l = {154, 159, 161, 195, 194, EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m = "supervise", n = {"this", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", "this", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", "this", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", "this", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", "this", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", "this", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", "this", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", "this", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", "this", "scope", "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0"})
    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f114590n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f114591o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f114592p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f114593q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f114594r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f114595s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f114596t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f114597u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        long f114598v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f114599w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f114601y;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114599w = obj;
            this.f114601y |= Integer.MIN_VALUE;
            return e.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$supervise$3", f = "WebSocketNetworkTransport.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f114602n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ n0<ti.g> f114603o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(n0<ti.g> n0Var, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f114603o = n0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new k(this.f114603o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f114602n;
            if (i11 == 0) {
                t.b(obj);
                ti.g gVar = this.f114603o.f86529a;
                s.h(gVar);
                this.f114602n = 1;
                if (gVar.f(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$supervise$4", f = "WebSocketNetworkTransport.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f114604n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ n0<ti.g> f114606p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ n0<Job> f114607q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ n0<Job> f114608r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(n0<ti.g> n0Var, n0<Job> n0Var2, n0<Job> n0Var3, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f114606p = n0Var;
            this.f114607q = n0Var2;
            this.f114608r = n0Var3;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new l(this.f114606p, this.f114607q, this.f114608r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f114604n;
            if (i11 == 0) {
                t.b(obj);
                long j11 = e.this.idleTimeoutMillis;
                this.f114604n = 1;
                if (DelayKt.delay(j11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            e.h(this.f114606p, this.f114607q, this.f114608r);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ e(wn0.l lVar, List list, ti.d dVar, long j11, ti.g.a aVar, q qVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, list, dVar, j11, aVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:138:0x0454  */
    /* JADX WARN: Code duplicated, block: B:141:0x0467  */
    /* JADX WARN: Code duplicated, block: B:142:0x0484  */
    /* JADX WARN: Code duplicated, block: B:144:0x0488  */
    /* JADX WARN: Code duplicated, block: B:145:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:147:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:152:0x04da  */
    /* JADX WARN: Code duplicated, block: B:153:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:155:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:77:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, java.lang.Object, ti.g] */
    /* JADX WARN: Type inference failed for: r1v33, types: [T, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x040e -> B:128:0x0411). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0467 -> B:150:0x04cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x0488 -> B:150:0x04cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x04a6 -> B:150:0x04cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x04c8 -> B:150:0x04cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x050b -> B:158:0x0508). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(kotlinx.coroutines.CoroutineScope r25, p013kotlin.coroutines.Continuation<? super jn0.h0> r26) {
        /*
            Method dump skipped, instruction units count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.e.g(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(n0<ti.g> n0Var, n0<Job> n0Var2, n0<Job> n0Var3) {
        ti.g gVar = n0Var.f86529a;
        if (gVar != null) {
            gVar.a();
        }
        n0Var.f86529a = null;
        Job job = n0Var2.f86529a;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        n0Var2.f86529a = null;
        Job job2 = n0Var3.f86529a;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        n0Var3.f86529a = null;
    }

    @Override // ri.a
    public <D extends v.a> Flow<ii.g<D>> a(ii.f<D> request) {
        s.k(request, "request");
        pi.d dVar = new pi.d();
        return FlowKt.onCompletion(new d(new C2444e(pi.g.a(new c(FlowKt.onSubscription(this.events, new f(request, null)), request), new g(request, null)), request, dVar), dVar), new h(request, null));
    }

    @Override // ri.a
    public void dispose() {
        this.messages.mo85trySendJP2dKIU(ui.c.f116287a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(wn0.l<? super Continuation<? super String>, ? extends Object> lVar, List<HttpHeader> list, ti.d dVar, long j11, ti.g.a aVar, q<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> qVar) {
        this.serverUrl = lVar;
        this.headers = list;
        this.webSocketEngine = dVar;
        this.idleTimeoutMillis = j11;
        this.protocolFactory = aVar;
        this.reopenWhen = qVar;
        this.messages = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        MutableSharedFlow<ui.d> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, Integer.MAX_VALUE, BufferOverflow.SUSPEND);
        this.mutableEvents = MutableSharedFlow;
        this.events = FlowKt.asSharedFlow(MutableSharedFlow);
        this.subscriptionCount = MutableSharedFlow.getSubscriptionCount();
        pi.c cVar = new pi.c();
        this.backgroundDispatcher = cVar;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(cVar.c());
        this.coroutineScope = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(null), 3, null);
        this.listener = new i();
    }
}
