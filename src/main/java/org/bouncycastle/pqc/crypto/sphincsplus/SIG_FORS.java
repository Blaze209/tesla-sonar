package org.bouncycastle.pqc.crypto.sphincsplus;

/* JADX INFO: loaded from: classes10.dex */
class SIG_FORS {
    final byte[][] authPath;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    final byte[] f99169sk;

    SIG_FORS(byte[] bArr, byte[][] bArr2) {
        this.authPath = bArr2;
        this.f99169sk = bArr;
    }

    public byte[][] getAuthPath() {
        return this.authPath;
    }

    byte[] getSK() {
        return this.f99169sk;
    }
}
