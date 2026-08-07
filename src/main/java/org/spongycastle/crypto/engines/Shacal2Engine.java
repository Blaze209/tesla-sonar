package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes10.dex */
public class Shacal2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 32;
    private static final int[] K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private static final int ROUNDS = 64;
    private boolean forEncryption = false;
    private int[] workingKey = null;

    private void byteBlockToInts(byte[] bArr, int[] iArr, int i11, int i12) {
        while (i12 < 8) {
            int i13 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24);
            int i14 = i11 + 3;
            int i15 = ((bArr[i11 + 2] & 255) << 8) | i13;
            i11 += 4;
            iArr[i12] = i15 | (bArr[i14] & 255);
            i12++;
        }
    }

    private void bytes2ints(byte[] bArr, int[] iArr, int i11, int i12) {
        while (i12 < bArr.length / 4) {
            int i13 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24);
            int i14 = i11 + 3;
            int i15 = i13 | ((bArr[i11 + 2] & 255) << 8);
            i11 += 4;
            iArr[i12] = i15 | (bArr[i14] & 255);
            i12++;
        }
    }

    private void decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr = new int[8];
        byteBlockToInts(bArr, iArr, i11, 0);
        for (int i13 = 63; i13 > -1; i13--) {
            int i14 = iArr[0];
            int i15 = iArr[1];
            int i16 = iArr[2];
            int i17 = iArr[3];
            int i18 = (i14 - ((((i15 >>> 2) | (i15 << (-2))) ^ ((i15 >>> 13) | (i15 << (-13)))) ^ ((i15 >>> 22) | (i15 << (-22))))) - (((i15 & i16) ^ (i15 & i17)) ^ (i16 & i17));
            iArr[0] = i15;
            iArr[1] = i16;
            iArr[2] = i17;
            iArr[3] = iArr[4] - i18;
            int i19 = iArr[5];
            iArr[4] = i19;
            int i21 = iArr[6];
            iArr[5] = i21;
            int i22 = iArr[7];
            iArr[6] = i22;
            iArr[7] = (((i18 - K[i13]) - this.workingKey[i13]) - ((((i19 >>> 6) | (i19 << (-6))) ^ ((i19 >>> 11) | (i19 << (-11)))) ^ ((i19 >>> 25) | (i19 << (-25))))) - ((i19 & i21) ^ ((~i19) & i22));
        }
        ints2bytes(iArr, bArr2, i12);
    }

    private void encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr = new int[8];
        byteBlockToInts(bArr, iArr, i11, 0);
        for (int i13 = 0; i13 < 64; i13++) {
            int i14 = iArr[4];
            int i15 = iArr[5];
            int i16 = ~i14;
            int i17 = iArr[6];
            int i18 = ((((i14 >>> 6) | (i14 << (-6))) ^ ((i14 >>> 11) | (i14 << (-11)))) ^ ((i14 >>> 25) | (i14 << (-25)))) + ((i14 & i15) ^ (i16 & i17)) + iArr[7] + K[i13] + this.workingKey[i13];
            iArr[7] = i17;
            iArr[6] = i15;
            iArr[5] = i14;
            iArr[4] = iArr[3] + i18;
            int i19 = iArr[2];
            iArr[3] = i19;
            int i21 = iArr[1];
            iArr[2] = i21;
            int i22 = iArr[0];
            iArr[1] = i22;
            iArr[0] = i18 + ((((i22 >>> 2) | (i22 << (-2))) ^ ((i22 >>> 13) | (i22 << (-13)))) ^ ((i22 >>> 22) | (i22 << (-22)))) + (((i22 & i19) ^ (i22 & i21)) ^ (i21 & i19));
        }
        ints2bytes(iArr, bArr2, i12);
    }

    private void ints2bytes(int[] iArr, byte[] bArr, int i11) {
        for (int i12 : iArr) {
            bArr[i11] = (byte) (i12 >>> 24);
            bArr[i11 + 1] = (byte) (i12 >>> 16);
            int i13 = i11 + 3;
            bArr[i11 + 2] = (byte) (i12 >>> 8);
            i11 += 4;
            bArr[i13] = (byte) i12;
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Shacal2";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 32;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        }
        this.forEncryption = z11;
        this.workingKey = new int[64];
        setKey(((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.workingKey == null) {
            throw new IllegalStateException("Shacal2 not initialised");
        }
        if (i11 + 32 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + 32 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i11, bArr2, i12);
            return 32;
        }
        decryptBlock(bArr, i11, bArr2, i12);
        return 32;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    public void setKey(byte[] bArr) {
        if (bArr.length != 0 && bArr.length <= 64) {
            if (bArr.length >= 16 && bArr.length % 8 == 0) {
                bytes2ints(bArr, this.workingKey, 0, 0);
                for (int i11 = 16; i11 < 64; i11++) {
                    int[] iArr = this.workingKey;
                    int i12 = iArr[i11 - 2];
                    int i13 = ((i12 >>> 10) ^ (((i12 >>> 17) | (i12 << (-17))) ^ ((i12 >>> 19) | (i12 << (-19))))) + iArr[i11 - 7];
                    int i14 = iArr[i11 - 15];
                    iArr[i11] = i13 + ((i14 >>> 3) ^ (((i14 >>> 7) | (i14 << (-7))) ^ ((i14 >>> 18) | (i14 << (-18))))) + iArr[i11 - 16];
                }
                return;
            }
        }
        throw new IllegalArgumentException("Shacal2-key must be 16 - 64 bytes and multiple of 8");
    }
}
