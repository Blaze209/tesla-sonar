package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4065yC implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f36957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f36958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4022xC f36959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ND f36960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3763rC f36961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3849tC f36962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3935vC f36963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3592nC f36964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC4044xs f36965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Object f36966j;

    public C4065yC(Is presenter, InterfaceC4022xC stateProvider, ND viewNavigator, C3763rC screenActions, InterfaceC3849tC finishScreenHandler, InterfaceC3935vC repository, C3592nC analytics, InterfaceC4044xs interfaceC4044xs, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(screenActions, "screenActions");
        p013kotlin.jvm.internal.s.k(finishScreenHandler, "finishScreenHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f36957a = coroutineScope;
        this.f36958b = presenter;
        this.f36959c = stateProvider;
        this.f36960d = viewNavigator;
        this.f36961e = screenActions;
        this.f36962f = finishScreenHandler;
        this.f36963g = repository;
        this.f36964h = analytics;
        this.f36965i = interfaceC4044xs;
    }

    private final void e() {
        this.f36964h.track((C3592nC.a) C3592nC.a.b.f33876a);
        this.f36960d.a(this.f36961e.b().a());
    }

    private final void f() {
        InterfaceC4044xs interfaceC4044xs;
        Ds dsA = this.f36961e.a();
        if (dsA == null || (interfaceC4044xs = this.f36965i) == null) {
            return;
        }
        interfaceC4044xs.a(dsA);
    }

    private final void g() {
        Object obj = this.f36966j;
        if (obj != null) {
            this.f36964h.track((C3592nC.a) new C3592nC.a.c(obj));
            this.f36963g.a(obj);
            this.f36962f.a(this, obj);
        }
    }

    public final Is b() {
        return this.f36958b;
    }

    public final InterfaceC4022xC c() {
        return this.f36959c;
    }

    public final ND d() {
        return this.f36960d;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f36957a.getCoroutineContext();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3678pC event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3678pC.d) {
            return;
        }
        if (event instanceof InterfaceC3678pC.e) {
            a(((InterfaceC3678pC.e) event).a());
            return;
        }
        if (event instanceof InterfaceC3678pC.c) {
            g();
        } else if (event instanceof InterfaceC3678pC.a) {
            e();
        } else {
            if (!(event instanceof InterfaceC3678pC.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f();
        }
    }

    private final void a(Object obj) {
        this.f36964h.track((C3592nC.a) new C3592nC.a.d(obj));
        this.f36966j = obj;
        this.f36958b.a(this.f36959c.a(obj));
    }
}
