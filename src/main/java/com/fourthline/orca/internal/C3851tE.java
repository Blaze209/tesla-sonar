package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3851tE implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3808sE f35614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f35617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f35618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f35619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f35620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f35621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f35622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider f35623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider f35624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Provider f35625l;

    public C3851tE(C3808sE c3808sE, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        this.f35614a = c3808sE;
        this.f35615b = provider;
        this.f35616c = provider2;
        this.f35617d = provider3;
        this.f35618e = provider4;
        this.f35619f = provider5;
        this.f35620g = provider6;
        this.f35621h = provider7;
        this.f35622i = provider8;
        this.f35623j = provider9;
        this.f35624k = provider10;
        this.f35625l = provider11;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public QE get() {
        return a(this.f35614a, (Context) this.f35615b.get(), (X3) this.f35616c.get(), (Xk) this.f35617d.get(), (InterfaceC3681pF) this.f35618e.get(), (InterfaceC3508lE) this.f35619f.get(), (InterfaceC3852tF) this.f35620g.get(), (InterfaceC3551mE) this.f35621h.get(), (InterfaceC3645og) this.f35622i.get(), (InterfaceC3625o2) this.f35623j.get(), (NetworkEnvironment) this.f35624k.get(), (C3438jo) this.f35625l.get());
    }

    public static C3851tE a(C3808sE c3808sE, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        return new C3851tE(c3808sE, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static QE a(C3808sE c3808sE, Context context, X3 x11, Xk xk2, InterfaceC3681pF interfaceC3681pF, InterfaceC3508lE interfaceC3508lE, InterfaceC3852tF interfaceC3852tF, InterfaceC3551mE interfaceC3551mE, InterfaceC3645og interfaceC3645og, InterfaceC3625o2 interfaceC3625o2, NetworkEnvironment networkEnvironment, C3438jo c3438jo) {
        return (QE) qj0.h.d(c3808sE.a(context, x11, xk2, interfaceC3681pF, interfaceC3508lE, interfaceC3852tF, interfaceC3551mE, interfaceC3645og, interfaceC3625o2, networkEnvironment, c3438jo));
    }
}
