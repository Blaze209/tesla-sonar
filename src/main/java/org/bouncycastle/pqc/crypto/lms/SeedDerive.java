package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes10.dex */
class SeedDerive {
    private final byte[] I;
    private final Digest digest;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f99126j;
    private final byte[] masterSeed;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f99127q;

    public SeedDerive(byte[] bArr, byte[] bArr2, Digest digest) {
        this.I = bArr;
        this.masterSeed = bArr2;
        this.digest = digest;
    }

    public void deriveSeed(byte[] bArr, boolean z11) {
        deriveSeed(bArr, z11, 0);
    }

    public byte[] getI() {
        return this.I;
    }

    public int getJ() {
        return this.f99126j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f99127q;
    }

    public void setJ(int i11) {
        this.f99126j = i11;
    }

    public void setQ(int i11) {
        this.f99127q = i11;
    }

    public void deriveSeed(byte[] bArr, boolean z11, int i11) {
        deriveSeed(bArr, i11);
        if (z11) {
            this.f99126j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i11) {
        if (bArr.length - i11 < this.digest.getDigestSize()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        Digest digest = this.digest;
        byte[] bArr2 = this.I;
        digest.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (this.f99127q >>> 24));
        this.digest.update((byte) (this.f99127q >>> 16));
        this.digest.update((byte) (this.f99127q >>> 8));
        this.digest.update((byte) this.f99127q);
        this.digest.update((byte) (this.f99126j >>> 8));
        this.digest.update((byte) this.f99126j);
        this.digest.update((byte) -1);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.masterSeed;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, i11);
        return bArr;
    }
}
