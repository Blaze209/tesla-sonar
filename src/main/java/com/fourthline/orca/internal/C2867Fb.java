package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2867Fb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f25801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25803c;

    public C2867Fb(C3811sb c3811sb, Provider provider, Provider provider2) {
        this.f25801a = c3811sb;
        this.f25802b = provider;
        this.f25803c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3010Xb get() {
        return a(this.f25801a, (C3392ik) this.f25802b.get(), (C3438jo) this.f25803c.get());
    }

    public static C2867Fb a(C3811sb c3811sb, Provider provider, Provider provider2) {
        return new C2867Fb(c3811sb, provider, provider2);
    }

    public static C3010Xb a(C3811sb c3811sb, C3392ik c3392ik, C3438jo c3438jo) {
        return (C3010Xb) qj0.h.d(c3811sb.b(c3392ik, c3438jo));
    }
}
