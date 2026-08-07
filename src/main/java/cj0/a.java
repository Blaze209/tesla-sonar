package cj0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.ui.network.AddressDetailsResponse;
import com.withpersona.sdk2.inquiry.ui.network.LocationData;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u000fB!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcj0/a;", "Ly20/o;", "Lcj0/a$b;", "", "sessionToken", "addressId", "Lcj0/b;", "uiService", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcj0/b;)V", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "otherWorker", "", "a", "(Ly20/o;)Z", "b", "Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "Lcj0/b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String addressId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cj0.b uiService;

    /* JADX INFO: renamed from: cj0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcj0/a$a;", "", "Lcj0/b;", "uiService", "<init>", "(Lcj0/b;)V", "", "sessionToken", "addressId", "Lcj0/a;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcj0/a;", "Lcj0/b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0396a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final cj0.b uiService;

        public C0396a(cj0.b uiService) {
            s.k(uiService, "uiService");
            this.uiService = uiService;
        }

        public final a a(String sessionToken, String addressId) {
            s.k(sessionToken, "sessionToken");
            s.k(addressId, "addressId");
            return new a(sessionToken, addressId, this.uiService, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcj0/a$b;", "", "<init>", "()V", "b", "a", "Lcj0/a$b$a;", "Lcj0/a$b$b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: cj0.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcj0/a$b$a;", "Lcj0/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0397a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0397a(InternalErrorInfo cause) {
                super(null);
                s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: cj0.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcj0/a$b$b;", "Lcj0/a$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "result", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "()Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0398b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final LocationData result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0398b(LocationData result) {
                super(null);
                s.k(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LocationData getResult() {
                return this.result;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcj0/a$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker$run$1", f = "UiAddressDetailsWorker.kt", i = {0, 1, 1, 2, 2, 3}, l = {19, 27, 29, 40}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$onSuccess$iv", "$this$flow", "$this$onSuccess$iv", "$this$onFailure$iv"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class c extends SuspendLambda implements p<FlowCollector<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f19379n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f19380o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f19381p;

        /* JADX INFO: renamed from: cj0.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker$run$1$1", f = "UiAddressDetailsWorker.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
        static final class C0399a extends SuspendLambda implements l<Continuation<? super y<AddressDetailsResponse>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f19383n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ a f19384o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0399a(a aVar, Continuation<? super C0399a> continuation) {
                super(1, continuation);
                this.f19384o = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new C0399a(this.f19384o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f19383n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                cj0.b bVar = this.f19384o.uiService;
                String str = this.f19384o.sessionToken;
                String str2 = this.f19384o.addressId;
                this.f19383n = 1;
                Object objA = bVar.a(str, str2, this);
                return objA == coroutine_suspended ? coroutine_suspended : objA;
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<AddressDetailsResponse>> continuation) {
                return ((C0399a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = a.this.new c(continuation);
            cVar.f19381p = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        
            if (r1.emit(r3, r14) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            r3 = r1;
            r1 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
        
            if (r1.emit(r4, r14) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
        
            if (r1.emit(r4, r14) == r0) goto L35;
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
                int r1 = r14.f19380o
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L3b
                if (r1 == r5) goto L32
                if (r1 == r4) goto L26
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r14.f19381p
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r0
                jn0.t.b(r15)
                goto Lc1
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L26:
                java.lang.Object r1 = r14.f19379n
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r1 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r1
                java.lang.Object r3 = r14.f19381p
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                jn0.t.b(r15)
                goto L82
            L32:
                java.lang.Object r1 = r14.f19381p
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r15)
                r5 = r15
                goto L55
            L3b:
                jn0.t.b(r15)
                java.lang.Object r1 = r14.f19381p
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                cj0.a$c$a r7 = new cj0.a$c$a
                cj0.a r8 = cj0.a.this
                r7.<init>(r8, r6)
                r14.f19381p = r1
                r14.f19380o = r5
                java.lang.Object r5 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueRetriableRequestWithRetry(r7, r14)
                if (r5 != r0) goto L55
                goto Lc0
            L55:
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r5 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r5
                boolean r7 = r5 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
                if (r7 == 0) goto La4
                r7 = r5
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r7 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r7
                java.lang.Object r7 = r7.getResponse()
                com.withpersona.sdk2.inquiry.ui.network.AddressDetailsResponse r7 = (com.withpersona.sdk2.inquiry.ui.network.AddressDetailsResponse) r7
                if (r7 == 0) goto L6b
                com.withpersona.sdk2.inquiry.ui.network.LocationData r7 = r7.getAttributes()
                goto L6c
            L6b:
                r7 = r6
            L6c:
                if (r7 == 0) goto L85
                cj0.a$b$b r3 = new cj0.a$b$b
                r3.<init>(r7)
                r14.f19381p = r1
                r14.f19379n = r5
                r14.f19380o = r4
                java.lang.Object r3 = r1.emit(r3, r14)
                if (r3 != r0) goto L80
                goto Lc0
            L80:
                r3 = r1
                r1 = r5
            L82:
                r5 = r1
                r1 = r3
                goto La4
            L85:
                cj0.a$b$a r4 = new cj0.a$b$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r7 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo
                r12 = 8
                r13 = 0
                r8 = 0
                java.lang.String r9 = "Expected body attributes to be non-null."
                r10 = 0
                r11 = 0
                r7.<init>(r8, r9, r10, r11, r12, r13)
                r4.<init>(r7)
                r14.f19381p = r1
                r14.f19379n = r5
                r14.f19380o = r3
                java.lang.Object r3 = r1.emit(r4, r14)
                if (r3 != r0) goto L80
                goto Lc0
            La4:
                boolean r3 = r5 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
                if (r3 == 0) goto Lc1
                r3 = r5
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r3 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure) r3
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r3 = r3.getNetworkErrorInfo()
                cj0.a$b$a r4 = new cj0.a$b$a
                r4.<init>(r3)
                r14.f19381p = r5
                r14.f19379n = r6
                r14.f19380o = r2
                java.lang.Object r1 = r1.emit(r4, r14)
                if (r1 != r0) goto Lc1
            Lc0:
                return r0
            Lc1:
                jn0.h0 r0 = jn0.h0.f84049a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cj0.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ a(String str, String str2, cj0.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bVar);
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        s.k(otherWorker, "otherWorker");
        return (otherWorker instanceof a) && s.f(this.addressId, ((a) otherWorker).addressId);
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new c(null));
    }

    private a(String str, String str2, cj0.b bVar) {
        this.sessionToken = str;
        this.addressId = str2;
        this.uiService = bVar;
    }
}
