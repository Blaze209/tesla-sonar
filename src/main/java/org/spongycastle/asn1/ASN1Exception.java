package org.spongycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class ASN1Exception extends IOException {
    private Throwable cause;

    ASN1Exception(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    ASN1Exception(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}
