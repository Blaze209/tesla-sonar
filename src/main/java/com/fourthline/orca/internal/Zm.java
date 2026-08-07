package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Zm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f30089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30091c;

    public Zm(Qm qm2, Provider provider, Provider provider2) {
        this.f30089a = qm2;
        this.f30090b = provider;
        this.f30091c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3909un get() {
        return a(this.f30089a, (C4104z8) this.f30090b.get(), (Context) this.f30091c.get());
    }

    public static Zm a(Qm qm2, Provider provider, Provider provider2) {
        return new Zm(qm2, provider, provider2);
    }

    public static InterfaceC3909un a(Qm qm2, C4104z8 c4104z8, Context context) {
        return (InterfaceC3909un) qj0.h.d(qm2.a(c4104z8, context));
    }
}
