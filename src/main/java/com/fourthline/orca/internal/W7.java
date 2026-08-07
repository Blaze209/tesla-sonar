package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class W7 implements InterfaceC3302gf {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f29452g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f29453h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f29454i = AnalyticsAttribute.DocumentCountry;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Is f29455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2874Gc f29456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ND f29457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3354ho f29458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S7 f29459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3302gf f29460f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return W7.f29454i;
        }

        private a() {
        }
    }

    public W7(Is presenter, C2874Gc effectHandler, ND viewNavigator, InterfaceC3354ho analytics, S7 repository, InterfaceC3302gf delegate) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        this.f29455a = presenter;
        this.f29456b = effectHandler;
        this.f29457c = viewNavigator;
        this.f29458d = analytics;
        this.f29459e = repository;
        this.f29460f = delegate;
    }

    private final void d() {
        this.f29458d.track(L7.a.b.f26738a);
        this.f29457c.a(R7.a.f27596a);
    }

    private final void e() {
        G5 g5A = this.f29459e.a();
        if (g5A != null) {
            this.f29458d.track(new L7.a.e(g5A));
        }
        this.f29457c.a(R7.c.f27598a);
    }

    private final void f() {
        this.f29458d.track(L7.a.d.f26740a);
    }

    public final C2874Gc b() {
        return this.f29456b;
    }

    public final Is c() {
        return this.f29455a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(J0 event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof J0.h) {
            f();
        } else if (event instanceof J0.g) {
            e();
        } else if (event instanceof J0.a) {
            d();
        }
        this.f29460f.a(event);
    }
}
