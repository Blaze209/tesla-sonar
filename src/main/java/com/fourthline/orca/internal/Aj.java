package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.location.Coordinate;

/* JADX INFO: loaded from: classes4.dex */
public final class Aj implements Lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceMetadata f24960a;

    public Aj(DeviceMetadata metadata) {
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        this.f24960a = metadata;
    }

    @Override // com.fourthline.orca.internal.Lj
    public void a(Coordinate coordinate) {
        this.f24960a.setLocation(coordinate);
    }

    @Override // com.fourthline.orca.internal.Lj
    public Coordinate getLocation() {
        return this.f24960a.getLocation();
    }
}
