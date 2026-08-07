package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3991wi implements InterfaceC3302gf {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f36481h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3354ho f36482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f36483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3947vi f36484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ND f36485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3390ii f36486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f36487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f36488g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wi$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wi$b */
    public static final class b implements e {
        @Override // com.fourthline.orca.internal.C3991wi.e
        public void a(C3991wi c3991wi) {
            p013kotlin.jvm.internal.s.k(c3991wi, "<this>");
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wi$c */
    public interface c {
        void a(C3991wi c3991wi);
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wi$d */
    public static final class d implements c {
        @Override // com.fourthline.orca.internal.C3991wi.c
        public void a(C3991wi c3991wi) {
            p013kotlin.jvm.internal.s.k(c3991wi, "<this>");
            c3991wi.d().a(c3991wi.a().b());
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wi$e */
    public interface e {
        void a(C3991wi c3991wi);
    }

    public C3991wi(InterfaceC3354ho analytics, Is presenter, InterfaceC3947vi stateProvider, ND viewNavigator, InterfaceC3390ii navigationDestinations, e startScreenHandler, c finishScreenHandler) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(navigationDestinations, "navigationDestinations");
        p013kotlin.jvm.internal.s.k(startScreenHandler, "startScreenHandler");
        p013kotlin.jvm.internal.s.k(finishScreenHandler, "finishScreenHandler");
        this.f36482a = analytics;
        this.f36483b = presenter;
        this.f36484c = stateProvider;
        this.f36485d = viewNavigator;
        this.f36486e = navigationDestinations;
        this.f36487f = startScreenHandler;
        this.f36488g = finishScreenHandler;
    }

    private final void e() {
        this.f36482a.track(C3092bi.a.b.f30658a);
        this.f36485d.a(this.f36486e.a());
    }

    private final void f() {
        this.f36482a.track(C3092bi.a.d.f30660a);
        this.f36488g.a(this);
    }

    private final void g() {
        this.f36482a.track(C3092bi.a.c.f30659a);
        this.f36487f.a(this);
    }

    public final Is b() {
        return this.f36483b;
    }

    public final InterfaceC3947vi c() {
        return this.f36484c;
    }

    public final ND d() {
        return this.f36485d;
    }

    public final InterfaceC3390ii a() {
        return this.f36486e;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3432ji event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3432ji.a) {
            e();
        } else if (event instanceof InterfaceC3432ji.b) {
            f();
        } else {
            if (!(event instanceof InterfaceC3432ji.c)) {
                throw new NoWhenBranchMatchedException();
            }
            g();
        }
    }

    public /* synthetic */ C3991wi(InterfaceC3354ho interfaceC3354ho, Is is2, InterfaceC3947vi interfaceC3947vi, ND nd2, InterfaceC3390ii interfaceC3390ii, e eVar, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3354ho, is2, interfaceC3947vi, nd2, interfaceC3390ii, (i11 & 32) != 0 ? new b() : eVar, (i11 & 64) != 0 ? new d() : cVar);
    }
}
