package com.fourthline.vision.document.ocr;

import com.fourthline.core.DocumentType;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/fourthline/vision/document/ocr/ExpirationDateData;", "", WorkflowKeys.ISSUING_COUNTRY, "", "Lcom/fourthline/core/mrz/Country;", "documentType", "Lcom/fourthline/core/DocumentType;", InquiryField.DateField.TYPE, "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Lcom/fourthline/core/DocumentType;Ljava/util/Date;)V", "getIssuingCountry", "()Ljava/lang/String;", "getDocumentType", "()Lcom/fourthline/core/DocumentType;", "getDate", "()Ljava/util/Date;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExpirationDateData {
    public static final int $stable = 8;
    private final Date date;
    private final DocumentType documentType;
    private final String issuingCountry;

    public ExpirationDateData(String str, DocumentType documentType, Date date) {
        s.k(date, "date");
        this.issuingCountry = str;
        this.documentType = documentType;
        this.date = date;
    }

    public static /* synthetic */ ExpirationDateData copy$default(ExpirationDateData expirationDateData, String str, DocumentType documentType, Date date, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = expirationDateData.issuingCountry;
        }
        if ((i11 & 2) != 0) {
            documentType = expirationDateData.documentType;
        }
        if ((i11 & 4) != 0) {
            date = expirationDateData.date;
        }
        return expirationDateData.copy(str, documentType, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    public final ExpirationDateData copy(String issuingCountry, DocumentType documentType, Date date) {
        s.k(date, "date");
        return new ExpirationDateData(issuingCountry, documentType, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpirationDateData)) {
            return false;
        }
        ExpirationDateData expirationDateData = (ExpirationDateData) other;
        return s.f(this.issuingCountry, expirationDateData.issuingCountry) && this.documentType == expirationDateData.documentType && s.f(this.date, expirationDateData.date);
    }

    public final Date getDate() {
        return this.date;
    }

    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public int hashCode() {
        String str = this.issuingCountry;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DocumentType documentType = this.documentType;
        return ((iHashCode + (documentType != null ? documentType.hashCode() : 0)) * 31) + this.date.hashCode();
    }

    public String toString() {
        return "ExpirationDateData(issuingCountry=" + this.issuingCountry + ", documentType=" + this.documentType + ", date=" + this.date + ")";
    }
}
