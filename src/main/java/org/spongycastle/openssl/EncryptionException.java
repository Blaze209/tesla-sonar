package org.spongycastle.openssl;

/* JADX INFO: loaded from: classes10.dex */
public class EncryptionException extends PEMException {
    private Throwable cause;

    public EncryptionException(String str) {
        super(str);
    }

    @Override // org.spongycastle.openssl.PEMException, java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public EncryptionException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}
