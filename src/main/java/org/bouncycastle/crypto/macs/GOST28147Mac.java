package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Pack;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes9.dex */
public class GOST28147Mac implements Mac {
    private static final int BLOCK_SIZE = 8;
    private static final int MAC_SIZE = 4;
    private byte[] S;
    private byte[] buf;
    private int bufOff;
    private boolean firstStep;
    private byte[] mac;
    private byte[] macIV;
    private final CryptoServicePurpose purpose;
    private int[] workingKey;

    public GOST28147Mac() {
        this(CryptoServicePurpose.AUTHENTICATION);
    }

    private static void CM5func(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3) {
        for (int i12 = 0; i12 < 8; i12++) {
            bArr3[i12] = (byte) (bArr[i11 + i12] ^ bArr2[i12]);
        }
    }

    private int[] generateWorkingKey(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i11 = 0; i11 != 8; i11++) {
            iArr[i11] = Pack.littleEndianToInt(bArr, i11 * 4);
        }
        return iArr;
    }

    private void gost28147MacFunc(int[] iArr, byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i11);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i11 + 4);
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = 0;
            while (i14 < 8) {
                int iGost28147_mainStep = iLittleEndianToInt2 ^ gost28147_mainStep(iLittleEndianToInt, iArr[i14]);
                i14++;
                int i15 = iLittleEndianToInt;
                iLittleEndianToInt = iGost28147_mainStep;
                iLittleEndianToInt2 = i15;
            }
        }
        Pack.intToLittleEndian(iLittleEndianToInt, bArr2, i12);
        Pack.intToLittleEndian(iLittleEndianToInt2, bArr2, i12 + 4);
    }

    private int gost28147_mainStep(int i11, int i12) {
        int i13 = i12 + i11;
        byte[] bArr = this.S;
        int i14 = bArr[i13 & 15] + (bArr[((i13 >> 4) & 15) + 16] << 4) + (bArr[((i13 >> 8) & 15) + 32] << 8) + (bArr[((i13 >> 12) & 15) + 48] << 12) + (bArr[((i13 >> 16) & 15) + 64] << Tnaf.POW_2_WIDTH) + (bArr[((i13 >> 20) & 15) + 80] << 20) + (bArr[((i13 >> 24) & 15) + 96] << 24) + (bArr[((i13 >> 28) & 15) + 112] << 28);
        return (i14 << 11) | (i14 >>> 21);
    }

    private void recursiveInit(CipherParameters cipherParameters) {
        CipherParameters parameters;
        if (cipherParameters == null) {
            return;
        }
        if (cipherParameters instanceof ParametersWithSBox) {
            ParametersWithSBox parametersWithSBox = (ParametersWithSBox) cipherParameters;
            System.arraycopy(parametersWithSBox.getSBox(), 0, this.S, 0, parametersWithSBox.getSBox().length);
            parameters = parametersWithSBox.getParameters();
        } else if (cipherParameters instanceof KeyParameter) {
            this.workingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey());
            parameters = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + cipherParameters.getClass().getName());
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            byte[] bArr = this.mac;
            System.arraycopy(iv2, 0, bArr, 0, bArr.length);
            this.macIV = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        }
        recursiveInit(parameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) {
        while (true) {
            int i12 = this.bufOff;
            if (i12 >= 8) {
                break;
            }
            this.buf[i12] = 0;
            this.bufOff = i12 + 1;
        }
        byte[] bArr2 = this.buf;
        byte[] bArr3 = new byte[bArr2.length];
        if (this.firstStep) {
            this.firstStep = false;
            System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
        } else {
            CM5func(bArr2, 0, this.mac, bArr3);
        }
        gost28147MacFunc(this.workingKey, bArr3, 0, this.mac, 0);
        byte[] bArr4 = this.mac;
        System.arraycopy(bArr4, (bArr4.length / 2) - 4, bArr, i11, 4);
        reset();
        return 4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        reset();
        this.buf = new byte[8];
        this.macIV = null;
        recursiveInit(cipherParameters);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 178, cipherParameters, this.purpose));
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i11 >= bArr.length) {
                this.bufOff = 0;
                this.firstStep = true;
                return;
            } else {
                bArr[i11] = 0;
                i11++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b11) {
        GOST28147Mac gOST28147Mac;
        int i11 = this.bufOff;
        byte[] bArr = this.buf;
        if (i11 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length];
            if (this.firstStep) {
                this.firstStep = false;
                byte[] bArr3 = this.macIV;
                if (bArr3 != null) {
                    CM5func(bArr, 0, bArr3, bArr2);
                } else {
                    System.arraycopy(bArr, 0, bArr2, 0, this.mac.length);
                }
            } else {
                CM5func(bArr, 0, this.mac, bArr2);
            }
            gOST28147Mac = this;
            gOST28147Mac.gost28147MacFunc(this.workingKey, bArr2, 0, this.mac, 0);
            gOST28147Mac.bufOff = 0;
        } else {
            gOST28147Mac = this;
        }
        byte[] bArr4 = gOST28147Mac.buf;
        int i12 = gOST28147Mac.bufOff;
        gOST28147Mac.bufOff = i12 + 1;
        bArr4[i12] = b11;
    }

    public GOST28147Mac(CryptoServicePurpose cryptoServicePurpose) {
        this.firstStep = true;
        this.workingKey = null;
        this.macIV = null;
        this.S = new byte[]{9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
        this.purpose = cryptoServicePurpose;
        this.mac = new byte[8];
        this.buf = new byte[8];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) {
        GOST28147Mac gOST28147Mac;
        if (i12 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i13 = this.bufOff;
        int i14 = 8 - i13;
        if (i12 > i14) {
            System.arraycopy(bArr, i11, this.buf, i13, i14);
            byte[] bArr2 = this.buf;
            byte[] bArr3 = new byte[bArr2.length];
            if (this.firstStep) {
                this.firstStep = false;
                byte[] bArr4 = this.macIV;
                if (bArr4 != null) {
                    CM5func(bArr2, 0, bArr4, bArr3);
                } else {
                    System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
                }
            } else {
                CM5func(bArr2, 0, this.mac, bArr3);
            }
            gOST28147Mac = this;
            gOST28147Mac.gost28147MacFunc(this.workingKey, bArr3, 0, this.mac, 0);
            gOST28147Mac.bufOff = 0;
            i12 -= i14;
            i11 += i14;
            while (i12 > 8) {
                CM5func(bArr, i11, gOST28147Mac.mac, bArr3);
                gOST28147Mac.gost28147MacFunc(gOST28147Mac.workingKey, bArr3, 0, gOST28147Mac.mac, 0);
                i12 -= 8;
                i11 += 8;
            }
        } else {
            gOST28147Mac = this;
        }
        System.arraycopy(bArr, i11, gOST28147Mac.buf, gOST28147Mac.bufOff, i12);
        gOST28147Mac.bufOff += i12;
    }
}
