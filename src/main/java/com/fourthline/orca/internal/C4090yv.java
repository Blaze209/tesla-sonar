package com.fourthline.orca.internal;

import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4090yv implements ED {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4133zv f37122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Zv f37123b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yv$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37125b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3448jy f37127d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3448jy c3448jy, Continuation continuation) {
            super(2, continuation);
            this.f37127d = c3448jy;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = C4090yv.this.new a(this.f37127d, continuation);
            aVar.f37125b = obj;
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
                int r1 = r6.f37124a
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
                java.lang.Object r1 = r6.f37125b
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r7)
                goto L3c
            L23:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f37125b
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.fourthline.orca.internal.FD$c r7 = new com.fourthline.orca.internal.FD$c
                r5 = 0
                r7.<init>(r5, r4, r2)
                r6.f37125b = r1
                r6.f37124a = r4
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L3c
                goto L4e
            L3c:
                com.fourthline.orca.internal.yv r7 = com.fourthline.orca.internal.C4090yv.this
                com.fourthline.orca.internal.jy r4 = r6.f37127d
                com.fourthline.vision.selfie.SelfieScannerResult r4 = r4.a()
                r6.f37125b = r2
                r6.f37124a = r3
                java.lang.Object r7 = r7.a(r1, r4, r6)
                if (r7 != r0) goto L4f
            L4e:
                return r0
            L4f:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C4090yv.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yv$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37129b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f37131d;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37129b = obj;
            this.f37131d |= Integer.MIN_VALUE;
            return C4090yv.this.a(null, null, this);
        }
    }

    public C4090yv(InterfaceC4133zv repository, Zv uploadSelfieWorker) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(uploadSelfieWorker, "uploadSelfieWorker");
        this.f37122a = repository;
        this.f37123b = uploadSelfieWorker;
    }

    @Override // com.fourthline.orca.internal.ED
    public Object a(C3448jy c3448jy, Continuation continuation) {
        return FlowKt.flow(new a(c3448jy, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r9.emit(r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r9.emit(r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        if (r9.emit(r11, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r9, com.fourthline.vision.selfie.SelfieScannerResult r10, p013kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.fourthline.orca.internal.C4090yv.b
            if (r0 == 0) goto L13
            r0 = r11
            com.fourthline.orca.internal.yv$b r0 = (com.fourthline.orca.internal.C4090yv.b) r0
            int r1 = r0.f37131d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37131d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.yv$b r0 = new com.fourthline.orca.internal.yv$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f37129b
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37131d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L37
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            goto L37
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            jn0.t.b(r11)
            goto Lbf
        L3c:
            java.lang.Object r9 = r0.f37128a
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            jn0.t.b(r11)
            jn0.s r11 = (jn0.s) r11
            java.lang.Object r10 = r11.getValue()
            goto L6d
        L4a:
            jn0.t.b(r11)
            com.fourthline.orca.internal.Zv r11 = r8.f37123b
            com.fourthline.orca.internal.Zv$a r2 = new com.fourthline.orca.internal.Zv$a
            com.fourthline.orca.internal.zv r7 = r8.f37122a
            java.lang.String r7 = r7.a()
            com.fourthline.vision.ScannerImage r10 = r10.getImage()
            android.graphics.Bitmap r10 = r10.getFull()
            r2.<init>(r7, r10)
            r0.f37128a = r9
            r0.f37131d = r6
            java.lang.Object r10 = r11.a(r2, r0)
            if (r10 != r1) goto L6d
            goto Lbe
        L6d:
            java.lang.Throwable r11 = jn0.s.e(r10)
            r2 = 0
            if (r11 != 0) goto Lab
            com.fourthline.orca.internal.Zv$b r10 = (com.fourthline.orca.internal.Zv.b) r10
            boolean r11 = r10 instanceof com.fourthline.orca.internal.Zv.b.C0538b
            if (r11 == 0) goto L8f
            com.fourthline.orca.internal.FD$a r10 = new com.fourthline.orca.internal.FD$a
            com.fourthline.orca.internal.ux$b r11 = new com.fourthline.orca.internal.ux$b
            r11.<init>(r2, r6, r2)
            r10.<init>(r11)
            r0.f37128a = r2
            r0.f37131d = r5
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto Lbf
            goto Lbe
        L8f:
            boolean r10 = r10 instanceof com.fourthline.orca.internal.Zv.b.a
            if (r10 == 0) goto La5
            com.fourthline.orca.internal.FD$b r10 = new com.fourthline.orca.internal.FD$b
            com.fourthline.orca.internal.ip$b r11 = com.fourthline.orca.internal.AbstractC3397ip.b.f32574a
            r10.<init>(r11)
            r0.f37128a = r2
            r0.f37131d = r4
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto Lbf
            goto Lbe
        La5:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        Lab:
            com.fourthline.orca.internal.ZD r10 = com.fourthline.orca.internal.AbstractC3039aE.a(r11)
            com.fourthline.orca.internal.FD$b r11 = new com.fourthline.orca.internal.FD$b
            r11.<init>(r10)
            r0.f37128a = r2
            r0.f37131d = r3
            java.lang.Object r9 = r9.emit(r11, r0)
            if (r9 != r1) goto Lbf
        Lbe:
            return r1
        Lbf:
            jn0.h0 r9 = jn0.h0.f84049a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C4090yv.a(kotlinx.coroutines.flow.FlowCollector, com.fourthline.vision.selfie.SelfieScannerResult, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
