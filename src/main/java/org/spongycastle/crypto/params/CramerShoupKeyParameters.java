package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes10.dex */
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
        CramerShoupKeyParameters cramerShoupKeyParameters = (CramerShoupKeyParameters) obj;
        CramerShoupParameters cramerShoupParameters = this.params;
        if (cramerShoupParameters == null) {
            return cramerShoupKeyParameters.getParameters() == null;
        }
        return cramerShoupParameters.equals(cramerShoupKeyParameters.getParameters());
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
