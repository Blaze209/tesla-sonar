package org.bouncycastle.jcajce.io;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
class DigestUpdatingOutputStream extends OutputStream {
    private MessageDigest digest;

    DigestUpdatingOutputStream(MessageDigest messageDigest) {
        this.digest = messageDigest;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.digest.update((byte) i11);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.digest.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.digest.update(bArr, i11, i12);
    }
}
