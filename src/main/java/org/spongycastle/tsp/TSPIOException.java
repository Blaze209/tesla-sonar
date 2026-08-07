package org.spongycastle.tsp;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class TSPIOException extends IOException {
    Throwable underlyingException;

    public TSPIOException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.underlyingException;
    }

    public Exception getUnderlyingException() {
        return (Exception) this.underlyingException;
    }

    public TSPIOException(String str, Throwable th2) {
        super(str);
        this.underlyingException = th2;
    }
}
