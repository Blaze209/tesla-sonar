package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2913Ob implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f27159a;

    public C2913Ob(C3811sb c3811sb) {
        this.f27159a = c3811sb;
    }

    public static InterfaceC4124zm b(C3811sb c3811sb) {
        return (InterfaceC4124zm) qj0.h.d(c3811sb.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4124zm get() {
        return b(this.f27159a);
    }

    public static C2913Ob a(C3811sb c3811sb) {
        return new C2913Ob(c3811sb);
    }
}
