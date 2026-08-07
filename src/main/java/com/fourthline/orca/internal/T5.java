package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class T5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S5 f27835a;

    public T5(S5 s11) {
        this.f27835a = s11;
    }

    public static C3392ik b(S5 s11) {
        return (C3392ik) qj0.h.d(s11.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392ik get() {
        return b(this.f27835a);
    }

    public static T5 a(S5 s11) {
        return new T5(s11);
    }
}
