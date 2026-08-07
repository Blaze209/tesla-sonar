package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3601nf implements Uv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tv f33928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3617nv f33929b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nf$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3319gw.values().length];
            try {
                iArr[EnumC3319gw.REJECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3319gw.KYC_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3319gw.SELFIE_REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3319gw.USER_CONSENT_REQUIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nf$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f33930a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f33932c;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33930a = obj;
            this.f33932c |= Integer.MIN_VALUE;
            return C3601nf.this.a((String) null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nf$c */
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33935c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f33937e;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33935c = obj;
            this.f33937e |= Integer.MIN_VALUE;
            Object objA = C3601nf.this.a((Uv.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3601nf(Tv startSignatureRequestWorker, InterfaceC3617nv pollStatusWorker) {
        p013kotlin.jvm.internal.s.k(startSignatureRequestWorker, "startSignatureRequestWorker");
        p013kotlin.jvm.internal.s.k(pollStatusWorker, "pollStatusWorker");
        this.f33928a = startSignatureRequestWorker;
        this.f33929b = pollStatusWorker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r7 == r1) goto L27;
     */
    @Override // com.fourthline.orca.internal.Uv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.Uv.a r6, p013kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.C3601nf.c
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.nf$c r0 = (com.fourthline.orca.internal.C3601nf.c) r0
            int r1 = r0.f33937e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33937e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.nf$c r0 = new com.fourthline.orca.internal.nf$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f33935c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f33937e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            jn0.t.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L75
        L2c:
            r6 = move-exception
            goto L7c
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f33934b
            com.fourthline.orca.internal.Uv$a r6 = (com.fourthline.orca.internal.Uv.a) r6
            java.lang.Object r2 = r0.f33933a
            com.fourthline.orca.internal.nf r2 = (com.fourthline.orca.internal.C3601nf) r2
            jn0.t.b(r7)
            jn0.s r7 = (jn0.s) r7
            java.lang.Object r7 = r7.getValue()
            goto L5b
        L48:
            jn0.t.b(r7)
            com.fourthline.orca.internal.Tv r7 = r5.f33928a
            r0.f33933a = r5
            r0.f33934b = r6
            r0.f33937e = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L5a
            goto L74
        L5a:
            r2 = r5
        L5b:
            boolean r4 = jn0.s.h(r7)
            if (r4 == 0) goto L87
            com.fourthline.orca.internal.Tv$a r7 = (com.fourthline.orca.internal.Tv.a) r7     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = r6.c()     // Catch: java.lang.Throwable -> L2c
            r7 = 0
            r0.f33933a = r7     // Catch: java.lang.Throwable -> L2c
            r0.f33934b = r7     // Catch: java.lang.Throwable -> L2c
            r0.f33937e = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r2.a(r6, r0)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            com.fourthline.orca.internal.Uv$b r7 = (com.fourthline.orca.internal.Uv.b) r7     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r6 = jn0.s.b(r7)     // Catch: java.lang.Throwable -> L2c
            return r6
        L7c:
            jn0.s$a r7 = jn0.s.INSTANCE
            java.lang.Object r6 = jn0.t.a(r6)
            java.lang.Object r6 = jn0.s.b(r6)
            return r6
        L87:
            java.lang.Object r6 = jn0.s.b(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3601nf.a(com.fourthline.orca.internal.Uv$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Continuation continuation) {
        b bVar;
        Object objA;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f33932c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f33932c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f33930a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f33932c;
        if (i12 == 0) {
            jn0.t.b(obj);
            InterfaceC3617nv interfaceC3617nv = this.f33929b;
            InterfaceC3617nv.a aVar = new InterfaceC3617nv.a(str, p013kotlin.collections.d1.i(EnumC3319gw.REJECTED, EnumC3319gw.KYC_REQUIRED, EnumC3319gw.SELFIE_REQUIRED, EnumC3319gw.USER_CONSENT_REQUIRED));
            bVar.f33932c = 1;
            objA = interfaceC3617nv.a(aVar, bVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        jn0.t.b(objA);
        Vu.b bVar2 = (Vu.b) objA;
        int i13 = a.$EnumSwitchMapping$0[bVar2.a().ordinal()];
        if (i13 == 1) {
            return Uv.b.C0525b.f28861a;
        }
        if (i13 == 2) {
            return Uv.b.a.f28860a;
        }
        if (i13 == 3) {
            return Uv.b.c.f28862a;
        }
        if (i13 == 4) {
            return Uv.b.d.f28863a;
        }
        throw new IllegalStateException(("FL Developer error. `pollStatus` returned " + bVar2.a() + ". Should never happen!").toString());
    }
}
