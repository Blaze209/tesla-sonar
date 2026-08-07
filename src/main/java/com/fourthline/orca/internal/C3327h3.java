package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3327h3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3156d3 f32178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f32182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f32183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f32184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f32185h;

    public C3327h3(C3156d3 c3156d3, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f32178a = c3156d3;
        this.f32179b = provider;
        this.f32180c = provider2;
        this.f32181d = provider3;
        this.f32182e = provider4;
        this.f32183f = provider5;
        this.f32184g = provider6;
        this.f32185h = provider7;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3834sy get() {
        return a(this.f32178a, (InterfaceC3663oy) this.f32179b.get(), (ND) this.f32180c.get(), (ED) this.f32181d.get(), (InterfaceC3791ry) this.f32182e.get(), (InterfaceC2931Re) this.f32183f.get(), (C3321gy) this.f32184g.get(), (CoroutineScope) this.f32185h.get());
    }

    public static C3327h3 a(C3156d3 c3156d3, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new C3327h3(c3156d3, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static C3834sy a(C3156d3 c3156d3, InterfaceC3663oy interfaceC3663oy, ND nd2, ED ed2, InterfaceC3791ry interfaceC3791ry, InterfaceC2931Re interfaceC2931Re, C3321gy c3321gy, CoroutineScope coroutineScope) {
        return (C3834sy) qj0.h.d(c3156d3.a(interfaceC3663oy, nd2, ed2, interfaceC3791ry, interfaceC2931Re, c3321gy, coroutineScope));
    }
}
