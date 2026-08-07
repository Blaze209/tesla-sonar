package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4213i4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f38402g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4240m3.a f38404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4312x.c f38405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f38406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f38407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f38408f;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.i4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4213i4 initFrom(SelfieScannerConfig selfieConfig) {
            p013kotlin.jvm.internal.s.k(selfieConfig, "selfieConfig");
            return new C4213i4(selfieConfig.getDebugModeEnabled(), AbstractC4220j4.toInternalType(selfieConfig.getRecordingType()), C4312x.c.FRONT, 0.4f, true, selfieConfig.getIncludeMotionData());
        }

        private a() {
        }

        public final C4213i4 initFrom(DocumentScannerConfig documentConfig, boolean z11) {
            p013kotlin.jvm.internal.s.k(documentConfig, "documentConfig");
            return new C4213i4(documentConfig.getDebugModeEnabled(), AbstractC4220j4.toInternalType(documentConfig.getRecordingType()), C4312x.c.BACK, 0.2f, z11, documentConfig.getIncludeMotionData());
        }
    }

    public C4213i4(boolean z11, InterfaceC4240m3.a recordingType, C4312x.c cameraDirection, float f11, boolean z12, boolean z13) {
        p013kotlin.jvm.internal.s.k(recordingType, "recordingType");
        p013kotlin.jvm.internal.s.k(cameraDirection, "cameraDirection");
        this.f38403a = z11;
        this.f38404b = recordingType;
        this.f38405c = cameraDirection;
        this.f38406d = f11;
        this.f38407e = z12;
        this.f38408f = z13;
    }

    public static /* synthetic */ C4213i4 copy$default(C4213i4 c4213i4, boolean z11, InterfaceC4240m3.a aVar, C4312x.c cVar, float f11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = c4213i4.f38403a;
        }
        if ((i11 & 2) != 0) {
            aVar = c4213i4.f38404b;
        }
        if ((i11 & 4) != 0) {
            cVar = c4213i4.f38405c;
        }
        if ((i11 & 8) != 0) {
            f11 = c4213i4.f38406d;
        }
        if ((i11 & 16) != 0) {
            z12 = c4213i4.f38407e;
        }
        if ((i11 & 32) != 0) {
            z13 = c4213i4.f38408f;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        return c4213i4.copy(z11, aVar, cVar, f11, z14, z15);
    }

    public final boolean component1() {
        return this.f38403a;
    }

    public final InterfaceC4240m3.a component2() {
        return this.f38404b;
    }

    public final C4312x.c component3() {
        return this.f38405c;
    }

    public final float component4() {
        return this.f38406d;
    }

    public final boolean component5() {
        return this.f38407e;
    }

    public final boolean component6() {
        return this.f38408f;
    }

    public final C4213i4 copy(boolean z11, InterfaceC4240m3.a recordingType, C4312x.c cameraDirection, float f11, boolean z12, boolean z13) {
        p013kotlin.jvm.internal.s.k(recordingType, "recordingType");
        p013kotlin.jvm.internal.s.k(cameraDirection, "cameraDirection");
        return new C4213i4(z11, recordingType, cameraDirection, f11, z12, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4213i4)) {
            return false;
        }
        C4213i4 c4213i4 = (C4213i4) obj;
        return this.f38403a == c4213i4.f38403a && this.f38404b == c4213i4.f38404b && this.f38405c == c4213i4.f38405c && Float.compare(this.f38406d, c4213i4.f38406d) == 0 && this.f38407e == c4213i4.f38407e && this.f38408f == c4213i4.f38408f;
    }

    public final C4312x.c getCameraDirection() {
        return this.f38405c;
    }

    public final boolean getDebugModeEnabled() {
        return this.f38403a;
    }

    public final float getFastFaceDetectorMinFaceSize() {
        return this.f38406d;
    }

    public final InterfaceC4240m3.a getRecordingType() {
        return this.f38404b;
    }

    public final boolean getShouldCollectMotionData() {
        return this.f38408f;
    }

    public final boolean getShouldStartAutomatically() {
        return this.f38407e;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f38403a) * 31) + this.f38404b.hashCode()) * 31) + this.f38405c.hashCode()) * 31) + Float.hashCode(this.f38406d)) * 31) + Boolean.hashCode(this.f38407e)) * 31) + Boolean.hashCode(this.f38408f);
    }

    public String toString() {
        return "ScannerConfig(debugModeEnabled=" + this.f38403a + ", recordingType=" + this.f38404b + ", cameraDirection=" + this.f38405c + ", fastFaceDetectorMinFaceSize=" + this.f38406d + ", shouldStartAutomatically=" + this.f38407e + ", shouldCollectMotionData=" + this.f38408f + ")";
    }
}
