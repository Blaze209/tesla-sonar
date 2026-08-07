package org.spongycastle.dvcs;

import org.spongycastle.asn1.dvcs.DVCSRequestInformationBuilder;
import org.spongycastle.asn1.dvcs.Data;
import org.spongycastle.asn1.dvcs.ServiceType;

/* JADX INFO: loaded from: classes10.dex */
public class CCPDRequestBuilder extends DVCSRequestBuilder {
    public CCPDRequestBuilder() {
        super(new DVCSRequestInformationBuilder(ServiceType.CCPD));
    }

    public DVCSRequest build(MessageImprint messageImprint) {
        return createDVCRequest(new Data(messageImprint.toASN1Structure()));
    }
}
