package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3444ju implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f32843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32844b;

    public C3444ju(C3146cu c3146cu, Provider provider) {
        this.f32843a = c3146cu;
        this.f32844b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bp get() {
        return a(this.f32843a, (Context) this.f32844b.get());
    }

    public static C3444ju a(C3146cu c3146cu, Provider provider) {
        return new C3444ju(c3146cu, provider);
    }

    public static Bp a(C3146cu c3146cu, Context context) {
        return (Bp) qj0.h.d(c3146cu.b(context));
    }
}
