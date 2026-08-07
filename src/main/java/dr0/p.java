package dr0;

import java.security.KeyPair;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class p extends o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f60964f;

    public p(AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, PublicKey publicKey, KeyPair keyPair, byte[] bArr2, AlgorithmParameterSpec algorithmParameterSpec2) {
        super(algorithmParameterSpec, bArr, publicKey, keyPair, algorithmParameterSpec2);
        this.f60964f = bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length);
    }

    @Override // dr0.o, dr0.t
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            return Arrays.equals(this.f60964f, ((p) obj).f60964f);
        }
        return false;
    }

    @Override // dr0.o, dr0.t
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.f60964f);
    }
}
