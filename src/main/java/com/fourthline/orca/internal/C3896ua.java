package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3896ua implements InterfaceC3302gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Is f35858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ND f35859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3354ho f35860c;

    public C3896ua(Is presenter, ND viewNavigator, InterfaceC3354ho analytics) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f35858a = presenter;
        this.f35859b = viewNavigator;
        this.f35860c = analytics;
    }

    private final void b() {
        this.f35860c.track(C3553ma.a.b.f33540a);
        this.f35859b.a(InterfaceC3596na.a.f33898a);
    }

    private final void c() {
        this.f35860c.track(C3553ma.a.d.f33542a);
        this.f35859b.a(new InterfaceC3596na.b(false));
    }

    private final void d() {
        this.f35860c.track(C3553ma.a.c.f33541a);
    }

    public final Is a() {
        return this.f35858a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3639oa event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3639oa.a) {
            b();
        } else if (event instanceof InterfaceC3639oa.b) {
            c();
        } else {
            if (!(event instanceof InterfaceC3639oa.c)) {
                throw new NoWhenBranchMatchedException();
            }
            d();
        }
    }
}
