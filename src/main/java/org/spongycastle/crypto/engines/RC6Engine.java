package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes10.dex */
public class RC6Engine implements BlockCipher {
    private static final int LGW = 5;
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private static final int _noRounds = 20;
    private static final int bytesPerWord = 4;
    private static final int wordSize = 32;
    private int[] _S = null;
    private boolean forEncryption;

    private int bytesToWord(byte[] bArr, int i11) {
        int i12 = 0;
        for (int i13 = 3; i13 >= 0; i13--) {
            i12 = (i12 << 8) + (bArr[i13 + i11] & 255);
        }
        return i12;
    }

    private int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iBytesToWord = bytesToWord(bArr, i11);
        int iBytesToWord2 = bytesToWord(bArr, i11 + 4);
        int iBytesToWord3 = bytesToWord(bArr, i11 + 8);
        int iBytesToWord4 = bytesToWord(bArr, i11 + 12);
        int[] iArr = this._S;
        int i13 = iBytesToWord3 - iArr[43];
        int iRotateRight = iBytesToWord - iArr[42];
        int i14 = 20;
        while (i14 >= 1) {
            int iRotateLeft = rotateLeft(((iRotateRight * 2) + 1) * iRotateRight, 5);
            int iRotateLeft2 = rotateLeft(((i13 * 2) + 1) * i13, 5);
            int i15 = i14 * 2;
            int iRotateRight2 = rotateRight(iBytesToWord2 - this._S[i15 + 1], iRotateLeft) ^ iRotateLeft2;
            i14--;
            int i16 = iRotateRight;
            iRotateRight = rotateRight(iBytesToWord4 - this._S[i15], iRotateLeft2) ^ iRotateLeft;
            iBytesToWord4 = i13;
            i13 = iRotateRight2;
            iBytesToWord2 = i16;
        }
        int[] iArr2 = this._S;
        int i17 = iBytesToWord4 - iArr2[1];
        int i18 = iBytesToWord2 - iArr2[0];
        wordToBytes(iRotateRight, bArr2, i12);
        wordToBytes(i18, bArr2, i12 + 4);
        wordToBytes(i13, bArr2, i12 + 8);
        wordToBytes(i17, bArr2, i12 + 12);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iBytesToWord = bytesToWord(bArr, i11);
        int iBytesToWord2 = bytesToWord(bArr, i11 + 4);
        int iBytesToWord3 = bytesToWord(bArr, i11 + 8);
        int iBytesToWord4 = bytesToWord(bArr, i11 + 12);
        int[] iArr = this._S;
        int i13 = iBytesToWord2 + iArr[0];
        int i14 = iBytesToWord4 + iArr[1];
        int i15 = 1;
        while (i15 <= 20) {
            int iRotateLeft = rotateLeft(((i13 * 2) + 1) * i13, 5);
            int iRotateLeft2 = rotateLeft(((i14 * 2) + 1) * i14, 5);
            int i16 = i15 * 2;
            int iRotateLeft3 = rotateLeft(iBytesToWord ^ iRotateLeft, iRotateLeft2) + this._S[i16];
            int iRotateLeft4 = rotateLeft(iBytesToWord3 ^ iRotateLeft2, iRotateLeft) + this._S[i16 + 1];
            i15++;
            iBytesToWord3 = i14;
            i14 = iRotateLeft3;
            iBytesToWord = i13;
            i13 = iRotateLeft4;
        }
        int[] iArr2 = this._S;
        int i17 = iBytesToWord + iArr2[42];
        int i18 = iBytesToWord3 + iArr2[43];
        wordToBytes(i17, bArr2, i12);
        wordToBytes(i13, bArr2, i12 + 4);
        wordToBytes(i18, bArr2, i12 + 8);
        wordToBytes(i14, bArr2, i12 + 12);
        return 16;
    }

    private int rotateLeft(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    private int rotateRight(int i11, int i12) {
        return (i11 << (-i12)) | (i11 >>> i12);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = bArr.length;
        int length2 = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i11 = length3 / 4;
            iArr2[i11] = (iArr2[i11] << 8) + (bArr[length3] & 255);
        }
        int[] iArr3 = new int[44];
        this._S = iArr3;
        iArr3[0] = P32;
        int i12 = 1;
        while (true) {
            iArr = this._S;
            if (i12 >= iArr.length) {
                break;
            }
            iArr[i12] = iArr[i12 - 1] + Q32;
            i12++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int length5 = 0;
        int iRotateLeft = 0;
        int iRotateLeft2 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length4; i14++) {
            int[] iArr4 = this._S;
            iRotateLeft = rotateLeft(iArr4[length5] + iRotateLeft + iRotateLeft2, 3);
            iArr4[length5] = iRotateLeft;
            iRotateLeft2 = rotateLeft(iArr2[i13] + iRotateLeft + iRotateLeft2, iRotateLeft2 + iRotateLeft);
            iArr2[i13] = iRotateLeft2;
            length5 = (length5 + 1) % this._S.length;
            i13 = (i13 + 1) % length2;
        }
    }

    private void wordToBytes(int i11, byte[] bArr, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            bArr[i13 + i12] = (byte) i11;
            i11 >>>= 8;
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC6";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.forEncryption = z11;
            setKey(((KeyParameter) cipherParameters).getKey());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC6 init - " + cipherParameters.getClass().getName());
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int blockSize = getBlockSize();
        if (this._S == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i11 + blockSize > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + i12 <= bArr2.length) {
            return this.forEncryption ? encryptBlock(bArr, i11, bArr2, i12) : decryptBlock(bArr, i11, bArr2, i12);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
