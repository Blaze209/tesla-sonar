package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes10.dex */
public class IDEAEngine implements BlockCipher {
    private static final int BASE = 65537;
    protected static final int BLOCK_SIZE = 8;
    private static final int MASK = 65535;
    private int[] workingKey = null;

    private int bytesToWord(byte[] bArr, int i11) {
        return ((bArr[i11] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) + (bArr[i11 + 1] & 255);
    }

    private int[] expandKey(byte[] bArr) {
        int i11;
        int[] iArr = new int[52];
        int i12 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i12 >= 8) {
                break;
            }
            iArr[i12] = bytesToWord(bArr, i12 * 2);
            i12++;
        }
        for (i11 = 8; i11 < 52; i11++) {
            int i13 = i11 & 7;
            if (i13 < 6) {
                iArr[i11] = (((iArr[i11 - 7] & 127) << 9) | (iArr[i11 - 6] >> 7)) & 65535;
            } else if (i13 == 6) {
                iArr[i11] = (((iArr[i11 - 7] & 127) << 9) | (iArr[i11 - 14] >> 7)) & 65535;
            } else {
                iArr[i11] = (((iArr[i11 - 15] & 127) << 9) | (iArr[i11 - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    private int[] generateWorkingKey(boolean z11, byte[] bArr) {
        return z11 ? expandKey(bArr) : invertKey(expandKey(bArr));
    }

    private void ideaFunc(int[] iArr, byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iBytesToWord = bytesToWord(bArr, i11);
        int iBytesToWord2 = bytesToWord(bArr, i11 + 2);
        int iBytesToWord3 = bytesToWord(bArr, i11 + 4);
        int iBytesToWord4 = bytesToWord(bArr, i11 + 6);
        int i13 = 0;
        int i14 = iBytesToWord3;
        int i15 = iBytesToWord2;
        int i16 = iBytesToWord;
        int i17 = 0;
        while (i13 < 8) {
            int iMul = mul(i16, iArr[i17]);
            int i18 = (i15 + iArr[i17 + 1]) & 65535;
            int i19 = (i14 + iArr[i17 + 2]) & 65535;
            int iMul2 = mul(iBytesToWord4, iArr[i17 + 3]);
            int i21 = i17 + 5;
            int iMul3 = mul(i19 ^ iMul, iArr[i17 + 4]);
            i17 += 6;
            int iMul4 = mul(((i18 ^ iMul2) + iMul3) & 65535, iArr[i21]);
            int i22 = 65535 & (iMul3 + iMul4);
            i16 = iMul ^ iMul4;
            iBytesToWord4 = iMul2 ^ i22;
            int i23 = i19 ^ iMul4;
            i13++;
            i14 = i18 ^ i22;
            i15 = i23;
        }
        wordToBytes(mul(i16, iArr[i17]), bArr2, i12);
        wordToBytes(i14 + iArr[i17 + 1], bArr2, i12 + 2);
        wordToBytes(i15 + iArr[i17 + 2], bArr2, i12 + 4);
        wordToBytes(mul(iBytesToWord4, iArr[i17 + 3]), bArr2, i12 + 6);
    }

    private int[] invertKey(int[] iArr) {
        int[] iArr2 = new int[52];
        int iMulInv = mulInv(iArr[0]);
        int iAddInv = addInv(iArr[1]);
        int iAddInv2 = addInv(iArr[2]);
        iArr2[51] = mulInv(iArr[3]);
        iArr2[50] = iAddInv2;
        iArr2[49] = iAddInv;
        int i11 = 48;
        iArr2[48] = iMulInv;
        int i12 = 4;
        for (int i13 = 1; i13 < 8; i13++) {
            int i14 = iArr[i12];
            iArr2[i11 - 1] = iArr[i12 + 1];
            iArr2[i11 - 2] = i14;
            int iMulInv2 = mulInv(iArr[i12 + 2]);
            int iAddInv3 = addInv(iArr[i12 + 3]);
            int i15 = i12 + 5;
            int iAddInv4 = addInv(iArr[i12 + 4]);
            i12 += 6;
            iArr2[i11 - 3] = mulInv(iArr[i15]);
            iArr2[i11 - 4] = iAddInv3;
            iArr2[i11 - 5] = iAddInv4;
            i11 -= 6;
            iArr2[i11] = iMulInv2;
        }
        int i16 = iArr[i12];
        iArr2[i11 - 1] = iArr[i12 + 1];
        iArr2[i11 - 2] = i16;
        int iMulInv3 = mulInv(iArr[i12 + 2]);
        int iAddInv5 = addInv(iArr[i12 + 3]);
        int iAddInv6 = addInv(iArr[i12 + 4]);
        iArr2[i11 - 3] = mulInv(iArr[i12 + 5]);
        iArr2[i11 - 4] = iAddInv6;
        iArr2[i11 - 5] = iAddInv5;
        iArr2[i11 - 6] = iMulInv3;
        return iArr2;
    }

    private int mul(int i11, int i12) {
        int i13;
        if (i11 == 0) {
            i13 = BASE - i12;
        } else if (i12 == 0) {
            i13 = BASE - i11;
        } else {
            int i14 = i11 * i12;
            int i15 = i14 & 65535;
            int i16 = i14 >>> 16;
            i13 = (i15 - i16) + (i15 < i16 ? 1 : 0);
        }
        return i13 & 65535;
    }

    private int mulInv(int i11) {
        if (i11 < 2) {
            return i11;
        }
        int i12 = BASE / i11;
        int i13 = BASE % i11;
        int i14 = 1;
        while (i13 != 1) {
            int i15 = i11 / i13;
            i11 %= i13;
            i14 = (i14 + (i15 * i12)) & 65535;
            if (i11 == 1) {
                return i14;
            }
            int i16 = i13 / i11;
            i13 %= i11;
            i12 = (i12 + (i16 * i14)) & 65535;
        }
        return (1 - i12) & 65535;
    }

    private void wordToBytes(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >>> 8);
        bArr[i12 + 1] = (byte) i11;
    }

    int addInv(int i11) {
        return (0 - i11) & 65535;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.workingKey = generateWorkingKey(z11, ((KeyParameter) cipherParameters).getKey());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to IDEA init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i11 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        ideaFunc(iArr, bArr, i11, bArr2, i12);
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
