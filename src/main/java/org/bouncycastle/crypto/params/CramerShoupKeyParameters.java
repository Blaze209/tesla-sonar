package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes9.dex */
public class CramerShoupKeyParameters extends AsymmetricKeyParameter {
    private CramerShoupParameters params;

    protected CramerShoupKeyParameters(boolean z11, CramerShoupParameters cramerShoupParameters) {
        super(z11);
        this.params = cramerShoupParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupKeyParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = this.params;
        CramerShoupParameters parameters = ((CramerShoupKeyParameters) obj).getParameters();
        if (cramerShoupParameters == null) {
            return parameters == null;
        }
        return cramerShoupParameters.equals(parameters);
    }

    public CramerShoupParameters getParameters() {
        return this.params;
    }

    public int hashCode() {
        int i11 = !isPrivate() ? 1 : 0;
        CramerShoupParameters cramerShoupParameters = this.params;
        return cramerShoupParameters != null ? i11 ^ cramerShoupParameters.hashCode() : i11;
    }
}
