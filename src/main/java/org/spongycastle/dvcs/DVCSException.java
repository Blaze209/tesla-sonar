package org.spongycastle.dvcs;

/* JADX INFO: loaded from: classes10.dex */
public class DVCSException extends Exception {
    private static final long serialVersionUID = 389345256020131488L;
    private Throwable cause;

    public DVCSException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public DVCSException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}
