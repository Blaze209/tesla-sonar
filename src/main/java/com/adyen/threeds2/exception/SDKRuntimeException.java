package com.adyen.threeds2.exception;

/* JADX INFO: loaded from: classes3.dex */
public final class SDKRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 3282225212522028461L;
    private final String mErrorCode;

    public SDKRuntimeException(String str, String str2, Throwable th2) {
        super(str, th2);
        this.mErrorCode = str2;
    }

    public final String getErrorCode() {
        return this.mErrorCode;
    }
}
