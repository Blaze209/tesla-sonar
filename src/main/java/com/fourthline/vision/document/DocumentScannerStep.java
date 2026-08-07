package com.fourthline.vision.document;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.core.DocumentFileSide;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0007\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b\b\u0010\u0010¨\u0006$"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerStep;", "", "", "index", "Lcom/fourthline/core/DocumentFileSide;", "fileSide", "", "isAngled", "isAutoDetectAvailable", "<init>", "(ILcom/fourthline/core/DocumentFileSide;ZZ)V", "component1", "()I", "component2", "()Lcom/fourthline/core/DocumentFileSide;", "component3", "()Z", "component4", "copy", "(ILcom/fourthline/core/DocumentFileSide;ZZ)Lcom/fourthline/vision/document/DocumentScannerStep;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIndex", "b", "Lcom/fourthline/core/DocumentFileSide;", "getFileSide", "c", "Z", DateTokenConverter.CONVERTER_KEY, "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DocumentScannerStep {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentFileSide fileSide;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAngled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAutoDetectAvailable;

    public DocumentScannerStep(int i11, DocumentFileSide fileSide, boolean z11, boolean z12) {
        s.k(fileSide, "fileSide");
        this.index = i11;
        this.fileSide = fileSide;
        this.isAngled = z11;
        this.isAutoDetectAvailable = z12;
    }

    public static /* synthetic */ DocumentScannerStep copy$default(DocumentScannerStep documentScannerStep, int i11, DocumentFileSide documentFileSide, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = documentScannerStep.index;
        }
        if ((i12 & 2) != 0) {
            documentFileSide = documentScannerStep.fileSide;
        }
        if ((i12 & 4) != 0) {
            z11 = documentScannerStep.isAngled;
        }
        if ((i12 & 8) != 0) {
            z12 = documentScannerStep.isAutoDetectAvailable;
        }
        return documentScannerStep.copy(i11, documentFileSide, z11, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DocumentFileSide getFileSide() {
        return this.fileSide;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsAngled() {
        return this.isAngled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsAutoDetectAvailable() {
        return this.isAutoDetectAvailable;
    }

    public final DocumentScannerStep copy(int index, DocumentFileSide fileSide, boolean isAngled, boolean isAutoDetectAvailable) {
        s.k(fileSide, "fileSide");
        return new DocumentScannerStep(index, fileSide, isAngled, isAutoDetectAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentScannerStep)) {
            return false;
        }
        DocumentScannerStep documentScannerStep = (DocumentScannerStep) other;
        return this.index == documentScannerStep.index && this.fileSide == documentScannerStep.fileSide && this.isAngled == documentScannerStep.isAngled && this.isAutoDetectAvailable == documentScannerStep.isAutoDetectAvailable;
    }

    public final DocumentFileSide getFileSide() {
        return this.fileSide;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.index) * 31) + this.fileSide.hashCode()) * 31) + Boolean.hashCode(this.isAngled)) * 31) + Boolean.hashCode(this.isAutoDetectAvailable);
    }

    public final boolean isAngled() {
        return this.isAngled;
    }

    public final boolean isAutoDetectAvailable() {
        return this.isAutoDetectAvailable;
    }

    public String toString() {
        return "DocumentScannerStep(index=" + this.index + ", fileSide=" + this.fileSide + ", isAngled=" + this.isAngled + ", isAutoDetectAvailable=" + this.isAutoDetectAvailable + ")";
    }
}
