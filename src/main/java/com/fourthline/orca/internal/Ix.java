package com.fourthline.orca.internal;

import com.fourthline.core.VideoRecording;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.selfie.LivenessCheckType;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerResult;
import java.net.URI;

/* JADX INFO: loaded from: classes4.dex */
public final class Ix implements Hx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4135zx f26391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E6 f26392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f26394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Aw f26395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SelfieScannerConfig f26396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SelfieScannerResult f26397g;

    public Ix(C4135zx selfieFlowDataBundle, E6 deviceDataBundle, boolean z11, RecordingType recordingType, LivenessCheckType livenessCheckType, boolean z12, Integer num, Aw aw2) {
        p013kotlin.jvm.internal.s.k(selfieFlowDataBundle, "selfieFlowDataBundle");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        p013kotlin.jvm.internal.s.k(recordingType, "recordingType");
        p013kotlin.jvm.internal.s.k(livenessCheckType, "livenessCheckType");
        this.f26391a = selfieFlowDataBundle;
        this.f26392b = deviceDataBundle;
        this.f26393c = z12;
        this.f26394d = num;
        this.f26395e = aw2;
        this.f26396f = new SelfieScannerConfig(false, recordingType, livenessCheckType, z11);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public SelfieScannerResult a() {
        return this.f26397g;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public Aw b() {
        return this.f26395e;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public SelfieScannerConfig c() {
        return this.f26396f;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public Integer f() {
        return this.f26394d;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public boolean h() {
        return this.f26393c;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3663oy
    public void a(SelfieScannerResult selfieScannerResult) {
        URI url;
        this.f26397g = selfieScannerResult;
        if (selfieScannerResult != null) {
            AbstractC3533lx.a(this.f26391a.b(), selfieScannerResult);
            this.f26392b.b(selfieScannerResult.getMetadata().getMotionData());
            C4135zx c4135zx = this.f26391a;
            VideoRecording videoRecording = selfieScannerResult.getVideoRecording();
            c4135zx.a((videoRecording == null || (url = videoRecording.getUrl()) == null) ? null : AbstractC3166dD.a(url));
        }
    }
}
