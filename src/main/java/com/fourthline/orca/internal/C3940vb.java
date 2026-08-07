package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3940vb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f36069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36071c;

    public C3940vb(C3811sb c3811sb, Provider provider, Provider provider2) {
        this.f36069a = c3811sb;
        this.f36070b = provider;
        this.f36071c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public L7 get() {
        return a(this.f36069a, (C3392ik) this.f36070b.get(), (C3438jo) this.f36071c.get());
    }

    public static C3940vb a(C3811sb c3811sb, Provider provider, Provider provider2) {
        return new C3940vb(c3811sb, provider, provider2);
    }

    public static L7 a(C3811sb c3811sb, C3392ik c3392ik, C3438jo c3438jo) {
        return (L7) qj0.h.d(c3811sb.a(c3392ik, c3438jo));
    }
}
