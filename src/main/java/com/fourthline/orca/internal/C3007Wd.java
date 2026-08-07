package com.fourthline.orca.internal;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3007Wd implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f29536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f29537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Is f29538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2874Gc f29539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ND f29540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2976Vd f29541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC2930Rd f29542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3354ho f29543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC4044xs f29544i;

    public C3007Wd(Context context, Is presenter, C2874Gc effectHandler, ND viewNavigator, C2976Vd stateProvider, InterfaceC2930Rd repository, InterfaceC3354ho analytics, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f29536a = coroutineScope;
        this.f29537b = context;
        this.f29538c = presenter;
        this.f29539d = effectHandler;
        this.f29540e = viewNavigator;
        this.f29541f = stateProvider;
        this.f29542g = repository;
        this.f29543h = analytics;
        this.f29544i = popupHandler;
    }

    private final void d() {
        this.f29539d.a(new wn0.a() { // from class: com.fourthline.orca.internal.mu0
            @Override // wn0.a
            public final Object invoke() {
                return C3007Wd.e();
            }
        });
        this.f29540e.a(InterfaceC2890Jd.c.a.f26461a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2890Jd e() {
        return InterfaceC2890Jd.b.f26460a;
    }

    private final void f() {
        this.f29543h.track(C2885Id.a.b.f26290a);
        d();
    }

    private final void g() {
        AbstractC3225eo.a(this.f29537b);
    }

    private final void h() {
        d();
    }

    private final void i() {
        this.f29543h.track(C2885Id.a.d.f26292a);
        if (p013kotlin.jvm.internal.s.f(this.f29542g.b(), this.f29542g.a())) {
            this.f29544i.a(C2940Td.a.C0519a.f27893a, new wn0.a() { // from class: com.fourthline.orca.internal.pu0
                @Override // wn0.a
                public final Object invoke() {
                    return C3007Wd.a(this.f34640a);
                }
            }, new wn0.a() { // from class: com.fourthline.orca.internal.qu0
                @Override // wn0.a
                public final Object invoke() {
                    return C3007Wd.b(this.f34896a);
                }
            });
        } else {
            this.f29540e.a(InterfaceC2890Jd.c.b.f26462a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2890Jd j() {
        return InterfaceC2890Jd.a.f26459a;
    }

    private final void k() {
        this.f29539d.a(new wn0.a() { // from class: com.fourthline.orca.internal.ru0
            @Override // wn0.a
            public final Object invoke() {
                return C3007Wd.l();
            }
        });
        this.f29538c.a(this.f29541f.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2890Jd l() {
        return InterfaceC2890Jd.b.f26460a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2890Jd m() {
        return InterfaceC2890Jd.b.f26460a;
    }

    private final void n() {
        this.f29543h.track(C2885Id.a.c.f26291a);
        this.f29539d.a(new wn0.a() { // from class: com.fourthline.orca.internal.nu0
            @Override // wn0.a
            public final Object invoke() {
                return C3007Wd.o();
            }
        });
        this.f29538c.a(this.f29541f.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2890Jd o() {
        return InterfaceC2890Jd.a.f26459a;
    }

    public final C2874Gc b() {
        return this.f29539d;
    }

    public final Is c() {
        return this.f29538c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f29536a.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(C3007Wd c3007Wd) {
        c3007Wd.f29540e.a(InterfaceC2890Jd.c.b.f26462a);
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC2895Kd event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC2895Kd.a) {
            f();
            return;
        }
        if (event instanceof InterfaceC2895Kd.d) {
            i();
            return;
        }
        if (event instanceof InterfaceC2895Kd.b) {
            g();
            return;
        }
        if (event instanceof InterfaceC2895Kd.g) {
            n();
            return;
        }
        if (event instanceof InterfaceC2895Kd.e) {
            k();
        } else if (event instanceof InterfaceC2895Kd.f) {
            a(((InterfaceC2895Kd.f) event).a());
        } else {
            if (!(event instanceof InterfaceC2895Kd.c)) {
                throw new NoWhenBranchMatchedException();
            }
            h();
        }
    }

    private final void a(String str) {
        this.f29539d.a(new wn0.a() { // from class: com.fourthline.orca.internal.su0
            @Override // wn0.a
            public final Object invoke() {
                return C3007Wd.m();
            }
        });
        this.f29542g.a(str);
        this.f29538c.a(this.f29541f.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3007Wd c3007Wd) {
        c3007Wd.f29542g.a("");
        c3007Wd.f29539d.a(new wn0.a() { // from class: com.fourthline.orca.internal.ou0
            @Override // wn0.a
            public final Object invoke() {
                return C3007Wd.j();
            }
        });
        c3007Wd.f29538c.a(c3007Wd.f29541f.j());
        return jn0.h0.f84049a;
    }
}
