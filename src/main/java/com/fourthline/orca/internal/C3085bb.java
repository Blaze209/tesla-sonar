package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3085bb implements Rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlowStrategyConfig f30603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentConfirmationConfig f30605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DocumentImageCaptureConfig f30606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DocumentVideoCaptureConfig f30607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final DocumentAnalysisConfig f30608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DocumentNfcConfig f30609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f30610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f30611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f30612j;

    public C3085bb(FlowStrategyConfig documentStrategy, boolean z11, DocumentConfirmationConfig confirmation, DocumentImageCaptureConfig imageCapture, DocumentVideoCaptureConfig video, DocumentAnalysisConfig analysis, DocumentNfcConfig nfc, List supportedDocuments, boolean z12) {
        p013kotlin.jvm.internal.s.k(documentStrategy, "documentStrategy");
        p013kotlin.jvm.internal.s.k(confirmation, "confirmation");
        p013kotlin.jvm.internal.s.k(imageCapture, "imageCapture");
        p013kotlin.jvm.internal.s.k(video, "video");
        p013kotlin.jvm.internal.s.k(analysis, "analysis");
        p013kotlin.jvm.internal.s.k(nfc, "nfc");
        p013kotlin.jvm.internal.s.k(supportedDocuments, "supportedDocuments");
        this.f30603a = documentStrategy;
        this.f30604b = z11;
        this.f30605c = confirmation;
        this.f30606d = imageCapture;
        this.f30607e = video;
        this.f30608f = analysis;
        this.f30609g = nfc;
        this.f30610h = supportedDocuments;
        this.f30611i = z12;
        this.f30612j = analysis.getMinimumAge();
    }

    public final DocumentAnalysisConfig b() {
        return this.f30608f;
    }

    public final DocumentConfirmationConfig c() {
        return this.f30605c;
    }

    public final FlowStrategyConfig d() {
        return this.f30603a;
    }

    public final DocumentImageCaptureConfig e() {
        return this.f30606d;
    }

    public final int f() {
        return this.f30612j;
    }

    public final DocumentNfcConfig g() {
        return this.f30609g;
    }

    public final List h() {
        return this.f30610h;
    }

    public final boolean i() {
        return this.f30604b;
    }

    public final boolean j() {
        return this.f30611i;
    }

    public final DocumentVideoCaptureConfig k() {
        return this.f30607e;
    }

    @Override // com.fourthline.orca.internal.Rf
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C3042ab a() {
        return new C3042ab(this);
    }
}
