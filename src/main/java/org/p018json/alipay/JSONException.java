package org.p018json.alipay;

/* JADX INFO: loaded from: classes10.dex */
public class JSONException extends Exception {
    private Throwable cause;

    public JSONException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public JSONException(Throwable th2) {
        super(th2.getMessage());
        this.cause = th2;
    }
}
