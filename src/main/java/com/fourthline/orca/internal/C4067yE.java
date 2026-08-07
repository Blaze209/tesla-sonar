package com.fourthline.orca.internal;

import java.util.Locale;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4067yE implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3808sE f36967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36969c;

    public C4067yE(C3808sE c3808sE, Provider provider, Provider provider2) {
        this.f36967a = c3808sE;
        this.f36968b = provider;
        this.f36969c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public KE get() {
        return a(this.f36967a, (C3765rE) this.f36968b.get(), (Locale) this.f36969c.get());
    }

    public static C4067yE a(C3808sE c3808sE, Provider provider, Provider provider2) {
        return new C4067yE(c3808sE, provider, provider2);
    }

    public static KE a(C3808sE c3808sE, C3765rE c3765rE, Locale locale) {
        return (KE) qj0.h.d(c3808sE.a(c3765rE, locale));
    }
}
