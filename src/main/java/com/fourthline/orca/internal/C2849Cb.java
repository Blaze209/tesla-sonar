package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2849Cb implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3811sb f25200a;

    public C2849Cb(C3811sb c3811sb) {
        this.f25200a = c3811sb;
    }

    public static InterfaceC3084ba b(C3811sb c3811sb) {
        return (InterfaceC3084ba) qj0.h.d(c3811sb.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3084ba get() {
        return b(this.f25200a);
    }

    public static C2849Cb a(C3811sb c3811sb) {
        return new C2849Cb(c3811sb);
    }
}
