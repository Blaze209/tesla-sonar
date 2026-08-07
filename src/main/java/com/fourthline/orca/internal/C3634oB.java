package com.fourthline.orca.internal;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.oB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3634oB implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f34106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3335hB f34107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3591nB f34108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3462kB f34109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3354ho f34110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ND f34111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ED f34112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3463kC f34113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C2874Gc f34114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Is f34115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC4044xs f34116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f34117l;

    public C3634oB(InterfaceC3335hB repository, C3591nB stateProvider, InterfaceC3462kB resultRepository, InterfaceC3354ho analytics, ND viewNavigator, ED viewCompletionHandler, InterfaceC3463kC tinValidator, C2874Gc effectHandler, Is presenter, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(tinValidator, "tinValidator");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f34106a = coroutineScope;
        this.f34107b = repository;
        this.f34108c = stateProvider;
        this.f34109d = resultRepository;
        this.f34110e = analytics;
        this.f34111f = viewNavigator;
        this.f34112g = viewCompletionHandler;
        this.f34113h = tinValidator;
        this.f34114i = effectHandler;
        this.f34115j = presenter;
        this.f34116k = popupHandler;
        this.f34117l = ((C3249fB) presenter.a()).q().c();
    }

    private final void e() {
        this.f34110e.track(ZA.a.e.f30004a);
        if (this.f34117l == null) {
            this.f34117l = "";
        }
        this.f34115j.a(this.f34108c.j());
        this.f34114i.a(new wn0.a() { // from class: com.fourthline.orca.internal.u81
            @Override // wn0.a
            public final Object invoke() {
                return C3634oB.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3036aB f() {
        return InterfaceC3036aB.b.f30324a;
    }

    private final void g() {
        this.f34114i.a(new wn0.a() { // from class: com.fourthline.orca.internal.v81
            @Override // wn0.a
            public final Object invoke() {
                return C3634oB.h();
            }
        });
        String str = this.f34117l;
        if (str == null || ((C3249fB) this.f34115j.a()).q().getState() != Gh.FOCUSED) {
            return;
        }
        b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3036aB h() {
        return InterfaceC3036aB.a.f30323a;
    }

    private final void i() {
        this.f34110e.track(ZA.a.d.f30003a);
        InterfaceC3462kB interfaceC3462kB = this.f34109d;
        MA maA = this.f34107b.a();
        String str = this.f34117l;
        if (str == null) {
            throw new IllegalStateException("FL developer error! The tax number must be filled in by user by this moment.");
        }
        interfaceC3462kB.a(new C3419jB(maA, str));
        a(C3206eB.f31363a);
    }

    private final void j() {
        String str = this.f34117l;
        if (str == null || str.length() == 0) {
            this.f34115j.a(new wn0.l() { // from class: com.fourthline.orca.internal.w81
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return C3634oB.a(this.f36366a, (C3249fB) obj);
                }
            });
        }
        this.f34110e.track(ZA.a.c.f30002a);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f34106a.getCoroutineContext();
    }

    private final void d() {
        this.f34110e.track(ZA.a.b.f30001a);
        this.f34111f.a(C3079bB.f30585a);
    }

    public final C2874Gc b() {
        return this.f34114i;
    }

    public final Is c() {
        return this.f34115j;
    }

    private final void b(String str) {
        this.f34115j.a(this.f34108c.a(this.f34113h.a(str)));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3164dB event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3164dB.a) {
            d();
            return;
        }
        if (event instanceof InterfaceC3164dB.c) {
            i();
            return;
        }
        if (event instanceof InterfaceC3164dB.d) {
            j();
            return;
        }
        if (!(event instanceof InterfaceC3164dB.b)) {
            if (!(event instanceof InterfaceC3164dB.e)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((InterfaceC3164dB.e) event).a());
        } else if (((InterfaceC3164dB.b) event).a()) {
            e();
        } else {
            g();
        }
    }

    private final void a(String str) {
        this.f34117l = str;
        this.f34115j.a(this.f34108c.a(str, this.f34113h.a(str) == EnumC3420jC.SUCCESS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C3206eB c3206eB) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(c3206eB, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3249fB a(C3634oB c3634oB, C3249fB present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3634oB.f34108c.getInitialState();
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oB$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34118a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3206eB f34120c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3206eB c3206eB, Continuation continuation) {
            super(2, continuation);
            this.f34120c = c3206eB;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3634oB.this.new a(this.f34120c, continuation);
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
                int r1 = r5.f34118a
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
                com.fourthline.orca.internal.oB r6 = com.fourthline.orca.internal.C3634oB.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.C3634oB.c(r6)
                com.fourthline.orca.internal.eB r1 = r5.f34120c
                r5.f34118a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.oB$a$a r1 = new com.fourthline.orca.internal.oB$a$a
                com.fourthline.orca.internal.oB r3 = com.fourthline.orca.internal.C3634oB.this
                com.fourthline.orca.internal.eB r4 = r5.f34120c
                r1.<init>(r3, r4)
                r5.f34118a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3634oB.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.oB$a$a, reason: collision with other inner class name */
        static final class C0594a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3634oB f34121a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3206eB f34122b;

            C0594a(C3634oB c3634oB, C3206eB c3206eB) {
                this.f34121a = c3634oB;
                this.f34122b = c3206eB;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d)) {
                    if (fd2 instanceof FD.c) {
                        this.f34121a.c().a(this.f34121a.f34108c.d(true));
                    } else if (fd2 instanceof FD.a) {
                        this.f34121a.c().a(this.f34121a.f34108c.d(false));
                        ND nd2 = this.f34121a.f34111f;
                        Of ofA = ((FD.a) fd2).a();
                        InterfaceC3805sB interfaceC3805sB = (InterfaceC3805sB) (!(ofA instanceof InterfaceC3805sB) ? null : ofA);
                        if (interfaceC3805sB == null) {
                            throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        nd2.a(new C3121cB(interfaceC3805sB));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f34121a.c().a(this.f34121a.f34108c.d(false));
                        Bo boA = ((FD.b) fd2).a();
                        final C3634oB c3634oB = this.f34121a;
                        final C3206eB c3206eB = this.f34122b;
                        this.f34121a.f34116k.a(new Ds.c(boA, null, new wn0.a() { // from class: com.fourthline.orca.internal.x81
                            @Override // wn0.a
                            public final Object invoke() {
                                return C3634oB.a.C0594a.a(c3634oB, c3206eB);
                            }
                        }, 2, null));
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(C3634oB c3634oB, C3206eB c3206eB) {
                c3634oB.a(c3206eB);
                return jn0.h0.f84049a;
            }
        }
    }
}
