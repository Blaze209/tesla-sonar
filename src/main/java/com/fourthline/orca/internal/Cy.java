package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;

/* JADX INFO: loaded from: classes4.dex */
public final class Cy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3848tB f25289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A7 f25290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f25291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Dy f25292d;

    public Cy(C3848tB tinFlowConfig, A7 document, wn0.a documentIssuingCountry, Dy skipDocumentScannerUseCaseEvaluator) {
        p013kotlin.jvm.internal.s.k(tinFlowConfig, "tinFlowConfig");
        p013kotlin.jvm.internal.s.k(document, "document");
        p013kotlin.jvm.internal.s.k(documentIssuingCountry, "documentIssuingCountry");
        p013kotlin.jvm.internal.s.k(skipDocumentScannerUseCaseEvaluator, "skipDocumentScannerUseCaseEvaluator");
        this.f25289a = tinFlowConfig;
        this.f25290b = document;
        this.f25291c = documentIssuingCountry;
        this.f25292d = skipDocumentScannerUseCaseEvaluator;
    }

    public final boolean a() {
        G5 g11 = (G5) this.f25291c.invoke();
        DocumentType documentTypeH = this.f25290b.h();
        return this.f25292d.a(g11, this.f25289a.getTaxationCountry(), documentTypeH);
    }
}
