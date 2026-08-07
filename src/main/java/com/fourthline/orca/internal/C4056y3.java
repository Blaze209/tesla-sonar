package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4056y3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f36887a;

    public C4056y3(C3712q3 c3712q3) {
        this.f36887a = c3712q3;
    }

    public static Kp b(C3712q3 c3712q3) {
        return (Kp) qj0.h.d(c3712q3.f());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Kp get() {
        return b(this.f36887a);
    }

    public static C4056y3 a(C3712q3 c3712q3) {
        return new C4056y3(c3712q3);
    }
}
