package com.fourthline.vision.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.vision.internal.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4223k0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f38497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f38498b;

    public C4223k0(L l11, Provider provider) {
        this.f38497a = l11;
        this.f38498b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public S3 get() {
        return a(this.f38497a, (Context) this.f38498b.get());
    }

    public static C4223k0 a(L l11, Provider provider) {
        return new C4223k0(l11, provider);
    }

    public static S3 a(L l11, Context context) {
        return (S3) qj0.h.d(l11.providesPlayServicesAvailabilityDataSource(context));
    }
}
