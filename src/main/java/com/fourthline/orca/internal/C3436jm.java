package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3436jm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f32815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32817c;

    public C3436jm(Zl zl2, Provider provider, Provider provider2) {
        this.f32815a = zl2;
        this.f32816b = provider;
        this.f32817c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3909un get() {
        return a(this.f32815a, (C4104z8) this.f32816b.get(), (Context) this.f32817c.get());
    }

    public static C3436jm a(Zl zl2, Provider provider, Provider provider2) {
        return new C3436jm(zl2, provider, provider2);
    }

    public static InterfaceC3909un a(Zl zl2, C4104z8 c4104z8, Context context) {
        return (InterfaceC3909un) qj0.h.d(zl2.a(c4104z8, context));
    }
}
