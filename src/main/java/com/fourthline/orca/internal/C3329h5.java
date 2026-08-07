package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3329h5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3286g5 f32194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32195b;

    public C3329h5(C3286g5 c3286g5, Provider provider) {
        this.f32194a = c3286g5;
        this.f32195b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public J4 get() {
        return a(this.f32194a, (C3438jo) this.f32195b.get());
    }

    public static C3329h5 a(C3286g5 c3286g5, Provider provider) {
        return new C3329h5(c3286g5, provider);
    }

    public static J4 a(C3286g5 c3286g5, C3438jo c3438jo) {
        return (J4) qj0.h.d(c3286g5.a(c3438jo));
    }
}
