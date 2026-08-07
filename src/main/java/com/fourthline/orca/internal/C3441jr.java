package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3441jr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f32833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32834b;

    public C3441jr(C3357hr c3357hr, Provider provider) {
        this.f32833a = c3357hr;
        this.f32834b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ur get() {
        return a(this.f32833a, (C3438jo) this.f32834b.get());
    }

    public static C3441jr a(C3357hr c3357hr, Provider provider) {
        return new C3441jr(c3357hr, provider);
    }

    public static Ur a(C3357hr c3357hr, C3438jo c3438jo) {
        return (Ur) qj0.h.d(c3357hr.b(c3438jo));
    }
}
