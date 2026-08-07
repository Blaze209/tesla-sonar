package bh0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lbh0/g;", "", "Lhh0/s;", "inquiryService", "Lcom/squareup/moshi/u;", "moshi", "Lkh0/b;", "logger", "<init>", "(Lhh0/s;Lcom/squareup/moshi/u;Lkh0/b;)V", "", "sessionToken", "subsystem", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "errorType", "Lkh0/a;", "level", "Ljn0/h0;", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lkh0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Job;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "f", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lkotlinx/coroutines/Job;", "h", "a", "Lhh0/s;", "b", "Lcom/squareup/moshi/u;", "c", "Lkh0/b;", "Lkotlinx/coroutines/CoroutineScope;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hh0.s inquiryService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.squareup.moshi.u moshi;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kh0.b logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportError$1", f = "ErrorReportingManager.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17242n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f17244p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InternalErrorInfo f17245q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, InternalErrorInfo internalErrorInfo, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f17244p = str;
            this.f17245q = internalErrorInfo;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return g.this.new a(this.f17244p, this.f17245q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f17242n;
            if (i11 == 0) {
                jn0.t.b(obj);
                hh0.s sVar = g.this.inquiryService;
                String str = this.f17244p;
                ErrorRequest errorRequest = new ErrorRequest(com.withpersona.sdk2.inquiry.internal.network.c.a(this.f17245q), g.this.moshi.c(InternalErrorInfo.class).toJsonValue(this.f17245q));
                this.f17242n = 1;
                if (sVar.h(str, errorRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager", f = "ErrorReportingManager.kt", i = {0, 0, 0}, l = {62, 71}, m = "reportError", n = {"this", "sessionToken", "errorType"}, s = {"L$0", "L$1", "L$2"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f17246n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f17247o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f17248p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f17249q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f17251s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17249q = obj;
            this.f17251s |= Integer.MIN_VALUE;
            return g.this.e(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1", f = "ErrorReportingManager.kt", i = {}, l = {48, 49, 50, 52}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17252n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f17254p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f17254p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return g.this.new c(this.f17254p, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0075 A[PHI: r10
          0x0075: PHI (r10v3 bh0.g$c) = (r10v2 bh0.g$c), (r10v6 bh0.g$c) binds: [B:21:0x0072, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            if (r14.e(r13) == r0) goto L25;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f17252n
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L27
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                jn0.t.b(r14)
                r10 = r13
                goto L84
            L1a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L22:
                jn0.t.b(r14)
                r10 = r13
                goto L75
            L27:
                jn0.t.b(r14)
                r10 = r13
                goto L60
            L2c:
                jn0.t.b(r14)
                r10 = r13
                goto L4b
            L31:
                jn0.t.b(r14)
                r14 = r5
                bh0.g r5 = bh0.g.this
                java.lang.String r6 = r13.f17254p
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Nfc
                r13.f17252n = r14
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.nfc"
                r9 = 0
                r11 = 8
                r12 = 0
                r10 = r13
                java.lang.Object r14 = bh0.g.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L4b
                goto L83
            L4b:
                bh0.g r5 = bh0.g.this
                java.lang.String r6 = r10.f17254p
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Network
                r10.f17252n = r4
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.network"
                r9 = 0
                r11 = 8
                r12 = 0
                java.lang.Object r14 = bh0.g.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L60
                goto L83
            L60:
                bh0.g r5 = bh0.g.this
                java.lang.String r6 = r10.f17254p
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Other
                r10.f17252n = r3
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.integrity"
                r9 = 0
                r11 = 8
                r12 = 0
                java.lang.Object r14 = bh0.g.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L75
                goto L83
            L75:
                bh0.g r14 = bh0.g.this
                kh0.b r14 = bh0.g.b(r14)
                r10.f17252n = r2
                java.lang.Object r14 = r14.e(r13)
                if (r14 != r0) goto L84
            L83:
                return r0
            L84:
                jn0.h0 r14 = jn0.h0.f84049a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: bh0.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportSessionCancelled$1", f = "ErrorReportingManager.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17255n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f17257p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f17257p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return g.this.new d(this.f17257p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f17255n;
            if (i11 == 0) {
                jn0.t.b(obj);
                hh0.s sVar = g.this.inquiryService;
                String str = this.f17257p;
                this.f17255n = 1;
                if (sVar.e(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public g(hh0.s inquiryService, com.squareup.moshi.u moshi, kh0.b logger) {
        p013kotlin.jvm.internal.s.k(inquiryService, "inquiryService");
        p013kotlin.jvm.internal.s.k(moshi, "moshi");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        this.inquiryService = inquiryService;
        this.moshi = moshi;
        this.logger = logger;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r9.h(r6, r2, r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, java.lang.String r7, com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a r8, kh0.a r9, p013kotlin.coroutines.Continuation<? super jn0.h0> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof bh0.g.b
            if (r0 == 0) goto L13
            r0 = r10
            bh0.g$b r0 = (bh0.g.b) r0
            int r1 = r0.f17251s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17251s = r1
            goto L18
        L13:
            bh0.g$b r0 = new bh0.g$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f17249q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17251s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r10)
            goto L92
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f17248p
            r8 = r6
            com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = (com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a) r8
            java.lang.Object r6 = r0.f17247o
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f17246n
            bh0.g r7 = (bh0.g) r7
            jn0.t.b(r10)
            goto L5a
        L45:
            jn0.t.b(r10)
            kh0.b r10 = r5.logger
            r0.f17246n = r5
            r0.f17247o = r6
            r0.f17248p = r8
            r0.f17251s = r4
            java.lang.Object r10 = r10.g(r7, r9, r0)
            if (r10 != r1) goto L59
            goto L91
        L59:
            r7 = r5
        L5a:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L61
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        L61:
            boolean r9 = p013kotlin.text.t.y0(r10)
            if (r9 == 0) goto L6a
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        L6a:
            hh0.s r9 = r7.inquiryService
            com.withpersona.sdk2.inquiry.internal.network.ErrorRequest r2 = new com.withpersona.sdk2.inquiry.internal.network.ErrorRequest
            com.squareup.moshi.u r7 = r7.moshi
            java.lang.Class<com.withpersona.sdk2.inquiry.internal.ErrorLog> r4 = com.withpersona.sdk2.inquiry.internal.ErrorLog.class
            com.squareup.moshi.h r7 = r7.c(r4)
            com.withpersona.sdk2.inquiry.internal.ErrorLog r4 = new com.withpersona.sdk2.inquiry.internal.ErrorLog
            r4.<init>(r10)
            java.lang.Object r7 = r7.toJsonValue(r4)
            r2.<init>(r8, r7)
            r7 = 0
            r0.f17246n = r7
            r0.f17247o = r7
            r0.f17248p = r7
            r0.f17251s = r3
            java.lang.Object r6 = r9.h(r6, r2, r0)
            if (r6 != r1) goto L92
        L91:
            return r1
        L92:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bh0.g.e(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a, kh0.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object g(g gVar, String str, String str2, ErrorRequest.a aVar, kh0.a aVar2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            aVar2 = kh0.a.Error;
        }
        return gVar.e(str, str2, aVar, aVar2, continuation);
    }

    public final Job f(String sessionToken, InternalErrorInfo errorInfo) {
        p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
        p013kotlin.jvm.internal.s.k(errorInfo, "errorInfo");
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getIO(), null, new a(sessionToken, errorInfo, null), 2, null);
    }

    public final Job h(String sessionToken) {
        p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getIO(), null, new c(sessionToken, null), 2, null);
    }

    public final Job i(String sessionToken) {
        p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getIO(), null, new d(sessionToken, null), 2, null);
    }
}
