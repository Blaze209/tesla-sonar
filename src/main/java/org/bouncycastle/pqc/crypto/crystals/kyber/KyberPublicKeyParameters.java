package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class KyberPublicKeyParameters extends KyberKeyParameters {
    final byte[] rho;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final byte[] f99053t;

    public KyberPublicKeyParameters(KyberParameters kyberParameters, byte[] bArr) {
        super(false, kyberParameters);
        this.f99053t = Arrays.copyOfRange(bArr, 0, bArr.length - 32);
        this.rho = Arrays.copyOfRange(bArr, bArr.length - 32, bArr.length);
    }

    public byte[] getEncoded() {
        return getEncoded(this.f99053t, this.rho);
    }

    public byte[] getPublicKey() {
        return getEncoded();
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getT() {
        return Arrays.clone(this.f99053t);
    }

    public KyberPublicKeyParameters(KyberParameters kyberParameters, byte[] bArr, byte[] bArr2) {
        super(false, kyberParameters);
        this.f99053t = Arrays.clone(bArr);
        this.rho = Arrays.clone(bArr2);
    }

    static byte[] getEncoded(byte[] bArr, byte[] bArr2) {
        return Arrays.concatenate(bArr, bArr2);
    }
}
