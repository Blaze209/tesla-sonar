package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes9.dex */
public class KDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    byte[] f98816iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f98816iv = bArr2;
    }

    public byte[] getIV() {
        return this.f98816iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
