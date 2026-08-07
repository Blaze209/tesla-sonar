package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesErrorPopupStateBuilder;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Nt implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f27094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27095b;

    public Nt(Et et2, Provider provider) {
        this.f27094a = et2;
        this.f27095b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public QesErrorPopupStateBuilder get() {
        return a(this.f27094a, (InterfaceC3732qh) this.f27095b.get());
    }

    public static Nt a(Et et2, Provider provider) {
        return new Nt(et2, provider);
    }

    public static QesErrorPopupStateBuilder a(Et et2, InterfaceC3732qh interfaceC3732qh) {
        return (QesErrorPopupStateBuilder) qj0.h.d(et2.c(interfaceC3732qh));
    }
}
