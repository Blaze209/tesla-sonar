package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC5Parameters;

/* JADX INFO: loaded from: classes9.dex */
public class RC532Engine implements BlockCipher {
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private boolean forEncryption;
    private int _noRounds = 12;
    private int[] _S = null;

    private int bytesToWord(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    private int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iBytesToWord = bytesToWord(bArr, i11);
        int iBytesToWord2 = bytesToWord(bArr, i11 + 4);
        for (int i13 = this._noRounds; i13 >= 1; i13--) {
            int i14 = i13 * 2;
            iBytesToWord2 = rotateRight(iBytesToWord2 - this._S[i14 + 1], iBytesToWord) ^ iBytesToWord;
            iBytesToWord = rotateRight(iBytesToWord - this._S[i14], iBytesToWord2) ^ iBytesToWord2;
        }
        wordToBytes(iBytesToWord - this._S[0], bArr2, i12);
        wordToBytes(iBytesToWord2 - this._S[1], bArr2, i12 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iBytesToWord = bytesToWord(bArr, i11) + this._S[0];
        int iBytesToWord2 = bytesToWord(bArr, i11 + 4) + this._S[1];
        for (int i13 = 1; i13 <= this._noRounds; i13++) {
            int i14 = i13 * 2;
            iBytesToWord = rotateLeft(iBytesToWord ^ iBytesToWord2, iBytesToWord2) + this._S[i14];
            iBytesToWord2 = rotateLeft(iBytesToWord2 ^ iBytesToWord, iBytesToWord) + this._S[i14 + 1];
        }
        wordToBytes(iBytesToWord, bArr2, i12);
        wordToBytes(iBytesToWord2, bArr2, i12 + 4);
        return 8;
    }

    private int rotateLeft(int i11, int i12) {
        int i13 = i12 & 31;
        return (i11 >>> (32 - i13)) | (i11 << i13);
    }

    private int rotateRight(int i11, int i12) {
        int i13 = i12 & 31;
        return (i11 << (32 - i13)) | (i11 >>> i13);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 != bArr.length; i11++) {
            int i12 = i11 / 4;
            iArr2[i12] = iArr2[i12] + ((bArr[i11] & 255) << ((i11 % 4) * 8));
        }
        int[] iArr3 = new int[(this._noRounds + 1) * 2];
        this._S = iArr3;
        iArr3[0] = P32;
        int i13 = 1;
        while (true) {
            iArr = this._S;
            if (i13 >= iArr.length) {
                break;
            }
            iArr[i13] = iArr[i13 - 1] + Q32;
            i13++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int length3 = 0;
        int iRotateLeft = 0;
        int iRotateLeft2 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length2; i15++) {
            int[] iArr4 = this._S;
            iRotateLeft = rotateLeft(iArr4[length3] + iRotateLeft + iRotateLeft2, 3);
            iArr4[length3] = iRotateLeft;
            iRotateLeft2 = rotateLeft(iArr2[i14] + iRotateLeft + iRotateLeft2, iRotateLeft2 + iRotateLeft);
            iArr2[i14] = iRotateLeft2;
            length3 = (length3 + 1) % this._S.length;
            i14 = (i14 + 1) % length;
        }
    }

    private void wordToBytes(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >> 8);
        bArr[i12 + 2] = (byte) (i11 >> 16);
        bArr[i12 + 3] = (byte) (i11 >> 24);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-32";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        byte[] key;
        if (cipherParameters instanceof RC5Parameters) {
            RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
            this._noRounds = rC5Parameters.getRounds();
            key = rC5Parameters.getKey();
            setKey(key);
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException("invalid parameter passed to RC532 init - " + cipherParameters.getClass().getName());
            }
            key = ((KeyParameter) cipherParameters).getKey();
            setKey(key);
        }
        this.forEncryption = z11;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z11)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        return this.forEncryption ? encryptBlock(bArr, i11, bArr2, i12) : decryptBlock(bArr, i11, bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
