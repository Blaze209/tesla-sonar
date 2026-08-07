package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class DB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f25433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25434b;

    public DB(BB bb2, Provider provider) {
        this.f25433a = bb2;
        this.f25434b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pi get() {
        return a(this.f25433a, (C3934vB) this.f25434b.get());
    }

    public static DB a(BB bb2, Provider provider) {
        return new DB(bb2, provider);
    }

    public static Pi a(BB bb2, C3934vB c3934vB) {
        return (Pi) qj0.h.d(bb2.a(c3934vB));
    }
}
