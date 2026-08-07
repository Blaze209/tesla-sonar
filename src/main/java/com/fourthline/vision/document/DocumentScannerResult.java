package com.fourthline.vision.document;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.mrz.MrzInfo;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JL\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0018¨\u00064"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerResult;", "", "Lcom/fourthline/core/VideoRecording;", "videoRecording", "Lcom/fourthline/core/mrz/MrzInfo;", "mrzInfo", "Lcom/fourthline/core/DocumentType;", "documentType", "", "Lcom/fourthline/vision/document/DocumentScannerStepResult;", "stepResults", "Lcom/fourthline/vision/document/DocumentScannerMetadata;", OrcaKeys.METADATA, "<init>", "(Lcom/fourthline/core/VideoRecording;Lcom/fourthline/core/mrz/MrzInfo;Lcom/fourthline/core/DocumentType;Ljava/util/List;Lcom/fourthline/vision/document/DocumentScannerMetadata;)V", "component1", "()Lcom/fourthline/core/VideoRecording;", "component2", "()Lcom/fourthline/core/mrz/MrzInfo;", "component3", "()Lcom/fourthline/core/DocumentType;", "component4", "()Ljava/util/List;", "component5", "()Lcom/fourthline/vision/document/DocumentScannerMetadata;", "copy", "(Lcom/fourthline/core/VideoRecording;Lcom/fourthline/core/mrz/MrzInfo;Lcom/fourthline/core/DocumentType;Ljava/util/List;Lcom/fourthline/vision/document/DocumentScannerMetadata;)Lcom/fourthline/vision/document/DocumentScannerResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/VideoRecording;", "getVideoRecording", "b", "Lcom/fourthline/core/mrz/MrzInfo;", "getMrzInfo", "c", "Lcom/fourthline/core/DocumentType;", "getDocumentType", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getStepResults", "e", "Lcom/fourthline/vision/document/DocumentScannerMetadata;", "getMetadata", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DocumentScannerResult {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final VideoRecording videoRecording;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MrzInfo mrzInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentType documentType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List stepResults;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentScannerMetadata metadata;

    public DocumentScannerResult(VideoRecording videoRecording, MrzInfo mrzInfo, DocumentType documentType, List<DocumentScannerStepResult> stepResults, DocumentScannerMetadata metadata) {
        s.k(documentType, "documentType");
        s.k(stepResults, "stepResults");
        s.k(metadata, "metadata");
        this.videoRecording = videoRecording;
        this.mrzInfo = mrzInfo;
        this.documentType = documentType;
        this.stepResults = stepResults;
        this.metadata = metadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentScannerResult copy$default(DocumentScannerResult documentScannerResult, VideoRecording videoRecording, MrzInfo mrzInfo, DocumentType documentType, List list, DocumentScannerMetadata documentScannerMetadata, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            videoRecording = documentScannerResult.videoRecording;
        }
        if ((i11 & 2) != 0) {
            mrzInfo = documentScannerResult.mrzInfo;
        }
        if ((i11 & 4) != 0) {
            documentType = documentScannerResult.documentType;
        }
        if ((i11 & 8) != 0) {
            list = documentScannerResult.stepResults;
        }
        if ((i11 & 16) != 0) {
            documentScannerMetadata = documentScannerResult.metadata;
        }
        DocumentScannerMetadata documentScannerMetadata2 = documentScannerMetadata;
        DocumentType documentType2 = documentType;
        return documentScannerResult.copy(videoRecording, mrzInfo, documentType2, list, documentScannerMetadata2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MrzInfo getMrzInfo() {
        return this.mrzInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    public final List<DocumentScannerStepResult> component4() {
        return this.stepResults;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DocumentScannerMetadata getMetadata() {
        return this.metadata;
    }

    public final DocumentScannerResult copy(VideoRecording videoRecording, MrzInfo mrzInfo, DocumentType documentType, List<DocumentScannerStepResult> stepResults, DocumentScannerMetadata metadata) {
        s.k(documentType, "documentType");
        s.k(stepResults, "stepResults");
        s.k(metadata, "metadata");
        return new DocumentScannerResult(videoRecording, mrzInfo, documentType, stepResults, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentScannerResult)) {
            return false;
        }
        DocumentScannerResult documentScannerResult = (DocumentScannerResult) other;
        return s.f(this.videoRecording, documentScannerResult.videoRecording) && s.f(this.mrzInfo, documentScannerResult.mrzInfo) && this.documentType == documentScannerResult.documentType && s.f(this.stepResults, documentScannerResult.stepResults) && s.f(this.metadata, documentScannerResult.metadata);
    }

    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    public final DocumentScannerMetadata getMetadata() {
        return this.metadata;
    }

    public final MrzInfo getMrzInfo() {
        return this.mrzInfo;
    }

    public final List<DocumentScannerStepResult> getStepResults() {
        return this.stepResults;
    }

    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    public int hashCode() {
        VideoRecording videoRecording = this.videoRecording;
        int iHashCode = (videoRecording == null ? 0 : videoRecording.hashCode()) * 31;
        MrzInfo mrzInfo = this.mrzInfo;
        return ((((((iHashCode + (mrzInfo != null ? mrzInfo.hashCode() : 0)) * 31) + this.documentType.hashCode()) * 31) + this.stepResults.hashCode()) * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "DocumentScannerResult(videoRecording=" + this.videoRecording + ", mrzInfo=" + this.mrzInfo + ", documentType=" + this.documentType + ", stepResults=" + this.stepResults + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ DocumentScannerResult(VideoRecording videoRecording, MrzInfo mrzInfo, DocumentType documentType, List list, DocumentScannerMetadata documentScannerMetadata, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : videoRecording, (i11 & 2) != 0 ? null : mrzInfo, documentType, list, documentScannerMetadata);
    }
}
