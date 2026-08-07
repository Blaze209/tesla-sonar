package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2903Mb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f26920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26921b;

    public C2903Mb(C3811sb c3811sb, Provider provider) {
        this.f26920a = c3811sb;
        this.f26921b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f26920a, (C2938Tb) this.f26921b.get());
    }

    public static C2903Mb a(C3811sb c3811sb, Provider provider) {
        return new C2903Mb(c3811sb, provider);
    }

    public static ED a(C3811sb c3811sb, C2938Tb c2938Tb) {
        return (ED) qj0.h.d(c3811sb.a(c2938Tb));
    }
}
