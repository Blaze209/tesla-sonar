package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Hp implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gp f26137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26138b;

    public Hp(Gp gp2, Provider provider) {
        this.f26137a = gp2;
        this.f26138b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Fp get() {
        return a(this.f26137a, (Context) this.f26138b.get());
    }

    public static Hp a(Gp gp2, Provider provider) {
        return new Hp(gp2, provider);
    }

    public static Fp a(Gp gp2, Context context) {
        return (Fp) qj0.h.d(gp2.a(context));
    }
}
