package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes10.dex */
public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private byte[] engineState = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f99492x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f99493y = 0;
    private byte[] workingKey = null;

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        this.f99492x = 0;
        this.f99493y = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int i11 = 0; i11 < 256; i11++) {
            this.engineState[i11] = (byte) i11;
        }
        int length = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            int i14 = bArr[length] & 255;
            byte[] bArr2 = this.engineState;
            byte b11 = bArr2[i13];
            i12 = (i14 + b11 + i12) & 255;
            bArr2[i13] = bArr2[i12];
            bArr2[i12] = b11;
            length = (length + 1) % bArr.length;
        }
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.workingKey = key;
            setKey(key);
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + cipherParameters.getClass().getName());
        }
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
            int i15 = (this.f99492x + 1) & 255;
            this.f99492x = i15;
            byte[] bArr3 = this.engineState;
            byte b11 = bArr3[i15];
            int i16 = (this.f99493y + b11) & 255;
            this.f99493y = i16;
            bArr3[i15] = bArr3[i16];
            bArr3[i16] = b11;
            bArr2[i14 + i13] = (byte) (bArr3[(bArr3[i15] + b11) & 255] ^ bArr[i14 + i11]);
        }
        return i12;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        int i11 = (this.f99492x + 1) & 255;
        this.f99492x = i11;
        byte[] bArr = this.engineState;
        byte b12 = bArr[i11];
        int i12 = (this.f99493y + b12) & 255;
        this.f99493y = i12;
        bArr[i11] = bArr[i12];
        bArr[i12] = b12;
        return (byte) (b11 ^ bArr[(bArr[i11] + b12) & 255]);
    }
}
