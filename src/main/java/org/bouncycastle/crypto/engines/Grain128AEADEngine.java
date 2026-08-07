package org.bouncycastle.crypto.engines;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class Grain128AEADEngine implements AEADCipher {
    private static final int STATE_SIZE = 4;
    private int[] authAcc;
    private int[] authSr;
    private int[] lfsr;
    private byte[] mac;
    private int[] nfsr;
    private byte[] workingIV;
    private byte[] workingKey;
    private boolean initialised = false;
    private boolean aadFinished = false;
    private ErasableOutputStream aadData = new ErasableOutputStream();

    private static final class ErasableOutputStream extends ByteArrayOutputStream {
        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    private void accumulate() {
        int[] iArr = this.authAcc;
        int i11 = iArr[0];
        int[] iArr2 = this.authSr;
        iArr[0] = i11 ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
    }

    private void authShift(int i11) {
        int[] iArr = this.authSr;
        int i12 = iArr[0] >>> 1;
        int i13 = iArr[1];
        iArr[0] = i12 | (i13 << 31);
        iArr[1] = (i11 << 31) | (i13 >>> 1);
    }

    private void doProcessAADBytes(byte[] bArr, int i11, int i12) {
        int i13;
        byte[] bArr2;
        if (i12 < 128) {
            bArr2 = new byte[i12 + 1];
            bArr2[0] = (byte) i12;
            i13 = 0;
        } else {
            int iLen_length = len_length(i12);
            byte[] bArr3 = new byte[iLen_length + 1 + i12];
            bArr3[0] = (byte) (iLen_length | 128);
            int i14 = i12;
            int i15 = 0;
            while (i15 < iLen_length) {
                i15++;
                bArr3[i15] = (byte) i14;
                i14 >>>= 8;
            }
            i13 = iLen_length;
            bArr2 = bArr3;
        }
        for (int i16 = 0; i16 < i12; i16++) {
            bArr2[1 + i13 + i16] = bArr[i11 + i16];
        }
        for (byte b11 : bArr2) {
            for (int i17 = 0; i17 < 8; i17++) {
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                int i18 = -((b11 >> i17) & 1);
                int[] iArr = this.authAcc;
                int i19 = iArr[0];
                int[] iArr2 = this.authSr;
                iArr[0] = i19 ^ (iArr2[0] & i18);
                iArr[1] = (i18 & iArr2[1]) ^ iArr[1];
                authShift(getOutput());
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
            }
        }
    }

    private byte[] getKeyStream(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        for (int i14 = 0; i14 < i12; i14++) {
            byte b11 = bArr[i11 + i14];
            byte b12 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                int output = getOutput();
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                int i16 = (b11 >> i15) & 1;
                b12 = (byte) (b12 | ((output ^ i16) << i15));
                int i17 = -i16;
                int[] iArr = this.authAcc;
                int i18 = iArr[0];
                int[] iArr2 = this.authSr;
                iArr[0] = i18 ^ (iArr2[0] & i17);
                iArr[1] = (i17 & iArr2[1]) ^ iArr[1];
                authShift(getOutput());
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
            }
            bArr2[i13 + i14] = b12;
        }
        return bArr2;
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i11 = iArr[0];
        int i12 = i11 >>> 12;
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = i14 >>> 9;
        int i16 = i14 >>> 25;
        int i17 = i14 >>> 31;
        int[] iArr2 = this.lfsr;
        int i18 = iArr2[0];
        int i19 = iArr2[1];
        int i21 = iArr2[2];
        int i22 = (i18 >>> 20) & (i18 >>> 13);
        return (((i14 ^ (((((((((i22 ^ ((i18 >>> 8) & i12)) ^ (i17 & (i19 >>> 10))) ^ ((i19 >>> 28) & (i21 >>> 15))) ^ ((i12 & i17) & (i21 >>> 30))) ^ (i21 >>> 29)) ^ (i11 >>> 2)) ^ (i11 >>> 15)) ^ (i13 >>> 4)) ^ (i13 >>> 13))) ^ i15) ^ i16) & 1;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i11 = iArr[0];
        int i12 = iArr[1] >>> 6;
        int i13 = iArr[2];
        return (iArr[3] ^ ((((i11 ^ (i11 >>> 7)) ^ i12) ^ (i13 >>> 6)) ^ (i13 >>> 17))) & 1;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i11 = iArr[0];
        int i12 = i11 >>> 25;
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = ((i11 >>> 26) ^ i11) ^ (i13 >>> 24);
        return (((((((((((iArr[3] ^ (i15 ^ (i14 >>> 27))) ^ ((i11 & i14) >>> 3)) ^ ((i11 >>> 11) & (i11 >>> 13))) ^ ((i11 >>> 17) & (i11 >>> 18))) ^ ((i11 & i13) >>> 27)) ^ ((i13 >>> 8) & (i13 >>> 16))) ^ ((i13 >>> 29) & (i14 >>> 1))) ^ ((i14 >>> 4) & (i14 >>> 20))) ^ (((i11 >>> 22) & (i11 >>> 24)) & i12)) ^ (((i14 >>> 6) & (i14 >>> 14)) & (i14 >>> 18))) ^ ((((i14 >>> 24) & (i14 >>> 28)) & (i14 >>> 29)) & (i14 >>> 31))) & 1;
    }

    private void initGrain() {
        for (int i11 = 0; i11 < 320; i11++) {
            int output = getOutput();
            this.nfsr = shift(this.nfsr, ((getOutputNFSR() ^ this.lfsr[0]) ^ output) & 1);
            this.lfsr = shift(this.lfsr, (output ^ getOutputLFSR()) & 1);
        }
        for (int i12 = 0; i12 < 8; i12++) {
            for (int i13 = 0; i13 < 8; i13++) {
                int output2 = getOutput();
                this.nfsr = shift(this.nfsr, (((getOutputNFSR() ^ this.lfsr[0]) ^ output2) ^ (this.workingKey[i12] >> i13)) & 1);
                this.lfsr = shift(this.lfsr, ((output2 ^ getOutputLFSR()) ^ (this.workingKey[i12 + 8] >> i13)) & 1);
            }
        }
        for (int i14 = 0; i14 < 2; i14++) {
            for (int i15 = 0; i15 < 32; i15++) {
                int output3 = getOutput();
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                int[] iArr = this.authAcc;
                iArr[i14] = (output3 << i15) | iArr[i14];
            }
        }
        for (int i16 = 0; i16 < 2; i16++) {
            for (int i17 = 0; i17 < 32; i17++) {
                int output4 = getOutput();
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                int[] iArr2 = this.authSr;
                iArr2[i16] = (output4 << i17) | iArr2[i16];
            }
        }
        this.initialised = true;
    }

    private static int len_length(int i11) {
        if ((i11 & 255) == i11) {
            return 1;
        }
        if ((65535 & i11) == i11) {
            return 2;
        }
        return (16777215 & i11) == i11 ? 3 : 4;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = 127;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        Pack.littleEndianToInt(bArr, 0, this.nfsr);
        Pack.littleEndianToInt(this.workingIV, 0, this.lfsr);
    }

    private int[] shift(int[] iArr, int i11) {
        int i12 = iArr[0] >>> 1;
        int i13 = iArr[1];
        iArr[0] = i12 | (i13 << 31);
        int i14 = i13 >>> 1;
        int i15 = iArr[2];
        iArr[1] = i14 | (i15 << 31);
        int i16 = iArr[3];
        iArr[2] = (i15 >>> 1) | (i16 << 31);
        iArr[3] = (i11 << 31) | (i16 >>> 1);
        return iArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) {
        if (!this.aadFinished) {
            doProcessAADBytes(this.aadData.getBuf(), 0, this.aadData.size());
            this.aadFinished = true;
        }
        accumulate();
        byte[] bArrIntToLittleEndian = Pack.intToLittleEndian(this.authAcc);
        this.mac = bArrIntToLittleEndian;
        System.arraycopy(bArrIntToLittleEndian, 0, bArr, i11, bArrIntToLittleEndian.length);
        reset(false);
        return this.mac.length;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "Grain-128AEAD";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.mac;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        return i11 + 8;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain-128AEAD init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        if (iv2 == null || iv2.length != 12) {
            throw new IllegalArgumentException("Grain-128AEAD requires exactly 12 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain-128AEAD init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Grain-128AEAD key must be 128 bits long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z11)));
        byte[] bArr = new byte[16];
        this.workingIV = bArr;
        this.workingKey = new byte[16];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.authAcc = new int[2];
        this.authSr = new int[2];
        System.arraycopy(iv2, 0, bArr, 0, iv2.length);
        System.arraycopy(key, 0, this.workingKey, 0, key.length);
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b11) throws IOException {
        if (this.aadFinished) {
            throw new IllegalStateException("associated data must be added before plaintext/ciphertext");
        }
        this.aadData.write(b11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) throws IOException {
        if (this.aadFinished) {
            throw new IllegalStateException("associated data must be added before plaintext/ciphertext");
        }
        this.aadData.write(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        return processBytes(new byte[]{b11}, 0, 1, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (!this.aadFinished) {
            doProcessAADBytes(this.aadData.getBuf(), 0, this.aadData.size());
            this.aadFinished = true;
        }
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i13 + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        getKeyStream(bArr, i11, i12, bArr2, i13);
        return i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z11) {
        if (z11) {
            this.mac = null;
        }
        this.aadData.reset();
        this.aadFinished = false;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }
}
