package org.bouncycastle.crypto.hpke;

/* JADX INFO: loaded from: classes9.dex */
public class HPKEContext {
    protected final AEAD aead;
    protected final byte[] exporterSecret;
    protected final HKDF hkdf;
    protected final byte[] suiteId;

    HPKEContext(AEAD aead, HKDF hkdf, byte[] bArr, byte[] bArr2) {
        this.aead = aead;
        this.hkdf = hkdf;
        this.exporterSecret = bArr;
        this.suiteId = bArr2;
    }

    public byte[] expand(byte[] bArr, byte[] bArr2, int i11) {
        return this.hkdf.Expand(bArr, bArr2, i11);
    }

    public byte[] export(byte[] bArr, int i11) {
        return this.hkdf.LabeledExpand(this.exporterSecret, this.suiteId, "sec", bArr, i11);
    }

    public byte[] extract(byte[] bArr, byte[] bArr2) {
        return this.hkdf.Extract(bArr, bArr2);
    }

    public byte[] open(byte[] bArr, byte[] bArr2) {
        return this.aead.open(bArr, bArr2);
    }

    public byte[] seal(byte[] bArr, byte[] bArr2) {
        return this.aead.seal(bArr, bArr2);
    }

    public byte[] open(byte[] bArr, byte[] bArr2, int i11, int i12) {
        return this.aead.open(bArr, bArr2, i11, i12);
    }

    public byte[] seal(byte[] bArr, byte[] bArr2, int i11, int i12) {
        return this.aead.seal(bArr, bArr2, i11, i12);
    }
}
