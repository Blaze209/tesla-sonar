package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class I7 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F7 f26263a;

    public I7(F7 f11) {
        this.f26263a = f11;
    }

    public static Ts b(F7 f11) {
        return (Ts) qj0.h.d(f11.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ts get() {
        return b(this.f26263a);
    }

    public static I7 a(F7 f11) {
        return new I7(f11);
    }
}
