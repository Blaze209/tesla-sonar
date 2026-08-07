package org.spongycastle.dvcs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.dvcs.Data;
import org.spongycastle.asn1.dvcs.TargetEtcChain;

/* JADX INFO: loaded from: classes10.dex */
public class VPKCRequestData extends DVCSRequestData {
    private List chains;

    VPKCRequestData(Data data) throws DVCSConstructionException {
        super(data);
        TargetEtcChain[] certs = data.getCerts();
        if (certs == null) {
            throw new DVCSConstructionException("DVCSRequest.data.certs should be specified for VPKC service");
        }
        this.chains = new ArrayList(certs.length);
        for (int i11 = 0; i11 != certs.length; i11++) {
            this.chains.add(new TargetChain(certs[i11]));
        }
    }

    public List getCerts() {
        return Collections.unmodifiableList(this.chains);
    }
}
