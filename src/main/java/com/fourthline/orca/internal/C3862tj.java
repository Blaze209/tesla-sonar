package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3862tj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3691pj f35675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35676b;

    public C3862tj(C3691pj c3691pj, Provider provider) {
        this.f35675a = c3691pj;
        this.f35676b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Aj get() {
        return a(this.f35675a, (DeviceMetadata) this.f35676b.get());
    }

    public static C3862tj a(C3691pj c3691pj, Provider provider) {
        return new C3862tj(c3691pj, provider);
    }

    public static Aj a(C3691pj c3691pj, DeviceMetadata deviceMetadata) {
        return (Aj) qj0.h.d(c3691pj.a(deviceMetadata));
    }
}
