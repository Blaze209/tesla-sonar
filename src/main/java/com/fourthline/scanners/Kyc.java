package com.fourthline.scanners;

import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.IdlBasicInfo;
import java.util.Date;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R\u001c\u00107\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001b¨\u0006:"}, d2 = {"Lcom/fourthline/scanners/Kyc;", "", "<init>", "()V", "selfieResult", "Lcom/fourthline/scanners/SelfieResultHolder;", "getSelfieResult", "()Lcom/fourthline/scanners/SelfieResultHolder;", "setSelfieResult", "(Lcom/fourthline/scanners/SelfieResultHolder;)V", "documentResult", "Lcom/fourthline/scanners/DocumentResultHolder;", "getDocumentResult", "()Lcom/fourthline/scanners/DocumentResultHolder;", "setDocumentResult", "(Lcom/fourthline/scanners/DocumentResultHolder;)V", "nfcResult", "Lcom/fourthline/scanners/NfcResultHolder;", "getNfcResult", "()Lcom/fourthline/scanners/NfcResultHolder;", "setNfcResult", "(Lcom/fourthline/scanners/NfcResultHolder;)V", "documentNumber", "", "getDocumentNumber", "()Ljava/lang/String;", "setDocumentNumber", "(Ljava/lang/String;)V", "idlMrz", "getIdlMrz", "setIdlMrz", "dateOfBirth", "Ljava/util/Date;", "getDateOfBirth", "()Ljava/util/Date;", "setDateOfBirth", "(Ljava/util/Date;)V", "expirationDate", "getExpirationDate", "setExpirationDate", "nfcMrzInfo", "Lcom/fourthline/core/mrz/MrzInfo;", "getNfcMrzInfo", "()Lcom/fourthline/core/mrz/MrzInfo;", "setNfcMrzInfo", "(Lcom/fourthline/core/mrz/MrzInfo;)V", "nfcIdlInfo", "Lcom/fourthline/nfc/IdlBasicInfo;", "getNfcIdlInfo", "()Lcom/fourthline/nfc/IdlBasicInfo;", "setNfcIdlInfo", "(Lcom/fourthline/nfc/IdlBasicInfo;)V", "documentMrzInfo", "getDocumentMrzInfo", "setDocumentMrzInfo", "zipUrl", "getZipUrl", "setZipUrl", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Kyc {
    private Date dateOfBirth;
    private MrzInfo documentMrzInfo;
    private String documentNumber;
    private DocumentResultHolder documentResult;
    private Date expirationDate;
    private String idlMrz;
    private IdlBasicInfo nfcIdlInfo;
    private MrzInfo nfcMrzInfo;
    private NfcResultHolder nfcResult;
    private SelfieResultHolder selfieResult;
    private String zipUrl;

    public final Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final MrzInfo getDocumentMrzInfo() {
        return this.documentMrzInfo;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final DocumentResultHolder getDocumentResult() {
        return this.documentResult;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final String getIdlMrz() {
        return this.idlMrz;
    }

    public final IdlBasicInfo getNfcIdlInfo() {
        return this.nfcIdlInfo;
    }

    public final MrzInfo getNfcMrzInfo() {
        return this.nfcMrzInfo;
    }

    public final NfcResultHolder getNfcResult() {
        return this.nfcResult;
    }

    public final SelfieResultHolder getSelfieResult() {
        return this.selfieResult;
    }

    public final String getZipUrl() {
        return this.zipUrl;
    }

    public final void setDateOfBirth(Date date) {
        this.dateOfBirth = date;
    }

    public final void setDocumentMrzInfo(MrzInfo mrzInfo) {
        this.documentMrzInfo = mrzInfo;
    }

    public final void setDocumentNumber(String str) {
        this.documentNumber = str;
    }

    public final void setDocumentResult(DocumentResultHolder documentResultHolder) {
        this.documentResult = documentResultHolder;
    }

    public final void setExpirationDate(Date date) {
        this.expirationDate = date;
    }

    public final void setIdlMrz(String str) {
        this.idlMrz = str;
    }

    public final void setNfcIdlInfo(IdlBasicInfo idlBasicInfo) {
        this.nfcIdlInfo = idlBasicInfo;
    }

    public final void setNfcMrzInfo(MrzInfo mrzInfo) {
        this.nfcMrzInfo = mrzInfo;
    }

    public final void setNfcResult(NfcResultHolder nfcResultHolder) {
        this.nfcResult = nfcResultHolder;
    }

    public final void setSelfieResult(SelfieResultHolder selfieResultHolder) {
        this.selfieResult = selfieResultHolder;
    }

    public final void setZipUrl(String str) {
        this.zipUrl = str;
    }
}
