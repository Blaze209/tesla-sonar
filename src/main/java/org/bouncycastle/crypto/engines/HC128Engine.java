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
public class HC128Engine implements StreamCipher {
    private boolean initialised;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f98670iv;
    private byte[] key;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f98671p = new int[512];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f98672q = new int[512];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private static int dim(int i11, int i12) {
        return mod512(i11 - i12);
    }

    private static int f1(int i11) {
        return (i11 >>> 3) ^ (rotateRight(i11, 7) ^ rotateRight(i11, 18));
    }

    private static int f2(int i11) {
        return (i11 >>> 10) ^ (rotateRight(i11, 17) ^ rotateRight(i11, 19));
    }

    private int g1(int i11, int i12, int i13) {
        return (rotateRight(i11, 10) ^ rotateRight(i13, 23)) + rotateRight(i12, 8);
    }

    private int g2(int i11, int i12, int i13) {
        return (rotateLeft(i11, 10) ^ rotateLeft(i13, 23)) + rotateLeft(i12, 8);
    }

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

    private int h1(int i11) {
        int[] iArr = this.f98672q;
        return iArr[i11 & 255] + iArr[((i11 >> 16) & 255) + 256];
    }

    private int h2(int i11) {
        int[] iArr = this.f98671p;
        return iArr[i11 & 255] + iArr[((i11 >> 16) & 255) + 256];
    }

    private void init() {
        if (this.key.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        if (this.f98670iv.length != 16) {
            throw new IllegalArgumentException("The IV must be 128 bits long");
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[1280];
        for (int i11 = 0; i11 < 16; i11++) {
            int i12 = i11 >> 2;
            iArr[i12] = ((this.key[i11] & 255) << ((i11 & 3) * 8)) | iArr[i12];
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i13 = 0;
        while (true) {
            byte[] bArr = this.f98670iv;
            if (i13 >= bArr.length || i13 >= 16) {
                break;
            }
            int i14 = (i13 >> 2) + 8;
            iArr[i14] = ((bArr[i13] & 255) << ((i13 & 3) * 8)) | iArr[i14];
            i13++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i15 = 16; i15 < 1280; i15++) {
            iArr[i15] = f2(iArr[i15 - 2]) + iArr[i15 - 7] + f1(iArr[i15 - 15]) + iArr[i15 - 16] + i15;
        }
        System.arraycopy(iArr, 256, this.f98671p, 0, 512);
        System.arraycopy(iArr, 768, this.f98672q, 0, 512);
        for (int i16 = 0; i16 < 512; i16++) {
            this.f98671p[i16] = step();
        }
        for (int i17 = 0; i17 < 512; i17++) {
            this.f98672q[i17] = step();
        }
        this.cnt = 0;
    }

    private static int mod1024(int i11) {
        return i11 & 1023;
    }

    private static int mod512(int i11) {
        return i11 & 511;
    }

    private static int rotateLeft(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    private static int rotateRight(int i11, int i12) {
        return (i11 << (-i12)) | (i11 >>> i12);
    }

    private int step() {
        int iH2;
        int i11;
        int iMod512 = mod512(this.cnt);
        if (this.cnt < 512) {
            int[] iArr = this.f98671p;
            iArr[iMod512] = iArr[iMod512] + g1(iArr[dim(iMod512, 3)], this.f98671p[dim(iMod512, 10)], this.f98671p[dim(iMod512, 511)]);
            iH2 = h1(this.f98671p[dim(iMod512, 12)]);
            i11 = this.f98671p[iMod512];
        } else {
            int[] iArr2 = this.f98672q;
            iArr2[iMod512] = iArr2[iMod512] + g2(iArr2[dim(iMod512, 3)], this.f98672q[dim(iMod512, 10)], this.f98672q[dim(iMod512, 511)]);
            iH2 = h2(this.f98672q[dim(iMod512, 12)]);
            i11 = this.f98672q[iMod512];
        }
        int i12 = i11 ^ iH2;
        this.cnt = mod1024(this.cnt + 1);
        return i12;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-128";
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
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("no IV passed");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.f98670iv = parametersWithIV.getIV();
        CipherParameters parameters = parametersWithIV.getParameters();
        if (!(parameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Invalid parameter passed to HC128 init - " + cipherParameters.getClass().getName());
        }
        this.key = ((KeyParameter) parameters).getKey();
        init();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z11)));
        this.initialised = true;
    }
}
