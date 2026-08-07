package com.fourthline.scanners.config.orca.kyc.model;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010!\u0012\u0004\b%\u0010&\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010$R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010!\u0012\u0004\b)\u0010&\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010$¨\u0006,"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel;", "", "", "taxationCountryCode", "taxpayerIdentificationNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTaxationCountryCode", "setTaxationCountryCode", "(Ljava/lang/String;)V", "getTaxationCountryCode$annotations", "()V", "getTaxpayerIdentificationNumber", "setTaxpayerIdentificationNumber", "getTaxpayerIdentificationNumber$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class TaxInfoModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String taxationCountryCode;
    private String taxpayerIdentificationNumber;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<TaxInfoModel> serializer() {
            return TaxInfoModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxInfoModel() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ TaxInfoModel copy$default(TaxInfoModel taxInfoModel, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = taxInfoModel.taxationCountryCode;
        }
        if ((i11 & 2) != 0) {
            str2 = taxInfoModel.taxpayerIdentificationNumber;
        }
        return taxInfoModel.copy(str, str2);
    }

    @o("taxationCountryCode")
    public static /* synthetic */ void getTaxationCountryCode$annotations() {
    }

    @o("taxpayerIdentificationNumber")
    public static /* synthetic */ void getTaxpayerIdentificationNumber$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(TaxInfoModel self, uo0.d output, f serialDesc) {
        if (output.G(serialDesc, 0) || self.taxationCountryCode != null) {
            output.y(serialDesc, 0, z1.f119730a, self.taxationCountryCode);
        }
        if (!output.G(serialDesc, 1) && self.taxpayerIdentificationNumber == null) {
            return;
        }
        output.y(serialDesc, 1, z1.f119730a, self.taxpayerIdentificationNumber);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTaxationCountryCode() {
        return this.taxationCountryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTaxpayerIdentificationNumber() {
        return this.taxpayerIdentificationNumber;
    }

    public final TaxInfoModel copy(String taxationCountryCode, String taxpayerIdentificationNumber) {
        return new TaxInfoModel(taxationCountryCode, taxpayerIdentificationNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxInfoModel)) {
            return false;
        }
        TaxInfoModel taxInfoModel = (TaxInfoModel) other;
        return s.f(this.taxationCountryCode, taxInfoModel.taxationCountryCode) && s.f(this.taxpayerIdentificationNumber, taxInfoModel.taxpayerIdentificationNumber);
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
        return "TaxInfoModel(taxationCountryCode=" + this.taxationCountryCode + ", taxpayerIdentificationNumber=" + this.taxpayerIdentificationNumber + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxInfoModel(String str) {
        this(str, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public /* synthetic */ TaxInfoModel(int i11, String str, String str2, v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.taxationCountryCode = null;
        } else {
            this.taxationCountryCode = str;
        }
        if ((i11 & 2) == 0) {
            this.taxpayerIdentificationNumber = null;
        } else {
            this.taxpayerIdentificationNumber = str2;
        }
    }

    public TaxInfoModel(String str, String str2) {
        this.taxationCountryCode = str;
        this.taxpayerIdentificationNumber = str2;
    }

    public /* synthetic */ TaxInfoModel(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
