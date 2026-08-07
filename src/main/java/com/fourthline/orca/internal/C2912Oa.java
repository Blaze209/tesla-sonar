package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2912Oa implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2877Ha f27158a;

    public C2912Oa(C2877Ha c2877Ha) {
        this.f27158a = c2877Ha;
    }

    public static Fs b(C2877Ha c2877Ha) {
        return (Fs) qj0.h.d(c2877Ha.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Fs get() {
        return b(this.f27158a);
    }

    public static C2912Oa a(C2877Ha c2877Ha) {
        return new C2912Oa(c2877Ha);
    }
}
