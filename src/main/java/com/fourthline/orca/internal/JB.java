package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class JB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f26449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26450b;

    public JB(BB bb2, Provider provider) {
        this.f26449a = bb2;
        this.f26450b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Oi get() {
        return a(this.f26449a, (C3934vB) this.f26450b.get());
    }

    public static JB a(BB bb2, Provider provider) {
        return new JB(bb2, provider);
    }

    public static Oi a(BB bb2, C3934vB c3934vB) {
        return (Oi) qj0.h.d(bb2.c(c3934vB));
    }
}
