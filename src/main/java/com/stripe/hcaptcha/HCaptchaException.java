package com.stripe.hcaptcha;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import u90.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001a2\u00060\u0001j\u0002`\u0002:\u0001\u000fJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0005R\u0014\u0010\u0019\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0005¨\u0006\u001b"}, d2 = {"Lcom/stripe/hcaptcha/HCaptchaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lu90/a;", "a", "Lu90/a;", "getHCaptchaError", "()Lu90/a;", "hCaptchaError", "b", "Ljava/lang/String;", "getHCaptchaMessage", "hCaptchaMessage", "getMessage", "message", "c", "hcaptcha_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HCaptchaException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a hCaptchaError;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hCaptchaMessage;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HCaptchaException)) {
            return false;
        }
        HCaptchaException hCaptchaException = (HCaptchaException) other;
        return this.hCaptchaError == hCaptchaException.hCaptchaError && s.f(this.hCaptchaMessage, hCaptchaException.hCaptchaMessage);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.hCaptchaMessage;
        return str == null ? this.hCaptchaError.getMessage() : str;
    }

    public int hashCode() {
        int iHashCode = this.hCaptchaError.hashCode() * 31;
        String str = this.hCaptchaMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "HCaptchaException(hCaptchaError=" + this.hCaptchaError + ", hCaptchaMessage=" + this.hCaptchaMessage + ")";
    }
}
