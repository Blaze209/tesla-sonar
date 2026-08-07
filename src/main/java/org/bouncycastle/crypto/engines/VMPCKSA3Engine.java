package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes9.dex */
public class VMPCKSA3Engine extends VMPCEngine {
    @Override // org.bouncycastle.crypto.engines.VMPCEngine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }

    @Override // org.bouncycastle.crypto.engines.VMPCEngine
    protected void initKey(byte[] bArr, byte[] bArr2) {
        this.f98706s = (byte) 0;
        this.P = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            this.P[i11] = (byte) i11;
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr3 = this.P;
            byte b11 = this.f98706s;
            int i13 = i12 & 255;
            byte b12 = bArr3[i13];
            byte b13 = bArr3[(b11 + b12 + bArr[i12 % bArr.length]) & 255];
            this.f98706s = b13;
            bArr3[i13] = bArr3[b13 & 255];
            bArr3[b13 & 255] = b12;
        }
        for (int i14 = 0; i14 < 768; i14++) {
            byte[] bArr4 = this.P;
            byte b14 = this.f98706s;
            int i15 = i14 & 255;
            byte b15 = bArr4[i15];
            byte b16 = bArr4[(b14 + b15 + bArr2[i14 % bArr2.length]) & 255];
            this.f98706s = b16;
            bArr4[i15] = bArr4[b16 & 255];
            bArr4[b16 & 255] = b15;
        }
        for (int i16 = 0; i16 < 768; i16++) {
            byte[] bArr5 = this.P;
            byte b17 = this.f98706s;
            int i17 = i16 & 255;
            byte b18 = bArr5[i17];
            byte b19 = bArr5[(b17 + b18 + bArr[i16 % bArr.length]) & 255];
            this.f98706s = b19;
            bArr5[i17] = bArr5[b19 & 255];
            bArr5[b19 & 255] = b18;
        }
        this.f98705n = (byte) 0;
    }
}
