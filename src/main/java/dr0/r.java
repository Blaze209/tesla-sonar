package dr0;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes10.dex */
public class r extends o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BigInteger f60966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f60967g;

    public r(AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, PublicKey publicKey, KeyPair keyPair, ECPoint eCPoint, AlgorithmParameterSpec algorithmParameterSpec2) {
        super(algorithmParameterSpec, bArr, publicKey, keyPair, algorithmParameterSpec2);
        this.f60966f = eCPoint.getAffineX();
        this.f60967g = eCPoint.getAffineY();
    }

    @Override // dr0.o, dr0.t
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        BigInteger bigInteger = this.f60966f;
        if (bigInteger == null) {
            if (rVar.f60966f != null) {
                return false;
            }
        } else if (!bigInteger.equals(rVar.f60966f)) {
            return false;
        }
        BigInteger bigInteger2 = this.f60967g;
        if (bigInteger2 == null) {
            if (rVar.f60967g != null) {
                return false;
            }
        } else if (!bigInteger2.equals(rVar.f60967g)) {
            return false;
        }
        return true;
    }

    @Override // dr0.o, dr0.t
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        BigInteger bigInteger = this.f60966f;
        int iHashCode2 = iHashCode + (bigInteger == null ? 0 : bigInteger.hashCode());
        BigInteger bigInteger2 = this.f60967g;
        return iHashCode2 + (bigInteger2 != null ? bigInteger2.hashCode() : 0);
    }
}
