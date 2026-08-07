package org.spongycastle.cms;

/* JADX INFO: loaded from: classes10.dex */
public class CMSRuntimeException extends RuntimeException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Exception f99416e;

    public CMSRuntimeException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f99416e;
    }

    public Exception getUnderlyingException() {
        return this.f99416e;
    }

    public CMSRuntimeException(String str, Exception exc) {
        super(str);
        this.f99416e = exc;
    }
}
