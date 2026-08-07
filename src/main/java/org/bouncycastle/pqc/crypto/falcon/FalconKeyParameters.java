package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes10.dex */
public class FalconKeyParameters extends AsymmetricKeyParameter {
    private final FalconParameters params;

    public FalconKeyParameters(boolean z11, FalconParameters falconParameters) {
        super(z11);
        this.params = falconParameters;
    }

    public FalconParameters getParameters() {
        return this.params;
    }
}
