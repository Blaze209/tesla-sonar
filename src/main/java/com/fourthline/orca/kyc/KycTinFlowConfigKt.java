package com.fourthline.orca.kyc;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"alpha3", "", "Lcom/fourthline/orca/kyc/KycTinFlowConfig$TaxationCountry;", "getAlpha3", "(Lcom/fourthline/orca/kyc/KycTinFlowConfig$TaxationCountry;)Ljava/lang/String;", "fourthline-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KycTinFlowConfigKt {
    public static final String getAlpha3(KycTinFlowConfig.TaxationCountry taxationCountry) {
        s.k(taxationCountry, "<this>");
        return taxationCountry.toString();
    }
}
