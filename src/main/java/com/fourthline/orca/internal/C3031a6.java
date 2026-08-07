package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3031a6 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f30308a;

    public C3031a6(Y5 y11) {
        this.f30308a = y11;
    }

    public static E6 b(Y5 y11) {
        return (E6) qj0.h.d(y11.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public E6 get() {
        return b(this.f30308a);
    }

    public static C3031a6 a(Y5 y11) {
        return new C3031a6(y11);
    }
}
