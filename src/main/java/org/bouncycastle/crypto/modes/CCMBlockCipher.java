package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class CCMBlockCipher implements CCMModeCipher {
    private int blockSize;
    private BlockCipher cipher;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private CipherParameters keyParam;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();

    private static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public CCMBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.macBlock = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    private int calculateMac(byte[] bArr, int i11, int i12, byte[] bArr2) {
        CBCBlockCipherMac cBCBlockCipherMac = new CBCBlockCipherMac(this.cipher, this.macSize * 8);
        cBCBlockCipherMac.init(this.keyParam);
        byte[] bArr3 = new byte[16];
        if (hasAssociatedText()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i13 = 2;
        byte macSize = (byte) (bArr3[0] | ((((cBCBlockCipherMac.getMacSize() - 2) / 2) & 7) << 3));
        bArr3[0] = macSize;
        byte[] bArr4 = this.nonce;
        bArr3[0] = (byte) (macSize | ((14 - bArr4.length) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i14 = i12;
        int i15 = 1;
        while (i14 > 0) {
            bArr3[16 - i15] = (byte) (i14 & 255);
            i14 >>>= 8;
            i15++;
        }
        cBCBlockCipherMac.update(bArr3, 0, 16);
        if (hasAssociatedText()) {
            int associatedTextLength = getAssociatedTextLength();
            if (associatedTextLength < 65280) {
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
            } else {
                cBCBlockCipherMac.update((byte) -1);
                cBCBlockCipherMac.update((byte) -2);
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 24));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 16));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
                i13 = 6;
            }
            byte[] bArr5 = this.initialAssociatedText;
            if (bArr5 != null) {
                cBCBlockCipherMac.update(bArr5, 0, bArr5.length);
            }
            if (this.associatedText.size() > 0) {
                cBCBlockCipherMac.update(this.associatedText.getBuffer(), 0, this.associatedText.size());
            }
            int i16 = (i13 + associatedTextLength) % 16;
            if (i16 != 0) {
                while (i16 != 16) {
                    cBCBlockCipherMac.update((byte) 0);
                    i16++;
                }
            }
        }
        cBCBlockCipherMac.update(bArr, i11, i12);
        return cBCBlockCipherMac.doFinal(bArr2, 0);
    }

    private int getAssociatedTextLength() {
        int size = this.associatedText.size();
        byte[] bArr = this.initialAssociatedText;
        return size + (bArr == null ? 0 : bArr.length);
    }

    private int getMacSize(boolean z11, int i11) {
        if (!z11 || (i11 >= 32 && i11 <= 128 && (i11 & 15) == 0)) {
            return i11 >>> 3;
        }
        throw new IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
    }

    private boolean hasAssociatedText() {
        return getAssociatedTextLength() > 0;
    }

    public static CCMModeCipher newInstance(BlockCipher blockCipher) {
        return new CCMBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException {
        int iProcessPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i11);
        reset();
        return iProcessPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i11 = this.macSize;
        byte[] bArr = new byte[i11];
        System.arraycopy(this.macBlock, 0, bArr, 0, i11);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        int size = i11 + this.data.size();
        if (this.forEncryption) {
            return size + this.macSize;
        }
        int i12 = this.macSize;
        if (size < i12) {
            return 0;
        }
        return size - i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        CipherParameters parameters;
        this.forEncryption = z11;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            this.nonce = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = getMacSize(z11, aEADParameters.getMacSize());
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to CCM: " + cipherParameters.getClass().getName());
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = getMacSize(z11, 64);
            parameters = parametersWithIV.getParameters();
        }
        if (parameters != null) {
            this.keyParam = parameters;
        }
        byte[] bArr = this.nonce;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b11) throws IOException {
        this.associatedText.write(b11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) throws IOException {
        this.associatedText.write(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b11, byte[] bArr, int i11) throws IOException {
        this.data.write(b11);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws IOException {
        if (bArr.length < i11 + i12) {
            throw new DataLengthException("Input buffer too short");
        }
        this.data.write(bArr, i11, i12);
        return 0;
    }

    public int processPacket(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws InvalidCipherTextException {
        int i14;
        if (this.keyParam == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.nonce;
        int length = bArr3.length;
        int i15 = 15 - length;
        if (i15 < 4) {
            if (i12 - (!this.forEncryption ? 16 : 0) >= (1 << (i15 * 8))) {
                throw new IllegalStateException("CCM packet too large for choice of q");
            }
        }
        byte[] bArr4 = new byte[this.blockSize];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(this.cipher);
        cTRModeCipherNewInstance.init(this.forEncryption, new ParametersWithIV(this.keyParam, bArr4));
        if (!this.forEncryption) {
            int i16 = this.macSize;
            if (i12 < i16) {
                throw new InvalidCipherTextException("data too short");
            }
            int i17 = i12 - i16;
            if (bArr2.length < i17 + i13) {
                throw new OutputLengthException("Output buffer too short.");
            }
            int i18 = i11 + i17;
            System.arraycopy(bArr, i18, this.macBlock, 0, i16);
            byte[] bArr5 = this.macBlock;
            cTRModeCipherNewInstance.processBlock(bArr5, 0, bArr5, 0);
            int i19 = this.macSize;
            while (true) {
                byte[] bArr6 = this.macBlock;
                if (i19 == bArr6.length) {
                    break;
                }
                bArr6[i19] = 0;
                i19++;
            }
            int i21 = i11;
            int i22 = i13;
            while (true) {
                i14 = this.blockSize;
                if (i21 >= i18 - i14) {
                    break;
                }
                cTRModeCipherNewInstance.processBlock(bArr, i21, bArr2, i22);
                int i23 = this.blockSize;
                i22 += i23;
                i21 += i23;
            }
            byte[] bArr7 = new byte[i14];
            int i24 = i17 - (i21 - i11);
            System.arraycopy(bArr, i21, bArr7, 0, i24);
            cTRModeCipherNewInstance.processBlock(bArr7, 0, bArr7, 0);
            System.arraycopy(bArr7, 0, bArr2, i22, i24);
            byte[] bArr8 = new byte[this.blockSize];
            calculateMac(bArr2, i13, i17, bArr8);
            if (Arrays.constantTimeAreEqual(this.macBlock, bArr8)) {
                return i17;
            }
            throw new InvalidCipherTextException("mac check in CCM failed");
        }
        int i25 = this.macSize + i12;
        if (bArr2.length < i25 + i13) {
            throw new OutputLengthException("Output buffer too short.");
        }
        calculateMac(bArr, i11, i12, this.macBlock);
        byte[] bArr9 = new byte[this.blockSize];
        cTRModeCipherNewInstance.processBlock(this.macBlock, 0, bArr9, 0);
        int i26 = i11;
        int i27 = i13;
        while (true) {
            int i28 = i11 + i12;
            int i29 = this.blockSize;
            if (i26 >= i28 - i29) {
                byte[] bArr10 = new byte[i29];
                int i31 = i28 - i26;
                System.arraycopy(bArr, i26, bArr10, 0, i31);
                cTRModeCipherNewInstance.processBlock(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i27, i31);
                System.arraycopy(bArr9, 0, bArr2, i13 + i12, this.macSize);
                return i25;
            }
            cTRModeCipherNewInstance.processBlock(bArr, i26, bArr2, i27);
            int i32 = this.blockSize;
            i27 += i32;
            i26 += i32;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        this.cipher.reset();
        this.associatedText.reset();
        this.data.reset();
    }

    public byte[] processPacket(byte[] bArr, int i11, int i12) throws InvalidCipherTextException {
        int i13;
        if (this.forEncryption) {
            i13 = this.macSize + i12;
        } else {
            int i14 = this.macSize;
            if (i12 < i14) {
                throw new InvalidCipherTextException("data too short");
            }
            i13 = i12 - i14;
        }
        byte[] bArr2 = new byte[i13];
        processPacket(bArr, i11, i12, bArr2, 0);
        return bArr2;
    }
}
