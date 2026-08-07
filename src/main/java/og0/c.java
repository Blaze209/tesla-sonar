package og0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\u0014B#\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Log0/c;", "Ly20/o;", "Log0/c$b;", "", "sessionToken", "Lng0/b;", "featureFlagManager", "Log0/b;", "featureFlagService", "<init>", "(Ljava/lang/String;Lng0/b;Log0/b;)V", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Ljava/lang/String;", "c", "Lng0/b;", DateTokenConverter.CONVERTER_KEY, "Log0/b;", "a", "feature-flag_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ng0.b featureFlagManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final og0.b featureFlagService;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Log0/c$a;", "", "", "sessionToken", "Log0/c;", "a", "(Ljava/lang/String;)Log0/c;", "feature-flag_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        c a(String sessionToken);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Log0/c$b;", "", "<init>", "()V", "b", "a", "Log0/c$b$a;", "Log0/c$b$b;", "feature-flag_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Log0/c$b$a;", "Log0/c$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "feature-flag_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f97321a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 727805021;
            }

            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: og0.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Log0/c$b$b;", "Log0/c$b;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "getData", "()Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "feature-flag_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final FeatureFlagResponse data;

            public Success(FeatureFlagResponse featureFlagResponse) {
                super(null);
                this.data = featureFlagResponse;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && s.f(this.data, ((Success) other).data);
            }

            public int hashCode() {
                FeatureFlagResponse featureFlagResponse = this.data;
                if (featureFlagResponse == null) {
                    return 0;
                }
                return featureFlagResponse.hashCode();
            }

            public String toString() {
                return "Success(data=" + this.data + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: og0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Log0/c$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1", f = "FeatureFlagWorker.kt", i = {0, 1, 1, 2}, l = {21, 30, 32}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$onSuccess$iv", "$this$onFailure$iv"}, s = {"L$0", "L$0", "L$1", "L$0"})
    static final class C2089c extends SuspendLambda implements p<FlowCollector<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f97323n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f97324o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f97325p;

        /* JADX INFO: renamed from: og0.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1$1", f = "FeatureFlagWorker.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super y<FeatureFlagResponse>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f97327n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ c f97328o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f97328o = cVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f97328o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f97327n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                og0.b bVar = this.f97328o.featureFlagService;
                String str = this.f97328o.sessionToken;
                String[] strArr = (String[]) this.f97328o.featureFlagManager.a().a().toArray(new String[0]);
                this.f97327n = 1;
                Object objA = bVar.a(str, strArr, this);
                return objA == coroutine_suspended ? coroutine_suspended : objA;
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<FeatureFlagResponse>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        C2089c(Continuation<? super C2089c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2089c c2089c = c.this.new C2089c(continuation);
            c2089c.f97325p = obj;
            return c2089c;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0085  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
        
            if (r1.emit(r4, r8) == r0) goto L27;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f97324o
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L37
                if (r1 == r5) goto L2f
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                java.lang.Object r0 = r8.f97325p
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r0
                jn0.t.b(r9)
                goto L9a
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.f97323n
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r1 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r1
                java.lang.Object r4 = r8.f97325p
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                jn0.t.b(r9)
                goto L7f
            L2f:
                java.lang.Object r1 = r8.f97325p
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r9)
                goto L53
            L37:
                jn0.t.b(r9)
                java.lang.Object r9 = r8.f97325p
                kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                og0.c$c$a r1 = new og0.c$c$a
                og0.c r6 = og0.c.this
                r1.<init>(r6, r2)
                r8.f97325p = r9
                r8.f97324o = r5
                java.lang.Object r1 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueVerificationRequestWithRetry(r1, r8)
                if (r1 != r0) goto L50
                goto L99
            L50:
                r7 = r1
                r1 = r9
                r9 = r7
            L53:
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r9 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r9
                og0.c r5 = og0.c.this
                boolean r6 = r9 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
                if (r6 == 0) goto L81
                r6 = r9
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r6 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r6
                java.lang.Object r6 = r6.getResponse()
                com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse r6 = (com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse) r6
                ng0.b r5 = og0.c.b(r5)
                r5.c(r6)
                og0.c$b$b r5 = new og0.c$b$b
                r5.<init>(r6)
                r8.f97325p = r1
                r8.f97323n = r9
                r8.f97324o = r4
                java.lang.Object r4 = r1.emit(r5, r8)
                if (r4 != r0) goto L7d
                goto L99
            L7d:
                r4 = r1
                r1 = r9
            L7f:
                r9 = r1
                r1 = r4
            L81:
                boolean r4 = r9 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
                if (r4 == 0) goto L9a
                r4 = r9
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r4 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure) r4
                r4.getNetworkErrorInfo()
                og0.c$b$a r4 = og0.c.b.a.f97321a
                r8.f97325p = r9
                r8.f97323n = r2
                r8.f97324o = r3
                java.lang.Object r9 = r1.emit(r4, r8)
                if (r9 != r0) goto L9a
            L99:
                return r0
            L9a:
                jn0.h0 r9 = jn0.h0.f84049a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: og0.c.C2089c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super h0> continuation) {
            return ((C2089c) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c(String sessionToken, ng0.b featureFlagManager, og0.b featureFlagService) {
        s.k(sessionToken, "sessionToken");
        s.k(featureFlagManager, "featureFlagManager");
        s.k(featureFlagService, "featureFlagService");
        this.sessionToken = sessionToken;
        this.featureFlagManager = featureFlagManager;
        this.featureFlagService = featureFlagService;
    }

    @Override // y20.o
    public boolean a(o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new C2089c(null));
    }
}
