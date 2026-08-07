package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes9.dex */
public class KCCMBlockCipher implements AEADBlockCipher {
    private static final int BITS_IN_BYTE = 8;
    private static final int BYTES_IN_INT = 4;
    private static final int MAX_MAC_BIT_LENGTH = 512;
    private static final int MIN_MAC_BIT_LENGTH = 64;
    private byte[] G1;
    private int Nb_;
    private ExposedByteArrayOutputStream associatedText;
    private byte[] buffer;
    private byte[] counter;
    private ExposedByteArrayOutputStream data;
    private BlockCipher engine;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f98761s;

    private static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, 4);
    }

    private void CalculateMac(byte[] bArr, int i11, int i12) {
        while (i12 > 0) {
            for (int i13 = 0; i13 < this.engine.getBlockSize(); i13++) {
                byte[] bArr2 = this.macBlock;
                bArr2[i13] = (byte) (bArr2[i13] ^ bArr[i11 + i13]);
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr3 = this.macBlock;
            blockCipher.processBlock(bArr3, 0, bArr3, 0);
            i12 -= this.engine.getBlockSize();
            i11 += this.engine.getBlockSize();
        }
    }

    private void ProcessBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14 = 0;
        while (true) {
            byte[] bArr3 = this.counter;
            if (i14 >= bArr3.length) {
                break;
            }
            byte[] bArr4 = this.f98761s;
            bArr4[i14] = (byte) (bArr4[i14] + bArr3[i14]);
            i14++;
        }
        this.engine.processBlock(this.f98761s, 0, this.buffer, 0);
        for (int i15 = 0; i15 < this.engine.getBlockSize(); i15++) {
            bArr2[i13 + i15] = (byte) (this.buffer[i15] ^ bArr[i11 + i15]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048 A[LOOP:0: B:24:0x0041->B:26:0x0048, LOOP_END] */
    private byte getFlag(boolean z11, int i11) {
        String str;
        String binaryString;
        StringBuffer stringBuffer = new StringBuffer();
        if (z11) {
            stringBuffer.append("1");
        } else {
            stringBuffer.append(WebrtcBuildVersion.maint_version);
        }
        if (i11 == 8) {
            str = "010";
        } else if (i11 == 16) {
            str = "011";
        } else if (i11 == 32) {
            str = "100";
        } else {
            if (i11 != 48) {
                if (i11 == 64) {
                    str = "110";
                }
                binaryString = Integer.toBinaryString(this.Nb_ - 1);
                while (binaryString.length() < 4) {
                    binaryString = new StringBuffer(binaryString).insert(0, WebrtcBuildVersion.maint_version).toString();
                }
                stringBuffer.append(binaryString);
                return (byte) Integer.parseInt(stringBuffer.toString(), 2);
            }
            str = "101";
        }
        stringBuffer.append(str);
        binaryString = Integer.toBinaryString(this.Nb_ - 1);
        while (binaryString.length() < 4) {
            binaryString = new StringBuffer(binaryString).insert(0, WebrtcBuildVersion.maint_version).toString();
        }
        stringBuffer.append(binaryString);
        return (byte) Integer.parseInt(stringBuffer.toString(), 2);
    }

    private void intToBytes(int i11, byte[] bArr, int i12) {
        bArr[i12 + 3] = (byte) (i11 >> 24);
        bArr[i12 + 2] = (byte) (i11 >> 16);
        bArr[i12 + 1] = (byte) (i11 >> 8);
        bArr[i12] = (byte) i11;
    }

    private void processAAD(byte[] bArr, int i11, int i12, int i13) {
        if (i12 - i11 < this.engine.getBlockSize()) {
            throw new IllegalArgumentException("authText buffer too short");
        }
        if (i12 % this.engine.getBlockSize() != 0) {
            throw new IllegalArgumentException("padding not supported");
        }
        byte[] bArr2 = this.nonce;
        System.arraycopy(bArr2, 0, this.G1, 0, (bArr2.length - this.Nb_) - 1);
        intToBytes(i13, this.buffer, 0);
        System.arraycopy(this.buffer, 0, this.G1, (this.nonce.length - this.Nb_) - 1, 4);
        byte[] bArr3 = this.G1;
        bArr3[bArr3.length - 1] = getFlag(true, this.macSize);
        this.engine.processBlock(this.G1, 0, this.macBlock, 0);
        intToBytes(i12, this.buffer, 0);
        if (i12 <= this.engine.getBlockSize() - this.Nb_) {
            for (int i14 = 0; i14 < i12; i14++) {
                byte[] bArr4 = this.buffer;
                int i15 = this.Nb_ + i14;
                bArr4[i15] = (byte) (bArr4[i15] ^ bArr[i11 + i14]);
            }
            for (int i16 = 0; i16 < this.engine.getBlockSize(); i16++) {
                byte[] bArr5 = this.macBlock;
                bArr5[i16] = (byte) (bArr5[i16] ^ this.buffer[i16]);
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr6 = this.macBlock;
            blockCipher.processBlock(bArr6, 0, bArr6, 0);
            return;
        }
        for (int i17 = 0; i17 < this.engine.getBlockSize(); i17++) {
            byte[] bArr7 = this.macBlock;
            bArr7[i17] = (byte) (bArr7[i17] ^ this.buffer[i17]);
        }
        BlockCipher blockCipher2 = this.engine;
        byte[] bArr8 = this.macBlock;
        blockCipher2.processBlock(bArr8, 0, bArr8, 0);
        while (i12 != 0) {
            for (int i18 = 0; i18 < this.engine.getBlockSize(); i18++) {
                byte[] bArr9 = this.macBlock;
                bArr9[i18] = (byte) (bArr9[i18] ^ bArr[i18 + i11]);
            }
            BlockCipher blockCipher3 = this.engine;
            byte[] bArr10 = this.macBlock;
            blockCipher3.processBlock(bArr10, 0, bArr10, 0);
            i11 += this.engine.getBlockSize();
            i12 -= this.engine.getBlockSize();
        }
    }

    private void setNb(int i11) {
        if (i11 != 4 && i11 != 6 && i11 != 8) {
            throw new IllegalArgumentException("Nb = 4 is recommended by DSTU7624 but can be changed to only 6 or 8 in this implementation");
        }
        this.Nb_ = i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IOException {
        int iProcessPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i11);
        reset();
        return iProcessPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + "/KCCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        return i11 + this.macSize;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IOException {
        CipherParameters parameters;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            if (aEADParameters.getMacSize() > 512 || aEADParameters.getMacSize() < 64 || aEADParameters.getMacSize() % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.nonce = aEADParameters.getNonce();
            this.macSize = aEADParameters.getMacSize() / 8;
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Invalid parameters specified");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.macSize = this.engine.getBlockSize();
            this.initialAssociatedText = null;
            parameters = parametersWithIV.getParameters();
        }
        this.mac = new byte[this.macSize];
        this.forEncryption = z11;
        this.engine.init(true, parameters);
        this.counter[0] = 1;
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
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
            throw new DataLengthException("input buffer too short");
        }
        this.data.write(bArr, i11, i12);
        return 0;
    }

    public int processPacket(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws InvalidCipherTextException, IOException {
        int i14;
        if (bArr.length - i11 < i12) {
            throw new DataLengthException("input buffer too short");
        }
        if (bArr2.length - i13 < i12) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.associatedText.size() > 0) {
            if (this.forEncryption) {
                processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size());
            } else {
                processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size() - this.macSize);
            }
        }
        if (!this.forEncryption) {
            if ((i12 - this.macSize) % this.engine.getBlockSize() != 0) {
                throw new DataLengthException("partial blocks not supported");
            }
            this.engine.processBlock(this.nonce, 0, this.f98761s, 0);
            int blockSize = i12 / this.engine.getBlockSize();
            int blockSize2 = i11;
            int blockSize3 = i13;
            for (int i15 = 0; i15 < blockSize; i15++) {
                ProcessBlock(bArr, blockSize2, i12, bArr2, blockSize3);
                blockSize2 += this.engine.getBlockSize();
                blockSize3 += this.engine.getBlockSize();
            }
            if (i12 > blockSize2) {
                int i16 = 0;
                while (true) {
                    byte[] bArr3 = this.counter;
                    if (i16 >= bArr3.length) {
                        break;
                    }
                    byte[] bArr4 = this.f98761s;
                    bArr4[i16] = (byte) (bArr4[i16] + bArr3[i16]);
                    i16++;
                }
                this.engine.processBlock(this.f98761s, 0, this.buffer, 0);
                int i17 = 0;
                while (true) {
                    i14 = this.macSize;
                    if (i17 >= i14) {
                        break;
                    }
                    bArr2[blockSize3 + i17] = (byte) (this.buffer[i17] ^ bArr[blockSize2 + i17]);
                    i17++;
                }
                blockSize3 += i14;
            }
            int i18 = 0;
            while (true) {
                byte[] bArr5 = this.counter;
                if (i18 >= bArr5.length) {
                    break;
                }
                byte[] bArr6 = this.f98761s;
                bArr6[i18] = (byte) (bArr6[i18] + bArr5[i18]);
                i18++;
            }
            this.engine.processBlock(this.f98761s, 0, this.buffer, 0);
            int i19 = this.macSize;
            System.arraycopy(bArr2, blockSize3 - i19, this.buffer, 0, i19);
            CalculateMac(bArr2, 0, blockSize3 - this.macSize);
            System.arraycopy(this.macBlock, 0, this.mac, 0, this.macSize);
            int i21 = this.macSize;
            byte[] bArr7 = new byte[i21];
            System.arraycopy(this.buffer, 0, bArr7, 0, i21);
            if (!Arrays.constantTimeAreEqual(this.mac, bArr7)) {
                throw new InvalidCipherTextException("mac check failed");
            }
            reset();
            return i12 - this.macSize;
        }
        if (i12 % this.engine.getBlockSize() != 0) {
            throw new DataLengthException("partial blocks not supported");
        }
        CalculateMac(bArr, i11, i12);
        this.engine.processBlock(this.nonce, 0, this.f98761s, 0);
        int blockSize4 = i11;
        int blockSize5 = i12;
        int blockSize6 = i13;
        while (blockSize5 > 0) {
            ProcessBlock(bArr, blockSize4, i12, bArr2, blockSize6);
            blockSize5 -= this.engine.getBlockSize();
            blockSize4 += this.engine.getBlockSize();
            blockSize6 += this.engine.getBlockSize();
        }
        int i22 = 0;
        while (true) {
            byte[] bArr8 = this.counter;
            if (i22 >= bArr8.length) {
                break;
            }
            byte[] bArr9 = this.f98761s;
            bArr9[i22] = (byte) (bArr9[i22] + bArr8[i22]);
            i22++;
        }
        this.engine.processBlock(this.f98761s, 0, this.buffer, 0);
        int i23 = 0;
        while (true) {
            int i24 = this.macSize;
            if (i23 >= i24) {
                System.arraycopy(this.macBlock, 0, this.mac, 0, i24);
                reset();
                return this.macSize + i12;
            }
            bArr2[blockSize6 + i23] = (byte) (this.buffer[i23] ^ this.macBlock[i23]);
            i23++;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IOException {
        Arrays.fill(this.G1, (byte) 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.counter, (byte) 0);
        Arrays.fill(this.macBlock, (byte) 0);
        this.counter[0] = 1;
        this.data.reset();
        this.associatedText.reset();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher, int i11) {
        this.associatedText = new ExposedByteArrayOutputStream();
        this.data = new ExposedByteArrayOutputStream();
        this.Nb_ = 4;
        this.engine = blockCipher;
        this.macSize = blockCipher.getBlockSize();
        this.nonce = new byte[blockCipher.getBlockSize()];
        this.initialAssociatedText = new byte[blockCipher.getBlockSize()];
        this.mac = new byte[blockCipher.getBlockSize()];
        this.macBlock = new byte[blockCipher.getBlockSize()];
        this.G1 = new byte[blockCipher.getBlockSize()];
        this.buffer = new byte[blockCipher.getBlockSize()];
        this.f98761s = new byte[blockCipher.getBlockSize()];
        this.counter = new byte[blockCipher.getBlockSize()];
        setNb(i11);
    }
}
