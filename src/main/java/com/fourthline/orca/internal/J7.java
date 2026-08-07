package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class J7 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F7 f26439a;

    public J7(F7 f11) {
        this.f26439a = f11;
    }

    public static Wf b(F7 f11) {
        return (Wf) qj0.h.d(f11.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Wf get() {
        return b(this.f26439a);
    }

    public static J7 a(F7 f11) {
        return new J7(f11);
    }
}
