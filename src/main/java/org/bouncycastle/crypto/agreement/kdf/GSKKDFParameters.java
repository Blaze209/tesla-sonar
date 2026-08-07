package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes9.dex */
public class GSKKDFParameters implements DerivationParameters {
    private final byte[] nonce;
    private final int startCounter;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final byte[] f98582z;

    public GSKKDFParameters(byte[] bArr, int i11) {
        this(bArr, i11, null);
    }

    public byte[] getNonce() {
        return this.nonce;
    }

    public int getStartCounter() {
        return this.startCounter;
    }

    public byte[] getZ() {
        return this.f98582z;
    }

    public GSKKDFParameters(byte[] bArr, int i11, byte[] bArr2) {
        this.f98582z = bArr;
        this.startCounter = i11;
        this.nonce = bArr2;
    }
}
