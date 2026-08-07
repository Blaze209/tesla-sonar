package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3016Yc implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f29861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f29862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3011Xc f29863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q3 f29864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ND f29865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3354ho f29866f;

    public C3016Yc(Is presenter, C3011Xc stateProvider, Q3 resultRepository, ND viewNavigator, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f29861a = coroutineScope;
        this.f29862b = presenter;
        this.f29863c = stateProvider;
        this.f29864d = resultRepository;
        this.f29865e = viewNavigator;
        this.f29866f = analytics;
    }

    private final void c() {
        this.f29866f.track(C3737qm.a.b.f34860a);
        this.f29865e.a(InterfaceC2970Uc.a.f28771a);
    }

    private final void d() {
        this.f29866f.track(C3737qm.a.f.f34864a);
        this.f29865e.a(InterfaceC2970Uc.b.f28772a);
    }

    private final void e() {
        this.f29866f.track(C3737qm.a.d.f34862a);
    }

    public final Is b() {
        return this.f29862b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f29861a.getCoroutineContext();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3822sm event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3822sm.e) {
            e();
            return;
        }
        if (event instanceof InterfaceC3822sm.d) {
            d();
            return;
        }
        if (event instanceof InterfaceC3822sm.a) {
            c();
            return;
        }
        if (event instanceof InterfaceC3822sm.b) {
            a((InterfaceC3822sm.b) event);
        } else if (event instanceof InterfaceC3822sm.f) {
            a((InterfaceC3822sm.f) event);
        } else if (!(event instanceof InterfaceC3822sm.c)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void a(InterfaceC3822sm.f fVar) {
        this.f29866f.track(C3737qm.a.c.f34861a);
        this.f29864d.a(fVar.a());
        this.f29862b.a(this.f29863c.a(fVar.a()));
    }

    private final void a(InterfaceC3822sm.b bVar) {
        this.f29862b.a(this.f29863c.a(bVar.b(), bVar.a()));
    }
}
