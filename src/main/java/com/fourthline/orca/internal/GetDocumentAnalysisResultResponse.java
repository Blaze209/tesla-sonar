package com.fourthline.orca.internal;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Cg, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002\u0014!B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/fourthline/orca/internal/Cg;", "", "", "seen0", "Lcom/fourthline/orca/internal/wa;", "documentRecognitionData", "Lcom/fourthline/orca/internal/Yn;", "ocrData", "Lcom/fourthline/orca/internal/Zn;", "mrzData", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILcom/fourthline/orca/internal/wa;Lcom/fourthline/orca/internal/Yn;Lcom/fourthline/orca/internal/Zn;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Cg;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/wa;", "()Lcom/fourthline/orca/internal/wa;", "b", "Lcom/fourthline/orca/internal/Yn;", "()Lcom/fourthline/orca/internal/Yn;", "c", "Lcom/fourthline/orca/internal/Zn;", "getMrzData", "()Lcom/fourthline/orca/internal/Zn;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class GetDocumentAnalysisResultResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f25219d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentRecognitionData documentRecognitionData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OcrData ocrData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OcrMrzData mrzData;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Cg$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<GetDocumentAnalysisResultResponse> serializer() {
            return a.f25223a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GetDocumentAnalysisResultResponse(int i11, DocumentRecognitionData documentRecognitionData, OcrData ocrData, OcrMrzData ocrMrzData, vo0.v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.documentRecognitionData = null;
        } else {
            this.documentRecognitionData = documentRecognitionData;
        }
        if ((i11 & 2) == 0) {
            this.ocrData = null;
        } else {
            this.ocrData = ocrData;
        }
        if ((i11 & 4) == 0) {
            this.mrzData = null;
        } else {
            this.mrzData = ocrMrzData;
        }
    }

    public static final /* synthetic */ void a(GetDocumentAnalysisResultResponse self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.documentRecognitionData != null) {
            output.y(serialDesc, 0, DocumentRecognitionData.a.f36410a, self.documentRecognitionData);
        }
        if (output.G(serialDesc, 1) || self.ocrData != null) {
            output.y(serialDesc, 1, OcrData.a.f29919a, self.ocrData);
        }
        if (!output.G(serialDesc, 2) && self.mrzData == null) {
            return;
        }
        output.y(serialDesc, 2, OcrMrzData.a.f30093a, self.mrzData);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OcrData getOcrData() {
        return this.ocrData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDocumentAnalysisResultResponse)) {
            return false;
        }
        GetDocumentAnalysisResultResponse getDocumentAnalysisResultResponse = (GetDocumentAnalysisResultResponse) other;
        return p013kotlin.jvm.internal.s.f(this.documentRecognitionData, getDocumentAnalysisResultResponse.documentRecognitionData) && p013kotlin.jvm.internal.s.f(this.ocrData, getDocumentAnalysisResultResponse.ocrData) && p013kotlin.jvm.internal.s.f(this.mrzData, getDocumentAnalysisResultResponse.mrzData);
    }

    public int hashCode() {
        DocumentRecognitionData documentRecognitionData = this.documentRecognitionData;
        int iHashCode = (documentRecognitionData == null ? 0 : documentRecognitionData.hashCode()) * 31;
        OcrData ocrData = this.ocrData;
        int iHashCode2 = (iHashCode + (ocrData == null ? 0 : ocrData.hashCode())) * 31;
        OcrMrzData ocrMrzData = this.mrzData;
        return iHashCode2 + (ocrMrzData != null ? ocrMrzData.hashCode() : 0);
    }

    public String toString() {
        return "GetDocumentAnalysisResultResponse(documentRecognitionData=" + this.documentRecognitionData + ", ocrData=" + this.ocrData + ", mrzData=" + this.mrzData + ")";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentRecognitionData getDocumentRecognitionData() {
        return this.documentRecognitionData;
    }
}
