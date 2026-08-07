package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3644of implements QE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f34223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3681pF f34224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3508lE f34225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3852tF f34226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3551mE f34227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3645og f34228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3625o2 f34229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wn0.p f34230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Xk f34231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f34232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f34233k;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.of$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f34236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f34237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f34238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f34239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f34240g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f34242i;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34240g = obj;
            this.f34242i |= Integer.MIN_VALUE;
            return C3644of.this.a((InterfaceC3681pF.b.C0596b) null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.of$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34244b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f34246d;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34244b = obj;
            this.f34246d |= Integer.MIN_VALUE;
            Object objA = C3644of.this.a((QE.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.of$c */
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34249c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f34251e;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34249c = obj;
            this.f34251e |= Integer.MIN_VALUE;
            return C3644of.this.a((String) null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.of$d */
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34252a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34254c;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34252a = obj;
            this.f34254c |= Integer.MIN_VALUE;
            return C3644of.this.a((WorkflowConfigurationResponse) null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.of$e */
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34255a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34257c;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34255a = obj;
            this.f34257c |= Integer.MIN_VALUE;
            return C3644of.this.b((String) null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.of$f */
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34258a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34260c;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34258a = obj;
            this.f34260c |= Integer.MIN_VALUE;
            return C3644of.this.a(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.of$g */
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34261a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34263c;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34261a = obj;
            this.f34263c |= Integer.MIN_VALUE;
            return C3644of.this.c(null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.of$h */
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34266c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f34268e;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34266c = obj;
            this.f34268e |= Integer.MIN_VALUE;
            Object objB = C3644of.this.b((QE.a) null, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.s.a(objB);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.of$i */
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34269a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34271c;

        i(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34269a = obj;
            this.f34271c |= Integer.MIN_VALUE;
            return C3644of.this.d(null, this);
        }
    }

    public C3644of(boolean z11, InterfaceC3681pF workflowStartSessionWorker, InterfaceC3508lE workflowConfigurationWorker, InterfaceC3852tF workflowStatusWorker, InterfaceC3551mE workflowDeviceMetadataWorker, InterfaceC3645og workflowWhatsNextWorker, InterfaceC3625o2 bavRedirectUrlWorker, wn0.p workflowModulesFilter, Xk networkConfigResultRepo) {
        p013kotlin.jvm.internal.s.k(workflowStartSessionWorker, "workflowStartSessionWorker");
        p013kotlin.jvm.internal.s.k(workflowConfigurationWorker, "workflowConfigurationWorker");
        p013kotlin.jvm.internal.s.k(workflowStatusWorker, "workflowStatusWorker");
        p013kotlin.jvm.internal.s.k(workflowDeviceMetadataWorker, "workflowDeviceMetadataWorker");
        p013kotlin.jvm.internal.s.k(workflowWhatsNextWorker, "workflowWhatsNextWorker");
        p013kotlin.jvm.internal.s.k(bavRedirectUrlWorker, "bavRedirectUrlWorker");
        p013kotlin.jvm.internal.s.k(workflowModulesFilter, "workflowModulesFilter");
        p013kotlin.jvm.internal.s.k(networkConfigResultRepo, "networkConfigResultRepo");
        this.f34223a = z11;
        this.f34224b = workflowStartSessionWorker;
        this.f34225c = workflowConfigurationWorker;
        this.f34226d = workflowStatusWorker;
        this.f34227e = workflowDeviceMetadataWorker;
        this.f34228f = workflowWhatsNextWorker;
        this.f34229g = bavRedirectUrlWorker;
        this.f34230h = workflowModulesFilter;
        this.f34231i = networkConfigResultRepo;
        this.f34232j = new LinkedHashMap();
        this.f34233k = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(QE.a aVar, Continuation continuation) {
        h hVar;
        Object objA;
        C3644of c3644of;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f34268e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f34268e = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object obj = hVar.f34266c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar.f34268e;
        if (i12 == 0) {
            jn0.t.b(obj);
            InterfaceC3681pF.b bVar = (InterfaceC3681pF.b) this.f34232j.get(aVar.b());
            if (bVar != null) {
                return jn0.s.b(bVar);
            }
            InterfaceC3681pF interfaceC3681pF = this.f34224b;
            InterfaceC3681pF.a aVar2 = new InterfaceC3681pF.a(aVar.b(), aVar.a());
            hVar.f34264a = this;
            hVar.f34265b = aVar;
            hVar.f34268e = 1;
            objA = interfaceC3681pF.a(aVar2, hVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3644of = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (QE.a) hVar.f34265b;
            c3644of = (C3644of) hVar.f34264a;
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        if (jn0.s.h(objA)) {
            c3644of.f34232j.get(aVar.b());
        }
        return objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, Continuation continuation) {
        g gVar;
        Object objA;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f34263c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f34263c = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.f34261a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar.f34263c;
        if (i12 == 0) {
            jn0.t.b(obj);
            InterfaceC3625o2 interfaceC3625o2 = this.f34229g;
            InterfaceC3625o2.a aVar = new InterfaceC3625o2.a(str);
            gVar.f34263c = 1;
            objA = interfaceC3625o2.a(aVar, gVar);
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
        return ((InterfaceC3625o2.b) objA).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, Continuation continuation) {
        i iVar;
        Object objA;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f34271c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f34271c = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.f34269a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = iVar.f34271c;
        if (i12 == 0) {
            jn0.t.b(obj);
            InterfaceC3551mE interfaceC3551mE = this.f34227e;
            iVar.f34271c = 1;
            objA = interfaceC3551mE.a(str, iVar);
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
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r7 == r1) goto L31;
     */
    @Override // com.fourthline.orca.internal.QE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.QE.a r6, p013kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.C3644of.b
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.of$b r0 = (com.fourthline.orca.internal.C3644of.b) r0
            int r1 = r0.f34246d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34246d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.of$b r0 = new com.fourthline.orca.internal.of$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34244b
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34246d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            jn0.t.b(r7)     // Catch: java.lang.Throwable -> L2c com.fourthline.orca.internal.AbstractC3594nE -> L2e
            goto L6f
        L2c:
            r6 = move-exception
            goto L8d
        L2e:
            r6 = move-exception
            goto L72
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f34243a
            com.fourthline.orca.internal.of r6 = (com.fourthline.orca.internal.C3644of) r6
            jn0.t.b(r7)
            jn0.s r7 = (jn0.s) r7
            java.lang.Object r7 = r7.getValue()
            goto L55
        L46:
            jn0.t.b(r7)
            r0.f34243a = r5
            r0.f34246d = r4
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 != r1) goto L54
            goto L6e
        L54:
            r6 = r5
        L55:
            boolean r2 = jn0.s.h(r7)
            if (r2 == 0) goto L98
            com.fourthline.orca.internal.pF$b r7 = (com.fourthline.orca.internal.InterfaceC3681pF.b) r7     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r7 instanceof com.fourthline.orca.internal.InterfaceC3681pF.b.C0596b     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L7c
            com.fourthline.orca.internal.pF$b$b r7 = (com.fourthline.orca.internal.InterfaceC3681pF.b.C0596b) r7     // Catch: java.lang.Throwable -> L2c com.fourthline.orca.internal.AbstractC3594nE -> L2e
            r2 = 0
            r0.f34243a = r2     // Catch: java.lang.Throwable -> L2c com.fourthline.orca.internal.AbstractC3594nE -> L2e
            r0.f34246d = r3     // Catch: java.lang.Throwable -> L2c com.fourthline.orca.internal.AbstractC3594nE -> L2e
            java.lang.Object r7 = r6.a(r7, r0)     // Catch: java.lang.Throwable -> L2c com.fourthline.orca.internal.AbstractC3594nE -> L2e
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            com.fourthline.orca.internal.QE$b r7 = (com.fourthline.orca.internal.QE.b) r7     // Catch: java.lang.Throwable -> L2c com.fourthline.orca.internal.AbstractC3594nE -> L2e
            goto L77
        L72:
            com.fourthline.orca.internal.QE$b$a r7 = new com.fourthline.orca.internal.QE$b$a     // Catch: java.lang.Throwable -> L2c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L2c
        L77:
            java.lang.Object r6 = jn0.s.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L97
        L7c:
            boolean r6 = r7 instanceof com.fourthline.orca.internal.InterfaceC3681pF.b.a     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L87
            com.fourthline.orca.internal.nE$b r6 = com.fourthline.orca.internal.AbstractC3594nE.f33879a     // Catch: java.lang.Throwable -> L2c
            com.fourthline.orca.internal.nE$d r6 = r6.a()     // Catch: java.lang.Throwable -> L2c
            throw r6     // Catch: java.lang.Throwable -> L2c
        L87:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L2c
            r6.<init>()     // Catch: java.lang.Throwable -> L2c
            throw r6     // Catch: java.lang.Throwable -> L2c
        L8d:
            jn0.s$a r7 = jn0.s.INSTANCE
            java.lang.Object r6 = jn0.t.a(r6)
            java.lang.Object r6 = jn0.s.b(r6)
        L97:
            return r6
        L98:
            java.lang.Object r6 = jn0.s.b(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3644of.a(com.fourthline.orca.internal.QE$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, Continuation continuation) {
        e eVar;
        Object objA;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f34257c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f34257c = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f34255a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f34257c;
        if (i12 == 0) {
            jn0.t.b(obj);
            InterfaceC3852tF interfaceC3852tF = this.f34226d;
            InterfaceC3852tF.a aVar = new InterfaceC3852tF.a(str);
            eVar.f34257c = 1;
            objA = interfaceC3852tF.a(aVar, eVar);
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
        return ((InterfaceC3852tF.b) objA).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:55:0x0190  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x020e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0223  */
    /* JADX WARN: Code duplicated, block: B:87:0x0233  */
    /* JADX WARN: Code duplicated, block: B:89:0x023d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0241 A[PHI: r2 r4 r6 r7 r15
      0x0241: PHI (r2v8 com.fourthline.orca.internal.of) = (r2v6 com.fourthline.orca.internal.of), (r2v10 com.fourthline.orca.internal.of) binds: [B:80:0x020c, B:89:0x023d] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r4v15 java.util.List) = (r4v12 java.util.List), (r4v18 java.util.List) binds: [B:80:0x020c, B:89:0x023d] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r6v6 com.fourthline.orca.internal.qF) = (r6v3 com.fourthline.orca.internal.qF), (r6v10 com.fourthline.orca.internal.qF) binds: [B:80:0x020c, B:89:0x023d] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r7v10 com.fourthline.orca.internal.iE) = (r7v8 com.fourthline.orca.internal.iE), (r7v13 com.fourthline.orca.internal.iE) binds: [B:80:0x020c, B:89:0x023d] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r15v6 com.fourthline.orca.internal.XE) = (r15v4 com.fourthline.orca.internal.XE), (r15v7 com.fourthline.orca.internal.XE) binds: [B:80:0x020c, B:89:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b3, code lost:
    
        if (r1 == r3) goto L83;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01b3 -> B:58:0x01b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.InterfaceC3681pF.b.C0596b r20, p013kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3644of.a(com.fourthline.orca.internal.pF$b$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Rf a(InterfaceC3645og.c cVar) {
        InterfaceC3645og.c.d dVar = cVar instanceof InterfaceC3645og.c.d ? (InterfaceC3645og.c.d) cVar : null;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Continuation continuation) {
        c cVar;
        Object objA;
        C3644of c3644of;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f34251e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f34251e = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f34249c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f34251e;
        if (i12 == 0) {
            jn0.t.b(obj);
            WorkflowConfigurationResponse workflowConfigurationResponse = (WorkflowConfigurationResponse) this.f34233k.get(str);
            if (workflowConfigurationResponse != null) {
                return workflowConfigurationResponse;
            }
            InterfaceC3508lE interfaceC3508lE = this.f34225c;
            InterfaceC3508lE.a aVar = new InterfaceC3508lE.a(str);
            cVar.f34247a = this;
            cVar.f34248b = str;
            cVar.f34251e = 1;
            objA = interfaceC3508lE.a(aVar, cVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3644of = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cVar.f34248b;
            c3644of = (C3644of) cVar.f34247a;
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        jn0.t.b(objA);
        InterfaceC3508lE.b bVar = (InterfaceC3508lE.b) objA;
        c3644of.f34233k.put(str, bVar.a());
        return bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(WorkflowConfigurationResponse workflowConfigurationResponse, Continuation continuation) {
        d dVar;
        Object objA;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f34254c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f34254c = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f34252a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f34254c;
        if (i12 == 0) {
            jn0.t.b(obj);
            InterfaceC3645og interfaceC3645og = this.f34228f;
            InterfaceC3645og.a aVar = new InterfaceC3645og.a(workflowConfigurationResponse);
            dVar.f34254c = 1;
            objA = interfaceC3645og.a(aVar, dVar);
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
        return objA;
    }

    private final Rf a(Rf rf2, List list, C3724qF c3724qF) {
        if (rf2 instanceof Zt) {
            Zt zt2 = (Zt) rf2;
            QesStatus qesStatusD = c3724qF.d();
            zt2.a(qesStatusD != null ? qesStatusD.getStatus() : null);
            return rf2;
        }
        if (rf2 instanceof C4011x1) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UE ue2 = (UE) it.next();
                if (ue2 instanceof UE.a) {
                    ((C4011x1) rf2).a(((UE.a) ue2).a());
                }
            }
        }
        return rf2;
    }

    private final List a(List list, Rf rf2) {
        if ((!(rf2 instanceof Zt) && !(rf2 instanceof C4011x1)) || !(p013kotlin.collections.v.q0(list) instanceof UE.b)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((UE) obj) instanceof UE.b)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r13.equals("IdentityVerification") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f6, code lost:
    
        if (r13.equals("Workflow") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fb, code lost:
    
        return com.fourthline.orca.internal.UE.b.f28747a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.WorkflowModule r13, com.fourthline.orca.internal.XE r14, com.fourthline.orca.internal.WorkflowConfigurationResponse r15, com.fourthline.orca.internal.C3724qF r16, p013kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3644of.a(com.fourthline.orca.internal.TE, com.fourthline.orca.internal.XE, com.fourthline.orca.internal.iE, com.fourthline.orca.internal.qF, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
