package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3761rA implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3676pA f34999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35000b;

    public C3761rA(C3676pA c3676pA, Provider provider) {
        this.f34999a = c3676pA;
        this.f35000b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3977wA get() {
        return a(this.f34999a, (Context) this.f35000b.get());
    }

    public static C3761rA a(C3676pA c3676pA, Provider provider) {
        return new C3761rA(c3676pA, provider);
    }

    public static C3977wA a(C3676pA c3676pA, Context context) {
        return (C3977wA) qj0.h.d(c3676pA.a(context));
    }
}
