package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes10.dex */
public class DHKeyParameters extends AsymmetricKeyParameter {
    private DHParameters params;

    protected DHKeyParameters(boolean z11, DHParameters dHParameters) {
        super(z11);
        this.params = dHParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHKeyParameters)) {
            return false;
        }
        DHKeyParameters dHKeyParameters = (DHKeyParameters) obj;
        DHParameters dHParameters = this.params;
        if (dHParameters == null) {
            return dHKeyParameters.getParameters() == null;
        }
        return dHParameters.equals(dHKeyParameters.getParameters());
    }

    public DHParameters getParameters() {
        return this.params;
    }

    public int hashCode() {
        int i11 = !isPrivate() ? 1 : 0;
        DHParameters dHParameters = this.params;
        return dHParameters != null ? i11 ^ dHParameters.hashCode() : i11;
    }
}
