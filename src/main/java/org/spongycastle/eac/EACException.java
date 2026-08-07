package org.spongycastle.eac;

/* JADX INFO: loaded from: classes10.dex */
public class EACException extends Exception {
    private Throwable cause;

    public EACException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public EACException(String str) {
        super(str);
    }
}
