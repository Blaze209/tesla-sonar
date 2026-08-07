package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3427jd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3386id f32746a;

    public C3427jd(C3386id c3386id) {
        this.f32746a = c3386id;
    }

    public static C3257fd b(C3386id c3386id) {
        return (C3257fd) qj0.h.d(c3386id.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3257fd get() {
        return b(this.f32746a);
    }

    public static C3427jd a(C3386id c3386id) {
        return new C3427jd(c3386id);
    }
}
