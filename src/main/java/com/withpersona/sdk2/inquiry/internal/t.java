package com.withpersona.sdk2.inquiry.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import hi0.InquirySessionConfig;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B9\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/t;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", "", "sessionToken", "inquiryId", "fromStep", "Lhi0/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhi0/g;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "otherWorker", "", "a", "(Ly20/o;)Z", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lhi0/g;", "()Lhi0/g;", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "()Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t implements y20.o<com.withpersona.sdk2.inquiry.internal.network.h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String inquiryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String fromStep;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InquirySessionConfig inquirySessionConfig;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/t$a;", "", "", "sessionToken", "inquiryId", "fromStep", "Lhi0/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/t;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhi0/g;)Lcom/withpersona/sdk2/inquiry/internal/t;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        t a(String sessionToken, String inquiryId, String fromStep, InquirySessionConfig inquirySessionConfig);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.TransitionBackWorker$run$1", f = "TransitionBackWorker.kt", i = {}, l = {21, 21}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<FlowCollector<? super com.withpersona.sdk2.inquiry.internal.network.h>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f58232n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f58233o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = t.this.new b(continuation);
            bVar.f58233o = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f58232n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                jn0.t.b(r11)
                r9 = r10
                goto L62
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                java.lang.Object r1 = r10.f58233o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r11)
                r9 = r10
                goto L56
            L24:
                jn0.t.b(r11)
                java.lang.Object r11 = r10.f58233o
                r1 = r11
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.withpersona.sdk2.inquiry.internal.t r11 = com.withpersona.sdk2.inquiry.internal.t.this
                com.withpersona.sdk2.inquiry.internal.network.e r4 = r11.getInquiryApiHelper()
                com.withpersona.sdk2.inquiry.internal.t r11 = com.withpersona.sdk2.inquiry.internal.t.this
                java.lang.String r5 = r11.getSessionToken()
                com.withpersona.sdk2.inquiry.internal.t r11 = com.withpersona.sdk2.inquiry.internal.t.this
                java.lang.String r6 = r11.getInquiryId()
                com.withpersona.sdk2.inquiry.internal.t r11 = com.withpersona.sdk2.inquiry.internal.t.this
                java.lang.String r7 = r11.getFromStep()
                com.withpersona.sdk2.inquiry.internal.t r11 = com.withpersona.sdk2.inquiry.internal.t.this
                hi0.g r8 = r11.getInquirySessionConfig()
                r10.f58233o = r1
                r10.f58232n = r3
                r9 = r10
                java.lang.Object r11 = r4.n(r5, r6, r7, r8, r9)
                if (r11 != r0) goto L56
                goto L61
            L56:
                r3 = 0
                r9.f58233o = r3
                r9.f58232n = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L62
            L61:
                return r0
            L62:
                jn0.h0 r11 = jn0.h0.f84049a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super com.withpersona.sdk2.inquiry.internal.network.h> flowCollector, Continuation<? super h0> continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public t(String sessionToken, String inquiryId, String fromStep, InquirySessionConfig inquirySessionConfig, com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
        p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
        p013kotlin.jvm.internal.s.k(fromStep, "fromStep");
        p013kotlin.jvm.internal.s.k(inquirySessionConfig, "inquirySessionConfig");
        p013kotlin.jvm.internal.s.k(inquiryApiHelper, "inquiryApiHelper");
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.fromStep = fromStep;
        this.inquirySessionConfig = inquirySessionConfig;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // y20.o
    public boolean a(y20.o<?> otherWorker) {
        p013kotlin.jvm.internal.s.k(otherWorker, "otherWorker");
        if (!(otherWorker instanceof t)) {
            return false;
        }
        t tVar = (t) otherWorker;
        return p013kotlin.jvm.internal.s.f(this.sessionToken, tVar.sessionToken) && p013kotlin.jvm.internal.s.f(this.inquiryId, tVar.inquiryId);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFromStep() {
        return this.fromStep;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.withpersona.sdk2.inquiry.internal.network.e getInquiryApiHelper() {
        return this.inquiryApiHelper;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInquiryId() {
        return this.inquiryId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InquirySessionConfig getInquirySessionConfig() {
        return this.inquirySessionConfig;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override // y20.o
    public Flow<com.withpersona.sdk2.inquiry.internal.network.h> run() {
        return FlowKt.flow(new b(null));
    }
}
