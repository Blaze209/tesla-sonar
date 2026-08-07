package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class BIKEPrivateKeyParameters extends BIKEKeyParameters {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private byte[] f99034h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private byte[] f99035h1;
    private byte[] sigma;

    public BIKEPrivateKeyParameters(BIKEParameters bIKEParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(true, bIKEParameters);
        this.f99034h0 = Arrays.clone(bArr);
        this.f99035h1 = Arrays.clone(bArr2);
        this.sigma = Arrays.clone(bArr3);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f99034h0, this.f99035h1, this.sigma);
    }

    byte[] getH0() {
        return this.f99034h0;
    }

    byte[] getH1() {
        return this.f99035h1;
    }

    byte[] getSigma() {
        return this.sigma;
    }
}
