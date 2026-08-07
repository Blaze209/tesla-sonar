package dr0;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class s extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f60968d;

    public s(AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, byte[] bArr2, AlgorithmParameterSpec algorithmParameterSpec2) {
        super(algorithmParameterSpec, bArr, algorithmParameterSpec2);
        this.f60968d = bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length);
    }

    @Override // dr0.t
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            return Arrays.equals(this.f60968d, ((s) obj).f60968d);
        }
        return false;
    }

    @Override // dr0.t
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.f60968d);
    }
}
