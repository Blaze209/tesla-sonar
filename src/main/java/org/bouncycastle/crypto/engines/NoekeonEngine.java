package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int SIZE = 16;
    private static final byte[] roundConstants = {-128, 27, 54, 108, -40, -85, 77, -102, 47, 94, -68, 99, -58, -105, 53, 106, -44};
    private boolean _forEncryption;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f98692k = new int[4];
    private boolean _initialised = false;

    private int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i11);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i11 + 4);
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, i11 + 8);
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i11 + 12);
        int[] iArr = this.f98692k;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        int i17 = 16;
        while (true) {
            int i18 = iBigEndianToInt ^ iBigEndianToInt3;
            int iRotateLeft = i18 ^ (Integers.rotateLeft(i18, 8) ^ Integers.rotateLeft(i18, 24));
            int i19 = iBigEndianToInt2 ^ i14;
            int i21 = iBigEndianToInt4 ^ i16;
            int i22 = i19 ^ i21;
            int iRotateLeft2 = i22 ^ (Integers.rotateLeft(i22, 24) ^ Integers.rotateLeft(i22, 8));
            int i23 = i19 ^ iRotateLeft;
            int i24 = (iBigEndianToInt3 ^ i15) ^ iRotateLeft2;
            int i25 = i21 ^ iRotateLeft;
            int i26 = ((iBigEndianToInt ^ i13) ^ iRotateLeft2) ^ (roundConstants[i17] & 255);
            i17--;
            if (i17 < 0) {
                Pack.intToBigEndian(i26, bArr2, i12);
                Pack.intToBigEndian(i23, bArr2, i12 + 4);
                Pack.intToBigEndian(i24, bArr2, i12 + 8);
                Pack.intToBigEndian(i25, bArr2, i12 + 12);
                return 16;
            }
            int iRotateLeft3 = Integers.rotateLeft(i23, 1);
            int iRotateLeft4 = Integers.rotateLeft(i24, 5);
            int iRotateLeft5 = Integers.rotateLeft(i25, 2);
            int i27 = iRotateLeft3 ^ (iRotateLeft5 | iRotateLeft4);
            int i28 = ~i27;
            int i29 = i26 ^ (iRotateLeft4 & i28);
            int i31 = (iRotateLeft4 ^ (i28 ^ iRotateLeft5)) ^ i29;
            int i32 = i27 ^ (i29 | i31);
            int i33 = iRotateLeft5 ^ (i31 & i32);
            iBigEndianToInt2 = Integers.rotateLeft(i32, 31);
            iBigEndianToInt3 = Integers.rotateLeft(i31, 27);
            int iRotateLeft6 = Integers.rotateLeft(i29, 30);
            iBigEndianToInt = i33;
            iBigEndianToInt4 = iRotateLeft6;
        }
    }

    private int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i11);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i11 + 4);
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, i11 + 8);
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i11 + 12);
        int[] iArr = this.f98692k;
        int i13 = 0;
        int i14 = iArr[0];
        int i15 = 1;
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        while (true) {
            int i19 = iBigEndianToInt ^ (roundConstants[i13] & 255);
            int i21 = i19 ^ iBigEndianToInt3;
            int iRotateLeft = i21 ^ (Integers.rotateLeft(i21, 8) ^ Integers.rotateLeft(i21, 24));
            int i22 = iBigEndianToInt2 ^ i16;
            int i23 = iBigEndianToInt4 ^ i18;
            int i24 = i15;
            int i25 = i22 ^ i23;
            int iRotateLeft2 = i25 ^ (Integers.rotateLeft(i25, 24) ^ Integers.rotateLeft(i25, 8));
            int i26 = (i19 ^ i14) ^ iRotateLeft2;
            int i27 = i22 ^ iRotateLeft;
            int i28 = (iBigEndianToInt3 ^ i17) ^ iRotateLeft2;
            int i29 = i23 ^ iRotateLeft;
            i13++;
            if (i13 > 16) {
                Pack.intToBigEndian(i26, bArr2, i12);
                Pack.intToBigEndian(i27, bArr2, i12 + 4);
                Pack.intToBigEndian(i28, bArr2, i12 + 8);
                Pack.intToBigEndian(i29, bArr2, i12 + 12);
                return 16;
            }
            i15 = i24;
            int iRotateLeft3 = Integers.rotateLeft(i27, i15);
            int iRotateLeft4 = Integers.rotateLeft(i28, 5);
            int iRotateLeft5 = Integers.rotateLeft(i29, 2);
            int i31 = iRotateLeft3 ^ (iRotateLeft5 | iRotateLeft4);
            int i32 = ~i31;
            int i33 = i26 ^ (iRotateLeft4 & i32);
            int i34 = (iRotateLeft4 ^ (i32 ^ iRotateLeft5)) ^ i33;
            int i35 = i31 ^ (i33 | i34);
            int i36 = iRotateLeft5 ^ (i34 & i35);
            iBigEndianToInt2 = Integers.rotateLeft(i35, 31);
            iBigEndianToInt3 = Integers.rotateLeft(i34, 27);
            int iRotateLeft6 = Integers.rotateLeft(i33, 30);
            iBigEndianToInt = i36;
            iBigEndianToInt4 = iRotateLeft6;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + cipherParameters.getClass().getName());
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Key length not 128 bits.");
        }
        Pack.bigEndianToInt(key, 0, this.f98692k, 0, 4);
        if (!z11) {
            int[] iArr = this.f98692k;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            int i15 = i11 ^ i13;
            int iRotateLeft = i15 ^ (Integers.rotateLeft(i15, 8) ^ Integers.rotateLeft(i15, 24));
            int i16 = i12 ^ i14;
            int iRotateLeft2 = (Integers.rotateLeft(i16, 8) ^ Integers.rotateLeft(i16, 24)) ^ i16;
            int i17 = i12 ^ iRotateLeft;
            int i18 = i14 ^ iRotateLeft;
            int[] iArr2 = this.f98692k;
            iArr2[0] = i11 ^ iRotateLeft2;
            iArr2[1] = i17;
            iArr2[2] = i13 ^ iRotateLeft2;
            iArr2[3] = i18;
        }
        this._forEncryption = z11;
        this._initialised = true;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z11)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i11 > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 <= bArr2.length - 16) {
            return this._forEncryption ? encryptBlock(bArr, i11, bArr2, i12) : decryptBlock(bArr, i11, bArr2, i12);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
