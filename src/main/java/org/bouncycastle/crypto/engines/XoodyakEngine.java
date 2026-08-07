package org.bouncycastle.crypto.engines;

import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class XoodyakEngine implements AEADCipher {
    private byte[] K;
    private int Rabsorb;
    private boolean aadFinished;
    private boolean encrypted;
    private boolean forEncryption;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f98707iv;
    private MODE mode;
    private int phase;
    private byte[] state;
    private byte[] tag;
    private final int f_bPrime = 48;
    private final int Rkout = 24;
    private final int PhaseDown = 1;
    private final int PhaseUp = 2;
    private final int NLANES = 12;
    private final int NROWS = 3;
    private final int NCOLUMS = 4;
    private final int MAXROUNDS = 12;
    private final int TAGLEN = 16;
    final int Rkin = 44;
    private final int[] RC = {88, 56, 960, EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, 20, 96, 44, 896, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 416, 18};
    private boolean initialised = false;
    private final ByteArrayOutputStream aadData = new ByteArrayOutputStream();
    private final ByteArrayOutputStream message = new ByteArrayOutputStream();

    enum MODE {
        ModeHash,
        ModeKeyed
    }

    private void AbsorbAny(byte[] bArr, int i11, int i12, int i13, int i14) {
        while (true) {
            if (this.phase != 2) {
                Up(null, 0, 0);
            }
            int iMin = Math.min(i12, i13);
            Down(bArr, i11, iMin, i14);
            i11 += iMin;
            i12 -= iMin;
            if (i12 == 0) {
                return;
            } else {
                i14 = 0;
            }
        }
    }

    private int ROTL32(int i11, int i12) {
        return (i11 >>> ((32 - i12) & 31)) ^ (i11 << (i12 & 31));
    }

    private void Up(byte[] bArr, int i11, int i12) {
        int i13;
        if (this.mode != MODE.ModeHash) {
            byte[] bArr2 = this.state;
            bArr2[47] = (byte) (bArr2[47] ^ i12);
        }
        int i14 = 12;
        int[] iArr = new int[12];
        Pack.littleEndianToInt(this.state, 0, iArr, 0, 12);
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        for (int i15 = 0; i15 < i14; i15++) {
            for (int i16 = 0; i16 < 4; i16++) {
                iArr3[i16] = (iArr[index(i16, 1)] ^ iArr[index(i16, 0)]) ^ iArr[index(i16, 2)];
            }
            int i17 = 0;
            while (true) {
                i13 = 3;
                if (i17 >= 4) {
                    break;
                }
                int i18 = iArr3[3 & (i17 + 3)];
                iArr4[i17] = ROTL32(i18, 14) ^ ROTL32(i18, 5);
                i17++;
            }
            for (int i19 = 0; i19 < 4; i19++) {
                for (int i21 = 0; i21 < 3; i21++) {
                    int iIndex = index(i19, i21);
                    iArr[iIndex] = iArr[iIndex] ^ iArr4[i19];
                }
            }
            for (int i22 = 0; i22 < 4; i22++) {
                iArr2[index(i22, 0)] = iArr[index(i22, 0)];
                iArr2[index(i22, 1)] = iArr[index(i22 + 3, 1)];
                iArr2[index(i22, 2)] = ROTL32(iArr[index(i22, 2)], 11);
            }
            iArr2[0] = iArr2[0] ^ this.RC[i15];
            int i23 = 0;
            while (i23 < 4) {
                int i24 = 0;
                while (i24 < i13) {
                    int i25 = i24 + 1;
                    iArr[index(i23, i24)] = ((~iArr2[index(i23, i25)]) & iArr2[index(i23, i24 + 2)]) ^ iArr2[index(i23, i24)];
                    i24 = i25;
                    i13 = 3;
                }
                i23++;
                i13 = 3;
            }
            for (int i26 = 0; i26 < 4; i26++) {
                iArr2[index(i26, 0)] = iArr[index(i26, 0)];
                iArr2[index(i26, 1)] = ROTL32(iArr[index(i26, 1)], 1);
                iArr2[index(i26, 2)] = ROTL32(iArr[index(i26 + 2, 2)], 8);
            }
            i14 = 12;
            System.arraycopy(iArr2, 0, iArr, 0, 12);
        }
        Pack.intToLittleEndian(iArr, 0, i14, this.state, 0);
        this.phase = 2;
        if (bArr != null) {
            System.arraycopy(this.state, 0, bArr, 0, i11);
        }
    }

    private int encrypt(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        byte[] bArr3 = new byte[24];
        int i14 = this.encrypted ? 0 : 128;
        int i15 = i12;
        while (true) {
            if (i15 == 0 && this.encrypted) {
                return i12;
            }
            int iMin = Math.min(i15, 24);
            if (this.forEncryption) {
                System.arraycopy(bArr, i11, bArr3, 0, iMin);
            }
            Up(null, 0, i14);
            int i16 = 0;
            while (i16 < iMin) {
                bArr2[i13 + i16] = (byte) (bArr[i11] ^ this.state[i16]);
                i16++;
                i11++;
            }
            if (this.forEncryption) {
                Down(bArr3, 0, iMin, 0);
            } else {
                Down(bArr2, i13, iMin, 0);
            }
            i13 += iMin;
            i15 -= iMin;
            this.encrypted = true;
            i14 = 0;
        }
    }

    private int index(int i11, int i12) {
        return ((i12 % 3) * 4) + (i11 % 4);
    }

    private void processAAD() {
        if (this.aadFinished) {
            return;
        }
        byte[] byteArray = this.aadData.toByteArray();
        AbsorbAny(byteArray, 0, byteArray.length, this.Rabsorb, 3);
        this.aadFinished = true;
    }

    void Down(byte[] bArr, int i11, int i12, int i13) {
        int i14 = 0;
        while (i14 < i12) {
            byte[] bArr2 = this.state;
            bArr2[i14] = (byte) (bArr[i11] ^ bArr2[i14]);
            i14++;
            i11++;
        }
        byte[] bArr3 = this.state;
        bArr3[i12] = (byte) (bArr3[i12] ^ 1);
        byte b11 = bArr3[47];
        if (this.mode == MODE.ModeHash) {
            i13 &= 1;
        }
        bArr3[47] = (byte) (b11 ^ i13);
        this.phase = 1;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) {
        int i12;
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        byte[] byteArray = this.message.toByteArray();
        int size = this.message.size();
        boolean z11 = this.forEncryption;
        if ((z11 && size + 16 + i11 > bArr.length) || (!z11 && (size - 16) + i11 > bArr.length)) {
            throw new OutputLengthException("output buffer too short");
        }
        processAAD();
        if (this.forEncryption) {
            encrypt(byteArray, 0, size, bArr, i11);
            byte[] bArr2 = new byte[16];
            this.tag = bArr2;
            Up(bArr2, 16, 64);
            System.arraycopy(this.tag, 0, bArr, i11 + size, 16);
            i12 = size + 16;
        } else {
            i12 = size - 16;
            encrypt(byteArray, 0, i12, bArr, i11);
            byte[] bArr3 = new byte[16];
            this.tag = bArr3;
            Up(bArr3, 16, 64);
            int i13 = i12;
            int i14 = 0;
            while (i14 < 16) {
                int i15 = i13 + 1;
                if (this.tag[i14] != byteArray[i13]) {
                    throw new IllegalArgumentException("Mac does not match");
                }
                i14++;
                i13 = i15;
            }
        }
        reset(false);
        return i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "Xoodyak AEAD";
    }

    public int getBlockSize() {
        return 24;
    }

    public int getIVBytesSize() {
        return 16;
    }

    public int getKeyBytesSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.tag;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        return i11 + 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Xoodyak init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        this.f98707iv = iv2;
        if (iv2 == null || iv2.length != 16) {
            throw new IllegalArgumentException("Xoodyak requires exactly 16 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Xoodyak init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        this.K = key;
        if (key.length != 16) {
            throw new IllegalArgumentException("Xoodyak key must be 128 bits long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z11)));
        this.state = new byte[48];
        this.tag = new byte[16];
        this.initialised = true;
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b11) {
        if (!this.aadFinished) {
            this.aadData.write(b11);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AAD cannot be added after reading a full block(");
        sb2.append(getBlockSize());
        sb2.append(" bytes) of input for ");
        sb2.append(this.forEncryption ? "encryption" : "decryption");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        if (!this.aadFinished) {
            if (i11 + i12 > bArr.length) {
                throw new DataLengthException("input buffer too short");
            }
            this.aadData.write(bArr, i11, i12);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AAD cannot be added after reading a full block(");
            sb2.append(getBlockSize());
            sb2.append(" bytes) of input for ");
            sb2.append(this.forEncryption ? "encryption" : "decryption");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        return processBytes(new byte[]{b11}, 0, 1, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        if (this.mode != MODE.ModeKeyed) {
            throw new IllegalArgumentException("Xoodyak has not been initialised");
        }
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.message.write(bArr, i11, i12);
        int size = this.message.size() - (this.forEncryption ? 0 : 16);
        if (size < getBlockSize()) {
            return 0;
        }
        byte[] byteArray = this.message.toByteArray();
        int blockSize = (size / getBlockSize()) * getBlockSize();
        if (blockSize + i13 > bArr2.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        processAAD();
        encrypt(byteArray, 0, blockSize, bArr2, i13);
        this.message.reset();
        this.message.write(byteArray, blockSize, byteArray.length - blockSize);
        return blockSize;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        reset(true);
    }

    private void reset(boolean z11) {
        if (z11) {
            this.tag = null;
        }
        Arrays.fill(this.state, (byte) 0);
        this.aadFinished = false;
        this.encrypted = false;
        this.phase = 2;
        this.message.reset();
        this.aadData.reset();
        byte[] bArr = this.K;
        int length = bArr.length;
        int length2 = this.f98707iv.length;
        byte[] bArr2 = new byte[44];
        this.mode = MODE.ModeKeyed;
        this.Rabsorb = 44;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(this.f98707iv, 0, bArr2, length, length2);
        int i11 = length + length2;
        bArr2[i11] = (byte) length2;
        AbsorbAny(bArr2, 0, i11 + 1, this.Rabsorb, 2);
    }
}
