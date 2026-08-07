package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class J9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C9 f26442a;

    public J9(C9 c11) {
        this.f26442a = c11;
    }

    public static E7 b(C9 c11) {
        return (E7) qj0.h.d(c11.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public E7 get() {
        return b(this.f26442a);
    }

    public static J9 a(C9 c11) {
        return new J9(c11);
    }
}
