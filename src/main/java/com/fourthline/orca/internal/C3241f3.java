package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3241f3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3156d3 f31599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31600b;

    public C3241f3(C3156d3 c3156d3, Provider provider) {
        this.f31599a = c3156d3;
        this.f31600b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3321gy get() {
        return a(this.f31599a, (C3438jo) this.f31600b.get());
    }

    public static C3241f3 a(C3156d3 c3156d3, Provider provider) {
        return new C3241f3(c3156d3, provider);
    }

    public static C3321gy a(C3156d3 c3156d3, C3438jo c3438jo) {
        return (C3321gy) qj0.h.d(c3156d3.a(c3438jo));
    }
}
