package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes10.dex */
public class VMPCMac implements Mac {
    private byte[] T;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f99542g;
    private byte[] workingIV;
    private byte[] workingKey;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private byte f99545x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private byte f99546x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private byte f99547x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private byte f99548x4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f99543n = 0;
    private byte[] P = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte f99544s = 0;

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.f99544s = (byte) 0;
        this.P = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            this.P[i11] = (byte) i11;
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr3 = this.P;
            byte b11 = this.f99544s;
            int i13 = i12 & 255;
            byte b12 = bArr3[i13];
            byte b13 = bArr3[(b11 + b12 + bArr[i12 % bArr.length]) & 255];
            this.f99544s = b13;
            bArr3[i13] = bArr3[b13 & 255];
            bArr3[b13 & 255] = b12;
        }
        for (int i14 = 0; i14 < 768; i14++) {
            byte[] bArr4 = this.P;
            byte b14 = this.f99544s;
            int i15 = i14 & 255;
            byte b15 = bArr4[i15];
            byte b16 = bArr4[(b14 + b15 + bArr2[i14 % bArr2.length]) & 255];
            this.f99544s = b16;
            bArr4[i15] = bArr4[b16 & 255];
            bArr4[b16 & 255] = b15;
        }
        this.f99543n = (byte) 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) {
        for (int i12 = 1; i12 < 25; i12++) {
            byte[] bArr2 = this.P;
            byte b11 = this.f99544s;
            byte b12 = this.f99543n;
            byte b13 = bArr2[(b11 + bArr2[b12 & 255]) & 255];
            this.f99544s = b13;
            byte b14 = this.f99548x4;
            byte b15 = this.f99547x3;
            byte b16 = bArr2[(b14 + b15 + i12) & 255];
            this.f99548x4 = b16;
            byte b17 = this.f99546x2;
            byte b18 = bArr2[(b15 + b17 + i12) & 255];
            this.f99547x3 = b18;
            byte b19 = this.f99545x1;
            byte b21 = bArr2[(b17 + b19 + i12) & 255];
            this.f99546x2 = b21;
            byte b22 = bArr2[(b19 + b13 + i12) & 255];
            this.f99545x1 = b22;
            byte[] bArr3 = this.T;
            byte b23 = this.f99542g;
            bArr3[b23 & 31] = (byte) (b22 ^ bArr3[b23 & 31]);
            bArr3[(b23 + 1) & 31] = (byte) (b21 ^ bArr3[(b23 + 1) & 31]);
            bArr3[(b23 + 2) & 31] = (byte) (b18 ^ bArr3[(b23 + 2) & 31]);
            bArr3[(b23 + 3) & 31] = (byte) (b16 ^ bArr3[(b23 + 3) & 31]);
            this.f99542g = (byte) ((b23 + 4) & 31);
            byte b24 = bArr2[b12 & 255];
            bArr2[b12 & 255] = bArr2[b13 & 255];
            bArr2[b13 & 255] = b24;
            this.f99543n = (byte) ((b12 + 1) & 255);
        }
        for (int i13 = 0; i13 < 768; i13++) {
            byte[] bArr4 = this.P;
            byte b25 = this.f99544s;
            int i14 = i13 & 255;
            byte b26 = bArr4[i14];
            byte b27 = bArr4[(b25 + b26 + this.T[i13 & 31]) & 255];
            this.f99544s = b27;
            bArr4[i14] = bArr4[b27 & 255];
            bArr4[b27 & 255] = b26;
        }
        byte[] bArr5 = new byte[20];
        for (int i15 = 0; i15 < 20; i15++) {
            byte[] bArr6 = this.P;
            int i16 = i15 & 255;
            byte b28 = bArr6[(this.f99544s + bArr6[i16]) & 255];
            this.f99544s = b28;
            bArr5[i15] = bArr6[(bArr6[bArr6[b28 & 255] & 255] + 1) & 255];
            byte b29 = bArr6[i16];
            bArr6[i16] = bArr6[b28 & 255];
            bArr6[b28 & 255] = b29;
        }
        System.arraycopy(bArr5, 0, bArr, i11, 20);
        reset();
        return 20;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] iv2 = parametersWithIV.getIV();
        this.workingIV = iv2;
        if (iv2 == null || iv2.length < 1 || iv2.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.workingKey = keyParameter.getKey();
        reset();
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.f99543n = (byte) 0;
        this.f99548x4 = (byte) 0;
        this.f99547x3 = (byte) 0;
        this.f99546x2 = (byte) 0;
        this.f99545x1 = (byte) 0;
        this.f99542g = (byte) 0;
        this.T = new byte[32];
        for (int i11 = 0; i11 < 32; i11++) {
            this.T[i11] = 0;
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b11) {
        byte[] bArr = this.P;
        byte b12 = this.f99544s;
        byte b13 = this.f99543n;
        byte b14 = bArr[(b12 + bArr[b13 & 255]) & 255];
        this.f99544s = b14;
        byte b15 = (byte) (b11 ^ bArr[(bArr[bArr[b14 & 255] & 255] + 1) & 255]);
        byte b16 = this.f99548x4;
        byte b17 = this.f99547x3;
        byte b18 = bArr[(b16 + b17) & 255];
        this.f99548x4 = b18;
        byte b19 = this.f99546x2;
        byte b21 = bArr[(b17 + b19) & 255];
        this.f99547x3 = b21;
        byte b22 = this.f99545x1;
        byte b23 = bArr[(b19 + b22) & 255];
        this.f99546x2 = b23;
        byte b24 = bArr[(b22 + b14 + b15) & 255];
        this.f99545x1 = b24;
        byte[] bArr2 = this.T;
        byte b25 = this.f99542g;
        bArr2[b25 & 31] = (byte) (b24 ^ bArr2[b25 & 31]);
        bArr2[(b25 + 1) & 31] = (byte) (b23 ^ bArr2[(b25 + 1) & 31]);
        bArr2[(b25 + 2) & 31] = (byte) (b21 ^ bArr2[(b25 + 2) & 31]);
        bArr2[(b25 + 3) & 31] = (byte) (b18 ^ bArr2[(b25 + 3) & 31]);
        this.f99542g = (byte) ((b25 + 4) & 31);
        byte b26 = bArr[b13 & 255];
        bArr[b13 & 255] = bArr[b14 & 255];
        bArr[b14 & 255] = b26;
        this.f99543n = (byte) ((b13 + 1) & 255);
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) {
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            update(bArr[i11 + i13]);
        }
    }
}
