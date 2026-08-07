package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes10.dex */
public class VMPCEngine implements StreamCipher {
    protected byte[] workingIV;
    protected byte[] workingKey;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected byte f99501n = 0;
    protected byte[] P = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected byte f99502s = 0;

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        byte[] iv2 = parametersWithIV.getIV();
        this.workingIV = iv2;
        if (iv2 == null || iv2.length < 1 || iv2.length > 768) {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        }
        byte[] key = keyParameter.getKey();
        this.workingKey = key;
        initKey(key, this.workingIV);
    }

    protected void initKey(byte[] bArr, byte[] bArr2) {
        this.f99502s = (byte) 0;
        this.P = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            this.P[i11] = (byte) i11;
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr3 = this.P;
            byte b11 = this.f99502s;
            int i13 = i12 & 255;
            byte b12 = bArr3[i13];
            byte b13 = bArr3[(b11 + b12 + bArr[i12 % bArr.length]) & 255];
            this.f99502s = b13;
            bArr3[i13] = bArr3[b13 & 255];
            bArr3[b13 & 255] = b12;
        }
        for (int i14 = 0; i14 < 768; i14++) {
            byte[] bArr4 = this.P;
            byte b14 = this.f99502s;
            int i15 = i14 & 255;
            byte b15 = bArr4[i15];
            byte b16 = bArr4[(b14 + b15 + bArr2[i14 % bArr2.length]) & 255];
            this.f99502s = b16;
            bArr4[i15] = bArr4[b16 & 255];
            bArr4[b16 & 255] = b15;
        }
        this.f99501n = (byte) 0;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i13 + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] bArr3 = this.P;
            byte b11 = this.f99502s;
            byte b12 = this.f99501n;
            byte b13 = bArr3[(b11 + bArr3[b12 & 255]) & 255];
            this.f99502s = b13;
            byte b14 = bArr3[(bArr3[bArr3[b13 & 255] & 255] + 1) & 255];
            byte b15 = bArr3[b12 & 255];
            bArr3[b12 & 255] = bArr3[b13 & 255];
            bArr3[b13 & 255] = b15;
            this.f99501n = (byte) ((b12 + 1) & 255);
            bArr2[i14 + i13] = (byte) (bArr[i14 + i11] ^ b14);
        }
        return i12;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        initKey(this.workingKey, this.workingIV);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        byte[] bArr = this.P;
        byte b12 = this.f99502s;
        byte b13 = this.f99501n;
        byte b14 = bArr[(b12 + bArr[b13 & 255]) & 255];
        this.f99502s = b14;
        byte b15 = bArr[(bArr[bArr[b14 & 255] & 255] + 1) & 255];
        byte b16 = bArr[b13 & 255];
        bArr[b13 & 255] = bArr[b14 & 255];
        bArr[b14 & 255] = b16;
        this.f99501n = (byte) ((b13 + 1) & 255);
        return (byte) (b11 ^ b15);
    }
}
