package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class HQCPublicKeyParameters extends HQCKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private byte[] f99111pk;

    public HQCPublicKeyParameters(HQCParameters hQCParameters, byte[] bArr) {
        super(true, hQCParameters);
        this.f99111pk = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return getPublicKey();
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.f99111pk);
    }
}
