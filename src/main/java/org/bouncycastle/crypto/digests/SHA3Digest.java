package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;

/* JADX INFO: loaded from: classes9.dex */
public class SHA3Digest extends KeccakDigest {
    public SHA3Digest() {
        this(256, CryptoServicePurpose.ANY);
    }

    private static int checkBitLength(int i11) {
        if (i11 == 224 || i11 == 256 || i11 == 384 || i11 == 512) {
            return i11;
        }
        throw new IllegalArgumentException("'bitLength' " + i11 + " not supported for SHA-3");
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        absorbBits(2, 2);
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA3-" + this.fixedOutputLength;
    }

    public SHA3Digest(int i11) {
        super(checkBitLength(i11), CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    protected int doFinal(byte[] bArr, int i11, byte b11, int i12) {
        if (i12 < 0 || i12 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i13 = (b11 & ((1 << i12) - 1)) | (2 << i12);
        int i14 = i12 + 2;
        if (i14 >= 8) {
            absorb((byte) i13);
            i14 = i12 - 6;
            i13 >>>= 8;
        }
        return super.doFinal(bArr, i11, (byte) i13, i14);
    }

    public SHA3Digest(int i11, CryptoServicePurpose cryptoServicePurpose) {
        super(checkBitLength(i11), cryptoServicePurpose);
    }

    public SHA3Digest(CryptoServicePurpose cryptoServicePurpose) {
        this(256, cryptoServicePurpose);
    }

    public SHA3Digest(SHA3Digest sHA3Digest) {
        super(sHA3Digest);
    }
}
