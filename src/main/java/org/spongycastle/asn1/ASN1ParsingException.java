package org.spongycastle.asn1;

/* JADX INFO: loaded from: classes10.dex */
public class ASN1ParsingException extends IllegalStateException {
    private Throwable cause;

    public ASN1ParsingException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ASN1ParsingException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}
