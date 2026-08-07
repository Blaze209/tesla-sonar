package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3013Xe implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2977Ve f29736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29737b;

    public C3013Xe(C2977Ve c2977Ve, Provider provider) {
        this.f29736a = c2977Ve;
        this.f29737b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3046af get() {
        return a(this.f29736a, (C3438jo) this.f29737b.get());
    }

    public static C3013Xe a(C2977Ve c2977Ve, Provider provider) {
        return new C3013Xe(c2977Ve, provider);
    }

    public static C3046af a(C2977Ve c2977Ve, C3438jo c3438jo) {
        return (C3046af) qj0.h.d(c2977Ve.a(c3438jo));
    }
}
