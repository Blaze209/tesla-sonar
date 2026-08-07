package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4509q extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f48048a;

    public C4509q(T0 t11) {
        this.f48048a = t11;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb2 = new StringBuilder("errorCode=");
        sb2.append(this.f48048a);
        if (super.getMessage() == null) {
            str = "";
        } else {
            str = "; " + super.getMessage();
        }
        sb2.append(str);
        return sb2.toString();
    }

    public C4509q(T0 t11, String str) {
        super(str);
        this.f48048a = t11;
    }

    public C4509q(T0 t11, Exception exc) {
        super(exc);
        this.f48048a = t11;
    }
}
