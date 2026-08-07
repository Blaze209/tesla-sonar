package com.fourthline.vision.internal;

import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f37894a;

    public Q(L l11) {
        this.f37894a = l11;
    }

    public static CoroutineContext b(L l11) {
        return (CoroutineContext) qj0.h.d(l11.provideCoroutineContext());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CoroutineContext get() {
        return b(this.f37894a);
    }

    public static Q a(L l11) {
        return new Q(l11);
    }
}
