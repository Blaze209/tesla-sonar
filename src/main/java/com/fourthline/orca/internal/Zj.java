package com.fourthline.orca.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class Zj implements InterfaceC4101z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3051ak f30081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3997wo f30082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Fk f30083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HA f30084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3692pk f30085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f30086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Tf f30087g;

    public Zj(InterfaceC3051ak mainRepository, InterfaceC3997wo orcaDestroyer, Fk navigator, HA systemBarsController, InterfaceC3692pk navigationAnalytics) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(navigator, "navigator");
        p013kotlin.jvm.internal.s.k(systemBarsController, "systemBarsController");
        p013kotlin.jvm.internal.s.k(navigationAnalytics, "navigationAnalytics");
        this.f30081a = mainRepository;
        this.f30082b = orcaDestroyer;
        this.f30083c = navigator;
        this.f30084d = systemBarsController;
        this.f30085e = navigationAnalytics;
        this.f30086f = Zj.class.getSimpleName();
        navigator.a(new ja.n.c() { // from class: com.fourthline.orca.internal.qx0
            @Override // ja.n.c
            public final void a(p011ja.n nVar, p011ja.r rVar, Bundle bundle) {
                Zj.a(this.f34920a, nVar, rVar, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Zj zj2, p011ja.n controller, p011ja.r destination, Bundle bundle) {
        p013kotlin.jvm.internal.s.k(controller, "controller");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        zj2.f30085e.d(AbstractC3993wk.a(destination));
    }

    private final void c() {
        a((Bo) AbstractC3594nE.a.f33881c);
    }

    private final p011ja.r d() {
        return this.f30083c.a();
    }

    private final Sf e() {
        Tf tf2 = this.f30087g;
        if (tf2 == null) {
            p013kotlin.jvm.internal.s.B("flowIterator");
            tf2 = null;
        }
        return tf2.a();
    }

    public final void a(C3098bo flowManager) {
        p013kotlin.jvm.internal.s.k(flowManager, "flowManager");
        C3055ao c3055ao = new C3055ao(flowManager);
        a(c3055ao, this.f30081a.d());
        this.f30087g = c3055ao;
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        return new InterfaceC3949vk.p(null, 1, null);
    }

    public final void a(InterfaceC3949vk destination) {
        Sf sfA;
        jn0.h0 h0Var;
        Object obj;
        C3743qs c3743qsB;
        C3743qs c3743qsB2;
        p013kotlin.jvm.internal.s.k(destination, "destination");
        Objects.toString(destination);
        a(destination, this);
        if (destination instanceof InterfaceC3949vk.b) {
            p011ja.r rVarD = d();
            if (rVarD != null) {
                this.f30085e.a(AbstractC3993wk.a(rVarD));
            }
            C3906uk config = ((InterfaceC3949vk.b) destination).getConfig();
            if (config != null && (c3743qsB2 = config.b()) != null) {
                this.f30083c.a(c3743qsB2.a(), c3743qsB2.b());
                return;
            } else {
                this.f30083c.b();
                return;
            }
        }
        Tf tf2 = null;
        if (destination instanceof InterfaceC3949vk.d) {
            p011ja.r rVarD2 = d();
            if (rVarD2 != null) {
                this.f30085e.a(AbstractC3993wk.a(rVarD2));
            }
            Sf sfE = e();
            if (sfE != null && this.f30085e.a(sfE.a(), sfE)) {
                this.f30085e.a(sfE.a(), AbstractC3434jk.a.f32795a);
            }
            Tf tf3 = this.f30087g;
            if (tf3 == null) {
                p013kotlin.jvm.internal.s.B("flowIterator");
                tf3 = null;
            }
            InterfaceC3949vk.d dVar = (InterfaceC3949vk.d) destination;
            Sf sfA2 = tf3.a(dVar.getConfig());
            if (sfA2 != null) {
                if (this.f30085e.a(sfA2.a())) {
                    this.f30085e.a(sfA2.a(), (Rf) null);
                }
                C3906uk config2 = dVar.getConfig();
                if (config2 != null && (c3743qsB = config2.b()) != null) {
                    this.f30083c.a(c3743qsB.a(), c3743qsB.b());
                    return;
                } else {
                    this.f30083c.b();
                    return;
                }
            }
            c();
            jn0.h0 h0Var2 = jn0.h0.f84049a;
            return;
        }
        if (destination instanceof InterfaceC3949vk.l) {
            p011ja.r rVarD3 = d();
            if (rVarD3 != null) {
                this.f30085e.b(AbstractC3993wk.a(rVarD3));
            }
            Sf sfE2 = e();
            if (sfE2 != null && this.f30085e.a(sfE2.a(), sfE2, ((InterfaceC3949vk.l) destination).d())) {
                this.f30085e.b(sfE2.a());
            }
            InterfaceC3949vk.l lVar = (InterfaceC3949vk.l) destination;
            Rf rfD = lVar.d();
            if (rfD != null) {
                Tf tf4 = this.f30087g;
                if (tf4 == null) {
                    p013kotlin.jvm.internal.s.B("flowIterator");
                } else {
                    tf2 = tf4;
                }
                sfA = a(tf2, rfD);
                if (sfA != null) {
                    InterfaceC3949vk interfaceC3949vkB = sfA.b();
                    a(interfaceC3949vkB, this);
                    this.f30083c.a(interfaceC3949vkB, lVar.getConfig());
                } else {
                    a((InterfaceC3740qp) InterfaceC3740qp.c.f34879a);
                    h0Var = jn0.h0.f84049a;
                }
                if (obj != null) {
                    obj = h0Var;
                    obj = sfA;
                    return;
                }
            }
            obj = h0Var;
            obj = sfA;
            a((InterfaceC3740qp) InterfaceC3740qp.c.f34879a);
            jn0.h0 h0Var3 = jn0.h0.f84049a;
            return;
        }
        if (destination instanceof InterfaceC3949vk.n) {
            p011ja.r rVarD4 = d();
            if (rVarD4 != null) {
                this.f30085e.b(AbstractC3993wk.a(rVarD4));
            }
            Sf sfE3 = e();
            if (sfE3 != null && this.f30085e.a(sfE3.a(), sfE3, null)) {
                this.f30085e.b(sfE3.a());
            }
            a(((InterfaceC3949vk.n) destination).d());
            jn0.h0 h0Var4 = jn0.h0.f84049a;
            return;
        }
        if (destination instanceof InterfaceC3949vk.m) {
            p011ja.r rVarD5 = d();
            if (rVarD5 != null) {
                this.f30085e.c(AbstractC3993wk.a(rVarD5));
            }
            Sf sfE4 = e();
            if (sfE4 != null) {
                this.f30085e.a(sfE4.a(), ((InterfaceC3949vk.m) destination).d());
            }
            a(((InterfaceC3949vk.m) destination).d());
            jn0.h0 h0Var5 = jn0.h0.f84049a;
            return;
        }
        if (destination instanceof InterfaceC3949vk.p) {
            jn0.h0 h0Var6 = jn0.h0.f84049a;
            return;
        }
        p011ja.r rVarD6 = d();
        if (rVarD6 != null && this.f30085e.a(AbstractC3993wk.a(rVarD6), destination.b())) {
            this.f30085e.b(AbstractC3993wk.a(rVarD6));
        }
        this.f30083c.a(destination);
        jn0.h0 h0Var7 = jn0.h0.f84049a;
    }

    private static final void a(InterfaceC3949vk interfaceC3949vk, Zj zj2) {
        C3906uk config;
        if ((interfaceC3949vk instanceof D4) && (config = ((D4) interfaceC3949vk).getConfig()) != null && config.a()) {
            zj2.f30084d.a();
        } else {
            zj2.f30084d.b();
        }
    }

    private final void a(InterfaceC3740qp interfaceC3740qp) {
        a(jn0.s.b(interfaceC3740qp));
    }

    private final void a(Bo bo2) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        a(jn0.s.b(jn0.t.a(bo2)));
    }

    private final void a(Object obj) {
        this.f30082b.a(obj);
    }

    private final Sf a(Tf tf2, Rf rf2) {
        tf2.a();
        Sf sfA = tf2.a(rf2);
        if (sfA != null && this.f30085e.a(sfA.a())) {
            this.f30085e.a(sfA.a(), rf2);
        }
        return sfA;
    }
}
