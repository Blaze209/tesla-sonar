package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3879u implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f35778a;

    public C3879u(C3152d c3152d) {
        this.f35778a = c3152d;
    }

    public static Rw b(C3152d c3152d) {
        return (Rw) qj0.h.d(c3152d.n());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rw get() {
        return b(this.f35778a);
    }

    public static C3879u a(C3152d c3152d) {
        return new C3879u(c3152d);
    }
}
