package org.spongycastle.cms;

/* JADX INFO: loaded from: classes10.dex */
public class CMSException extends Exception {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Exception f99415e;

    public CMSException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f99415e;
    }

    public Exception getUnderlyingException() {
        return this.f99415e;
    }

    public CMSException(String str, Exception exc) {
        super(str);
        this.f99415e = exc;
    }
}
