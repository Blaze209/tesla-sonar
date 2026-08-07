package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3277fx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f31887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f31888b;

    public C3277fx(float f11) {
        this.f31887a = f11;
        this.f31888b = f11;
    }

    public final float a() {
        return this.f31888b;
    }

    public final float b() {
        return this.f31887a;
    }

    public /* synthetic */ C3277fx(float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f11);
    }
}
