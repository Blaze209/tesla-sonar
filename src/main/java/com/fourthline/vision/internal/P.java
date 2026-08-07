package com.fourthline.vision.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f37870a;

    public P(L l11) {
        this.f37870a = l11;
    }

    public static Context b(L l11) {
        return (Context) qj0.h.d(l11.provideContext());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return b(this.f37870a);
    }

    public static P a(L l11) {
        return new P(l11);
    }
}
