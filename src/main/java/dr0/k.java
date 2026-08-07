package dr0;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f60951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PublicKey f60952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private y f60953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f60954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PublicKey f60955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PrivateKey f60956f;

    public k(BigInteger bigInteger, PublicKey publicKey, byte[] bArr, PublicKey publicKey2, PrivateKey privateKey, y yVar) {
        this.f60951a = bigInteger;
        this.f60952b = publicKey;
        this.f60954d = bArr;
        this.f60955e = publicKey2;
        this.f60956f = privateKey;
        this.f60953c = yVar;
    }

    public y a() {
        return this.f60953c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (!Arrays.equals(this.f60954d, kVar.f60954d)) {
            return false;
        }
        BigInteger bigInteger = this.f60951a;
        if (bigInteger == null) {
            if (kVar.f60951a != null) {
                return false;
            }
        } else if (!bigInteger.equals(kVar.f60951a)) {
            return false;
        }
        PrivateKey privateKey = this.f60956f;
        if (privateKey == null) {
            if (kVar.f60956f != null) {
                return false;
            }
        } else if (!privateKey.equals(kVar.f60956f)) {
            return false;
        }
        PublicKey publicKey = this.f60955e;
        if (publicKey == null) {
            if (kVar.f60955e != null) {
                return false;
            }
        } else if (!publicKey.equals(kVar.f60955e)) {
            return false;
        }
        PublicKey publicKey2 = this.f60952b;
        if (publicKey2 == null) {
            if (kVar.f60952b != null) {
                return false;
            }
        } else if (!publicKey2.equals(kVar.f60952b)) {
            return false;
        }
        y yVar = this.f60953c;
        if (yVar == null) {
            if (kVar.f60953c != null) {
                return false;
            }
        } else if (!yVar.equals(kVar.f60953c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f60954d) + 31) * 31;
        BigInteger bigInteger = this.f60951a;
        int iHashCode2 = (iHashCode + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
        PublicKey publicKey = this.f60952b;
        int iHashCode3 = (iHashCode2 + (publicKey == null ? 0 : publicKey.hashCode())) * 31;
        PublicKey publicKey2 = this.f60955e;
        int iHashCode4 = (iHashCode3 + (publicKey2 == null ? 0 : publicKey2.hashCode())) * 31;
        PrivateKey privateKey = this.f60956f;
        int iHashCode5 = (iHashCode4 + (privateKey == null ? 0 : privateKey.hashCode())) * 31;
        y yVar = this.f60953c;
        return iHashCode5 + (yVar != null ? yVar.hashCode() : 0);
    }

    public String toString() {
        return "EACCAResult [keyId: " + this.f60951a + ", PICC public key: " + this.f60952b + ", wrapper: " + this.f60953c + ", key hash: " + bp0.a.b(this.f60954d) + ", PCD public key: " + yq0.o.t(this.f60955e) + ", PCD private key: " + yq0.o.s(this.f60956f) + "]";
    }
}
