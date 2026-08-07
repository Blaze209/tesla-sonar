package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3532lw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f33451a;

    public C3532lw(C3489kw c3489kw) {
        this.f33451a = c3489kw;
    }

    public static Dt b(C3489kw c3489kw) {
        return (Dt) qj0.h.d(c3489kw.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Dt get() {
        return b(this.f33451a);
    }

    public static C3532lw a(C3489kw c3489kw) {
        return new C3532lw(c3489kw);
    }
}
