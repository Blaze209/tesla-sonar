package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3846t9 implements InterfaceC3645og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final On f35588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3085bb f35589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3645og f35590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wn0.a f35591d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t9$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35593b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f35595d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f35593b = obj;
            this.f35595d |= Integer.MIN_VALUE;
            Object objA = C3846t9.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3846t9(On worker, C3085bb flowConfig, InterfaceC3645og delegate, wn0.a skipNfcScannerUseCase) {
        p013kotlin.jvm.internal.s.k(worker, "worker");
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(skipNfcScannerUseCase, "skipNfcScannerUseCase");
        this.f35588a = worker;
        this.f35589b = flowConfig;
        this.f35590c = delegate;
        this.f35591d = skipNfcScannerUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r7 == r1) goto L33;
     */
    @Override // com.fourthline.orca.internal.InterfaceC3645og
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.InterfaceC3645og.a r6, p013kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.C3846t9.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.t9$a r0 = (com.fourthline.orca.internal.C3846t9.a) r0
            int r1 = r0.f35595d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35595d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.t9$a r0 = new com.fourthline.orca.internal.t9$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35593b
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35595d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            jn0.t.b(r7)
            jn0.s r7 = (jn0.s) r7
            java.lang.Object r6 = r7.getValue()
            return r6
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f35592a
            com.fourthline.orca.internal.og$c$d r6 = (com.fourthline.orca.internal.InterfaceC3645og.c.d) r6
            jn0.t.b(r7)
            jn0.s r7 = (jn0.s) r7
            java.lang.Object r7 = r7.getValue()
            goto L78
        L48:
            jn0.t.b(r7)
            wn0.a r7 = r5.f35591d
            java.lang.Object r7 = r7.invoke()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto Lac
            com.fourthline.orca.internal.og$c$d r6 = new com.fourthline.orca.internal.og$c$d
            com.fourthline.orca.internal.Km r7 = new com.fourthline.orca.internal.Km
            com.fourthline.orca.internal.bb r2 = r5.f35589b
            int r2 = r2.f()
            r7.<init>(r2)
            java.lang.String r2 = "nfc"
            r6.<init>(r2, r7)
            com.fourthline.orca.internal.On r7 = r5.f35588a
            r0.f35592a = r6
            r0.f35595d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L78
            goto Lb6
        L78:
            boolean r0 = jn0.s.h(r7)
            if (r0 == 0) goto L9e
            com.fourthline.orca.internal.On$a r7 = (com.fourthline.orca.internal.On.a) r7     // Catch: java.lang.Throwable -> L92
            com.fourthline.orca.internal.og$b r7 = new com.fourthline.orca.internal.og$b     // Catch: java.lang.Throwable -> L92
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L92
            java.lang.Object r6 = jn0.s.b(r7)     // Catch: java.lang.Throwable -> L92
            jn0.s r6 = jn0.s.a(r6)     // Catch: java.lang.Throwable -> L92
            java.lang.Object r6 = jn0.s.b(r6)     // Catch: java.lang.Throwable -> L92
            goto La2
        L92:
            r6 = move-exception
            jn0.s$a r7 = jn0.s.INSTANCE
            java.lang.Object r6 = jn0.t.a(r6)
            java.lang.Object r6 = jn0.s.b(r6)
            goto La2
        L9e:
            java.lang.Object r6 = jn0.s.b(r7)
        La2:
            jn0.t.b(r6)
            jn0.s r6 = (jn0.s) r6
            java.lang.Object r6 = r6.getValue()
            return r6
        Lac:
            com.fourthline.orca.internal.og r7 = r5.f35590c
            r0.f35595d = r3
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto Lb7
        Lb6:
            return r1
        Lb7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3846t9.a(com.fourthline.orca.internal.og$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
