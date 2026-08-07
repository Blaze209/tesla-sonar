package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class SPHINCSPlusPrivateKeyParameters extends SPHINCSPlusKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    final PK f99190pk;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    final SK f99191sk;

    SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, SK sk2, PK pk2) {
        super(true, sPHINCSPlusParameters);
        this.f99191sk = sk2;
        this.f99190pk = pk2;
    }

    public byte[] getEncoded() {
        SK sk2 = this.f99191sk;
        byte[] bArr = sk2.seed;
        byte[] bArr2 = sk2.prf;
        PK pk2 = this.f99190pk;
        return Arrays.concatenate(new byte[][]{bArr, bArr2, pk2.seed, pk2.root});
    }

    public byte[] getEncodedPublicKey() {
        PK pk2 = this.f99190pk;
        return Arrays.concatenate(pk2.seed, pk2.root);
    }

    public byte[] getPrf() {
        return Arrays.clone(this.f99191sk.prf);
    }

    public byte[] getPublicKey() {
        PK pk2 = this.f99190pk;
        return Arrays.concatenate(pk2.seed, pk2.root);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.f99190pk.seed);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f99190pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f99191sk.seed);
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(true, sPHINCSPlusParameters);
        int n11 = sPHINCSPlusParameters.getN();
        int i11 = n11 * 4;
        if (bArr.length != i11) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i12 = n11 * 2;
        this.f99191sk = new SK(Arrays.copyOfRange(bArr, 0, n11), Arrays.copyOfRange(bArr, n11, i12));
        int i13 = n11 * 3;
        this.f99190pk = new PK(Arrays.copyOfRange(bArr, i12, i13), Arrays.copyOfRange(bArr, i13, i11));
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, sPHINCSPlusParameters);
        this.f99191sk = new SK(bArr, bArr2);
        this.f99190pk = new PK(bArr3, bArr4);
    }
}
