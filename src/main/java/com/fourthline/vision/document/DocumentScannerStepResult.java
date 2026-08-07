package com.fourthline.vision.document;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.vision.ScannerImage;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010¨\u0006&"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerStepResult;", "", "Lcom/fourthline/vision/ScannerImage;", "image", "Lcom/fourthline/vision/document/DocumentScannerStepMetadata;", OrcaKeys.METADATA, "", "Lcom/fourthline/vision/document/DocumentValidationError;", "validationErrors", "<init>", "(Lcom/fourthline/vision/ScannerImage;Lcom/fourthline/vision/document/DocumentScannerStepMetadata;Ljava/util/Set;)V", "component1", "()Lcom/fourthline/vision/ScannerImage;", "component2", "()Lcom/fourthline/vision/document/DocumentScannerStepMetadata;", "component3", "()Ljava/util/Set;", "copy", "(Lcom/fourthline/vision/ScannerImage;Lcom/fourthline/vision/document/DocumentScannerStepMetadata;Ljava/util/Set;)Lcom/fourthline/vision/document/DocumentScannerStepResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/ScannerImage;", "getImage", "b", "Lcom/fourthline/vision/document/DocumentScannerStepMetadata;", "getMetadata", "c", "Ljava/util/Set;", "getValidationErrors", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DocumentScannerStepResult {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScannerImage image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentScannerStepMetadata metadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set validationErrors;

    public DocumentScannerStepResult(ScannerImage image, DocumentScannerStepMetadata metadata, Set<? extends DocumentValidationError> validationErrors) {
        s.k(image, "image");
        s.k(metadata, "metadata");
        s.k(validationErrors, "validationErrors");
        this.image = image;
        this.metadata = metadata;
        this.validationErrors = validationErrors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentScannerStepResult copy$default(DocumentScannerStepResult documentScannerStepResult, ScannerImage scannerImage, DocumentScannerStepMetadata documentScannerStepMetadata, Set set, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            scannerImage = documentScannerStepResult.image;
        }
        if ((i11 & 2) != 0) {
            documentScannerStepMetadata = documentScannerStepResult.metadata;
        }
        if ((i11 & 4) != 0) {
            set = documentScannerStepResult.validationErrors;
        }
        return documentScannerStepResult.copy(scannerImage, documentScannerStepMetadata, set);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScannerImage getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DocumentScannerStepMetadata getMetadata() {
        return this.metadata;
    }

    public final Set<DocumentValidationError> component3() {
        return this.validationErrors;
    }

    public final DocumentScannerStepResult copy(ScannerImage image, DocumentScannerStepMetadata metadata, Set<? extends DocumentValidationError> validationErrors) {
        s.k(image, "image");
        s.k(metadata, "metadata");
        s.k(validationErrors, "validationErrors");
        return new DocumentScannerStepResult(image, metadata, validationErrors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentScannerStepResult)) {
            return false;
        }
        DocumentScannerStepResult documentScannerStepResult = (DocumentScannerStepResult) other;
        return s.f(this.image, documentScannerStepResult.image) && s.f(this.metadata, documentScannerStepResult.metadata) && s.f(this.validationErrors, documentScannerStepResult.validationErrors);
    }

    public final ScannerImage getImage() {
        return this.image;
    }

    public final DocumentScannerStepMetadata getMetadata() {
        return this.metadata;
    }

    public final Set<DocumentValidationError> getValidationErrors() {
        return this.validationErrors;
    }

    public int hashCode() {
        return (((this.image.hashCode() * 31) + this.metadata.hashCode()) * 31) + this.validationErrors.hashCode();
    }

    public String toString() {
        return "DocumentScannerStepResult(image=" + this.image + ", metadata=" + this.metadata + ", validationErrors=" + this.validationErrors + ")";
    }
}
