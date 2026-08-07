package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3461kA implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3377iA f32938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32939b;

    public C3461kA(C3377iA c3377iA, Provider provider) {
        this.f32938a = c3377iA;
        this.f32939b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3788rv get() {
        return a(this.f32938a, (Context) this.f32939b.get());
    }

    public static C3461kA a(C3377iA c3377iA, Provider provider) {
        return new C3461kA(c3377iA, provider);
    }

    public static InterfaceC3788rv a(C3377iA c3377iA, Context context) {
        return (InterfaceC3788rv) qj0.h.d(c3377iA.a(context));
    }
}
