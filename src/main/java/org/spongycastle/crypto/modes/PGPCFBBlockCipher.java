package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes10.dex */
public class PGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;
    private boolean inlineIv;
    private byte[] tmp;

    public PGPCFBBlockCipher(BlockCipher blockCipher, boolean z11) {
        this.cipher = blockCipher;
        this.inlineIv = z11;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
        this.tmp = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.blockSize;
        if (i11 + i13 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i13 + i12 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        int i14 = 0;
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        for (int i15 = 0; i15 < this.blockSize; i15++) {
            bArr2[i12 + i15] = encryptByte(bArr[i11 + i15], i15);
        }
        while (true) {
            int i16 = this.blockSize;
            if (i14 >= i16) {
                return i16;
            }
            this.FR[i14] = bArr[i11 + i14];
            i14++;
        }
    }

    private int decryptBlockWithIV(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14 = this.blockSize;
        if (i11 + i14 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i14 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        int i15 = this.count;
        if (i15 == 0) {
            for (int i16 = 0; i16 < this.blockSize; i16++) {
                this.FR[i16] = bArr[i11 + i16];
            }
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            this.count += this.blockSize;
            return 0;
        }
        if (i15 != i14) {
            if (i15 >= i14 + 2) {
                System.arraycopy(bArr, i11, this.tmp, 0, i14);
                bArr2[i12] = encryptByte(this.tmp[0], this.blockSize - 2);
                bArr2[i12 + 1] = encryptByte(this.tmp[1], this.blockSize - 1);
                System.arraycopy(this.tmp, 0, this.FR, this.blockSize - 2, 2);
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                int i17 = 0;
                while (true) {
                    i13 = this.blockSize;
                    if (i17 >= i13 - 2) {
                        break;
                    }
                    bArr2[i12 + i17 + 2] = encryptByte(this.tmp[i17 + 2], i17);
                    i17++;
                }
                System.arraycopy(this.tmp, 2, this.FR, 0, i13 - 2);
            }
            return this.blockSize;
        }
        System.arraycopy(bArr, i11, this.tmp, 0, i14);
        byte[] bArr3 = this.FR;
        System.arraycopy(bArr3, 2, bArr3, 0, this.blockSize - 2);
        byte[] bArr4 = this.FR;
        int i18 = this.blockSize;
        byte[] bArr5 = this.tmp;
        bArr4[i18 - 2] = bArr5[0];
        bArr4[i18 - 1] = bArr5[1];
        this.cipher.processBlock(bArr4, 0, this.FRE, 0);
        int i19 = 0;
        while (true) {
            int i21 = this.blockSize;
            if (i19 >= i21 - 2) {
                System.arraycopy(this.tmp, 2, this.FR, 0, i21 - 2);
                this.count += 2;
                return this.blockSize - 2;
            }
            bArr2[i12 + i19] = encryptByte(this.tmp[i19 + 2], i19);
            i19++;
        }
    }

    private int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.blockSize;
        if (i11 + i13 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i13 + i12 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        int i14 = 0;
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        for (int i15 = 0; i15 < this.blockSize; i15++) {
            bArr2[i12 + i15] = encryptByte(bArr[i11 + i15], i15);
        }
        while (true) {
            int i16 = this.blockSize;
            if (i14 >= i16) {
                return i16;
            }
            this.FR[i14] = bArr2[i12 + i14];
            i14++;
        }
    }

    private int encryptBlockWithIV(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14;
        int i15 = this.blockSize;
        if (i11 + i15 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        int i16 = this.count;
        if (i16 != 0) {
            if (i16 >= i15 + 2) {
                if (i15 + i12 > bArr2.length) {
                    throw new DataLengthException("output buffer too short");
                }
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                int i17 = 0;
                while (true) {
                    i13 = this.blockSize;
                    if (i17 >= i13) {
                        break;
                    }
                    bArr2[i12 + i17] = encryptByte(bArr[i11 + i17], i17);
                    i17++;
                }
                System.arraycopy(bArr2, i12, this.FR, 0, i13);
            }
            return this.blockSize;
        }
        if ((i15 * 2) + i12 + 2 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i18 = 0;
        while (true) {
            i14 = this.blockSize;
            if (i18 >= i14) {
                break;
            }
            bArr2[i12 + i18] = encryptByte(this.IV[i18], i18);
            i18++;
        }
        System.arraycopy(bArr2, i12, this.FR, 0, i14);
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i19 = this.blockSize;
        bArr2[i12 + i19] = encryptByte(this.IV[i19 - 2], 0);
        int i21 = this.blockSize;
        bArr2[i12 + i21 + 1] = encryptByte(this.IV[i21 - 1], 1);
        System.arraycopy(bArr2, i12 + 2, this.FR, 0, this.blockSize);
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i22 = 0;
        while (true) {
            int i23 = this.blockSize;
            if (i22 >= i23) {
                System.arraycopy(bArr2, i12 + i23 + 2, this.FR, 0, i23);
                int i24 = this.count;
                int i25 = this.blockSize;
                this.count = i24 + (i25 * 2) + 2;
                return (i25 * 2) + 2;
            }
            bArr2[i23 + i12 + 2 + i22] = encryptByte(bArr[i11 + i22], i22);
            i22++;
        }
    }

    private byte encryptByte(byte b11, int i11) {
        return (byte) (b11 ^ this.FRE[i11]);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        if (this.inlineIv) {
            return this.cipher.getAlgorithmName() + "/PGPCFBwithIV";
        }
        return this.cipher.getAlgorithmName() + "/PGPCFB";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            reset();
            this.cipher.init(true, cipherParameters);
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        int length = iv2.length;
        byte[] bArr = this.IV;
        if (length < bArr.length) {
            System.arraycopy(iv2, 0, bArr, bArr.length - iv2.length, iv2.length);
            int i11 = 0;
            while (true) {
                byte[] bArr2 = this.IV;
                if (i11 >= bArr2.length - iv2.length) {
                    break;
                }
                bArr2[i11] = 0;
                i11++;
            }
        } else {
            System.arraycopy(iv2, 0, bArr, 0, bArr.length);
        }
        reset();
        this.cipher.init(true, parametersWithIV.getParameters());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.inlineIv) {
            return this.forEncryption ? encryptBlockWithIV(bArr, i11, bArr2, i12) : decryptBlockWithIV(bArr, i11, bArr2, i12);
        }
        return this.forEncryption ? encryptBlock(bArr, i11, bArr2, i12) : decryptBlock(bArr, i11, bArr2, i12);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.FR;
            if (i11 == bArr.length) {
                this.cipher.reset();
                return;
            }
            if (this.inlineIv) {
                bArr[i11] = 0;
            } else {
                bArr[i11] = this.IV[i11];
            }
            i11++;
        }
    }
}
