package com.fourthline.kyc;

import com.fourthline.core.Validatable;
import java.util.ArrayList;
import java.util.List;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lcom/fourthline/kyc/TaxInfo;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/TaxInfoValidationError;", "", "taxationCountryCode", "taxpayerIdentificationNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "b", "()Z", "a", "", "validate", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/kyc/TaxInfo;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTaxationCountryCode", "setTaxationCountryCode", "(Ljava/lang/String;)V", "getTaxpayerIdentificationNumber", "setTaxpayerIdentificationNumber", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TaxInfo implements Validatable<TaxInfoValidationError> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String taxationCountryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String taxpayerIdentificationNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public TaxInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final boolean a() {
        String str = this.taxationCountryCode;
        if (str != null) {
            return CountryCodes.INSTANCE.isSupportedCountry(str);
        }
        return false;
    }

    private final boolean b() {
        String str = this.taxpayerIdentificationNumber;
        if (str != null) {
            return !t.y0(str);
        }
        return false;
    }

    public static /* synthetic */ TaxInfo copy$default(TaxInfo taxInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = taxInfo.taxationCountryCode;
        }
        if ((i11 & 2) != 0) {
            str2 = taxInfo.taxpayerIdentificationNumber;
        }
        return taxInfo.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTaxationCountryCode() {
        return this.taxationCountryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTaxpayerIdentificationNumber() {
        return this.taxpayerIdentificationNumber;
    }

    public final TaxInfo copy(String taxationCountryCode, String taxpayerIdentificationNumber) {
        return new TaxInfo(taxationCountryCode, taxpayerIdentificationNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxInfo)) {
            return false;
        }
        TaxInfo taxInfo = (TaxInfo) other;
        return s.f(this.taxationCountryCode, taxInfo.taxationCountryCode) && s.f(this.taxpayerIdentificationNumber, taxInfo.taxpayerIdentificationNumber);
    }

    public final String getTaxationCountryCode() {
        return this.taxationCountryCode;
    }

    public final String getTaxpayerIdentificationNumber() {
        return this.taxpayerIdentificationNumber;
    }

    public int hashCode() {
        String str = this.taxationCountryCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.taxpayerIdentificationNumber;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setTaxationCountryCode(String str) {
        this.taxationCountryCode = str;
    }

    public final void setTaxpayerIdentificationNumber(String str) {
        this.taxpayerIdentificationNumber = str;
    }

    public String toString() {
        return "TaxInfo(taxationCountryCode=" + this.taxationCountryCode + ", taxpayerIdentificationNumber=" + this.taxpayerIdentificationNumber + ")";
    }

    @Override // com.fourthline.core.Validatable
    public List<TaxInfoValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (!b()) {
            arrayList.add(TaxInfoValidationError.INVALID_TAXPAYER_IDENTIFICATION_NUMBER);
        }
        if (!a()) {
            arrayList.add(TaxInfoValidationError.INVALID_TAXATION_COUNTRY_CODE);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxInfo(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public TaxInfo(String str, String str2) {
        this.taxationCountryCode = str;
        this.taxpayerIdentificationNumber = str2;
    }

    public /* synthetic */ TaxInfo(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
