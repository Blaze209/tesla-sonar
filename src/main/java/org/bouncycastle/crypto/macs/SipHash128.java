package org.bouncycastle.crypto.macs;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) {
        long j11 = this.f98744m;
        int i12 = this.wordPos;
        this.f98744m = ((j11 >>> ((7 - i12) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i12)) & 255) << 56);
        processMessageWord();
        this.f98747v2 ^= 238;
        applySipRounds(this.f98741d);
        long j12 = this.f98745v0;
        long j13 = this.f98746v1;
        long j14 = ((j12 ^ j13) ^ this.f98747v2) ^ this.f98748v3;
        this.f98746v1 = j13 ^ 221;
        applySipRounds(this.f98741d);
        long j15 = ((this.f98745v0 ^ this.f98746v1) ^ this.f98747v2) ^ this.f98748v3;
        reset();
        Pack.longToLittleEndian(j14, bArr, i11);
        Pack.longToLittleEndian(j15, bArr, i11 + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.f98740c + "-" + this.f98741d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f98746v1 ^= 238;
    }

    public SipHash128(int i11, int i12) {
        super(i11, i12);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }
}
