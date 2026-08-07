package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3705px implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3662ox f34657a;

    public C3705px(C3662ox c3662ox) {
        this.f34657a = c3662ox;
    }

    public static InterfaceC3051ak b(C3662ox c3662ox) {
        return (InterfaceC3051ak) qj0.h.d(c3662ox.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3051ak get() {
        return b(this.f34657a);
    }

    public static C3705px a(C3662ox c3662ox) {
        return new C3705px(c3662ox);
    }
}
