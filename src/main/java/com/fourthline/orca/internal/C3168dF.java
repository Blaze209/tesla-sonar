package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3168dF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final YE f31100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31101b;

    public C3168dF(YE ye2, Provider provider) {
        this.f31100a = ye2;
        this.f31101b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gl get() {
        return a(this.f31100a, (NetworkEnvironment) this.f31101b.get());
    }

    public static C3168dF a(YE ye2, Provider provider) {
        return new C3168dF(ye2, provider);
    }

    public static Gl a(YE ye2, NetworkEnvironment networkEnvironment) {
        return (Gl) qj0.h.d(ye2.b(networkEnvironment));
    }
}
