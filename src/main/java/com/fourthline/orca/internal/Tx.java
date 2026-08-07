package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Tx implements InterfaceC3302gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Is f27978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ND f27979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4044xs f27980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3354ho f27981d;

    public Tx(Is presenter, ND viewNavigator, InterfaceC4044xs popupHandler, InterfaceC3354ho analytics) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f27978a = presenter;
        this.f27979b = viewNavigator;
        this.f27980c = popupHandler;
        this.f27981d = analytics;
    }

    private final void b() {
        this.f27981d.track(Mx.a.b.f26976a);
        this.f27979b.a(Nx.a.f27101a);
    }

    private final void c() {
        this.f27981d.track(Mx.a.d.f26978a);
        this.f27979b.a(Nx.b.f27102a);
    }

    private final void d() {
        this.f27981d.track(Mx.a.c.f26977a);
    }

    public final Is a() {
        return this.f27978a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(Ox event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof Ox.c) {
            d();
        } else if (event instanceof Ox.a) {
            b();
        } else {
            if (!(event instanceof Ox.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c();
        }
    }
}
