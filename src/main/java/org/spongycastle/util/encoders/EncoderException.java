package org.spongycastle.util.encoders;

/* JADX INFO: loaded from: classes10.dex */
public class EncoderException extends IllegalStateException {
    private Throwable cause;

    EncoderException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
