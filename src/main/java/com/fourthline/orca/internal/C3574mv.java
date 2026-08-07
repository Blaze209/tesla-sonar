package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3574mv implements InterfaceC3302gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Is f33717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3531lv f33718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ND f33719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Bp f33720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3147cv f33721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3730qf f33722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3772rf f33723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3354ho f33724h;

    public C3574mv(Is presenter, C3531lv stateProvider, ND viewNavigator, Bp renderer, InterfaceC3147cv repository, InterfaceC3730qf fileDownloader, InterfaceC3772rf fileSharer, InterfaceC3354ho analytics) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(renderer, "renderer");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(fileDownloader, "fileDownloader");
        p013kotlin.jvm.internal.s.k(fileSharer, "fileSharer");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f33717a = presenter;
        this.f33718b = stateProvider;
        this.f33719c = viewNavigator;
        this.f33720d = renderer;
        this.f33721e = repository;
        this.f33722f = fileDownloader;
        this.f33723g = fileSharer;
        this.f33724h = analytics;
    }

    private final void c() {
        this.f33724h.track(C3232ev.a.b.f31536a);
        this.f33719c.a(InterfaceC3275fv.a.f31877a);
    }

    private final void d() {
        this.f33724h.track(C3232ev.a.e.f31539a);
        e();
    }

    private final void e() {
        this.f33717a.a(this.f33718b.a(this.f33721e.b(), this.f33720d.a(this.f33721e.a())));
    }

    private final void f() {
        this.f33724h.track(C3232ev.a.f.f31540a);
        this.f33723g.a(this.f33721e.a());
    }

    public final Is b() {
        return this.f33717a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3318gv event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3318gv.a) {
            c();
            return;
        }
        if (event instanceof InterfaceC3318gv.d) {
            d();
            return;
        }
        if (event instanceof InterfaceC3318gv.e) {
            f();
        } else if (event instanceof InterfaceC3318gv.c) {
            a();
        } else {
            if (!(event instanceof InterfaceC3318gv.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((InterfaceC3318gv.b) event).a());
        }
    }

    private final void a() {
        this.f33724h.track(C3232ev.a.d.f31538a);
        this.f33722f.a(this.f33721e.b(), this.f33721e.a());
    }

    private final void a(Map map) {
        this.f33724h.track(new C3232ev.a.c(map));
    }
}
