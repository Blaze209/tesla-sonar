package com.fourthline.vision.internal;

import android.media.ImageReader;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.vision.internal.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4332z5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4297u5 f39155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f39156b;

    public C4332z5(C4297u5 c4297u5, Provider provider) {
        this.f39155a = c4297u5;
        this.f39156b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ImageReader get() {
        return a(this.f39155a, (C4312x) this.f39156b.get());
    }

    public static C4332z5 a(C4297u5 c4297u5, Provider provider) {
        return new C4332z5(c4297u5, provider);
    }

    public static ImageReader a(C4297u5 c4297u5, C4312x c4312x) {
        return (ImageReader) qj0.h.d(c4297u5.provideImageReader(c4312x));
    }
}
