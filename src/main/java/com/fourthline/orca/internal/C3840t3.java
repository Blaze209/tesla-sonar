package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3840t3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f35531a;

    public C3840t3(C3712q3 c3712q3) {
        this.f35531a = c3712q3;
    }

    public static F4 b(C3712q3 c3712q3) {
        return (F4) qj0.h.d(c3712q3.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public F4 get() {
        return b(this.f35531a);
    }

    public static C3840t3 a(C3712q3 c3712q3) {
        return new C3840t3(c3712q3);
    }
}
