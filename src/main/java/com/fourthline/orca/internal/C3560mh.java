package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3560mh implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3474kh f33587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f33591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f33592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f33593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f33594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f33595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider f33596j;

    public C3560mh(C3474kh c3474kh, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f33587a = c3474kh;
        this.f33588b = provider;
        this.f33589c = provider2;
        this.f33590d = provider3;
        this.f33591e = provider4;
        this.f33592f = provider5;
        this.f33593g = provider6;
        this.f33594h = provider7;
        this.f33595i = provider8;
        this.f33596j = provider9;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3251fD get() {
        return a(this.f33587a, (Context) this.f33588b.get(), (InterfaceC3051ak) this.f33589c.get(), (wn0.a) this.f33590d.get(), (Gl) this.f33591e.get(), (CC) this.f33592f.get(), this.f33593g, (X3) this.f33594h.get(), (InterfaceC3559mg) this.f33595i.get(), (C3687pf) this.f33596j.get());
    }

    public static C3560mh a(C3474kh c3474kh, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new C3560mh(c3474kh, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static C3251fD a(C3474kh c3474kh, Context context, InterfaceC3051ak interfaceC3051ak, wn0.a aVar, Gl gl2, CC cc2, Provider provider, X3 x11, InterfaceC3559mg interfaceC3559mg, C3687pf c3687pf) {
        return (C3251fD) qj0.h.d(c3474kh.a(context, interfaceC3051ak, aVar, gl2, cc2, provider, x11, interfaceC3559mg, c3687pf));
    }
}
