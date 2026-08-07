package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.We, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3008We implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2977Ve f29545a;

    public C3008We(C2977Ve c2977Ve) {
        this.f29545a = c2977Ve;
    }

    public static Bs b(C2977Ve c2977Ve) {
        return (Bs) qj0.h.d(c2977Ve.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bs get() {
        return b(this.f29545a);
    }

    public static C3008We a(C2977Ve c2977Ve) {
        return new C3008We(c2977Ve);
    }
}
