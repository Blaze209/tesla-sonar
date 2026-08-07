package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3536m implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f33469a;

    public C3536m(C3152d c3152d) {
        this.f33469a = c3152d;
    }

    public static Nf b(C3152d c3152d) {
        return (Nf) qj0.h.d(c3152d.h());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Nf get() {
        return b(this.f33469a);
    }

    public static C3536m a(C3152d c3152d) {
        return new C3536m(c3152d);
    }
}
