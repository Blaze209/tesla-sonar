package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultMultiBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class CBCBlockCipher extends DefaultMultiBlockCipher implements CBCModeCipher {
    private byte[] IV;
    private int blockSize;
    private byte[] cbcNextV;
    private byte[] cbcV;
    private BlockCipher cipher;
    private boolean encrypting;

    public CBCBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.cbcV = new byte[blockSize];
        this.cbcNextV = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.blockSize;
        if (i11 + i13 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        System.arraycopy(bArr, i11, this.cbcNextV, 0, i13);
        int iProcessBlock = this.cipher.processBlock(bArr, i11, bArr2, i12);
        for (int i14 = 0; i14 < this.blockSize; i14++) {
            int i15 = i12 + i14;
            bArr2[i15] = (byte) (bArr2[i15] ^ this.cbcV[i14]);
        }
        byte[] bArr3 = this.cbcV;
        this.cbcV = this.cbcNextV;
        this.cbcNextV = bArr3;
        return iProcessBlock;
    }

    private int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.blockSize + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i13 = 0; i13 < this.blockSize; i13++) {
            byte[] bArr3 = this.cbcV;
            bArr3[i13] = (byte) (bArr3[i13] ^ bArr[i11 + i13]);
        }
        int iProcessBlock = this.cipher.processBlock(this.cbcV, 0, bArr2, i12);
        byte[] bArr4 = this.cbcV;
        System.arraycopy(bArr2, i12, bArr4, 0, bArr4.length);
        return iProcessBlock;
    }

    public static CBCModeCipher newInstance(BlockCipher blockCipher) {
        return new CBCBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CBC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.modes.CBCModeCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        boolean z12 = this.encrypting;
        this.encrypting = z11;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            if (iv2.length != this.blockSize) {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            System.arraycopy(iv2, 0, this.IV, 0, iv2.length);
            cipherParameters = parametersWithIV.getParameters();
        } else {
            Arrays.fill(this.IV, (byte) 0);
        }
        reset();
        if (cipherParameters != null) {
            this.cipher.init(z11, cipherParameters);
        } else if (z12 != z11) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        return this.encrypting ? encryptBlock(bArr, i11, bArr2, i12) : decryptBlock(bArr, i11, bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cbcV, 0, bArr.length);
        Arrays.fill(this.cbcNextV, (byte) 0);
        this.cipher.reset();
    }
}
