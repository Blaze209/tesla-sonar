package com.fourthline.orca.kyc;

import jn0.e;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/kyc/KycTinFlowConfig;", "", "Lcom/fourthline/orca/kyc/KycTinFlowConfig$TaxationCountry;", "taxationCountry", "<init>", "(Lcom/fourthline/orca/kyc/KycTinFlowConfig$TaxationCountry;)V", "component1", "()Lcom/fourthline/orca/kyc/KycTinFlowConfig$TaxationCountry;", "copy", "(Lcom/fourthline/orca/kyc/KycTinFlowConfig$TaxationCountry;)Lcom/fourthline/orca/kyc/KycTinFlowConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/kyc/KycTinFlowConfig$TaxationCountry;", "getTaxationCountry", "TaxationCountry", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KycTinFlowConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TaxationCountry taxationCountry;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/orca/kyc/KycTinFlowConfig$TaxationCountry;", "", "<init>", "(Ljava/lang/String;I)V", "ESP", "ITA", "NLD", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum TaxationCountry {
        ESP,
        ITA,
        NLD;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f37387b = a.a(a());

        public static EnumEntries<TaxationCountry> getEntries() {
            return f37387b;
        }
    }

    public KycTinFlowConfig(TaxationCountry taxationCountry) {
        s.k(taxationCountry, "taxationCountry");
        this.taxationCountry = taxationCountry;
    }

    public static /* synthetic */ KycTinFlowConfig copy$default(KycTinFlowConfig kycTinFlowConfig, TaxationCountry taxationCountry, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            taxationCountry = kycTinFlowConfig.taxationCountry;
        }
        return kycTinFlowConfig.copy(taxationCountry);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TaxationCountry getTaxationCountry() {
        return this.taxationCountry;
    }

    public final KycTinFlowConfig copy(TaxationCountry taxationCountry) {
        s.k(taxationCountry, "taxationCountry");
        return new KycTinFlowConfig(taxationCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KycTinFlowConfig) && this.taxationCountry == ((KycTinFlowConfig) other).taxationCountry;
    }

    public final TaxationCountry getTaxationCountry() {
        return this.taxationCountry;
    }

    public int hashCode() {
        return this.taxationCountry.hashCode();
    }

    public String toString() {
        return "KycTinFlowConfig(taxationCountry=" + this.taxationCountry + ")";
    }
}
