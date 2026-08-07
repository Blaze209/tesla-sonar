package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes10.dex */
public class KDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    byte[] f99599iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f99599iv = bArr2;
    }

    public byte[] getIV() {
        return this.f99599iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
