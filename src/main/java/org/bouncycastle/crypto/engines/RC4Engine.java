package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes9.dex */
public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private boolean forEncryption;
    private byte[] engineState = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f98695x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f98696y = 0;
    private byte[] workingKey = null;

    public RC4Engine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 20));
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        this.f98695x = 0;
        this.f98696y = 0;
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

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + cipherParameters.getClass().getName());
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        this.forEncryption = z11;
        setKey(key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 20, cipherParameters, Utils.getPurpose(z11)));
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i13 + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = (this.f98695x + 1) & 255;
            this.f98695x = i15;
            byte[] bArr3 = this.engineState;
            byte b11 = bArr3[i15];
            int i16 = (this.f98696y + b11) & 255;
            this.f98696y = i16;
            bArr3[i15] = bArr3[i16];
            bArr3[i16] = b11;
            bArr2[i14 + i13] = (byte) (bArr3[(bArr3[i15] + b11) & 255] ^ bArr[i14 + i11]);
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        int i11 = (this.f98695x + 1) & 255;
        this.f98695x = i11;
        byte[] bArr = this.engineState;
        byte b12 = bArr[i11];
        int i12 = (this.f98696y + b12) & 255;
        this.f98696y = i12;
        bArr[i11] = bArr[i12];
        bArr[i12] = b12;
        return (byte) (b11 ^ bArr[(bArr[i11] + b12) & 255]);
    }
}
