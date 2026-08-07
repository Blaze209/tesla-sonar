package com.plaid.internal;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes6.dex */
public final class G3 implements qj0.e<F3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4504p3 f46323a;

    public G3(C4504p3 c4504p3) {
        this.f46323a = c4504p3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F3((Resources) this.f46323a.get());
    }
}
