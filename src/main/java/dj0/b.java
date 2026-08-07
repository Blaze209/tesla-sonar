package dj0;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.webrtc.networking.AuthorizeWebRtcResponse;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import retrofit2.y;
import wn0.l;
import wn0.p;
import y20.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u0010B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ldj0/b;", "Ly20/o;", "Ldj0/b$b;", "Ldj0/a;", "service", "", "jwt", "<init>", "(Ldj0/a;Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Ldj0/a;", "c", "Ljava/lang/String;", "a", "webrtc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements o<AbstractC1237b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dj0.a service;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String jwt;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldj0/b$a;", "", "Ldj0/a;", "service", "<init>", "(Ldj0/a;)V", "", "jwt", "Ldj0/b;", "a", "(Ljava/lang/String;)Ldj0/b;", "Ldj0/a;", "b", "()Ldj0/a;", "webrtc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final dj0.a service;

        public a(dj0.a service) {
            s.k(service, "service");
            this.service = service;
        }

        public final b a(String jwt) {
            return new b(this.service, jwt);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final dj0.a getService() {
            return this.service;
        }
    }

    /* JADX INFO: renamed from: dj0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ldj0/b$b;", "", "<init>", "()V", "b", "a", "Ldj0/b$b$a;", "Ldj0/b$b$b;", "webrtc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AbstractC1237b {

        /* JADX INFO: renamed from: dj0.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ldj0/b$b$a;", "Ldj0/b$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "webrtc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends AbstractC1237b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo cause) {
                super(null);
                s.k(cause, "cause");
                this.cause = cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && s.f(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: dj0.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ldj0/b$b$b;", "Ldj0/b$b;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "result", "<init>", "(Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "()Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "webrtc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1238b extends AbstractC1237b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final AuthorizeWebRtcResponse result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1238b(AuthorizeWebRtcResponse result) {
                super(null);
                s.k(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AuthorizeWebRtcResponse getResult() {
                return this.result;
            }
        }

        public /* synthetic */ AbstractC1237b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1237b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Ldj0/b$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1", f = "WebRtcWorker.kt", i = {0, 1, 1, 2, 2, 3}, l = {36, 40, 42, 53}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$onSuccess$iv", "$this$flow", "$this$onSuccess$iv", "$this$onFailure$iv"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class c extends SuspendLambda implements p<FlowCollector<? super AbstractC1237b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f60696n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f60697o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f60698p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1$1", f = "WebRtcWorker.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super y<AuthorizeWebRtcResponse>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f60700n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f60701o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f60701o = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f60701o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f60700n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                dj0.a aVar = this.f60701o.service;
                String str = this.f60701o.jwt;
                this.f60700n = 1;
                Object objA = aVar.a(str, this);
                return objA == coroutine_suspended ? coroutine_suspended : objA;
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<AuthorizeWebRtcResponse>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f60698p = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        
            if (r1.emit(r4, r14) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        
            r4 = r1;
            r1 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
        
            if (r1.emit(r5, r14) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
        
            if (r1.emit(r5, r14) == r0) goto L33;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.f60697o
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3a
                if (r1 == r6) goto L32
                if (r1 == r5) goto L26
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r0 = r14.f60698p
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r0
                jn0.t.b(r15)
                goto Lbb
            L1e:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L26:
                java.lang.Object r1 = r14.f60696n
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r1 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r1
                java.lang.Object r4 = r14.f60698p
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                jn0.t.b(r15)
                goto L7c
            L32:
                java.lang.Object r1 = r14.f60698p
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r15)
                goto L57
            L3a:
                jn0.t.b(r15)
                java.lang.Object r15 = r14.f60698p
                kotlinx.coroutines.flow.FlowCollector r15 = (kotlinx.coroutines.flow.FlowCollector) r15
                dj0.b$c$a r1 = new dj0.b$c$a
                dj0.b r7 = dj0.b.this
                r1.<init>(r7, r2)
                r14.f60698p = r15
                r14.f60697o = r6
                java.lang.Object r1 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueRetriableRequestWithRetry(r1, r14)
                if (r1 != r0) goto L54
                goto Lba
            L54:
                r13 = r1
                r1 = r15
                r15 = r13
            L57:
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r15 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r15
                boolean r6 = r15 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
                if (r6 == 0) goto L9e
                r6 = r15
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r6 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r6
                java.lang.Object r6 = r6.getResponse()
                com.withpersona.sdk2.inquiry.webrtc.networking.AuthorizeWebRtcResponse r6 = (com.withpersona.sdk2.inquiry.webrtc.networking.AuthorizeWebRtcResponse) r6
                if (r6 == 0) goto L7f
                dj0.b$b$b r4 = new dj0.b$b$b
                r4.<init>(r6)
                r14.f60698p = r1
                r14.f60696n = r15
                r14.f60697o = r5
                java.lang.Object r4 = r1.emit(r4, r14)
                if (r4 != r0) goto L7a
                goto Lba
            L7a:
                r4 = r1
                r1 = r15
            L7c:
                r15 = r1
                r1 = r4
                goto L9e
            L7f:
                dj0.b$b$a r5 = new dj0.b$b$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r6 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo
                r11 = 8
                r12 = 0
                r7 = 0
                java.lang.String r8 = "Expected body to be non-null."
                r9 = 0
                r10 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                r5.<init>(r6)
                r14.f60698p = r1
                r14.f60696n = r15
                r14.f60697o = r4
                java.lang.Object r4 = r1.emit(r5, r14)
                if (r4 != r0) goto L7a
                goto Lba
            L9e:
                boolean r4 = r15 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
                if (r4 == 0) goto Lbb
                r4 = r15
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r4 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure) r4
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r4 = r4.getNetworkErrorInfo()
                dj0.b$b$a r5 = new dj0.b$b$a
                r5.<init>(r4)
                r14.f60698p = r15
                r14.f60696n = r2
                r14.f60697o = r3
                java.lang.Object r15 = r1.emit(r5, r14)
                if (r15 != r0) goto Lbb
            Lba:
                return r0
            Lbb:
                jn0.h0 r15 = jn0.h0.f84049a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: dj0.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super AbstractC1237b> flowCollector, Continuation<? super h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(dj0.a service, String str) {
        s.k(service, "service");
        this.service = service;
        this.jwt = str;
    }

    @Override // y20.o
    public boolean a(o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override // y20.o
    public Flow<AbstractC1237b> run() {
        return FlowKt.flow(new c(null));
    }
}
