package com.fourthline.nfc;

import com.fourthline.core.DocumentType;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/fourthline/nfc/ExtraNfcScannerConfig;", "", "Lcom/fourthline/core/DocumentType;", "documentType", "", "issueCountry", "<init>", "(Lcom/fourthline/core/DocumentType;Ljava/lang/String;)V", "component1", "()Lcom/fourthline/core/DocumentType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/fourthline/core/DocumentType;Ljava/lang/String;)Lcom/fourthline/nfc/ExtraNfcScannerConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/DocumentType;", "getDocumentType", "b", "Ljava/lang/String;", "getIssueCountry", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExtraNfcScannerConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentType documentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issueCountry;

    public ExtraNfcScannerConfig(DocumentType documentType, String str) {
        s.k(documentType, "documentType");
        this.documentType = documentType;
        this.issueCountry = str;
    }

    public static /* synthetic */ ExtraNfcScannerConfig copy$default(ExtraNfcScannerConfig extraNfcScannerConfig, DocumentType documentType, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            documentType = extraNfcScannerConfig.documentType;
        }
        if ((i11 & 2) != 0) {
            str = extraNfcScannerConfig.issueCountry;
        }
        return extraNfcScannerConfig.copy(documentType, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssueCountry() {
        return this.issueCountry;
    }

    public final ExtraNfcScannerConfig copy(DocumentType documentType, String issueCountry) {
        s.k(documentType, "documentType");
        return new ExtraNfcScannerConfig(documentType, issueCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraNfcScannerConfig)) {
            return false;
        }
        ExtraNfcScannerConfig extraNfcScannerConfig = (ExtraNfcScannerConfig) other;
        return this.documentType == extraNfcScannerConfig.documentType && s.f(this.issueCountry, extraNfcScannerConfig.issueCountry);
    }

    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    public final String getIssueCountry() {
        return this.issueCountry;
    }

    public int hashCode() {
        int iHashCode = this.documentType.hashCode() * 31;
        String str = this.issueCountry;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ExtraNfcScannerConfig(documentType=" + this.documentType + ", issueCountry=" + this.issueCountry + ")";
    }
}
