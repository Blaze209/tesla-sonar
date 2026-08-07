package com.fourthline.adapters.kyc;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.kyc.KycInfo;
import com.fourthline.scanners.config.orca.kyc.model.KycInfoModel;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/fourthline/adapters/kyc/KycInfoModelMapper;", "", "map", "Lcom/fourthline/scanners/config/orca/kyc/model/KycInfoModel;", OrcaKeys.KEY_KYC_INFO, "Lcom/fourthline/kyc/KycInfo;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface KycInfoModelMapper {
    KycInfoModel map(KycInfo kycInfo);
}
