package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3030a5 implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f30291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f30292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H4 f30293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2874Gc f30294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final G4 f30295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3988wf f30296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ND f30297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ED f30298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3354ho f30299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC4044xs f30300j;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.a5$b */
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l {
        b(Object obj) {
            super(1, obj, C3030a5.class, "onCountryCodeSelected", "onCountryCodeSelected(Lcom/fourthline/orca/core/internal/composable/base_selector/SelectableItem;)V", 0);
        }

        public final void a(InterfaceC3447jx p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C3030a5) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3447jx) obj);
            return jn0.h0.f84049a;
        }
    }

    public C3030a5(Is presenter, H4 stateProvider, C2874Gc effectHandler, G4 repository, InterfaceC3988wf filterCountriesUseCase, ND viewNavigator, ED viewCompletionHandler, InterfaceC3354ho analytics, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(filterCountriesUseCase, "filterCountriesUseCase");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f30291a = coroutineScope;
        this.f30292b = presenter;
        this.f30293c = stateProvider;
        this.f30294d = effectHandler;
        this.f30295e = repository;
        this.f30296f = filterCountriesUseCase;
        this.f30297g = viewNavigator;
        this.f30298h = viewCompletionHandler;
        this.f30299i = analytics;
        this.f30300j = popupHandler;
    }

    private final void e() {
        this.f30299i.track(J4.a.b.f26429a);
        this.f30297g.a(K4.c.a.f26540a);
    }

    private final void f() {
        this.f30292b.a(this.f30293c.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K4 g() {
        return K4.b.f26539a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K4 h() {
        return K4.a.f26538a;
    }

    private final void i() {
        this.f30292b.a(this.f30293c.o());
    }

    private final void j() {
        if (((Y4) this.f30292b.a()).p().getState() == Gh.FOCUSED) {
            this.f30292b.a(this.f30293c.A());
        }
    }

    private final void k() {
        this.f30294d.a(new wn0.a() { // from class: com.fourthline.orca.internal.cy0
            @Override // wn0.a
            public final Object invoke() {
                return C3030a5.l();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K4 l() {
        return K4.a.f26538a;
    }

    private final void m() {
        this.f30292b.a(this.f30293c.r());
    }

    private final void n() {
        if (((Y4) this.f30292b.a()).q().getState() == Gh.UNFOCUSED) {
            return;
        }
        s();
    }

    private final void o() {
        this.f30299i.track(J4.a.d.f26431a);
        a(X4.f29657a);
    }

    private final void p() {
        this.f30292b.a(this.f30293c.s());
    }

    private final void q() {
        if (((Y4) this.f30292b.a()).s().b().getState() == Gh.UNFOCUSED) {
            return;
        }
        t();
    }

    private final void r() {
        this.f30299i.track(J4.a.c.f26430a);
        if (!this.f30295e.h()) {
            s();
        }
        if (this.f30295e.c()) {
            return;
        }
        t();
    }

    private final void s() {
        if (this.f30295e.h()) {
            this.f30292b.a(this.f30293c.w());
        } else if (this.f30295e.d()) {
            this.f30292b.a(this.f30293c.B());
        } else {
            this.f30292b.a(this.f30293c.x());
        }
    }

    private final void t() {
        if (this.f30295e.c()) {
            this.f30292b.a(this.f30293c.z());
        } else if (this.f30295e.j()) {
            this.f30292b.a(this.f30293c.C());
        } else {
            this.f30292b.a(this.f30293c.y());
        }
    }

    public final H4 d() {
        return this.f30293c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f30291a.getCoroutineContext();
    }

    public final C2874Gc b() {
        return this.f30294d;
    }

    public final Is c() {
        return this.f30292b;
    }

    private final void b(String str) {
        this.f30295e.b(p013kotlin.text.t.F1(str).toString());
        Is is2 = this.f30292b;
        is2.a(this.f30293c.d(str));
        is2.a(this.f30293c.v());
    }

    private final void c(String str) {
        this.f30295e.a(p013kotlin.text.t.F1(str).toString());
        Is is2 = this.f30292b;
        is2.a(this.f30293c.f(str));
        is2.a(this.f30293c.v());
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(T4 event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof T4.a) {
            e();
            return;
        }
        if (event instanceof T4.c) {
            o();
            return;
        }
        if (event instanceof T4.b) {
            k();
            return;
        }
        if (event instanceof T4.d) {
            r();
            return;
        }
        if (event instanceof M4) {
            f();
            return;
        }
        if (event instanceof O4) {
            a(((O4) event).a());
            return;
        }
        if (event instanceof N4) {
            i();
            return;
        }
        if (event instanceof P4) {
            j();
            return;
        }
        if (event instanceof L4) {
            a(((L4) event).a());
            return;
        }
        if (event instanceof Q4) {
            b(((Q4) event).a());
            return;
        }
        if (event instanceof R4) {
            m();
            return;
        }
        if (event instanceof S4) {
            n();
            return;
        }
        if (event instanceof V4) {
            p();
        } else if (event instanceof W4) {
            q();
        } else {
            if (!(event instanceof U4)) {
                throw new NoWhenBranchMatchedException();
            }
            c(((U4) event).a());
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.a5$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30301a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ X4 f30303c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(X4 x11, Continuation continuation) {
            super(2, continuation);
            this.f30303c = x11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3030a5.this.new a(this.f30303c, continuation);
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
                int r1 = r5.f30301a
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
                com.fourthline.orca.internal.a5 r6 = com.fourthline.orca.internal.C3030a5.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.C3030a5.b(r6)
                com.fourthline.orca.internal.X4 r1 = r5.f30303c
                r5.f30301a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.a5$a$a r1 = new com.fourthline.orca.internal.a5$a$a
                com.fourthline.orca.internal.a5 r3 = com.fourthline.orca.internal.C3030a5.this
                com.fourthline.orca.internal.X4 r4 = r5.f30303c
                r1.<init>(r3, r4)
                r5.f30301a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3030a5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.a5$a$a, reason: collision with other inner class name */
        static final class C0540a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3030a5 f30304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ X4 f30305b;

            C0540a(C3030a5 c3030a5, X4 x11) {
                this.f30304a = c3030a5;
                this.f30305b = x11;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d)) {
                    if (fd2 instanceof FD.c) {
                        this.f30304a.c().a(this.f30304a.d().d(true));
                    } else if (fd2 instanceof FD.a) {
                        this.f30304a.c().a(this.f30304a.d().d(false));
                        ND nd2 = this.f30304a.f30297g;
                        Of ofA = ((FD.a) fd2).a();
                        InterfaceC3115c5 interfaceC3115c5 = (InterfaceC3115c5) (!(ofA instanceof InterfaceC3115c5) ? null : ofA);
                        if (interfaceC3115c5 == null) {
                            throw new IllegalStateException((ofA.getClass().getSimpleName() + " are not accepted by this Coordinator.").toString());
                        }
                        nd2.a(new K4.c.b(interfaceC3115c5));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f30304a.c().a(this.f30304a.d().d(false));
                        Bo boA = ((FD.b) fd2).a();
                        final C3030a5 c3030a5 = this.f30304a;
                        final X4 x11 = this.f30305b;
                        this.f30304a.f30300j.a(new Ds.c(boA, null, new wn0.a() { // from class: com.fourthline.orca.internal.dy0
                            @Override // wn0.a
                            public final Object invoke() {
                                return C3030a5.a.C0540a.a(c3030a5, x11);
                            }
                        }, 2, null));
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(C3030a5 c3030a5, X4 x11) {
                c3030a5.a(x11);
                return jn0.h0.f84049a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(X4 x11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(x11, null), 3, null);
    }

    private final void a(String str) {
        this.f30292b.a(this.f30293c.a(str));
        this.f30296f.a(p013kotlin.text.t.F1(str).toString(), this.f30295e.b(), new b(this), new wn0.l() { // from class: com.fourthline.orca.internal.zx0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3030a5.a(this.f37377a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3030a5 c3030a5, List it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        c3030a5.f30292b.a(c3030a5.f30293c.a(it));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC3447jx interfaceC3447jx) {
        Object next;
        Iterator it = this.f30295e.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f((G5) next, interfaceC3447jx));
        G5 g11 = (G5) next;
        if (g11 != null) {
            a(g11);
        }
    }

    private final void a(G5 g11) {
        String strG = g11.g();
        G5 g5E = this.f30295e.e();
        if (!p013kotlin.jvm.internal.s.f(strG, g5E != null ? g5E.g() : null)) {
            this.f30295e.a("");
        }
        this.f30295e.a(g11);
        Is is2 = this.f30292b;
        is2.a(this.f30293c.a(g11));
        is2.a(this.f30293c.v());
        C2874Gc c2874Gc = this.f30294d;
        c2874Gc.a(new wn0.a() { // from class: com.fourthline.orca.internal.ay0
            @Override // wn0.a
            public final Object invoke() {
                return C3030a5.g();
            }
        });
        c2874Gc.a(new wn0.a() { // from class: com.fourthline.orca.internal.by0
            @Override // wn0.a
            public final Object invoke() {
                return C3030a5.h();
            }
        });
    }
}
