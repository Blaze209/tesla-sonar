package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes10.dex */
public class Grainv1Engine implements StreamCipher {
    private static final int STATE_SIZE = 5;
    private int index = 2;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 1) {
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
        int i13 = (i11 >>> 1) | (i12 << 15);
        int i14 = (i11 >>> 2) | (i12 << 14);
        int i15 = (i11 >>> 4) | (i12 << 12);
        int i16 = (i11 >>> 10) | (i12 << 6);
        int i17 = iArr[2];
        int i18 = (i12 >>> 15) | (i17 << 1);
        int i19 = iArr[3];
        int i21 = (i17 >>> 11) | (i19 << 5);
        int i22 = iArr[4];
        int i23 = (i19 >>> 8) | (i22 << 8);
        int i24 = (i22 << 1) | (i19 >>> 15);
        int[] iArr2 = this.lfsr;
        int i25 = iArr2[0] >>> 3;
        int i26 = iArr2[1];
        int i27 = i25 | (i26 << 13);
        int i28 = iArr2[2];
        int i29 = (i26 >>> 9) | (i28 << 7);
        int i31 = (iArr2[3] << 2) | (i28 >>> 14);
        int i32 = iArr2[4];
        int i33 = i31 & i32;
        int i34 = ((((i29 ^ i24) ^ (i27 & i32)) ^ i33) ^ (i32 & i24)) ^ ((i27 & i29) & i31);
        int i35 = i27 & i31;
        return (((((((((i24 & i33) ^ (((i35 & i24) ^ ((i32 & i35) ^ i34)) ^ ((i29 & i31) & i24))) ^ i13) ^ i14) ^ i15) ^ i16) ^ i18) ^ i21) ^ i23) & 65535;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = (i11 >>> 13) | (i12 << 3);
        int i14 = iArr[2];
        int i15 = (i12 >>> 7) | (i14 << 9);
        int i16 = iArr[3];
        int i17 = (i14 >>> 6) | (i16 << 10);
        int i18 = iArr[4];
        int i19 = (i16 >>> 3) | (i18 << 13);
        return (((i18 << 2) | (i16 >>> 14)) ^ ((((i11 ^ i13) ^ i15) ^ i17) ^ i19)) & 65535;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = (i11 >>> 9) | (i12 << 7);
        int i14 = (i11 >>> 14) | (i12 << 2);
        int i15 = (i11 >>> 15) | (i12 << 1);
        int i16 = iArr[2];
        int i17 = (i12 >>> 5) | (i16 << 11);
        int i18 = (i12 >>> 12) | (i16 << 4);
        int i19 = iArr[3];
        int i21 = (i16 >>> 1) | (i19 << 15);
        int i22 = (i16 >>> 5) | (i19 << 11);
        int i23 = (i16 >>> 13) | (i19 << 3);
        int i24 = iArr[4];
        int i25 = (i19 >>> 4) | (i24 << 12);
        int i26 = (i19 >>> 12) | (i24 << 4);
        int i27 = (i19 >>> 14) | (i24 << 2);
        int i28 = (i24 << 1) | (i19 >>> 15);
        int i29 = i28 & i26;
        int i31 = (((i11 ^ (((((((((i27 ^ i26) ^ i25) ^ i23) ^ i22) ^ i21) ^ i18) ^ i17) ^ i14) ^ i13)) ^ i29) ^ (i22 & i21)) ^ (i15 & i13);
        int i32 = i26 & i25;
        int i33 = i21 & i18 & i17;
        return (((((((((i28 & i23) & i18) & i13) ^ ((i31 ^ (i32 & i23)) ^ i33)) ^ ((i32 & i22) & i21)) ^ ((i29 & i17) & i15)) ^ (((i29 & i25) & i23) & i22)) ^ ((i33 & i15) & i13)) ^ (((((i25 & i23) & i22) & i21) & i18) & i17)) & 65535;
    }

    private void initGrain() {
        for (int i11 = 0; i11 < 10; i11++) {
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
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
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
            int i13 = i12 + 1;
            iArr[i11] = ((bArr3[i12] & 255) | (bArr3[i13] << 8)) & 65535;
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i11] = ((bArr4[i12] & 255) | (bArr4[i13] << 8)) & 65535;
            i12 += 2;
            i11++;
        }
    }

    private int[] shift(int[] iArr, int i11) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i11;
        return iArr;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        if (iv2 == null || iv2.length != 8) {
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        this.workingIV = new byte[keyParameter.getKey().length];
        this.workingKey = new byte[keyParameter.getKey().length];
        this.lfsr = new int[5];
        this.nfsr = new int[5];
        this.out = new byte[2];
        System.arraycopy(iv2, 0, this.workingIV, 0, iv2.length);
        System.arraycopy(keyParameter.getKey(), 0, this.workingKey, 0, keyParameter.getKey().length);
        reset();
    }

    @Override // org.spongycastle.crypto.StreamCipher
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

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        this.index = 2;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        if (this.initialised) {
            return (byte) (b11 ^ getKeyStream());
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}
