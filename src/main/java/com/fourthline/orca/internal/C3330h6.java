package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3330h6 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f32203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32204b;

    public C3330h6(Y5 y11, Provider provider) {
        this.f32203a = y11;
        this.f32204b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(a(this.f32203a, (InterfaceC3051ak) this.f32204b.get()));
    }

    public static C3330h6 a(Y5 y11, Provider provider) {
        return new C3330h6(y11, provider);
    }

    public static boolean a(Y5 y11, InterfaceC3051ak interfaceC3051ak) {
        return y11.d(interfaceC3051ak);
    }
}
