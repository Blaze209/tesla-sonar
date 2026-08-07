package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes9.dex */
public class PhotonBeetleDigest implements Digest {
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private final int INITIAL_RATE_INBYTES = 16;
    private int RATE_INBYTES = 4;
    private int SQUEEZE_RATE_INBYTES = 16;
    private int STATE_INBYTES = 32;
    private int TAG_INBYTES = 32;
    private int LAST_THREE_BITS_OFFSET = 5;
    private int ROUND = 12;
    private int D = 8;
    private int Dq = 3;
    private int Dr = 7;
    private int DSquare = 64;
    private int S = 4;
    private int S_1 = 3;
    private byte[][] RC = {new byte[]{1, 3, 7, 14, 13, 11, 6, 12, 9, 2, 5, 10}, new byte[]{0, 2, 6, 15, 12, 10, 7, 13, 8, 3, 4, 11}, new byte[]{2, 0, 4, 13, 14, 8, 5, 15, 10, 1, 6, 9}, new byte[]{6, 4, 0, 9, 10, 12, 1, 11, 14, 5, 2, 13}, new byte[]{14, 12, 8, 1, 2, 4, 9, 3, 6, 13, 10, 5}, new byte[]{15, 13, 9, 0, 3, 5, 8, 2, 7, 12, 11, 4}, new byte[]{13, 15, 11, 2, 1, 7, 10, 0, 5, 14, 9, 6}, new byte[]{9, 11, 15, 6, 5, 3, 14, 4, 1, 10, 13, 2}};
    private byte[][] MixColMatrix = {new byte[]{2, 4, 2, 11, 2, 8, 5, 6}, new byte[]{12, 9, 8, 13, 7, 7, 5, 2}, new byte[]{4, 4, 13, 13, 9, 4, 13, 9}, new byte[]{1, 6, 5, 1, 12, 13, 15, 14}, new byte[]{15, 12, 9, 13, 14, 5, 14, 13}, new byte[]{9, 14, 5, 15, 4, 12, 9, 6}, new byte[]{12, 2, 2, 10, 3, 1, 1, 14}, new byte[]{15, 1, 13, 10, 5, 10, 2, 3}};
    private byte[] sbox = {12, 5, 6, 11, 9, 0, 10, 13, 3, 14, 15, 8, 4, 7, 1, 2};
    private byte[] state = new byte[32];
    private byte[][] state_2d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 8, 8);

    void PHOTON_Permutation() {
        for (int i11 = 0; i11 < this.DSquare; i11++) {
            this.state_2d[i11 >>> this.Dq][this.Dr & i11] = (byte) (((this.state[i11 >> 1] & 255) >>> ((i11 & 1) * 4)) & 15);
        }
        for (int i12 = 0; i12 < this.ROUND; i12++) {
            for (int i13 = 0; i13 < this.D; i13++) {
                byte[] bArr = this.state_2d[i13];
                bArr[0] = (byte) (bArr[0] ^ this.RC[i13][i12]);
            }
            for (int i14 = 0; i14 < this.D; i14++) {
                for (int i15 = 0; i15 < this.D; i15++) {
                    byte[] bArr2 = this.state_2d[i14];
                    bArr2[i15] = this.sbox[bArr2[i15]];
                }
            }
            int i16 = 1;
            while (true) {
                int i17 = this.D;
                if (i16 >= i17) {
                    break;
                }
                System.arraycopy(this.state_2d[i16], 0, this.state, 0, i17);
                System.arraycopy(this.state, i16, this.state_2d[i16], 0, this.D - i16);
                System.arraycopy(this.state, 0, this.state_2d[i16], this.D - i16, i16);
                i16++;
            }
            for (int i18 = 0; i18 < this.D; i18++) {
                for (int i19 = 0; i19 < this.D; i19++) {
                    byte b11 = 0;
                    for (int i21 = 0; i21 < this.D; i21++) {
                        int i22 = this.MixColMatrix[i19][i21];
                        byte b12 = this.state_2d[i21][i18];
                        int i23 = 0;
                        for (int i24 = 0; i24 < this.S; i24++) {
                            if (((b12 >>> i24) & 1) != 0) {
                                i23 ^= i22;
                            }
                            int i25 = (i22 >>> this.S_1) & 1;
                            i22 <<= 1;
                            if (i25 != 0) {
                                i22 ^= 3;
                            }
                        }
                        b11 = (byte) (b11 ^ (i23 & 15));
                    }
                    this.state[i19] = b11;
                }
                for (int i26 = 0; i26 < this.D; i26++) {
                    this.state_2d[i26][i18] = this.state[i26];
                }
            }
        }
        for (int i27 = 0; i27 < this.DSquare; i27 += 2) {
            byte[][] bArr3 = this.state_2d;
            int i28 = this.Dq;
            byte[] bArr4 = bArr3[i27 >>> i28];
            int i29 = this.Dr;
            this.state[i27 >>> 1] = (byte) (((bArr3[i27 >>> i28][(i27 + 1) & i29] & 15) << 4) | (bArr4[i27 & i29] & 15));
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        if (i11 + 32 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        byte[] byteArray = this.buffer.toByteArray();
        int length = byteArray.length;
        if (length == 0) {
            byte[] bArr2 = this.state;
            int i12 = this.STATE_INBYTES - 1;
            bArr2[i12] = (byte) ((1 << this.LAST_THREE_BITS_OFFSET) ^ bArr2[i12]);
        } else {
            byte[] bArr3 = this.state;
            if (length <= 16) {
                System.arraycopy(byteArray, 0, bArr3, 0, length);
                if (length < 16) {
                    byte[] bArr4 = this.state;
                    bArr4[length] = (byte) (bArr4[length] ^ 1);
                }
                byte[] bArr5 = this.state;
                int i13 = this.STATE_INBYTES - 1;
                bArr5[i13] = (byte) (((length >= 16 ? 2 : 1) << this.LAST_THREE_BITS_OFFSET) ^ bArr5[i13]);
            } else {
                System.arraycopy(byteArray, 0, bArr3, 0, 16);
                int i14 = length - 16;
                int i15 = this.RATE_INBYTES;
                int i16 = ((i14 + i15) - 1) / i15;
                int i17 = 0;
                while (true) {
                    int i18 = i16 - 1;
                    PHOTON_Permutation();
                    if (i17 >= i18) {
                        break;
                    }
                    int i19 = this.RATE_INBYTES;
                    Bytes.xorTo(i19, byteArray, (i17 * i19) + 16, this.state, 0);
                    i17++;
                }
                int i21 = this.RATE_INBYTES;
                int i22 = i14 - (i17 * i21);
                Bytes.xorTo(i22, byteArray, (i17 * i21) + 16, this.state, 0);
                int i23 = this.RATE_INBYTES;
                if (i22 < i23) {
                    byte[] bArr6 = this.state;
                    bArr6[i22] = (byte) (bArr6[i22] ^ 1);
                }
                byte[] bArr7 = this.state;
                int i24 = this.STATE_INBYTES - 1;
                bArr7[i24] = (byte) (((i14 % i23 != 0 ? 2 : 1) << this.LAST_THREE_BITS_OFFSET) ^ bArr7[i24]);
            }
        }
        PHOTON_Permutation();
        System.arraycopy(this.state, 0, bArr, i11, this.SQUEEZE_RATE_INBYTES);
        PHOTON_Permutation();
        byte[] bArr8 = this.state;
        int i25 = this.SQUEEZE_RATE_INBYTES;
        System.arraycopy(bArr8, 0, bArr, i11 + i25, this.TAG_INBYTES - i25);
        return this.TAG_INBYTES;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Photon-Beetle Hash";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.TAG_INBYTES;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.buffer.reset();
        Arrays.fill(this.state, (byte) 0);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b11) {
        this.buffer.write(b11);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.buffer.write(bArr, i11, i12);
    }
}
