package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.nfc.ExtraNfcScannerConfig;
import com.fourthline.nfc.NfcScannerCallback;
import com.fourthline.nfc.NfcScannerConfig;
import com.fourthline.nfc.NfcScannerDataSource;
import com.fourthline.nfc.NfcScannerError;
import com.fourthline.nfc.NfcScannerResult;
import com.fourthline.nfc.NfcScannerStep;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Pn implements InterfaceC3302gf, NfcScannerCallback, NfcScannerDataSource, CoroutineScope {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f27352m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f27353n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f27354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f27355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2874Gc f27356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Kn f27357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ND f27358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ED f27359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Gn f27360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC2931Re f27361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC4044xs f27362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC3354ho f27363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Job f27365l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NfcScannerError.values().length];
            try {
                iArr[NfcScannerError.CONNECTION_LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NfcScannerError.AUTHENTICATION_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NfcScannerError.NFC_NOT_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NfcScannerError.NFC_NOT_SUPPORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NfcScannerError.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27366a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dn f27368c;

        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Dn f27369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Pn f27370b;

            a(Dn dn2, Pn pn2) {
                this.f27369a = dn2;
                this.f27370b = pn2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                MD bVar;
                if (fd2 instanceof FD.a) {
                    Dn dn2 = this.f27369a;
                    if (dn2 instanceof Dn.a) {
                        Of ofA = ((FD.a) fd2).a();
                        Im im2 = (Im) (ofA instanceof Im ? ofA : null);
                        if (im2 == null) {
                            throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        bVar = new An.c.C0471c(im2);
                    } else {
                        if (!(dn2 instanceof Dn.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Of ofA2 = ((FD.a) fd2).a();
                        Im im3 = (Im) (ofA2 instanceof Im ? ofA2 : null);
                        if (im3 == null) {
                            throw new IllegalStateException((ofA2.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        bVar = new An.c.b(im3, ((Dn.b) this.f27369a).a());
                    }
                    this.f27370b.f27358e.a(bVar);
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Dn dn2, Continuation continuation) {
            super(2, continuation);
            this.f27368c = dn2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Pn.this.new c(this.f27368c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r6).collect(r1, r5) == r0) goto L15;
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
                int r1 = r5.f27366a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L46
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)
                goto L32
            L1e:
                jn0.t.b(r6)
                com.fourthline.orca.internal.Pn r6 = com.fourthline.orca.internal.Pn.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.Pn.b(r6)
                com.fourthline.orca.internal.Dn r1 = r5.f27368c
                r5.f27366a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.Pn$c$a r1 = new com.fourthline.orca.internal.Pn$c$a
                com.fourthline.orca.internal.Dn r3 = r5.f27368c
                com.fourthline.orca.internal.Pn r4 = com.fourthline.orca.internal.Pn.this
                r1.<init>(r3, r4)
                r5.f27366a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Pn.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f27372b;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Pn.this.new d(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003a  */
        /* JADX WARN: Code duplicated, block: B:13:0x0046 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0044 -> B:14:0x0047). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f27372b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r5.f27371a
                kotlin.jvm.internal.l0 r1 = (p013kotlin.jvm.internal.l0) r1
                jn0.t.b(r6)
                goto L47
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                jn0.t.b(r6)
                com.fourthline.orca.internal.Pn r6 = com.fourthline.orca.internal.Pn.this
                com.fourthline.orca.internal.Is r6 = r6.e()
                com.fourthline.orca.internal.Pn r1 = com.fourthline.orca.internal.Pn.this
                com.fourthline.orca.internal.rl0 r3 = new com.fourthline.orca.internal.rl0
                r3.<init>()
                r6.a(r3)
                kotlin.jvm.internal.l0 r6 = new kotlin.jvm.internal.l0
                r6.<init>()
                r1 = r6
            L34:
                int r6 = r1.f86527a
                r3 = 10
                if (r6 >= r3) goto L5d
                r5.f27371a = r1
                r5.f27372b = r2
                r3 = 700(0x2bc, double:3.46E-321)
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L47
                return r0
            L47:
                int r6 = r1.f86527a
                int r6 = r6 + r2
                r1.f86527a = r6
                com.fourthline.orca.internal.Pn r6 = com.fourthline.orca.internal.Pn.this
                com.fourthline.orca.internal.Is r6 = r6.e()
                com.fourthline.orca.internal.Pn r3 = com.fourthline.orca.internal.Pn.this
                com.fourthline.orca.internal.sl0 r4 = new com.fourthline.orca.internal.sl0
                r4.<init>()
                r6.a(r4)
                goto L34
            L5d:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Pn.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final En a(Pn pn2, En en2) {
            return pn2.f27357d.r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final En a(Pn pn2, p013kotlin.jvm.internal.l0 l0Var, En en2) {
            return pn2.f27357d.d(l0Var.f86527a);
        }
    }

    public Pn(Is presenter, C2874Gc effectHandler, Kn stateProvider, ND viewNavigator, ED viewCompletionHandler, Gn repository, InterfaceC2931Re nfcErrorHandler, InterfaceC4044xs popupHandler, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(nfcErrorHandler, "nfcErrorHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f27354a = coroutineScope;
        this.f27355b = presenter;
        this.f27356c = effectHandler;
        this.f27357d = stateProvider;
        this.f27358e = viewNavigator;
        this.f27359f = viewCompletionHandler;
        this.f27360g = repository;
        this.f27361h = nfcErrorHandler;
        this.f27362i = popupHandler;
        this.f27363j = analytics;
        this.f27364k = true;
    }

    private final void f() {
        p();
    }

    private final void g() {
        Am amC = this.f27360g.c();
        if (amC == null) {
            throw new IllegalStateException("Scanner result should be present at this point!");
        }
        a(new Dn.b(amC));
    }

    private final void h() {
        this.f27364k = false;
        this.f27358e.a(An.c.a.f24974a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final An i() {
        return An.a.f24972a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final An j() {
        return An.e.f24980a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final An k() {
        return An.d.f24979a;
    }

    private final void l() {
        p();
    }

    private final void m() {
        this.f27364k = true;
        this.f27360g.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final An n() {
        return An.e.f24980a;
    }

    private final void o() {
        En en2 = (En) this.f27355b.a();
        if (en2 instanceof En.d) {
            g();
        } else if (!(en2 instanceof En.a) && !(en2 instanceof En.c) && !(en2 instanceof En.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void p() {
        b();
        this.f27356c.a(new wn0.a() { // from class: com.fourthline.orca.internal.ql0
            @Override // wn0.a
            public final Object invoke() {
                return Pn.q();
            }
        });
        this.f27355b.a(new wn0.l() { // from class: com.fourthline.orca.internal.hl0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Pn.c(this.f32330a, (En) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final An q() {
        return An.b.f24973a;
    }

    private final void r() {
        Job job = this.f27365l;
        if (job == null || !job.isActive()) {
            this.f27365l = BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(null), 3, null);
        }
    }

    public final ExtraNfcScannerConfig d() {
        Gn gn2 = this.f27360g;
        DocumentType documentTypeD = gn2.d();
        G5 g5A = gn2.a();
        return new ExtraNfcScannerConfig(documentTypeD, g5A != null ? g5A.c() : null);
    }

    public final Is e() {
        return this.f27355b;
    }

    @Override // com.fourthline.nfc.NfcScannerDataSource
    public NfcScannerConfig getConfig() {
        Jn jnB = this.f27360g.b();
        if (jnB != null) {
            return new NfcScannerConfig(jnB.getKey());
        }
        throw new IllegalStateException("Scanner should never be started without a key in the repository");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f27354a.getCoroutineContext();
    }

    @Override // com.fourthline.nfc.NfcScannerCallback
    public void onFail(final NfcScannerError error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        b();
        G5 g5A = this.f27360g.a();
        if (g5A != null) {
            this.f27363j.track(new C4125zn.a.b(this.f27360g.d(), g5A, error));
        }
        if (this.f27364k) {
            this.f27356c.a(new wn0.a() { // from class: com.fourthline.orca.internal.gl0
                @Override // wn0.a
                public final Object invoke() {
                    return Pn.i();
                }
            });
            this.f27356c.a(new wn0.a() { // from class: com.fourthline.orca.internal.il0
                @Override // wn0.a
                public final Object invoke() {
                    return Pn.j();
                }
            });
            Em emA = a(error);
            if (!(emA instanceof Em.a) && !(emA instanceof Em.d)) {
                this.f27361h.handleRecoverableError(emA, "nfc_scanner", new wn0.a() { // from class: com.fourthline.orca.internal.jl0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Pn.a(error, this);
                    }
                });
            } else {
                this.f27362i.a(new Ds.c(emA, null, null, 6, null), new wn0.a() { // from class: com.fourthline.orca.internal.kl0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Pn.d(this.f33015a);
                    }
                }, new wn0.a() { // from class: com.fourthline.orca.internal.ll0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Pn.e(this.f33353a);
                    }
                });
            }
        }
    }

    @Override // com.fourthline.nfc.NfcScannerCallback
    public void onStepUpdate(NfcScannerStep step) {
        p013kotlin.jvm.internal.s.k(step, "step");
        if (step != NfcScannerStep.LOOKING_FOR_DOCUMENT) {
            r();
        } else {
            b();
            this.f27355b.a(new wn0.l() { // from class: com.fourthline.orca.internal.ml0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Pn.a(this.f33614a, (En) obj);
                }
            });
        }
    }

    @Override // com.fourthline.nfc.NfcScannerCallback
    public void onSuccess(NfcScannerResult result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        b();
        this.f27356c.a(new wn0.a() { // from class: com.fourthline.orca.internal.ol0
            @Override // wn0.a
            public final Object invoke() {
                return Pn.n();
            }
        });
        this.f27360g.a(new Bm(result));
        this.f27355b.a(new wn0.l() { // from class: com.fourthline.orca.internal.pl0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Pn.b(this.f34608a, (En) obj);
            }
        });
    }

    private final void b() {
        Job job = this.f27365l;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f27365l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e(Pn pn2) {
        pn2.a(Dn.a.f25483a);
        return jn0.h0.f84049a;
    }

    public final C2874Gc c() {
        return this.f27356c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final En c(Pn pn2, En present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return pn2.f27357d.getInitialState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(Pn pn2) {
        pn2.p();
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(Bn event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof Bn.a) {
            f();
            return;
        }
        if (event instanceof Bn.d) {
            m();
            return;
        }
        if (event instanceof Bn.c) {
            l();
        } else if (event instanceof Bn.b) {
            h();
        } else {
            if (!(event instanceof Bn.e)) {
                throw new NoWhenBranchMatchedException();
            }
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final En b(Pn pn2, En present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return pn2.f27357d.s();
    }

    private final void a(Dn dn2) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(dn2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final En a(Pn pn2, En present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return pn2.f27357d.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(NfcScannerError nfcScannerError, Pn pn2) {
        if (nfcScannerError == NfcScannerError.NFC_NOT_ENABLED) {
            pn2.f27356c.a(new wn0.a() { // from class: com.fourthline.orca.internal.nl0
                @Override // wn0.a
                public final Object invoke() {
                    return Pn.k();
                }
            });
        } else {
            pn2.p();
        }
        return jn0.h0.f84049a;
    }

    private final Em a(NfcScannerError nfcScannerError) {
        int i11 = b.$EnumSwitchMapping$0[nfcScannerError.ordinal()];
        if (i11 == 1) {
            return Em.a.f25605a;
        }
        if (i11 == 2) {
            return new Em.e(this.f27360g.b());
        }
        if (i11 == 3) {
            return Em.b.f25606a;
        }
        if (i11 == 4) {
            return Em.c.f25607a;
        }
        if (i11 == 5) {
            return Em.d.a.a(Em.d.f25608c, "NfcScannerViewModel.UNKNOWN", null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
