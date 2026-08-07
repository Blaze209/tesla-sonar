package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3365hz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3066az f32392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f32396e;

    public C3365hz(C3066az c3066az, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f32392a = c3066az;
        this.f32393b = provider;
        this.f32394c = provider2;
        this.f32395d = provider3;
        this.f32396e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3681pF get() {
        return a(this.f32392a, (NetworkEnvironment) this.f32393b.get(), (Gl) this.f32394c.get(), (C3438jo) this.f32395d.get(), this.f32396e);
    }

    public static C3365hz a(C3066az c3066az, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3365hz(c3066az, provider, provider2, provider3, provider4);
    }

    public static InterfaceC3681pF a(C3066az c3066az, NetworkEnvironment networkEnvironment, Gl gl2, C3438jo c3438jo, Provider provider) {
        return (InterfaceC3681pF) qj0.h.d(c3066az.a(networkEnvironment, gl2, c3438jo, provider));
    }
}
