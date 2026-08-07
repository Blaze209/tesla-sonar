package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;

/* JADX INFO: renamed from: com.fourthline.orca.internal.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3584n4 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3498l4 f33815a;

    public C3584n4(C3498l4 c3498l4) {
        this.f33815a = c3498l4;
    }

    public static DeviceMetadata b(C3498l4 c3498l4) {
        return (DeviceMetadata) qj0.h.d(c3498l4.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DeviceMetadata get() {
        return b(this.f33815a);
    }

    public static C3584n4 a(C3498l4 c3498l4) {
        return new C3584n4(c3498l4);
    }
}
