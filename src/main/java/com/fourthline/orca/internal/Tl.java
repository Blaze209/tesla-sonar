package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Tl implements Rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlowStrategyConfig f27944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentImageCaptureConfig f27946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DocumentVideoCaptureConfig f27947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DocumentConfirmationConfig f27948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final DocumentAnalysisConfig f27949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DocumentNfcConfig f27950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f27951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f27952i;

    public Tl(FlowStrategyConfig documentStrategy, boolean z11, DocumentImageCaptureConfig imageCapture, DocumentVideoCaptureConfig video, DocumentConfirmationConfig confirmation, DocumentAnalysisConfig analysis, DocumentNfcConfig nfc, List supportedDocuments, boolean z12) {
        p013kotlin.jvm.internal.s.k(documentStrategy, "documentStrategy");
        p013kotlin.jvm.internal.s.k(imageCapture, "imageCapture");
        p013kotlin.jvm.internal.s.k(video, "video");
        p013kotlin.jvm.internal.s.k(confirmation, "confirmation");
        p013kotlin.jvm.internal.s.k(analysis, "analysis");
        p013kotlin.jvm.internal.s.k(nfc, "nfc");
        p013kotlin.jvm.internal.s.k(supportedDocuments, "supportedDocuments");
        this.f27944a = documentStrategy;
        this.f27945b = z11;
        this.f27946c = imageCapture;
        this.f27947d = video;
        this.f27948e = confirmation;
        this.f27949f = analysis;
        this.f27950g = nfc;
        this.f27951h = supportedDocuments;
        this.f27952i = z12;
    }

    public final DocumentAnalysisConfig b() {
        return this.f27949f;
    }

    public final DocumentConfirmationConfig c() {
        return this.f27948e;
    }

    public final FlowStrategyConfig d() {
        return this.f27944a;
    }

    public final DocumentImageCaptureConfig e() {
        return this.f27946c;
    }

    public final DocumentNfcConfig f() {
        return this.f27950g;
    }

    public final List g() {
        return this.f27951h;
    }

    public final boolean h() {
        return this.f27945b;
    }

    public final boolean i() {
        return this.f27952i;
    }

    public final DocumentVideoCaptureConfig j() {
        return this.f27947d;
    }

    @Override // com.fourthline.orca.internal.Rf
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Rl a() {
        return new Rl(this);
    }
}
