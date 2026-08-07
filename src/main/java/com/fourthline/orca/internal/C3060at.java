package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.at, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3060at implements InterfaceC4073ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2899Lc f30480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EidServiceProvider f30481b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.at$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30483b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f30485d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30483b = obj;
            this.f30485d |= Integer.MIN_VALUE;
            Object objA = C3060at.this.a(this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3060at(C2899Lc bundle, EidServiceProvider provider) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(provider, "provider");
        this.f30480a = bundle;
        this.f30481b = provider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r6 == r1) goto L31;
     */
    @Override // com.fourthline.orca.internal.InterfaceC4073ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p013kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.C3060at.a
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.at$a r0 = (com.fourthline.orca.internal.C3060at.a) r0
            int r1 = r0.f30485d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30485d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.at$a r0 = new com.fourthline.orca.internal.at$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f30483b
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f30485d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            jn0.t.b(r6)     // Catch: java.lang.Throwable -> L32
            jn0.s r6 = (jn0.s) r6     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L32
            goto L7e
        L32:
            r6 = move-exception
            goto L88
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r0 = r0.f30482a
            com.fourthline.orca.internal.at r0 = (com.fourthline.orca.internal.C3060at) r0
            jn0.t.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L5d
        L44:
            jn0.t.b(r6)
            jn0.s$a r6 = jn0.s.INSTANCE     // Catch: java.lang.Throwable -> L32
            com.fourthline.orca.internal.Lc r6 = r5.f30480a     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.Deferred r6 = r6.g()     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L6d
            r0.f30482a = r5     // Catch: java.lang.Throwable -> L32
            r0.f30485d = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = r6.await(r0)     // Catch: java.lang.Throwable -> L32
            if (r6 != r1) goto L5c
            goto L7d
        L5c:
            r0 = r5
        L5d:
            jn0.s r6 = (jn0.s) r6     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L32
            jn0.t.b(r6)     // Catch: java.lang.Throwable -> L32
            com.fourthline.orca.internal.Lc r6 = r0.f30480a     // Catch: java.lang.Throwable -> L32
            r0 = 0
            r6.a(r0)     // Catch: java.lang.Throwable -> L32
            goto L81
        L6d:
            com.fourthline.core.eid.EidServiceProvider r6 = r5.f30481b     // Catch: java.lang.Throwable -> L32
            com.fourthline.orca.internal.Lc r2 = r5.f30480a     // Catch: java.lang.Throwable -> L32
            boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L32
            r0.f30485d = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = r6.mo84startProcessgIAlus(r2, r0)     // Catch: java.lang.Throwable -> L32
            if (r6 != r1) goto L7e
        L7d:
            return r1
        L7e:
            jn0.t.b(r6)     // Catch: java.lang.Throwable -> L32
        L81:
            com.fourthline.orca.internal.xe r6 = com.fourthline.orca.internal.C4030xe.f36708a     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = jn0.s.b(r6)     // Catch: java.lang.Throwable -> L32
            return r6
        L88:
            jn0.s$a r0 = jn0.s.INSTANCE
            java.lang.Object r6 = jn0.t.a(r6)
            java.lang.Object r6 = jn0.s.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3060at.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
