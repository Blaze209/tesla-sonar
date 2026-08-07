package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerMetadata;
import com.fourthline.vision.selfie.SelfieScannerResult;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3278fy implements InterfaceC3663oy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E6 f31891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SelfieScannerConfig f31892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Aw f31893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f31895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SelfieScannerResult f31896f;

    public C3278fy(E6 deviceDataBundle, SelfieScannerConfig selfieScannerConfig, Aw aw2, boolean z11, Integer num) {
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        p013kotlin.jvm.internal.s.k(selfieScannerConfig, "selfieScannerConfig");
        this.f31891a = deviceDataBundle;
        this.f31892b = selfieScannerConfig;
        this.f31893c = aw2;
        this.f31894d = z11;
        this.f31895e = num;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public SelfieScannerResult a() {
        return this.f31896f;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public Aw b() {
        return this.f31893c;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public SelfieScannerConfig c() {
        return this.f31892b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3278fy)) {
            return false;
        }
        C3278fy c3278fy = (C3278fy) obj;
        return p013kotlin.jvm.internal.s.f(this.f31891a, c3278fy.f31891a) && p013kotlin.jvm.internal.s.f(this.f31892b, c3278fy.f31892b) && p013kotlin.jvm.internal.s.f(this.f31893c, c3278fy.f31893c) && this.f31894d == c3278fy.f31894d && p013kotlin.jvm.internal.s.f(this.f31895e, c3278fy.f31895e);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public Integer f() {
        return this.f31895e;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public boolean h() {
        return this.f31894d;
    }

    public int hashCode() {
        int iHashCode = ((this.f31891a.hashCode() * 31) + this.f31892b.hashCode()) * 31;
        Aw aw2 = this.f31893c;
        int iHashCode2 = (((iHashCode + (aw2 == null ? 0 : aw2.hashCode())) * 31) + Boolean.hashCode(this.f31894d)) * 31;
        Integer num = this.f31895e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "SelfieProductScannerRepository(deviceDataBundle=" + this.f31891a + ", selfieScannerConfig=" + this.f31892b + ", randomnessConfig=" + this.f31893c + ", useCameraX=" + this.f31894d + ", preferredVideoRecordingBitrate=" + this.f31895e + ")";
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public void a(SelfieScannerResult selfieScannerResult) {
        SelfieScannerMetadata metadata;
        this.f31896f = selfieScannerResult;
        this.f31891a.b((selfieScannerResult == null || (metadata = selfieScannerResult.getMetadata()) == null) ? null : metadata.getMotionData());
    }
}
