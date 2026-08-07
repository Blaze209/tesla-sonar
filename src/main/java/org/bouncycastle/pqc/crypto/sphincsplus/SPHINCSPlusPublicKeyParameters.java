package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class SPHINCSPlusPublicKeyParameters extends SPHINCSPlusKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private final PK f99192pk;

    SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, PK pk2) {
        super(false, sPHINCSPlusParameters);
        this.f99192pk = pk2;
    }

    public byte[] getEncoded() {
        PK pk2 = this.f99192pk;
        return Arrays.concatenate(pk2.seed, pk2.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f99192pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f99192pk.seed);
    }

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(false, sPHINCSPlusParameters);
        int n11 = sPHINCSPlusParameters.getN();
        int i11 = n11 * 2;
        if (bArr.length != i11) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f99192pk = new PK(Arrays.copyOfRange(bArr, 0, n11), Arrays.copyOfRange(bArr, n11, i11));
    }
}
