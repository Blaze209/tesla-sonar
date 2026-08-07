package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowKeyParameters extends AsymmetricKeyParameter {
    private final int docLength;
    private final RainbowParameters params;

    public RainbowKeyParameters(boolean z11, RainbowParameters rainbowParameters) {
        super(z11);
        this.params = rainbowParameters;
        this.docLength = rainbowParameters.getM();
    }

    public int getDocLength() {
        return this.docLength;
    }

    public RainbowParameters getParameters() {
        return this.params;
    }
}
