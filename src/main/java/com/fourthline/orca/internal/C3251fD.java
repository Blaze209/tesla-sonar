package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3251fD implements InterfaceC3645og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3051ak f31662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3645og f31663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f31664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CC f31665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final XC f31666e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fD$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31667a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31669c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31667a = obj;
            this.f31669c |= Integer.MIN_VALUE;
            return C3251fD.this.a(this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fD$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31670a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31672c;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31670a = obj;
            this.f31672c |= Integer.MIN_VALUE;
            Object objB = C3251fD.this.b(this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.s.a(objB);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fD$c */
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31675c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f31677e;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31675c = obj;
            this.f31677e |= Integer.MIN_VALUE;
            return C3251fD.this.b((InterfaceC3645og.a) null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fD$d */
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31680c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f31682e;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31680c = obj;
            this.f31682e |= Integer.MIN_VALUE;
            Object objA = C3251fD.this.a((InterfaceC3645og.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3251fD(InterfaceC3051ak mainRepository, InterfaceC3645og whatsNextDelegate, wn0.a workflowIdProvider, CC collectDeviceDataWorker, XC completeOnboardingWorker) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(whatsNextDelegate, "whatsNextDelegate");
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(collectDeviceDataWorker, "collectDeviceDataWorker");
        p013kotlin.jvm.internal.s.k(completeOnboardingWorker, "completeOnboardingWorker");
        this.f31662a = mainRepository;
        this.f31663b = whatsNextDelegate;
        this.f31664c = workflowIdProvider;
        this.f31665d = collectDeviceDataWorker;
        this.f31666e = completeOnboardingWorker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[PHI: r2 r8 r9
      0x00a9: PHI (r2v4 com.fourthline.orca.internal.fD) = (r2v3 com.fourthline.orca.internal.fD), (r2v10 com.fourthline.orca.internal.fD) binds: [B:30:0x00a6, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r8v3 com.fourthline.orca.internal.og$a) = (r8v2 com.fourthline.orca.internal.og$a), (r8v9 com.fourthline.orca.internal.og$a) binds: [B:30:0x00a6, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r9v11 java.lang.Object) = (r9v10 java.lang.Object), (r9v19 java.lang.Object) binds: [B:30:0x00a6, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (a(r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        if (r9 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.fourthline.orca.internal.InterfaceC3645og.a r8, p013kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.fourthline.orca.internal.C3251fD.c
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.orca.internal.fD$c r0 = (com.fourthline.orca.internal.C3251fD.c) r0
            int r1 = r0.f31677e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31677e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.fD$c r0 = new com.fourthline.orca.internal.fD$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f31675c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f31677e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L6b
            if (r2 == r6) goto L5f
            if (r2 == r5) goto L4d
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            jn0.t.b(r9)
            goto Lbc
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f31674b
            com.fourthline.orca.internal.og$a r8 = (com.fourthline.orca.internal.InterfaceC3645og.a) r8
            java.lang.Object r2 = r0.f31673a
            com.fourthline.orca.internal.fD r2 = (com.fourthline.orca.internal.C3251fD) r2
            jn0.t.b(r9)
            jn0.s r9 = (jn0.s) r9
            java.lang.Object r9 = r9.getValue()
            goto La9
        L4d:
            java.lang.Object r8 = r0.f31674b
            com.fourthline.orca.internal.og$a r8 = (com.fourthline.orca.internal.InterfaceC3645og.a) r8
            java.lang.Object r2 = r0.f31673a
            com.fourthline.orca.internal.fD r2 = (com.fourthline.orca.internal.C3251fD) r2
            jn0.t.b(r9)
            jn0.s r9 = (jn0.s) r9
            java.lang.Object r9 = r9.getValue()
            goto L95
        L5f:
            java.lang.Object r8 = r0.f31674b
            com.fourthline.orca.internal.og$a r8 = (com.fourthline.orca.internal.InterfaceC3645og.a) r8
            java.lang.Object r2 = r0.f31673a
            com.fourthline.orca.internal.fD r2 = (com.fourthline.orca.internal.C3251fD) r2
            jn0.t.b(r9)
            goto L88
        L6b:
            jn0.t.b(r9)
            com.fourthline.orca.internal.ak r9 = r7.f31662a
            com.fourthline.orca.internal.F6 r9 = r9.c()
            boolean r9 = r9.getEnabled()
            if (r9 == 0) goto L87
            r0.f31673a = r7
            r0.f31674b = r8
            r0.f31677e = r6
            java.lang.Object r9 = r7.a(r0)
            if (r9 != r1) goto L87
            goto Lbb
        L87:
            r2 = r7
        L88:
            r0.f31673a = r2
            r0.f31674b = r8
            r0.f31677e = r5
            java.lang.Object r9 = r2.b(r0)
            if (r9 != r1) goto L95
            goto Lbb
        L95:
            jn0.t.b(r9)
            com.fourthline.orca.internal.XC$b r9 = (com.fourthline.orca.internal.XC.b) r9
            com.fourthline.orca.internal.og r9 = r2.f31663b
            r0.f31673a = r2
            r0.f31674b = r8
            r0.f31677e = r4
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto La9
            goto Lbb
        La9:
            jn0.t.b(r9)
            com.fourthline.orca.internal.og$b r9 = (com.fourthline.orca.internal.InterfaceC3645og.b) r9
            r4 = 0
            r0.f31673a = r4
            r0.f31674b = r4
            r0.f31677e = r3
            java.lang.Object r9 = r2.a(r8, r9, r0)
            if (r9 != r1) goto Lbc
        Lbb:
            return r1
        Lbc:
            com.fourthline.orca.internal.og$b r9 = (com.fourthline.orca.internal.InterfaceC3645og.b) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3251fD.b(com.fourthline.orca.internal.og$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r7 == r1) goto L27;
     */
    @Override // com.fourthline.orca.internal.InterfaceC3645og
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.InterfaceC3645og.a r6, p013kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.C3251fD.d
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.fD$d r0 = (com.fourthline.orca.internal.C3251fD.d) r0
            int r1 = r0.f31682e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31682e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.fD$d r0 = new com.fourthline.orca.internal.fD$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31680c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f31682e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            jn0.t.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L71
        L2c:
            r6 = move-exception
            goto L78
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f31679b
            com.fourthline.orca.internal.og$a r6 = (com.fourthline.orca.internal.InterfaceC3645og.a) r6
            java.lang.Object r2 = r0.f31678a
            com.fourthline.orca.internal.fD r2 = (com.fourthline.orca.internal.C3251fD) r2
            jn0.t.b(r7)
            jn0.s r7 = (jn0.s) r7
            java.lang.Object r7 = r7.getValue()
            goto L5b
        L48:
            jn0.t.b(r7)
            com.fourthline.orca.internal.og r7 = r5.f31663b
            r0.f31678a = r5
            r0.f31679b = r6
            r0.f31682e = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L5a
            goto L70
        L5a:
            r2 = r5
        L5b:
            boolean r4 = jn0.s.h(r7)
            if (r4 == 0) goto L83
            com.fourthline.orca.internal.og$b r7 = (com.fourthline.orca.internal.InterfaceC3645og.b) r7     // Catch: java.lang.Throwable -> L2c
            r4 = 0
            r0.f31678a = r4     // Catch: java.lang.Throwable -> L2c
            r0.f31679b = r4     // Catch: java.lang.Throwable -> L2c
            r0.f31682e = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r2.a(r6, r7, r0)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            com.fourthline.orca.internal.og$b r7 = (com.fourthline.orca.internal.InterfaceC3645og.b) r7     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r6 = jn0.s.b(r7)     // Catch: java.lang.Throwable -> L2c
            return r6
        L78:
            jn0.s$a r7 = jn0.s.INSTANCE
            java.lang.Object r6 = jn0.t.a(r6)
            java.lang.Object r6 = jn0.s.b(r6)
            return r6
        L83:
            java.lang.Object r6 = jn0.s.b(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3251fD.a(com.fourthline.orca.internal.og$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object a(InterfaceC3645og.a aVar, InterfaceC3645og.b bVar, Continuation continuation) {
        QesStatus qesStatusD;
        if (bVar.a().b()) {
            return b(aVar, continuation);
        }
        if (this.f31662a instanceof If) {
            Rf rfA = bVar.a().a();
            if (rfA instanceof Zt) {
                Zt zt2 = (Zt) rfA;
                C3724qF c3724qFH = ((If) this.f31662a).h();
                zt2.a((c3724qFH == null || (qesStatusD = c3724qFH.d()) == null) ? null : qesStatusD.getStatus());
                return bVar;
            }
            if (rfA instanceof C4011x1) {
                ((C4011x1) rfA).a(((If) this.f31662a).i());
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Continuation continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f31672c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f31672c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f31670a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f31672c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        XC xc2 = this.f31666e;
        XC.a aVar = new XC.a((String) this.f31664c.invoke());
        bVar.f31672c = 1;
        Object objA = xc2.a(aVar, bVar);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Continuation continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f31669c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f31669c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f31667a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f31669c;
        if (i12 == 0) {
            jn0.t.b(obj);
            CC cc2 = this.f31665d;
            CC.a aVar2 = new CC.a((String) this.f31664c.invoke());
            aVar.f31669c = 1;
            if (cc2.a(aVar2, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            ((jn0.s) obj).getValue();
        }
        return jn0.h0.f84049a;
    }
}
