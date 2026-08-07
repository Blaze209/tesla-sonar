package com.withpersona.sdk2.inquiry.internal;

import bh0.t2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0012B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/internal/r$b;", "Lbh0/t2;", "uiStepSavedStateHelper", "", "sessionToken", "inquiryId", "stepName", "<init>", "(Lbh0/t2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "otherWorker", "", "a", "(Ly20/o;)Z", "b", "Lbh0/t2;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "e", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r implements y20.o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t2 uiStepSavedStateHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String inquiryId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String stepName;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r$a;", "", "", "sessionToken", "inquiryId", "stepName", "Lcom/withpersona/sdk2/inquiry/internal/r;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/r;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        r a(String sessionToken, String inquiryId, String stepName);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r$b;", "", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/r$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/r$b$b;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/r$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f58221a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1486380735;
            }

            public String toString() {
                return "Failure";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.r$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/r$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/r$b;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1188b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<UiComponentConfig> components;

            /* JADX WARN: Multi-variable type inference failed */
            public C1188b(List<? extends UiComponentConfig> components) {
                p013kotlin.jvm.internal.s.k(components, "components");
                this.components = components;
            }

            public final List<UiComponentConfig> a() {
                return this.components;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/r$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker$run$1", f = "RestoreUiStepStateWorker.kt", i = {0}, l = {33, 40, 42}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    static final class c extends SuspendLambda implements wn0.p<FlowCollector<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f58223n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f58224o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = r.this.new c(continuation);
            cVar.f58224o = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
        
            if (r1.emit(r2, r8) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L22;
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
                int r1 = r8.f58223n
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                jn0.t.b(r9)
                goto L73
            L1e:
                java.lang.Object r1 = r8.f58224o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r9)
                goto L51
            L26:
                jn0.t.b(r9)
                java.lang.Object r9 = r8.f58224o
                r1 = r9
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.withpersona.sdk2.inquiry.internal.r r9 = com.withpersona.sdk2.inquiry.internal.r.this
                bh0.t2 r9 = com.withpersona.sdk2.inquiry.internal.r.e(r9)
                com.withpersona.sdk2.inquiry.internal.r r5 = com.withpersona.sdk2.inquiry.internal.r.this
                java.lang.String r5 = com.withpersona.sdk2.inquiry.internal.r.c(r5)
                com.withpersona.sdk2.inquiry.internal.r r6 = com.withpersona.sdk2.inquiry.internal.r.this
                java.lang.String r6 = com.withpersona.sdk2.inquiry.internal.r.b(r6)
                com.withpersona.sdk2.inquiry.internal.r r7 = com.withpersona.sdk2.inquiry.internal.r.this
                java.lang.String r7 = com.withpersona.sdk2.inquiry.internal.r.d(r7)
                r8.f58224o = r1
                r8.f58223n = r4
                java.lang.Object r9 = r9.d(r5, r6, r7, r8)
                if (r9 != r0) goto L51
                goto L72
            L51:
                java.util.List r9 = (java.util.List) r9
                r4 = 0
                if (r9 == 0) goto L66
                com.withpersona.sdk2.inquiry.internal.r$b$b r2 = new com.withpersona.sdk2.inquiry.internal.r$b$b
                r2.<init>(r9)
                r8.f58224o = r4
                r8.f58223n = r3
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto L73
                goto L72
            L66:
                com.withpersona.sdk2.inquiry.internal.r$b$a r9 = com.withpersona.sdk2.inquiry.internal.r.b.a.f58221a
                r8.f58224o = r4
                r8.f58223n = r2
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L73
            L72:
                return r0
            L73:
                jn0.h0 r9 = jn0.h0.f84049a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.r.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public r(t2 uiStepSavedStateHelper, String sessionToken, String inquiryId, String stepName) {
        p013kotlin.jvm.internal.s.k(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
        p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
        p013kotlin.jvm.internal.s.k(stepName, "stepName");
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.stepName = stepName;
    }

    @Override // y20.o
    public boolean a(y20.o<?> otherWorker) {
        p013kotlin.jvm.internal.s.k(otherWorker, "otherWorker");
        if (!(otherWorker instanceof r)) {
            return false;
        }
        r rVar = (r) otherWorker;
        return p013kotlin.jvm.internal.s.f(rVar.sessionToken, this.sessionToken) && p013kotlin.jvm.internal.s.f(rVar.inquiryId, this.inquiryId) && p013kotlin.jvm.internal.s.f(rVar.stepName, this.stepName);
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new c(null));
    }
}
