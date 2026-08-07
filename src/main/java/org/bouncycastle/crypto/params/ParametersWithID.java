package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes9.dex */
public class ParametersWithID implements CipherParameters {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private byte[] f98819id;
    private CipherParameters parameters;

    public ParametersWithID(CipherParameters cipherParameters, byte[] bArr) {
        this.parameters = cipherParameters;
        this.f98819id = bArr;
    }

    public byte[] getID() {
        return this.f98819id;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
