package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes10.dex */
public class ECKeyParameters extends AsymmetricKeyParameter {
    ECDomainParameters params;

    protected ECKeyParameters(boolean z11, ECDomainParameters eCDomainParameters) {
        super(z11);
        this.params = eCDomainParameters;
    }

    public ECDomainParameters getParameters() {
        return this.params;
    }
}
