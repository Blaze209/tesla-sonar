package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3428je implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3344he f32749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32751c;

    public C3428je(C3344he c3344he, Provider provider, Provider provider2) {
        this.f32749a = c3344he;
        this.f32750b = provider;
        this.f32751c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3643oe get() {
        return a(this.f32749a, (C2899Lc) this.f32750b.get(), (Context) this.f32751c.get());
    }

    public static C3428je a(C3344he c3344he, Provider provider, Provider provider2) {
        return new C3428je(c3344he, provider, provider2);
    }

    public static InterfaceC3643oe a(C3344he c3344he, C2899Lc c2899Lc, Context context) {
        return (InterfaceC3643oe) qj0.h.d(c3344he.a(c2899Lc, context));
    }
}
