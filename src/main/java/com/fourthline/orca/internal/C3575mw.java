package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3575mw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f33726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33727b;

    public C3575mw(C3489kw c3489kw, Provider provider) {
        this.f33726a = c3489kw;
        this.f33727b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3901uf get() {
        return a(this.f33726a, (Context) this.f33727b.get());
    }

    public static C3575mw a(C3489kw c3489kw, Provider provider) {
        return new C3575mw(c3489kw, provider);
    }

    public static InterfaceC3901uf a(C3489kw c3489kw, Context context) {
        return (InterfaceC3901uf) qj0.h.d(c3489kw.b(context));
    }
}
