package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3139cn implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f30954a;

    public C3139cn(Qm qm2) {
        this.f30954a = qm2;
    }

    public static C4125zn b(Qm qm2) {
        return (C4125zn) qj0.h.d(qm2.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4125zn get() {
        return b(this.f30954a);
    }

    public static C3139cn a(Qm qm2) {
        return new C3139cn(qm2);
    }
}
