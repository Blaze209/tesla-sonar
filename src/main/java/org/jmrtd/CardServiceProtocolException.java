package org.jmrtd;

import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes10.dex */
public class CardServiceProtocolException extends CardServiceException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f99305b;

    public CardServiceProtocolException(String str, int i11) {
        super(str);
        this.f99305b = i11;
    }

    @Override // net.sf.scuba.smartcards.CardServiceException, java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + " (step: " + this.f99305b + ")";
    }

    public CardServiceProtocolException(String str, int i11, Throwable th2) {
        super(str, th2);
        this.f99305b = i11;
    }

    public CardServiceProtocolException(String str, int i11, int i12) {
        super(str, i12);
        this.f99305b = i11;
    }
}
