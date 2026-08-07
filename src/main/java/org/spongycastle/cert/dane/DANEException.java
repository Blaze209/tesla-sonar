package org.spongycastle.cert.dane;

/* JADX INFO: loaded from: classes10.dex */
public class DANEException extends Exception {
    private Throwable cause;

    public DANEException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public DANEException(String str) {
        super(str);
    }
}
