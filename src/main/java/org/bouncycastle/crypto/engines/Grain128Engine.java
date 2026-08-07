package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes9.dex */
public class Grain128Engine implements StreamCipher {
    private static final int STATE_SIZE = 4;
    private int index = 4;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 3) {
            oneRound();
            this.index = 0;
        }
        byte[] bArr = this.out;
        int i11 = this.index;
        this.index = i11 + 1;
        return bArr[i11];
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = (i11 >>> 2) | (i12 << 30);
        int i14 = (i11 >>> 12) | (i12 << 20);
        int i15 = (i11 >>> 15) | (i12 << 17);
        int i16 = iArr[2];
        int i17 = (i12 >>> 4) | (i16 << 28);
        int i18 = (i12 >>> 13) | (i16 << 19);
        int i19 = iArr[3];
        int i21 = (i16 >>> 9) | (i19 << 23);
        int i22 = (i16 >>> 25) | (i19 << 7);
        int i23 = (i19 << 1) | (i16 >>> 31);
        int[] iArr2 = this.lfsr;
        int i24 = iArr2[0];
        int i25 = iArr2[1];
        int i26 = (i24 >>> 8) | (i25 << 24);
        int i27 = (i24 >>> 13) | (i25 << 19);
        int i28 = (i24 >>> 20) | (i25 << 12);
        int i29 = iArr2[2];
        int i31 = iArr2[3];
        int i32 = i27 & i28;
        return ((((((((((i23 & i14) & ((i31 << 1) | (i29 >>> 31))) ^ (((i32 ^ (i14 & i26)) ^ (i23 & ((i25 >>> 10) | (i29 << 22)))) ^ (((i25 >>> 28) | (i29 << 4)) & ((i29 >>> 15) | (i31 << 17))))) ^ ((i29 >>> 29) | (i31 << 3))) ^ i13) ^ i15) ^ i17) ^ i18) ^ i16) ^ i21) ^ i22;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = (i11 >>> 7) | (i12 << 25);
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = (i14 >>> 6) | (i15 << 26);
        return i15 ^ ((((i11 ^ i13) ^ ((i12 >>> 6) | (i14 << 26))) ^ i16) ^ ((i14 >>> 17) | (i15 << 15)));
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = (i11 >>> 3) | (i12 << 29);
        int i14 = (i11 >>> 11) | (i12 << 21);
        int i15 = (i11 >>> 13) | (i12 << 19);
        int i16 = (i11 >>> 17) | (i12 << 15);
        int i17 = (i11 >>> 18) | (i12 << 14);
        int i18 = (i11 >>> 26) | (i12 << 6);
        int i19 = (i11 >>> 27) | (i12 << 5);
        int i21 = iArr[2];
        int i22 = (i12 >>> 8) | (i21 << 24);
        int i23 = (i12 >>> 16) | (i21 << 16);
        int i24 = (i12 >>> 24) | (i21 << 8);
        int i25 = (i12 >>> 27) | (i21 << 5);
        int i26 = (i12 >>> 29) | (i21 << 3);
        int i27 = iArr[3];
        return (((((((i27 ^ (((i11 ^ i18) ^ i24) ^ ((i21 >>> 27) | (i27 << 5)))) ^ (i13 & ((i21 >>> 3) | (i27 << 29)))) ^ (i14 & i15)) ^ (i16 & i17)) ^ (i19 & i25)) ^ (i22 & i23)) ^ (i26 & ((i21 >>> 1) | (i27 << 31)))) ^ (((i21 >>> 4) | (i27 << 28)) & ((i21 >>> 20) | (i27 << 12)));
    }

    private void initGrain() {
        for (int i11 = 0; i11 < 8; i11++) {
            this.output = getOutput();
            this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) ^ this.output);
            this.lfsr = shift(this.lfsr, getOutputLFSR() ^ this.output);
        }
        this.initialised = true;
    }

    private void oneRound() {
        int output = getOutput();
        this.output = output;
        byte[] bArr = this.out;
        bArr[0] = (byte) output;
        bArr[1] = (byte) (output >> 8);
        bArr[2] = (byte) (output >> 16);
        bArr[3] = (byte) (output >> 24);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.nfsr;
            if (i11 >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.workingKey;
            int i13 = i12 + 3;
            int i14 = i12 + 2;
            int i15 = i12 + 1;
            iArr[i11] = (bArr3[i12] & 255) | (bArr3[i13] << 24) | ((bArr3[i14] << Tnaf.POW_2_WIDTH) & 16711680) | ((bArr3[i15] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB);
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i11] = (bArr4[i12] & 255) | (bArr4[i13] << 24) | ((bArr4[i14] << Tnaf.POW_2_WIDTH) & 16711680) | ((bArr4[i15] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB);
            i12 += 4;
            i11++;
        }
    }

    private int[] shift(int[] iArr, int i11) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i11;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        if (iv2 == null || iv2.length != 12) {
            throw new IllegalArgumentException("Grain-128 requires exactly 12 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain-128 init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Grain-128 key must be 128 bits long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z11)));
        byte[] bArr = new byte[key.length];
        this.workingIV = bArr;
        this.workingKey = new byte[key.length];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.out = new byte[4];
        System.arraycopy(iv2, 0, bArr, 0, iv2.length);
        System.arraycopy(key, 0, this.workingKey, 0, key.length);
        reset();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i13 + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i14 = 0; i14 < i12; i14++) {
            bArr2[i13 + i14] = (byte) (bArr[i11 + i14] ^ getKeyStream());
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 4;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        if (this.initialised) {
            return (byte) (b11 ^ getKeyStream());
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}
