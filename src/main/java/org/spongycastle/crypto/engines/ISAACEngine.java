package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
public class ISAACEngine implements StreamCipher {
    private final int sizeL = 8;
    private final int stateArraySize = 256;
    private int[] engineState = null;
    private int[] results = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f99487a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f99488b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f99489c = 0;
    private int index = 0;
    private byte[] keyStream = new byte[1024];
    private byte[] workingKey = null;
    private boolean initialised = false;

    private void isaac() {
        int i11 = this.f99488b;
        int i12 = this.f99489c + 1;
        this.f99489c = i12;
        this.f99488b = i11 + i12;
        for (int i13 = 0; i13 < 256; i13++) {
            int[] iArr = this.engineState;
            int i14 = iArr[i13];
            int i15 = i13 & 3;
            if (i15 == 0) {
                int i16 = this.f99487a;
                this.f99487a = i16 ^ (i16 << 13);
            } else if (i15 == 1) {
                int i17 = this.f99487a;
                this.f99487a = i17 ^ (i17 >>> 6);
            } else if (i15 == 2) {
                int i18 = this.f99487a;
                this.f99487a = i18 ^ (i18 << 2);
            } else if (i15 == 3) {
                int i19 = this.f99487a;
                this.f99487a = i19 ^ (i19 >>> 16);
            }
            int i21 = this.f99487a + iArr[(i13 + 128) & 255];
            this.f99487a = i21;
            int i22 = iArr[(i14 >>> 2) & 255] + i21 + this.f99488b;
            iArr[i13] = i22;
            int[] iArr2 = this.results;
            int i23 = iArr[(i22 >>> 10) & 255] + i14;
            this.f99488b = i23;
            iArr2[i13] = i23;
        }
    }

    private void mix(int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = i11 ^ (i12 << 11);
        iArr[0] = i13;
        int i14 = iArr[3] + i13;
        iArr[3] = i14;
        int i15 = iArr[2];
        int i16 = i12 + i15;
        iArr[1] = i16;
        int i17 = i16 ^ (i15 >>> 2);
        iArr[1] = i17;
        int i18 = iArr[4] + i17;
        iArr[4] = i18;
        int i19 = i15 + i14;
        iArr[2] = i19;
        int i21 = i19 ^ (i14 << 8);
        iArr[2] = i21;
        int i22 = iArr[5] + i21;
        iArr[5] = i22;
        int i23 = i14 + i18;
        iArr[3] = i23;
        int i24 = i23 ^ (i18 >>> 16);
        iArr[3] = i24;
        int i25 = iArr[6] + i24;
        iArr[6] = i25;
        int i26 = i18 + i22;
        iArr[4] = i26;
        int i27 = (i22 << 10) ^ i26;
        iArr[4] = i27;
        int i28 = iArr[7] + i27;
        iArr[7] = i28;
        int i29 = i22 + i25;
        iArr[5] = i29;
        int i31 = (i25 >>> 4) ^ i29;
        iArr[5] = i31;
        int i32 = i13 + i31;
        iArr[0] = i32;
        int i33 = i25 + i28;
        iArr[6] = i33;
        int i34 = (i28 << 8) ^ i33;
        iArr[6] = i34;
        int i35 = i17 + i34;
        iArr[1] = i35;
        int i36 = i28 + i32;
        iArr[7] = i36;
        int i37 = (i32 >>> 9) ^ i36;
        iArr[7] = i37;
        iArr[2] = i21 + i37;
        iArr[0] = i32 + i35;
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        if (this.engineState == null) {
            this.engineState = new int[256];
        }
        if (this.results == null) {
            this.results = new int[256];
        }
        for (int i11 = 0; i11 < 256; i11++) {
            int[] iArr = this.engineState;
            this.results[i11] = 0;
            iArr[i11] = 0;
        }
        this.f99489c = 0;
        this.f99488b = 0;
        this.f99487a = 0;
        this.index = 0;
        int length = bArr.length + (bArr.length & 3);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i12 = 0; i12 < length; i12 += 4) {
            this.results[i12 >>> 2] = Pack.littleEndianToInt(bArr2, i12);
        }
        int[] iArr2 = new int[8];
        for (int i13 = 0; i13 < 8; i13++) {
            iArr2[i13] = -1640531527;
        }
        for (int i14 = 0; i14 < 4; i14++) {
            mix(iArr2);
        }
        int i15 = 0;
        while (i15 < 2) {
            for (int i16 = 0; i16 < 256; i16 += 8) {
                for (int i17 = 0; i17 < 8; i17++) {
                    iArr2[i17] = iArr2[i17] + (i15 < 1 ? this.results[i16 + i17] : this.engineState[i16 + i17]);
                }
                mix(iArr2);
                for (int i18 = 0; i18 < 8; i18++) {
                    this.engineState[i16 + i18] = iArr2[i18];
                }
            }
            i15++;
        }
        isaac();
        this.initialised = true;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ISAAC";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            setKey(((KeyParameter) cipherParameters).getKey());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to ISAAC init - " + cipherParameters.getClass().getName());
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
            if (this.index == 0) {
                isaac();
                this.keyStream = Pack.intToBigEndian(this.results);
            }
            byte[] bArr3 = this.keyStream;
            int i15 = this.index;
            bArr2[i14 + i13] = (byte) (bArr3[i15] ^ bArr[i14 + i11]);
            this.index = (i15 + 1) & 1023;
        }
        return i12;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        if (this.index == 0) {
            isaac();
            this.keyStream = Pack.intToBigEndian(this.results);
        }
        byte[] bArr = this.keyStream;
        int i11 = this.index;
        byte b12 = (byte) (b11 ^ bArr[i11]);
        this.index = (i11 + 1) & 1023;
        return b12;
    }
}
