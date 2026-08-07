package com.fourthline.orca.internal;

import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3062av implements ED {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uv f30505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rv f30506b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.av$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f30508b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Jj f30510d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Jj jj2, Continuation continuation) {
            super(2, continuation);
            this.f30510d = jj2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = C3062av.this.new a(this.f30510d, continuation);
            aVar.f30508b = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r7.a(r1, r4, r6) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f30507a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                jn0.t.b(r7)
                goto L4f
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.f30508b
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r7)
                goto L3c
            L23:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f30508b
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.fourthline.orca.internal.FD$c r7 = new com.fourthline.orca.internal.FD$c
                r5 = 0
                r7.<init>(r5, r4, r2)
                r6.f30508b = r1
                r6.f30507a = r4
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L3c
                goto L4e
            L3c:
                com.fourthline.orca.internal.av r7 = com.fourthline.orca.internal.C3062av.this
                com.fourthline.orca.internal.Jj r4 = r6.f30510d
                com.fourthline.core.location.Coordinate r4 = r4.a()
                r6.f30508b = r2
                r6.f30507a = r3
                java.lang.Object r7 = r7.a(r1, r4, r6)
                if (r7 != r0) goto L4f
            L4e:
                return r0
            L4f:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3062av.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.av$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30512b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f30514d;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30512b = obj;
            this.f30514d |= Integer.MIN_VALUE;
            return C3062av.this.a(null, null, this);
        }
    }

    public C3062av(Uv startSignatureWorker, Rv repository) {
        p013kotlin.jvm.internal.s.k(startSignatureWorker, "startSignatureWorker");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.f30505a = startSignatureWorker;
        this.f30506b = repository;
    }

    @Override // com.fourthline.orca.internal.ED
    public Object a(Jj jj2, Continuation continuation) {
        return FlowKt.flow(new a(jj2, null));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
    
        if (r6.emit(r8, r0) == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r6, com.fourthline.core.location.Coordinate r7, p013kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3062av.a(kotlinx.coroutines.flow.FlowCollector, com.fourthline.core.location.Coordinate, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
