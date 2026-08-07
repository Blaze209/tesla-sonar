package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Jr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hr f26503a;

    public Jr(Hr hr2) {
        this.f26503a = hr2;
    }

    public static C3255fb b(Hr hr2) {
        return (C3255fb) qj0.h.d(hr2.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3255fb get() {
        return b(this.f26503a);
    }

    public static Jr a(Hr hr2) {
        return new Jr(hr2);
    }
}
