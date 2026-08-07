package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3493l implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f33174a;

    public C3493l(C3152d c3152d) {
        this.f33174a = c3152d;
    }

    public static InterfaceC3886u6 b(C3152d c3152d) {
        return (InterfaceC3886u6) qj0.h.d(c3152d.g());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3886u6 get() {
        return b(this.f33174a);
    }

    public static C3493l a(C3152d c3152d) {
        return new C3493l(c3152d);
    }
}
