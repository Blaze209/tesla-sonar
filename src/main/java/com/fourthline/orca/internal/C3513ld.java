package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3513ld implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3386id f33293a;

    public C3513ld(C3386id c3386id) {
        this.f33293a = c3386id;
    }

    public static C3214ed b(C3386id c3386id) {
        return (C3214ed) qj0.h.d(c3386id.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3214ed get() {
        return b(this.f33293a);
    }

    public static C3513ld a(C3386id c3386id) {
        return new C3513ld(c3386id);
    }
}
