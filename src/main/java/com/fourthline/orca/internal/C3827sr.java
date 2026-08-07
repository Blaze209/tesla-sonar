package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3827sr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f35391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f35394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f35395e;

    public C3827sr(C3357hr c3357hr, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f35391a = c3357hr;
        this.f35392b = provider;
        this.f35393c = provider2;
        this.f35394d = provider3;
        this.f35395e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Fr get() {
        return a(this.f35391a, (Context) this.f35392b.get(), (C3528ls) this.f35393c.get(), (Uj) this.f35394d.get(), (InterfaceC3732qh) this.f35395e.get());
    }

    public static C3827sr a(C3357hr c3357hr, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3827sr(c3357hr, provider, provider2, provider3, provider4);
    }

    public static Fr a(C3357hr c3357hr, Context context, C3528ls c3528ls, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (Fr) qj0.h.d(c3357hr.a(context, c3528ls, uj2, interfaceC3732qh));
    }
}
