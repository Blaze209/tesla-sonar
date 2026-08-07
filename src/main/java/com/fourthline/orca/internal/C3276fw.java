package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3276fw implements Zv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zv f31878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3617nv f31879b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fw$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31882c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f31884e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31882c = obj;
            this.f31884e |= Integer.MIN_VALUE;
            Object objA = C3276fw.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3276fw(Zv validateSelfieWorker, InterfaceC3617nv pollStatusWorker) {
        p013kotlin.jvm.internal.s.k(validateSelfieWorker, "validateSelfieWorker");
        p013kotlin.jvm.internal.s.k(pollStatusWorker, "pollStatusWorker");
        this.f31878a = validateSelfieWorker;
        this.f31879b = pollStatusWorker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r6 == r1) goto L29;
     */
    @Override // com.fourthline.orca.internal.Zv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.Zv.a r6, p013kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.C3276fw.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.fw$a r0 = (com.fourthline.orca.internal.C3276fw.a) r0
            int r1 = r0.f31884e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31884e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.fw$a r0 = new com.fourthline.orca.internal.fw$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31882c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f31884e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            jn0.t.b(r7)     // Catch: java.lang.Throwable -> L32
            jn0.s r7 = (jn0.s) r7     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = r7.getValue()     // Catch: java.lang.Throwable -> L32
            goto L8c
        L32:
            r6 = move-exception
            goto L98
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f31881b
            com.fourthline.orca.internal.Zv$a r6 = (com.fourthline.orca.internal.Zv.a) r6
            java.lang.Object r2 = r0.f31880a
            com.fourthline.orca.internal.fw r2 = (com.fourthline.orca.internal.C3276fw) r2
            jn0.t.b(r7)
            jn0.s r7 = (jn0.s) r7
            java.lang.Object r7 = r7.getValue()
            goto L61
        L4e:
            jn0.t.b(r7)
            com.fourthline.orca.internal.Zv r7 = r5.f31878a
            r0.f31880a = r5
            r0.f31881b = r6
            r0.f31884e = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L60
            goto L8b
        L60:
            r2 = r5
        L61:
            boolean r4 = jn0.s.h(r7)
            if (r4 == 0) goto La3
            com.fourthline.orca.internal.Zv$b r7 = (com.fourthline.orca.internal.Zv.b) r7     // Catch: java.lang.Throwable -> L32
            boolean r4 = r7 instanceof com.fourthline.orca.internal.Zv.b.C0538b     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L93
            com.fourthline.orca.internal.nv r7 = r2.f31879b     // Catch: java.lang.Throwable -> L32
            com.fourthline.orca.internal.nv$a r2 = new com.fourthline.orca.internal.nv$a     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = r6.b()     // Catch: java.lang.Throwable -> L32
            com.fourthline.orca.internal.gw r4 = com.fourthline.orca.internal.EnumC3319gw.USER_CONSENT_REQUIRED     // Catch: java.lang.Throwable -> L32
            java.util.Set r4 = p013kotlin.collections.d1.c(r4)     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L32
            r6 = 0
            r0.f31880a = r6     // Catch: java.lang.Throwable -> L32
            r0.f31881b = r6     // Catch: java.lang.Throwable -> L32
            r0.f31884e = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = r7.a(r2, r0)     // Catch: java.lang.Throwable -> L32
            if (r6 != r1) goto L8c
        L8b:
            return r1
        L8c:
            jn0.t.b(r6)     // Catch: java.lang.Throwable -> L32
            com.fourthline.orca.internal.Vu$b r6 = (com.fourthline.orca.internal.Vu.b) r6     // Catch: java.lang.Throwable -> L32
            com.fourthline.orca.internal.Zv$b$b r7 = com.fourthline.orca.internal.Zv.b.C0538b.f30136a     // Catch: java.lang.Throwable -> L32
        L93:
            java.lang.Object r6 = jn0.s.b(r7)     // Catch: java.lang.Throwable -> L32
            return r6
        L98:
            jn0.s$a r7 = jn0.s.INSTANCE
            java.lang.Object r6 = jn0.t.a(r6)
            java.lang.Object r6 = jn0.s.b(r6)
            return r6
        La3:
            java.lang.Object r6 = jn0.s.b(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3276fw.a(com.fourthline.orca.internal.Zv$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
