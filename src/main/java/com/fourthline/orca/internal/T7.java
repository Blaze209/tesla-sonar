package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class T7 implements S7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4104z8 f27841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f27842b;

    public T7(C4104z8 bundle, List countries) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(countries, "countries");
        this.f27841a = bundle;
        this.f27842b = countries;
    }

    @Override // com.fourthline.orca.internal.S7
    public G5 a() {
        return this.f27841a.h();
    }

    @Override // com.fourthline.orca.internal.N0
    public InterfaceC3447jx c() {
        return this.f27841a.h();
    }

    @Override // com.fourthline.orca.internal.N0
    public List d() {
        return this.f27842b;
    }

    @Override // com.fourthline.orca.internal.S7
    public void a(G5 g11) {
        this.f27841a.a(g11);
    }
}
