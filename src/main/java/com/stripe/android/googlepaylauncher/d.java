package com.stripe.android.googlepaylauncher;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements qj0.e<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f50770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<h.Config> f50771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<o30.d> f50772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<h70.h> f50773d;

    public d(Provider<Context> provider, Provider<h.Config> provider2, Provider<o30.d> provider3, Provider<h70.h> provider4) {
        this.f50770a = provider;
        this.f50771b = provider2;
        this.f50772c = provider3;
        this.f50773d = provider4;
    }

    public static d a(Provider<Context> provider, Provider<h.Config> provider2, Provider<o30.d> provider3, Provider<h70.h> provider4) {
        return new d(provider, provider2, provider3, provider4);
    }

    public static c c(Context context, h.Config config, o30.d dVar, h70.h hVar) {
        return new c(context, config, dVar, hVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f50770a.get(), this.f50771b.get(), this.f50772c.get(), this.f50773d.get());
    }
}
