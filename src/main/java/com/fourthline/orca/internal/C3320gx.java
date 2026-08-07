package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3320gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dh f32115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4127zp f32116b;

    public C3320gx(Dh indicatorSettings, C4127zp overlaySettings) {
        p013kotlin.jvm.internal.s.k(indicatorSettings, "indicatorSettings");
        p013kotlin.jvm.internal.s.k(overlaySettings, "overlaySettings");
        this.f32115a = indicatorSettings;
        this.f32116b = overlaySettings;
    }

    public final Dh a() {
        return this.f32115a;
    }

    public final C4127zp b() {
        return this.f32116b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3320gx)) {
            return false;
        }
        C3320gx c3320gx = (C3320gx) obj;
        return p013kotlin.jvm.internal.s.f(this.f32115a, c3320gx.f32115a) && p013kotlin.jvm.internal.s.f(this.f32116b, c3320gx.f32116b);
    }

    public int hashCode() {
        return (this.f32115a.hashCode() * 31) + this.f32116b.hashCode();
    }

    public String toString() {
        return "ScrollSettings(indicatorSettings=" + this.f32115a + ", overlaySettings=" + this.f32116b + ")";
    }

    public /* synthetic */ C3320gx(Dh dh2, C4127zp c4127zp, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Dh(false, 0L, BitmapDescriptorFactory.HUE_RED, 7, null) : dh2, (i11 & 2) != 0 ? new C4127zp(false, false, BitmapDescriptorFactory.HUE_RED, null, null, null, 63, null) : c4127zp);
    }
}
