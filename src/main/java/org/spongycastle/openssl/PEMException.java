package org.spongycastle.openssl;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class PEMException extends IOException {
    Exception underlying;

    public PEMException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.underlying;
    }

    public Exception getUnderlyingException() {
        return this.underlying;
    }

    public PEMException(String str, Exception exc) {
        super(str);
        this.underlying = exc;
    }
}
