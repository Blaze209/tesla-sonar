package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Mw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Jw f26972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26974c;

    public Mw(Jw jw2, Provider provider, Provider provider2) {
        this.f26972a = jw2;
        this.f26973b = provider;
        this.f26974c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ln get() {
        return a(this.f26972a, (Context) this.f26973b.get(), (Iw) this.f26974c.get());
    }

    public static Mw a(Jw jw2, Provider provider, Provider provider2) {
        return new Mw(jw2, provider, provider2);
    }

    public static Ln a(Jw jw2, Context context, Iw iw2) {
        return (Ln) qj0.h.d(jw2.c(context, iw2));
    }
}
