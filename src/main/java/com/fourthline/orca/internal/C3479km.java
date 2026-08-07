package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3479km implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f33016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f33020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f33021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f33022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f33023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f33024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider f33025j;

    public C3479km(Zl zl2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f33016a = zl2;
        this.f33017b = provider;
        this.f33018c = provider2;
        this.f33019d = provider3;
        this.f33020e = provider4;
        this.f33021f = provider5;
        this.f33022g = provider6;
        this.f33023h = provider7;
        this.f33024i = provider8;
        this.f33025j = provider9;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082yn get() {
        return a(this.f33016a, (C4039xn) this.f33017b.get(), (InterfaceC3909un) this.f33018c.get(), (C3523ln) this.f33019d.get(), (Ul) this.f33020e.get(), (CoroutineScope) this.f33021f.get(), (C4087ys) this.f33022g.get(), (InterfaceC3732qh) this.f33023h.get(), (Uj) this.f33024i.get(), (C3085bb) this.f33025j.get());
    }

    public static C3479km a(Zl zl2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new C3479km(zl2, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static C4082yn a(Zl zl2, C4039xn c4039xn, InterfaceC3909un interfaceC3909un, C3523ln c3523ln, Ul ul2, CoroutineScope coroutineScope, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh, Uj uj2, C3085bb c3085bb) {
        return (C4082yn) qj0.h.d(zl2.a(c4039xn, interfaceC3909un, c3523ln, ul2, coroutineScope, c4087ys, interfaceC3732qh, uj2, c3085bb));
    }
}
