package com.fourthline.core.mrz;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0010\b\u001a\u00060\u0002j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u000f\u001a\u00060\u0002j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\b\u0002\u0010\b\u001a\u00060\u0002j\u0002`\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001b\u0010\b\u001a\u00060\u0002j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/fourthline/core/mrz/IdlMrzInfo;", "Lcom/fourthline/core/mrz/MrzInfo;", "", "rawMrz", "", "Lcom/fourthline/core/mrz/IdlMrzInfoValidationError;", "validationErrors", "Lcom/fourthline/core/mrz/DocumentNumber;", "documentNumber", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/fourthline/core/mrz/IdlMrzInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "getRawMrz", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getValidationErrors", "e", "getDocumentNumber", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IdlMrzInfo extends MrzInfo {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rawMrz;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List validationErrors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentNumber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdlMrzInfo(String rawMrz, List<? extends IdlMrzInfoValidationError> validationErrors, String documentNumber) {
        super(rawMrz, validationErrors, null);
        s.k(rawMrz, "rawMrz");
        s.k(validationErrors, "validationErrors");
        s.k(documentNumber, "documentNumber");
        this.rawMrz = rawMrz;
        this.validationErrors = validationErrors;
        this.documentNumber = documentNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdlMrzInfo copy$default(IdlMrzInfo idlMrzInfo, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = idlMrzInfo.rawMrz;
        }
        if ((i11 & 2) != 0) {
            list = idlMrzInfo.validationErrors;
        }
        if ((i11 & 4) != 0) {
            str2 = idlMrzInfo.documentNumber;
        }
        return idlMrzInfo.copy(str, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRawMrz() {
        return this.rawMrz;
    }

    public final List<IdlMrzInfoValidationError> component2() {
        return this.validationErrors;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final IdlMrzInfo copy(String rawMrz, List<? extends IdlMrzInfoValidationError> validationErrors, String documentNumber) {
        s.k(rawMrz, "rawMrz");
        s.k(validationErrors, "validationErrors");
        s.k(documentNumber, "documentNumber");
        return new IdlMrzInfo(rawMrz, validationErrors, documentNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdlMrzInfo)) {
            return false;
        }
        IdlMrzInfo idlMrzInfo = (IdlMrzInfo) other;
        return s.f(this.rawMrz, idlMrzInfo.rawMrz) && s.f(this.validationErrors, idlMrzInfo.validationErrors) && s.f(this.documentNumber, idlMrzInfo.documentNumber);
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    @Override // com.fourthline.core.mrz.MrzInfo
    public String getRawMrz() {
        return this.rawMrz;
    }

    @Override // com.fourthline.core.mrz.MrzInfo
    public List<IdlMrzInfoValidationError> getValidationErrors() {
        return this.validationErrors;
    }

    public int hashCode() {
        return (((this.rawMrz.hashCode() * 31) + this.validationErrors.hashCode()) * 31) + this.documentNumber.hashCode();
    }

    public String toString() {
        return "IdlMrzInfo(rawMrz=" + this.rawMrz + ", validationErrors=" + this.validationErrors + ", documentNumber=" + this.documentNumber + ")";
    }
}
