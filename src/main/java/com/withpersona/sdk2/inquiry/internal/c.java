package com.withpersona.sdk2.inquiry.internal;

import hh0.InquiryAttributes;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/c;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "Lhh0/d;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiryApiHelper", "<init>", "(Lhh0/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "otherWorker", "", "a", "(Ly20/o;)Z", "b", "Lhh0/d;", "c", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements y20.o<com.withpersona.sdk2.inquiry.internal.network.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InquiryAttributes attributes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/c$a;", "", "Lhh0/d;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/c;", "a", "(Lhh0/d;)Lcom/withpersona/sdk2/inquiry/internal/c;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        c a(InquiryAttributes attributes);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker$run$1", f = "CreateInquiryWorker.kt", i = {}, l = {19, 19}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<FlowCollector<? super com.withpersona.sdk2.inquiry.internal.network.a>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57544n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f57545o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = c.this.new b(continuation);
            bVar.f57545o = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f57544n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L4d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f57545o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r6)
                goto L41
            L22:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f57545o
                r1 = r6
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.withpersona.sdk2.inquiry.internal.c r6 = com.withpersona.sdk2.inquiry.internal.c.this
                com.withpersona.sdk2.inquiry.internal.network.e r6 = com.withpersona.sdk2.inquiry.internal.c.c(r6)
                com.withpersona.sdk2.inquiry.internal.c r4 = com.withpersona.sdk2.inquiry.internal.c.this
                hh0.d r4 = com.withpersona.sdk2.inquiry.internal.c.b(r4)
                r5.f57545o = r1
                r5.f57544n = r3
                java.lang.Object r6 = r6.h(r4, r5)
                if (r6 != r0) goto L41
                goto L4c
            L41:
                r3 = 0
                r5.f57545o = r3
                r5.f57544n = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L4d
            L4c:
                return r0
            L4d:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super com.withpersona.sdk2.inquiry.internal.network.a> flowCollector, Continuation<? super h0> continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c(InquiryAttributes attributes, com.withpersona.sdk2.inquiry.internal.network.e inquiryApiHelper) {
        p013kotlin.jvm.internal.s.k(attributes, "attributes");
        p013kotlin.jvm.internal.s.k(inquiryApiHelper, "inquiryApiHelper");
        this.attributes = attributes;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // y20.o
    public boolean a(y20.o<?> otherWorker) {
        p013kotlin.jvm.internal.s.k(otherWorker, "otherWorker");
        if (!(otherWorker instanceof c)) {
            return false;
        }
        c cVar = (c) otherWorker;
        return p013kotlin.jvm.internal.s.f(this.attributes.getTemplateId(), cVar.attributes.getTemplateId()) && p013kotlin.jvm.internal.s.f(this.attributes.getTemplateVersion(), cVar.attributes.getTemplateVersion()) && this.attributes.getEnvironment() == cVar.attributes.getEnvironment();
    }

    @Override // y20.o
    public Flow<com.withpersona.sdk2.inquiry.internal.network.a> run() {
        return FlowKt.flow(new b(null));
    }
}
