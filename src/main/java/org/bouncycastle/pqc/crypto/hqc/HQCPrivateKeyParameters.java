package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class HQCPrivateKeyParameters extends HQCKeyParameters {

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private byte[] f99110sk;

    public HQCPrivateKeyParameters(HQCParameters hQCParameters, byte[] bArr) {
        super(true, hQCParameters);
        this.f99110sk = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f99110sk);
    }

    public byte[] getPrivateKey() {
        return Arrays.clone(this.f99110sk);
    }
}
