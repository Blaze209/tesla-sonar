package dr0;

import java.security.KeyPair;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PublicKey f60962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private KeyPair f60963e;

    public o(AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, PublicKey publicKey, KeyPair keyPair, AlgorithmParameterSpec algorithmParameterSpec2) {
        super(algorithmParameterSpec, bArr, algorithmParameterSpec2);
        this.f60962d = publicKey;
        this.f60963e = keyPair;
    }

    @Override // dr0.t
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        PublicKey publicKey = this.f60962d;
        if (publicKey == null) {
            if (oVar.f60962d != null) {
                return false;
            }
        } else if (!publicKey.equals(oVar.f60962d)) {
            return false;
        }
        KeyPair keyPair = this.f60963e;
        if (keyPair == null) {
            if (oVar.f60963e != null) {
                return false;
            }
        } else if (!keyPair.equals(oVar.f60963e)) {
            return false;
        }
        return true;
    }

    @Override // dr0.t
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        PublicKey publicKey = this.f60962d;
        return iHashCode + (publicKey == null ? 0 : publicKey.hashCode());
    }
}
