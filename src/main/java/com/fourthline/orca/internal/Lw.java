package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Lw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Jw f26862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26864c;

    public Lw(Jw jw2, Provider provider, Provider provider2) {
        this.f26862a = jw2;
        this.f26863b = provider;
        this.f26864c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Uj get() {
        return a(this.f26862a, (Context) this.f26863b.get(), (Iw) this.f26864c.get());
    }

    public static Lw a(Jw jw2, Provider provider, Provider provider2) {
        return new Lw(jw2, provider, provider2);
    }

    public static Uj a(Jw jw2, Context context, Iw iw2) {
        return (Uj) qj0.h.d(jw2.b(context, iw2));
    }
}
