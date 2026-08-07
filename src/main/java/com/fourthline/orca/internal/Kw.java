package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Kw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Jw f26685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26687c;

    public Kw(Jw jw2, Provider provider, Provider provider2) {
        this.f26685a = jw2;
        this.f26686b = provider;
        this.f26687c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3732qh get() {
        return a(this.f26685a, (Context) this.f26686b.get(), (Iw) this.f26687c.get());
    }

    public static Kw a(Jw jw2, Provider provider, Provider provider2) {
        return new Kw(jw2, provider, provider2);
    }

    public static InterfaceC3732qh a(Jw jw2, Context context, Iw iw2) {
        return (InterfaceC3732qh) qj0.h.d(jw2.a(context, iw2));
    }
}
