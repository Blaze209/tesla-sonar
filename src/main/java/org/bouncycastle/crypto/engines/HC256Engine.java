package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes9.dex */
public class HC256Engine implements StreamCipher {
    private boolean initialised;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f98673iv;
    private byte[] key;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f98674p = new int[1024];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f98675q = new int[1024];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private byte getByte() {
        if (this.idx == 0) {
            int iStep = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (iStep & 255);
            bArr[1] = (byte) ((iStep >> 8) & 255);
            bArr[2] = (byte) ((iStep >> 16) & 255);
            bArr[3] = (byte) ((iStep >> 24) & 255);
        }
        byte[] bArr2 = this.buf;
        int i11 = this.idx;
        byte b11 = bArr2[i11];
        this.idx = 3 & (i11 + 1);
        return b11;
    }

    private void init() {
        byte[] bArr = this.key;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.f98673iv.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.key;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.key = bArr2;
        }
        byte[] bArr4 = this.f98673iv;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.f98673iv;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.f98673iv = bArr5;
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[2560];
        for (int i11 = 0; i11 < 32; i11++) {
            int i12 = i11 >> 2;
            iArr[i12] = iArr[i12] | ((this.key[i11] & 255) << ((i11 & 3) * 8));
        }
        for (int i13 = 0; i13 < 32; i13++) {
            int i14 = (i13 >> 2) + 8;
            iArr[i14] = iArr[i14] | ((this.f98673iv[i13] & 255) << ((i13 & 3) * 8));
        }
        for (int i15 = 16; i15 < 2560; i15++) {
            int i16 = iArr[i15 - 2];
            int i17 = iArr[i15 - 15];
            iArr[i15] = ((i16 >>> 10) ^ (rotateRight(i16, 17) ^ rotateRight(i16, 19))) + iArr[i15 - 7] + ((i17 >>> 3) ^ (rotateRight(i17, 7) ^ rotateRight(i17, 18))) + iArr[i15 - 16] + i15;
        }
        System.arraycopy(iArr, 512, this.f98674p, 0, 1024);
        System.arraycopy(iArr, 1536, this.f98675q, 0, 1024);
        for (int i18 = 0; i18 < 4096; i18++) {
            step();
        }
        this.cnt = 0;
    }

    private static int rotateRight(int i11, int i12) {
        return (i11 << (-i12)) | (i11 >>> i12);
    }

    private int step() {
        int i11;
        int i12;
        int i13 = this.cnt;
        int i14 = i13 & 1023;
        if (i13 < 1024) {
            int[] iArr = this.f98674p;
            int i15 = iArr[(i14 - 3) & 1023];
            int i16 = iArr[(i14 - 1023) & 1023];
            int i17 = iArr[i14];
            int iRotateRight = iArr[(i14 - 10) & 1023] + (rotateRight(i16, 23) ^ rotateRight(i15, 10));
            int[] iArr2 = this.f98675q;
            iArr[i14] = i17 + iRotateRight + iArr2[(i15 ^ i16) & 1023];
            int[] iArr3 = this.f98674p;
            int i18 = iArr3[(i14 - 12) & 1023];
            i11 = iArr2[i18 & 255] + iArr2[((i18 >> 8) & 255) + 256] + iArr2[((i18 >> 16) & 255) + 512] + iArr2[((i18 >> 24) & 255) + 768];
            i12 = iArr3[i14];
        } else {
            int[] iArr4 = this.f98675q;
            int i19 = iArr4[(i14 - 3) & 1023];
            int i21 = iArr4[(i14 - 1023) & 1023];
            int i22 = iArr4[i14];
            int iRotateRight2 = iArr4[(i14 - 10) & 1023] + (rotateRight(i21, 23) ^ rotateRight(i19, 10));
            int[] iArr5 = this.f98674p;
            iArr4[i14] = i22 + iRotateRight2 + iArr5[(i19 ^ i21) & 1023];
            int[] iArr6 = this.f98675q;
            int i23 = iArr6[(i14 - 12) & 1023];
            i11 = iArr5[i23 & 255] + iArr5[((i23 >> 8) & 255) + 256] + iArr5[((i23 >> 16) & 255) + 512] + iArr5[((i23 >> 24) & 255) + 768];
            i12 = iArr6[i14];
        }
        int i24 = i12 ^ i11;
        this.cnt = (this.cnt + 1) & 2047;
        return i24;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-256";
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
            bArr2[i13 + i14] = (byte) (bArr[i11 + i14] ^ getByte());
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        return (byte) (b11 ^ getByte());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        CipherParameters parameters;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f98673iv = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        } else {
            this.f98673iv = new byte[0];
            parameters = cipherParameters;
        }
        if (!(parameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Invalid parameter passed to HC256 init - " + cipherParameters.getClass().getName());
        }
        this.key = ((KeyParameter) parameters).getKey();
        init();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), this.key.length * 8, cipherParameters, Utils.getPurpose(z11)));
        this.initialised = true;
    }
}
