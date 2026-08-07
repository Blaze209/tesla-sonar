package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2938Tb implements InterfaceC3645og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f27881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f27882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentFlowConfig f27883c;

    public C2938Tb(wn0.a nfcSupportedUseCase, wn0.a nfcCanFlowUseCase, DocumentFlowConfig documentFlowConfig) {
        p013kotlin.jvm.internal.s.k(nfcSupportedUseCase, "nfcSupportedUseCase");
        p013kotlin.jvm.internal.s.k(nfcCanFlowUseCase, "nfcCanFlowUseCase");
        p013kotlin.jvm.internal.s.k(documentFlowConfig, "documentFlowConfig");
        this.f27881a = nfcSupportedUseCase;
        this.f27882b = nfcCanFlowUseCase;
        this.f27883c = documentFlowConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.orca.internal.InterfaceC3645og
    public Object a(InterfaceC3645og.a aVar, Continuation continuation) {
        InterfaceC3645og.c.d dVar;
        FlowStrategyConfig documentStrategy;
        jn0.s.Companion companion = jn0.s.INSTANCE;
        if (((Boolean) this.f27882b.invoke()).booleanValue() && ((Boolean) this.f27881a.invoke()).booleanValue()) {
            dVar = new InterfaceC3645og.c.d("nfc_can", new Tl(this.f27883c.getDocumentStrategy(), this.f27883c.getTiltedStepsEnabled(), this.f27883c.getImageCapture(), this.f27883c.getVideo(), this.f27883c.getConfirmation(), this.f27883c.getAnalysis(), this.f27883c.getNfc(), this.f27883c.getSupportedDocuments(), this.f27883c.getCameraX().getEnabled()));
        } else {
            if (this.f27883c.getDocumentStrategy().a(C3632o9.f34099a.c())) {
                documentStrategy = new FlowStrategyConfig((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            } else {
                documentStrategy = this.f27883c.getDocumentStrategy();
            }
            FlowStrategyConfig flowStrategyConfig = documentStrategy;
            boolean tiltedStepsEnabled = this.f27883c.getTiltedStepsEnabled();
            DocumentImageCaptureConfig imageCapture = this.f27883c.getImageCapture();
            DocumentVideoCaptureConfig video = this.f27883c.getVideo();
            dVar = new InterfaceC3645og.c.d("document", new C3085bb(flowStrategyConfig, tiltedStepsEnabled, this.f27883c.getConfirmation(), imageCapture, video, this.f27883c.getAnalysis(), this.f27883c.getNfc(), this.f27883c.getSupportedDocuments(), this.f27883c.getCameraX().getEnabled()));
        }
        return jn0.s.b(new InterfaceC3645og.b(dVar));
    }
}
