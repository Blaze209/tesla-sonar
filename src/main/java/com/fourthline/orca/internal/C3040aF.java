package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.aF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3040aF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final YE f30346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30348c;

    public C3040aF(YE ye2, Provider provider, Provider provider2) {
        this.f30346a = ye2;
        this.f30347b = provider;
        this.f30348c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Il get() {
        return a(this.f30346a, (NetworkEnvironment) this.f30347b.get(), (C3438jo) this.f30348c.get());
    }

    public static C3040aF a(YE ye2, Provider provider, Provider provider2) {
        return new C3040aF(ye2, provider, provider2);
    }

    public static Il a(YE ye2, NetworkEnvironment networkEnvironment, C3438jo c3438jo) {
        return (Il) qj0.h.d(ye2.a(networkEnvironment, c3438jo));
    }
}
