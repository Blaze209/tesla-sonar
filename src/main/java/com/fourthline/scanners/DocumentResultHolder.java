package com.fourthline.scanners;

import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoRecording;
import com.fourthline.scanners.config.ImageReturnType;
import com.fourthline.vision.document.DocumentScannerStep;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JE\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006*"}, d2 = {"Lcom/fourthline/scanners/DocumentResultHolder;", "", "documentType", "Lcom/fourthline/core/DocumentType;", "images", "", "Lcom/fourthline/vision/document/DocumentScannerStep;", "Lcom/fourthline/scanners/DocumentStepResult;", "videoRecording", "Lcom/fourthline/core/VideoRecording;", "imageReturnType", "Lcom/fourthline/scanners/config/ImageReturnType;", "<init>", "(Lcom/fourthline/core/DocumentType;Ljava/util/Map;Lcom/fourthline/core/VideoRecording;Lcom/fourthline/scanners/config/ImageReturnType;)V", "getDocumentType", "()Lcom/fourthline/core/DocumentType;", "setDocumentType", "(Lcom/fourthline/core/DocumentType;)V", "getImages", "()Ljava/util/Map;", "setImages", "(Ljava/util/Map;)V", "getVideoRecording", "()Lcom/fourthline/core/VideoRecording;", "setVideoRecording", "(Lcom/fourthline/core/VideoRecording;)V", "getImageReturnType", "()Lcom/fourthline/scanners/config/ImageReturnType;", "setImageReturnType", "(Lcom/fourthline/scanners/config/ImageReturnType;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DocumentResultHolder {
    private DocumentType documentType;
    private ImageReturnType imageReturnType;
    private Map<DocumentScannerStep, DocumentStepResult> images;
    private VideoRecording videoRecording;

    public DocumentResultHolder() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentResultHolder copy$default(DocumentResultHolder documentResultHolder, DocumentType documentType, Map map, VideoRecording videoRecording, ImageReturnType imageReturnType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            documentType = documentResultHolder.documentType;
        }
        if ((i11 & 2) != 0) {
            map = documentResultHolder.images;
        }
        if ((i11 & 4) != 0) {
            videoRecording = documentResultHolder.videoRecording;
        }
        if ((i11 & 8) != 0) {
            imageReturnType = documentResultHolder.imageReturnType;
        }
        return documentResultHolder.copy(documentType, map, videoRecording, imageReturnType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    public final Map<DocumentScannerStep, DocumentStepResult> component2() {
        return this.images;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ImageReturnType getImageReturnType() {
        return this.imageReturnType;
    }

    public final DocumentResultHolder copy(DocumentType documentType, Map<DocumentScannerStep, DocumentStepResult> images, VideoRecording videoRecording, ImageReturnType imageReturnType) {
        s.k(imageReturnType, "imageReturnType");
        return new DocumentResultHolder(documentType, images, videoRecording, imageReturnType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentResultHolder)) {
            return false;
        }
        DocumentResultHolder documentResultHolder = (DocumentResultHolder) other;
        return this.documentType == documentResultHolder.documentType && s.f(this.images, documentResultHolder.images) && s.f(this.videoRecording, documentResultHolder.videoRecording) && this.imageReturnType == documentResultHolder.imageReturnType;
    }

    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    public final ImageReturnType getImageReturnType() {
        return this.imageReturnType;
    }

    public final Map<DocumentScannerStep, DocumentStepResult> getImages() {
        return this.images;
    }

    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    public int hashCode() {
        DocumentType documentType = this.documentType;
        int iHashCode = (documentType == null ? 0 : documentType.hashCode()) * 31;
        Map<DocumentScannerStep, DocumentStepResult> map = this.images;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        VideoRecording videoRecording = this.videoRecording;
        return ((iHashCode2 + (videoRecording != null ? videoRecording.hashCode() : 0)) * 31) + this.imageReturnType.hashCode();
    }

    public final void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public final void setImageReturnType(ImageReturnType imageReturnType) {
        s.k(imageReturnType, "<set-?>");
        this.imageReturnType = imageReturnType;
    }

    public final void setImages(Map<DocumentScannerStep, DocumentStepResult> map) {
        this.images = map;
    }

    public final void setVideoRecording(VideoRecording videoRecording) {
        this.videoRecording = videoRecording;
    }

    public String toString() {
        return "DocumentResultHolder(documentType=" + this.documentType + ", images=" + this.images + ", videoRecording=" + this.videoRecording + ", imageReturnType=" + this.imageReturnType + ")";
    }

    public DocumentResultHolder(DocumentType documentType, Map<DocumentScannerStep, DocumentStepResult> map, VideoRecording videoRecording, ImageReturnType imageReturnType) {
        s.k(imageReturnType, "imageReturnType");
        this.documentType = documentType;
        this.images = map;
        this.videoRecording = videoRecording;
        this.imageReturnType = imageReturnType;
    }

    public /* synthetic */ DocumentResultHolder(DocumentType documentType, Map map, VideoRecording videoRecording, ImageReturnType imageReturnType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : documentType, (i11 & 2) != 0 ? null : map, (i11 & 4) != 0 ? null : videoRecording, (i11 & 8) != 0 ? ImageReturnType.BASE_64 : imageReturnType);
    }
}
