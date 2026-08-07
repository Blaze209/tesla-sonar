package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.gcm.BasicGCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.modes.gcm.GCMUtil;
import org.bouncycastle.crypto.modes.gcm.Tables4kGCMMultiplier;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class GCMBlockCipher implements GCMModeCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] H;
    private byte[] J0;
    private byte[] S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private int blocksRemaining;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private GCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private boolean initialised;
    private byte[] lastKey;
    private byte[] macBlock;
    private int macSize;
    private GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;

    public GCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, null);
    }

    private void checkStatus() {
        if (this.initialised) {
            return;
        }
        if (!this.forEncryption) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    private void decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (bArr2.length - i12 < 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.totalLength == 0) {
            initCipher();
        }
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        gHASHBlock(this.S, bArr, i11);
        GCMUtil.xor(bArr3, 0, bArr, i11, bArr2, i12);
        this.totalLength += 16;
    }

    private void encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (bArr2.length - i12 < 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.totalLength == 0) {
            initCipher();
        }
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        GCMUtil.xor(bArr3, bArr, i11);
        gHASHBlock(this.S, bArr3);
        System.arraycopy(bArr3, 0, bArr2, i12, 16);
        this.totalLength += 16;
    }

    private void gHASH(byte[] bArr, byte[] bArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 16) {
            gHASHPartial(bArr, bArr2, i12, Math.min(i11 - i12, 16));
        }
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2) {
        GCMUtil.xor(bArr, bArr2);
        this.multiplier.multiplyH(bArr);
    }

    private void gHASHPartial(byte[] bArr, byte[] bArr2, int i11, int i12) {
        GCMUtil.xor(bArr, bArr2, i11, i12);
        this.multiplier.multiplyH(bArr);
    }

    private void getNextCTRBlock(byte[] bArr) {
        int i11 = this.blocksRemaining;
        if (i11 == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.blocksRemaining = i11 - 1;
        byte[] bArr2 = this.counter;
        int i12 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i12;
        int i13 = (i12 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i13;
        int i14 = (i13 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i14;
        bArr2[12] = (byte) ((i14 >>> 8) + (bArr2[12] & 255));
        this.cipher.processBlock(bArr2, 0, bArr, 0);
    }

    private void initCipher() {
        if (this.atLength > 0) {
            System.arraycopy(this.S_at, 0, this.S_atPre, 0, 16);
            this.atLengthPre = this.atLength;
        }
        int i11 = this.atBlockPos;
        if (i11 > 0) {
            gHASHPartial(this.S_atPre, this.atBlock, 0, i11);
            this.atLengthPre += (long) this.atBlockPos;
        }
        if (this.atLengthPre > 0) {
            System.arraycopy(this.S_atPre, 0, this.S, 0, 16);
        }
    }

    public static GCMModeCipher newInstance(BlockCipher blockCipher) {
        return new GCMBlockCipher(blockCipher);
    }

    private void processPartial(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        if (this.forEncryption) {
            GCMUtil.xor(bArr, i11, bArr3, 0, i12);
            gHASHPartial(this.S, bArr, i11, i12);
        } else {
            gHASHPartial(this.S, bArr, i11, i12);
            GCMUtil.xor(bArr, i11, bArr3, 0, i12);
        }
        System.arraycopy(bArr, i11, bArr2, i13, i12);
        this.totalLength += (long) i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException {
        GCMBlockCipher gCMBlockCipher;
        byte[] bArr2;
        int i12;
        checkStatus();
        if (this.totalLength == 0) {
            initCipher();
        }
        int i13 = this.bufOff;
        if (!this.forEncryption) {
            int i14 = this.macSize;
            if (i13 < i14) {
                throw new InvalidCipherTextException("data too short");
            }
            i13 -= i14;
            if (bArr.length - i11 < i13) {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (bArr.length - i11 < this.macSize + i13) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i15 = i13;
        if (i15 > 0) {
            gCMBlockCipher = this;
            bArr2 = bArr;
            i12 = i11;
            gCMBlockCipher.processPartial(this.bufBlock, 0, i15, bArr2, i12);
        } else {
            gCMBlockCipher = this;
            bArr2 = bArr;
            i12 = i11;
        }
        long j11 = gCMBlockCipher.atLength;
        int i16 = gCMBlockCipher.atBlockPos;
        long j12 = j11 + ((long) i16);
        gCMBlockCipher.atLength = j12;
        if (j12 > gCMBlockCipher.atLengthPre) {
            if (i16 > 0) {
                gHASHPartial(gCMBlockCipher.S_at, gCMBlockCipher.atBlock, 0, i16);
            }
            if (gCMBlockCipher.atLengthPre > 0) {
                GCMUtil.xor(gCMBlockCipher.S_at, gCMBlockCipher.S_atPre);
            }
            long j13 = ((gCMBlockCipher.totalLength * 8) + 127) >>> 7;
            byte[] bArr3 = new byte[16];
            if (gCMBlockCipher.exp == null) {
                BasicGCMExponentiator basicGCMExponentiator = new BasicGCMExponentiator();
                gCMBlockCipher.exp = basicGCMExponentiator;
                basicGCMExponentiator.init(gCMBlockCipher.H);
            }
            gCMBlockCipher.exp.exponentiateX(j13, bArr3);
            GCMUtil.multiply(gCMBlockCipher.S_at, bArr3);
            GCMUtil.xor(gCMBlockCipher.S, gCMBlockCipher.S_at);
        }
        byte[] bArr4 = new byte[16];
        Pack.longToBigEndian(gCMBlockCipher.atLength * 8, bArr4, 0);
        Pack.longToBigEndian(gCMBlockCipher.totalLength * 8, bArr4, 8);
        gHASHBlock(gCMBlockCipher.S, bArr4);
        byte[] bArr5 = new byte[16];
        gCMBlockCipher.cipher.processBlock(gCMBlockCipher.J0, 0, bArr5, 0);
        GCMUtil.xor(bArr5, gCMBlockCipher.S);
        int i17 = gCMBlockCipher.macSize;
        byte[] bArr6 = new byte[i17];
        gCMBlockCipher.macBlock = bArr6;
        System.arraycopy(bArr5, 0, bArr6, 0, i17);
        if (gCMBlockCipher.forEncryption) {
            System.arraycopy(gCMBlockCipher.macBlock, 0, bArr2, gCMBlockCipher.bufOff + i12, gCMBlockCipher.macSize);
            i15 += gCMBlockCipher.macSize;
        } else {
            int i18 = gCMBlockCipher.macSize;
            byte[] bArr7 = new byte[i18];
            System.arraycopy(gCMBlockCipher.bufBlock, i15, bArr7, 0, i18);
            if (!Arrays.constantTimeAreEqual(gCMBlockCipher.macBlock, bArr7)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        reset(false);
        return i15;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.macSize] : Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        int i12 = i11 + this.bufOff;
        if (this.forEncryption) {
            return i12 + this.macSize;
        }
        int i13 = this.macSize;
        if (i12 < i13) {
            return 0;
        }
        return i12 - i13;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        int i12 = i11 + this.bufOff;
        if (!this.forEncryption) {
            int i13 = this.macSize;
            if (i12 < i13) {
                return 0;
            }
            i12 -= i13;
        }
        return i12 - (i12 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        byte[] iv2;
        KeyParameter key;
        byte[] bArr;
        this.forEncryption = z11;
        this.macBlock = null;
        this.initialised = true;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv2 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 32 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
            this.macSize = macSize / 8;
            key = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv2 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.bufBlock = new byte[z11 ? 16 : this.macSize + 16];
        if (iv2 == null || iv2.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z11 && (bArr = this.nonce) != null && Arrays.areEqual(bArr, iv2)) {
            if (key == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.lastKey;
            if (bArr2 != null && Arrays.areEqual(bArr2, key.getKey())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.nonce = iv2;
        if (key != null) {
            this.lastKey = key.getKey();
        }
        if (key != null) {
            this.cipher.init(true, key);
            byte[] bArr3 = new byte[16];
            this.H = bArr3;
            this.cipher.processBlock(bArr3, 0, bArr3, 0);
            this.multiplier.init(this.H);
            this.exp = null;
        } else if (this.H == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.J0 = bArr4;
        byte[] bArr5 = this.nonce;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.J0[15] = 1;
        } else {
            gHASH(bArr4, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            Pack.longToBigEndian(((long) this.nonce.length) * 8, bArr6, 8);
            gHASHBlock(this.J0, bArr6);
        }
        this.S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr7 = this.initialAssociatedText;
        if (bArr7 != null) {
            processAADBytes(bArr7, 0, bArr7.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b11) {
        checkStatus();
        byte[] bArr = this.atBlock;
        int i11 = this.atBlockPos;
        bArr[i11] = b11;
        int i12 = i11 + 1;
        this.atBlockPos = i12;
        if (i12 == 16) {
            gHASHBlock(this.S_at, bArr);
            this.atBlockPos = 0;
            this.atLength += 16;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        checkStatus();
        int i13 = this.atBlockPos;
        if (i13 > 0) {
            int i14 = 16 - i13;
            if (i12 < i14) {
                System.arraycopy(bArr, i11, this.atBlock, i13, i12);
                this.atBlockPos += i12;
                return;
            } else {
                System.arraycopy(bArr, i11, this.atBlock, i13, i14);
                gHASHBlock(this.S_at, this.atBlock);
                this.atLength += 16;
                i11 += i14;
                i12 -= i14;
            }
        }
        int i15 = i12 + i11;
        int i16 = i15 - 16;
        while (i11 <= i16) {
            gHASHBlock(this.S_at, bArr, i11);
            this.atLength += 16;
            i11 += 16;
        }
        int i17 = i15 - i11;
        this.atBlockPos = i17;
        System.arraycopy(bArr, i11, this.atBlock, 0, i17);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        checkStatus();
        byte[] bArr2 = this.bufBlock;
        int i12 = this.bufOff;
        bArr2[i12] = b11;
        int i13 = i12 + 1;
        this.bufOff = i13;
        if (i13 != bArr2.length) {
            return 0;
        }
        if (this.forEncryption) {
            encryptBlock(bArr2, 0, bArr, i11);
            this.bufOff = 0;
        } else {
            decryptBlock(bArr2, 0, bArr, i11);
            byte[] bArr3 = this.bufBlock;
            System.arraycopy(bArr3, 16, bArr3, 0, this.macSize);
            this.bufOff = this.macSize;
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        checkStatus();
        if (bArr.length - i11 < i12) {
            throw new DataLengthException("Input buffer too short");
        }
        int i15 = 16;
        if (this.forEncryption) {
            int i16 = this.bufOff;
            if (i16 > 0) {
                int i17 = 16 - i16;
                if (i12 < i17) {
                    System.arraycopy(bArr, i11, this.bufBlock, i16, i12);
                } else {
                    System.arraycopy(bArr, i11, this.bufBlock, i16, i17);
                    encryptBlock(this.bufBlock, 0, bArr2, i13);
                    i11 += i17;
                    i12 -= i17;
                }
            } else {
                i15 = 0;
            }
            int i18 = i12 + i11;
            int i19 = i18 - 16;
            while (i11 <= i19) {
                encryptBlock(bArr, i11, bArr2, i13 + i15);
                i11 += 16;
                i15 += 16;
            }
            int i21 = i18 - i11;
            this.bufOff = i21;
            System.arraycopy(bArr, i11, this.bufBlock, 0, i21);
            return i15;
        }
        byte[] bArr3 = this.bufBlock;
        int length = bArr3.length;
        int i22 = this.bufOff;
        int i23 = length - i22;
        if (i12 >= i23) {
            if (i22 >= 16) {
                decryptBlock(bArr3, 0, bArr2, i13);
                byte[] bArr4 = this.bufBlock;
                int i24 = this.bufOff - 16;
                this.bufOff = i24;
                System.arraycopy(bArr4, 16, bArr4, 0, i24);
                if (i12 < i23 + 16) {
                    System.arraycopy(bArr, i11, this.bufBlock, this.bufOff, i12);
                    this.bufOff += i12;
                    return 16;
                }
                i14 = 16;
            } else {
                i14 = 0;
            }
            byte[] bArr5 = this.bufBlock;
            int length2 = (i12 + i11) - bArr5.length;
            int i25 = this.bufOff;
            int i26 = 16 - i25;
            System.arraycopy(bArr, i11, bArr5, i25, i26);
            decryptBlock(this.bufBlock, 0, bArr2, i13 + i14);
            int i27 = i11 + i26;
            int i28 = i14 + 16;
            while (i27 <= length2) {
                decryptBlock(bArr, i27, bArr2, i13 + i28);
                i27 += 16;
                i28 += 16;
            }
            byte[] bArr6 = this.bufBlock;
            int length3 = (bArr6.length + length2) - i27;
            this.bufOff = length3;
            System.arraycopy(bArr, i27, bArr6, 0, length3);
            return i28;
        }
        System.arraycopy(bArr, i11, bArr3, i22, i12);
        this.bufOff += i12;
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    public GCMBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        gCMMultiplier = gCMMultiplier == null ? new Tables4kGCMMultiplier() : gCMMultiplier;
        this.cipher = blockCipher;
        this.multiplier = gCMMultiplier;
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2, int i11) {
        GCMUtil.xor(bArr, bArr2, i11);
        this.multiplier.multiplyH(bArr);
    }

    public static GCMModeCipher newInstance(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        return new GCMBlockCipher(blockCipher, gCMMultiplier);
    }

    private void reset(boolean z11) {
        this.cipher.reset();
        this.S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr = this.bufBlock;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z11) {
            this.macBlock = null;
        }
        if (this.forEncryption) {
            this.initialised = false;
            return;
        }
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }
}
