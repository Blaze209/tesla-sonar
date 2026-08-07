package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes9.dex */
public abstract class SerpentEngineBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    static final int PHI = -1640531527;
    static final int ROUNDS = 32;
    protected boolean encrypting;
    protected int keyBits;
    protected int[] wKey;

    SerpentEngineBase() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256));
    }

    private CryptoServicePurpose getPurpose() {
        if (this.wKey == null) {
            return CryptoServicePurpose.ANY;
        }
        return this.encrypting ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }

    protected static int rotateLeft(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    protected static int rotateRight(int i11, int i12) {
        return (i11 << (-i12)) | (i11 >>> i12);
    }

    protected final void LT(int[] iArr) {
        int iRotateLeft = rotateLeft(iArr[0], 13);
        int iRotateLeft2 = rotateLeft(iArr[2], 3);
        int i11 = (iArr[1] ^ iRotateLeft) ^ iRotateLeft2;
        int i12 = (iArr[3] ^ iRotateLeft2) ^ (iRotateLeft << 3);
        iArr[1] = rotateLeft(i11, 1);
        int iRotateLeft3 = rotateLeft(i12, 7);
        iArr[3] = iRotateLeft3;
        iArr[0] = rotateLeft((iRotateLeft ^ iArr[1]) ^ iRotateLeft3, 5);
        iArr[2] = rotateLeft((iArr[3] ^ iRotateLeft2) ^ (iArr[1] << 7), 22);
    }

    protected abstract void decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12);

    protected abstract void encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12);

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    protected final void ib0(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i12 ^ i11;
        int i17 = (i15 | i16) ^ i14;
        int i18 = i13 ^ i17;
        int i19 = i16 ^ i18;
        iArr[2] = i19;
        int i21 = (i16 & i14) ^ i15;
        int i22 = (i19 & i21) ^ i17;
        iArr[1] = i22;
        int i23 = (i11 & i17) ^ (i22 | i18);
        iArr[3] = i23;
        iArr[0] = i23 ^ (i21 ^ i18);
    }

    protected final void ib1(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = i14 ^ i12;
        int i16 = i11 ^ (i12 & i15);
        int i17 = i15 ^ i16;
        int i18 = i13 ^ i17;
        iArr[3] = i18;
        int i19 = i12 ^ (i15 & i16);
        int i21 = i16 ^ (i18 | i19);
        iArr[1] = i21;
        int i22 = ~i21;
        int i23 = i19 ^ i18;
        iArr[0] = i22 ^ i23;
        iArr[2] = (i22 | i23) ^ i17;
    }

    protected final void ib2(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = i12 ^ i14;
        int i16 = ~i15;
        int i17 = i11 ^ i13;
        int i18 = i13 ^ i15;
        int i19 = (i12 & i18) ^ i17;
        iArr[0] = i19;
        int i21 = (((i11 | i16) ^ i14) | i17) ^ i15;
        iArr[3] = i21;
        int i22 = ~i18;
        int i23 = i21 | i19;
        iArr[1] = i22 ^ i23;
        iArr[2] = (i23 ^ i17) ^ (i14 & i22);
    }

    protected final void ib3(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = i11 | i12;
        int i16 = i12 ^ i13;
        int i17 = i11 ^ (i12 & i16);
        int i18 = i13 ^ i17;
        int i19 = i14 | i17;
        int i21 = i16 ^ i19;
        iArr[0] = i21;
        int i22 = (i19 | i16) ^ i14;
        iArr[2] = i18 ^ i22;
        int i23 = i15 ^ i22;
        int i24 = i17 ^ (i21 & i23);
        iArr[3] = i24;
        iArr[1] = i24 ^ (i23 ^ i21);
    }

    protected final void ib4(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = i12 ^ ((i13 | i14) & i11);
        int i16 = i13 ^ (i11 & i15);
        int i17 = i14 ^ i16;
        iArr[1] = i17;
        int i18 = ~i11;
        int i19 = (i16 & i17) ^ i15;
        iArr[3] = i19;
        int i21 = i14 ^ (i17 | i18);
        iArr[0] = i19 ^ i21;
        iArr[2] = (i18 ^ i17) ^ (i15 & i21);
    }

    protected final void ib5(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = ~i13;
        int i16 = (i12 & i15) ^ i14;
        int i17 = i11 & i16;
        int i18 = (i12 ^ i15) ^ i17;
        iArr[3] = i18;
        int i19 = i18 | i12;
        iArr[1] = i16 ^ (i11 & i19);
        int i21 = i14 | i11;
        iArr[0] = (i15 ^ i19) ^ i21;
        iArr[2] = ((i11 ^ i13) | i17) ^ (i12 & i21);
    }

    protected final void ib6(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i11 ^ i12;
        int i17 = i13 ^ i16;
        int i18 = (i13 | i15) ^ i14;
        iArr[1] = i17 ^ i18;
        int i19 = i16 ^ (i17 & i18);
        int i21 = i18 ^ (i12 | i19);
        iArr[3] = i21;
        int i22 = i12 | i21;
        iArr[0] = i19 ^ i22;
        iArr[2] = (i14 & i15) ^ (i22 ^ i17);
    }

    protected final void ib7(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = (i11 & i12) | i13;
        int i16 = (i11 | i12) & i14;
        int i17 = i15 ^ i16;
        iArr[3] = i17;
        int i18 = i12 ^ i16;
        int i19 = ((i17 ^ (~i14)) | i18) ^ i11;
        iArr[1] = i19;
        int i21 = (i18 ^ i13) ^ (i14 | i19);
        iArr[0] = i21;
        iArr[2] = ((i11 & i17) ^ i21) ^ (i15 ^ i19);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.encrypting = z11;
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.wKey = makeWorkingKey(key);
            CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, getPurpose()));
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + cipherParameters.getClass().getName());
    }

    protected final void inverseLT(int[] iArr) {
        int iRotateRight = (rotateRight(iArr[2], 22) ^ iArr[3]) ^ (iArr[1] << 7);
        int iRotateRight2 = rotateRight(iArr[0], 5) ^ iArr[1];
        int i11 = iArr[3];
        int i12 = iRotateRight2 ^ i11;
        int iRotateRight3 = rotateRight(i11, 7);
        int iRotateRight4 = rotateRight(iArr[1], 1);
        iArr[3] = (iRotateRight3 ^ iRotateRight) ^ (i12 << 3);
        iArr[1] = (iRotateRight4 ^ i12) ^ iRotateRight;
        iArr[2] = rotateRight(iRotateRight, 3);
        iArr[0] = rotateRight(i12, 13);
    }

    protected abstract int[] makeWorkingKey(byte[] bArr);

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.wKey == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i11 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i11, bArr2, i12);
            return 16;
        }
        decryptBlock(bArr, i11, bArr2, i12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    protected final void sb0(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = i11 ^ i14;
        int i16 = i13 ^ i15;
        int i17 = i12 ^ i16;
        int i18 = (i14 & i11) ^ i17;
        iArr[3] = i18;
        int i19 = i11 ^ (i12 & i15);
        iArr[2] = (i13 | i19) ^ i17;
        int i21 = (i16 ^ i19) & i18;
        iArr[1] = (~i16) ^ i21;
        iArr[0] = (~i19) ^ i21;
    }

    protected final void sb1(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = (~i11) ^ i12;
        int i16 = (i11 | i15) ^ i13;
        int i17 = i14 ^ i16;
        iArr[2] = i17;
        int i18 = i12 ^ (i14 | i15);
        int i19 = i17 ^ i15;
        int i21 = (i16 & i18) ^ i19;
        iArr[3] = i21;
        int i22 = i18 ^ i16;
        iArr[1] = i21 ^ i22;
        iArr[0] = i16 ^ (i22 & i19);
    }

    protected final void sb2(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i12 ^ i14;
        int i17 = (i13 & i15) ^ i16;
        iArr[0] = i17;
        int i18 = i13 ^ i15;
        int i19 = i12 & (i13 ^ i17);
        int i21 = i18 ^ i19;
        iArr[3] = i21;
        int i22 = i11 ^ ((i19 | i14) & (i17 | i18));
        iArr[2] = i22;
        iArr[1] = (i22 ^ (i14 | i15)) ^ (i16 ^ i21);
    }

    protected final void sb3(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = i11 ^ i12;
        int i16 = i11 & i13;
        int i17 = i11 | i14;
        int i18 = i13 ^ i14;
        int i19 = i16 | (i15 & i17);
        int i21 = i18 ^ i19;
        iArr[2] = i21;
        int i22 = (i17 ^ i12) ^ i19;
        int i23 = i15 ^ (i18 & i22);
        iArr[0] = i23;
        int i24 = i23 & i21;
        iArr[1] = i22 ^ i24;
        iArr[3] = (i12 | i14) ^ (i18 ^ i24);
    }

    protected final void sb4(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = i11 ^ i14;
        int i16 = i13 ^ (i14 & i15);
        int i17 = i12 | i16;
        iArr[3] = i15 ^ i17;
        int i18 = ~i12;
        int i19 = (i15 | i18) ^ i16;
        iArr[0] = i19;
        int i21 = i18 ^ i15;
        int i22 = (i17 & i21) ^ (i19 & i11);
        iArr[2] = i22;
        iArr[1] = (i11 ^ i16) ^ (i21 & i22);
    }

    protected final void sb5(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i11 ^ i12;
        int i17 = i11 ^ i14;
        int i18 = (i13 ^ i15) ^ (i16 | i17);
        iArr[0] = i18;
        int i19 = i14 & i18;
        int i21 = (i16 ^ i18) ^ i19;
        iArr[1] = i21;
        int i22 = i17 ^ (i18 | i15);
        iArr[2] = (i16 | i19) ^ i22;
        iArr[3] = (i22 & i21) ^ (i12 ^ i19);
    }

    protected final void sb6(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i11 ^ i14;
        int i17 = i12 ^ i16;
        int i18 = i13 ^ (i15 | i16);
        int i19 = i12 ^ i18;
        iArr[1] = i19;
        int i21 = (i16 | i19) ^ i14;
        int i22 = (i18 & i21) ^ i17;
        iArr[2] = i22;
        int i23 = i21 ^ i18;
        iArr[0] = i22 ^ i23;
        iArr[3] = (i23 & i17) ^ (~i18);
    }

    protected final void sb7(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = i12 ^ i13;
        int i16 = (i13 & i15) ^ i14;
        int i17 = i11 ^ i16;
        int i18 = i12 ^ ((i14 | i15) & i17);
        iArr[1] = i18;
        int i19 = (i11 & i17) ^ i15;
        iArr[3] = i19;
        int i21 = (i18 | i16) ^ i17;
        int i22 = i16 ^ (i19 & i21);
        iArr[2] = i22;
        iArr[0] = (i19 & i22) ^ (~i21);
    }
}
