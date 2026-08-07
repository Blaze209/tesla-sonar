package org.spongycastle.cms;

/* JADX INFO: loaded from: classes10.dex */
public class CMSAttributeTableGenerationException extends CMSRuntimeException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Exception f99414e;

    public CMSAttributeTableGenerationException(String str) {
        super(str);
    }

    @Override // org.spongycastle.cms.CMSRuntimeException, java.lang.Throwable
    public Throwable getCause() {
        return this.f99414e;
    }

    @Override // org.spongycastle.cms.CMSRuntimeException
    public Exception getUnderlyingException() {
        return this.f99414e;
    }

    public CMSAttributeTableGenerationException(String str, Exception exc) {
        super(str);
        this.f99414e = exc;
    }
}
