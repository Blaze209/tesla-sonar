package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: loaded from: classes9.dex */
public class OpenPGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;

    public OpenPGPCFBBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14 = this.blockSize;
        if (i11 + i14 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i14 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i15 = this.count;
        int i16 = 2;
        int i17 = 0;
        if (i15 > i14) {
            byte b11 = bArr[i11];
            this.FR[i14 - 2] = b11;
            bArr2[i12] = encryptByte(b11, i14 - 2);
            byte b12 = bArr[i11 + 1];
            byte[] bArr3 = this.FR;
            int i18 = this.blockSize;
            bArr3[i18 - 1] = b12;
            bArr2[i12 + 1] = encryptByte(b12, i18 - 1);
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i16 < this.blockSize) {
                byte b13 = bArr[i11 + i16];
                int i19 = i16 - 2;
                this.FR[i19] = b13;
                bArr2[i12 + i16] = encryptByte(b13, i19);
                i16++;
            }
        } else {
            if (i15 != 0) {
                if (i15 == i14) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    byte b14 = bArr[i11];
                    byte b15 = bArr[i11 + 1];
                    bArr2[i12] = encryptByte(b14, 0);
                    bArr2[i12 + 1] = encryptByte(b15, 1);
                    byte[] bArr4 = this.FR;
                    System.arraycopy(bArr4, 2, bArr4, 0, this.blockSize - 2);
                    byte[] bArr5 = this.FR;
                    int i21 = this.blockSize;
                    bArr5[i21 - 2] = b14;
                    bArr5[i21 - 1] = b15;
                    this.cipher.processBlock(bArr5, 0, this.FRE, 0);
                    while (true) {
                        i13 = this.blockSize;
                        if (i16 >= i13) {
                            break;
                        }
                        byte b16 = bArr[i11 + i16];
                        int i22 = i16 - 2;
                        this.FR[i22] = b16;
                        bArr2[i12 + i16] = encryptByte(b16, i22);
                        i16++;
                    }
                }
            } else {
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                while (true) {
                    i13 = this.blockSize;
                    if (i17 >= i13) {
                        break;
                    }
                    int i23 = i11 + i17;
                    this.FR[i17] = bArr[i23];
                    bArr2[i12 + i17] = encryptByte(bArr[i23], i17);
                    i17++;
                }
            }
            this.count += i13;
        }
        return this.blockSize;
    }

    private int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14 = this.blockSize;
        if (i11 + i14 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i14 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i15 = this.count;
        int i16 = 2;
        int i17 = 0;
        if (i15 > i14) {
            byte[] bArr3 = this.FR;
            int i18 = i14 - 2;
            byte bEncryptByte = encryptByte(bArr[i11], i14 - 2);
            bArr2[i12] = bEncryptByte;
            bArr3[i18] = bEncryptByte;
            byte[] bArr4 = this.FR;
            int i19 = this.blockSize;
            int i21 = i19 - 1;
            byte bEncryptByte2 = encryptByte(bArr[i11 + 1], i19 - 1);
            bArr2[i12 + 1] = bEncryptByte2;
            bArr4[i21] = bEncryptByte2;
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i16 < this.blockSize) {
                byte[] bArr5 = this.FR;
                int i22 = i16 - 2;
                byte bEncryptByte3 = encryptByte(bArr[i11 + i16], i22);
                bArr2[i12 + i16] = bEncryptByte3;
                bArr5[i22] = bEncryptByte3;
                i16++;
            }
        } else {
            if (i15 != 0) {
                if (i15 == i14) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    bArr2[i12] = encryptByte(bArr[i11], 0);
                    bArr2[i12 + 1] = encryptByte(bArr[i11 + 1], 1);
                    byte[] bArr6 = this.FR;
                    System.arraycopy(bArr6, 2, bArr6, 0, this.blockSize - 2);
                    System.arraycopy(bArr2, i12, this.FR, this.blockSize - 2, 2);
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    while (true) {
                        i13 = this.blockSize;
                        if (i16 >= i13) {
                            break;
                        }
                        byte[] bArr7 = this.FR;
                        int i23 = i16 - 2;
                        byte bEncryptByte4 = encryptByte(bArr[i11 + i16], i23);
                        bArr2[i12 + i16] = bEncryptByte4;
                        bArr7[i23] = bEncryptByte4;
                        i16++;
                    }
                }
            } else {
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                while (true) {
                    i13 = this.blockSize;
                    if (i17 >= i13) {
                        break;
                    }
                    byte[] bArr8 = this.FR;
                    byte bEncryptByte5 = encryptByte(bArr[i11 + i17], i17);
                    bArr2[i12 + i17] = bEncryptByte5;
                    bArr8[i17] = bEncryptByte5;
                    i17++;
                }
            }
            this.count += i13;
        }
        return this.blockSize;
    }

    private byte encryptByte(byte b11, int i11) {
        return (byte) (b11 ^ this.FRE[i11]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        reset();
        this.cipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        return this.forEncryption ? encryptBlock(bArr, i11, bArr2, i12) : decryptBlock(bArr, i11, bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        byte[] bArr = this.IV;
        byte[] bArr2 = this.FR;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.cipher.reset();
    }
}
