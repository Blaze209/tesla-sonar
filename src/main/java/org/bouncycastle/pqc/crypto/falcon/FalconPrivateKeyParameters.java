package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class FalconPrivateKeyParameters extends FalconKeyParameters {
    private final byte[] F;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f99057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f99058g;

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private final byte[] f99059pk;

    public FalconPrivateKeyParameters(FalconParameters falconParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, falconParameters);
        this.f99057f = Arrays.clone(bArr);
        this.f99058g = Arrays.clone(bArr2);
        this.F = Arrays.clone(bArr3);
        this.f99059pk = Arrays.clone(bArr4);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f99057f, this.f99058g, this.F);
    }

    public byte[] getG() {
        return Arrays.clone(this.f99058g);
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.f99059pk);
    }

    public byte[] getSpolyF() {
        return Arrays.clone(this.F);
    }

    public byte[] getSpolyf() {
        return Arrays.clone(this.f99057f);
    }
}
