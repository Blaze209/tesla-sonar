package dr0;

import java.security.KeyPair;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class n extends v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f60960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f60961l;

    public n(yq0.g gVar, String str, String str2, String str3, int i11, t tVar, KeyPair keyPair, PublicKey publicKey, byte[] bArr, byte[] bArr2, y yVar) {
        super(gVar, br0.n.b.CAM, str, str2, str3, i11, tVar, keyPair, publicKey, yVar);
        this.f60960k = null;
        if (bArr != null) {
            byte[] bArr3 = new byte[bArr.length];
            this.f60960k = bArr3;
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        }
        this.f60961l = null;
        if (bArr2 != null) {
            byte[] bArr4 = new byte[bArr2.length];
            this.f60961l = bArr4;
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        }
    }

    @Override // dr0.v
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return Arrays.equals(this.f60961l, nVar.f60961l) && Arrays.equals(this.f60960k, nVar.f60960k);
    }

    @Override // dr0.v
    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.f60961l)) * 31) + Arrays.hashCode(this.f60960k);
    }

    @Override // dr0.v
    public String toString() {
        return "PACECAMResult [paceKey: " + g() + ", mappingType: " + f() + ", agreementAlg: " + a() + ", cipherAlg: " + b() + ", digestAlg: " + c() + ", keyLength: " + d() + ", mappingResult: " + e() + ", pcdKeyPair: " + h() + ", piccPublicKey: " + i() + ", encryptedChipAuthenticationData: " + bp0.a.b(this.f60960k) + ", wrapper: " + j() + ", chipAuthenticationData: " + bp0.a.b(this.f60961l) + "]";
    }
}
