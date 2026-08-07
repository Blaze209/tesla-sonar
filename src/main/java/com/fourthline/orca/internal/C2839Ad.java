package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2839Ad implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4072yd f24940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f24941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f24942c;

    public C2839Ad(C4072yd c4072yd, Provider provider, Provider provider2) {
        this.f24940a = c4072yd;
        this.f24941b = provider;
        this.f24942c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2869Fd get() {
        return a(this.f24940a, (NetworkEnvironment) this.f24941b.get(), (C3257fd) this.f24942c.get());
    }

    public static C2839Ad a(C4072yd c4072yd, Provider provider, Provider provider2) {
        return new C2839Ad(c4072yd, provider, provider2);
    }

    public static InterfaceC2869Fd a(C4072yd c4072yd, NetworkEnvironment networkEnvironment, C3257fd c3257fd) {
        return (InterfaceC2869Fd) qj0.h.d(c4072yd.a(networkEnvironment, c3257fd));
    }
}
