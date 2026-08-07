package org.spongycastle.operator.bc;

import java.io.OutputStream;
import org.spongycastle.crypto.Signer;

/* JADX INFO: loaded from: classes10.dex */
public class BcSignerOutputStream extends OutputStream {
    private Signer sig;

    BcSignerOutputStream(Signer signer) {
        this.sig = signer;
    }

    byte[] getSignature() {
        return this.sig.generateSignature();
    }

    boolean verify(byte[] bArr) {
        return this.sig.verifySignature(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.sig.update(bArr, i11, i12);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.sig.update(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.sig.update((byte) i11);
    }
}
