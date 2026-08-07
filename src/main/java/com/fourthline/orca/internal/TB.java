package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class TB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f27859a;

    public TB(BB bb2) {
        this.f27859a = bb2;
    }

    public static AbstractC3292gB b(BB bb2) {
        return (AbstractC3292gB) qj0.h.d(bb2.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3292gB get() {
        return b(this.f27859a);
    }

    public static TB a(BB bb2) {
        return new TB(bb2);
    }
}
