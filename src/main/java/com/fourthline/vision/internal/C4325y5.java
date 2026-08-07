package com.fourthline.vision.internal;

import android.media.ImageReader;
import android.os.Handler;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.fourthline.vision.internal.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4325y5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4297u5 f39133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f39134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f39135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f39136d;

    public C4325y5(C4297u5 c4297u5, Provider provider, Provider provider2, Provider provider3) {
        this.f39133a = c4297u5;
        this.f39134b = provider;
        this.f39135c = provider2;
        this.f39136d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public K2 get() {
        return a(this.f39133a, (ImageReader) this.f39134b.get(), (Handler) this.f39135c.get(), (CoroutineContext) this.f39136d.get());
    }

    public static C4325y5 a(C4297u5 c4297u5, Provider provider, Provider provider2, Provider provider3) {
        return new C4325y5(c4297u5, provider, provider2, provider3);
    }

    public static K2 a(C4297u5 c4297u5, ImageReader imageReader, Handler handler, CoroutineContext coroutineContext) {
        return (K2) qj0.h.d(c4297u5.provideImageDataSource(imageReader, handler, coroutineContext));
    }
}
