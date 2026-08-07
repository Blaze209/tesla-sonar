package com.fourthline.vision.internal;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f37950a;

    public T(L l11) {
        this.f37950a = l11;
    }

    public static HandlerThread b(L l11) {
        return (HandlerThread) qj0.h.d(l11.provideHandlerThread());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HandlerThread get() {
        return b(this.f37950a);
    }

    public static T a(L l11) {
        return new T(l11);
    }
}
