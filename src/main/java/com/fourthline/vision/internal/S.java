package com.fourthline.vision.internal;

import android.os.Handler;
import android.os.HandlerThread;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class S implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f37928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37929b;

    public S(L l11, Provider provider) {
        this.f37928a = l11;
        this.f37929b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Handler get() {
        return a(this.f37928a, (HandlerThread) this.f37929b.get());
    }

    public static S a(L l11, Provider provider) {
        return new S(l11, provider);
    }

    public static Handler a(L l11, HandlerThread handlerThread) {
        return (Handler) qj0.h.d(l11.provideHandler(handlerThread));
    }
}
