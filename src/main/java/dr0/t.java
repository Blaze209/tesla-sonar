package dr0;

import java.io.Serializable;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class t implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient AlgorithmParameterSpec f60969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AlgorithmParameterSpec f60970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f60971c;

    public t(AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec2) {
        this.f60969a = algorithmParameterSpec;
        this.f60970b = algorithmParameterSpec2;
        this.f60971c = null;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.f60971c = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    public AlgorithmParameterSpec a() {
        return this.f60970b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        AlgorithmParameterSpec algorithmParameterSpec = this.f60970b;
        if (algorithmParameterSpec == null) {
            if (tVar.f60970b != null) {
                return false;
            }
        } else if (!algorithmParameterSpec.equals(tVar.f60970b)) {
            return false;
        }
        if (!Arrays.equals(this.f60971c, tVar.f60971c)) {
            return false;
        }
        AlgorithmParameterSpec algorithmParameterSpec2 = this.f60969a;
        if (algorithmParameterSpec2 == null) {
            if (tVar.f60969a != null) {
                return false;
            }
        } else if (!algorithmParameterSpec2.equals(tVar.f60969a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        AlgorithmParameterSpec algorithmParameterSpec = this.f60970b;
        int iHashCode = ((((algorithmParameterSpec == null ? 0 : algorithmParameterSpec.hashCode()) + 31) * 31) + Arrays.hashCode(this.f60971c)) * 31;
        AlgorithmParameterSpec algorithmParameterSpec2 = this.f60969a;
        return iHashCode + (algorithmParameterSpec2 != null ? algorithmParameterSpec2.hashCode() : 0);
    }
}
