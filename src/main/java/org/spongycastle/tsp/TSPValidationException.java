package org.spongycastle.tsp;

/* JADX INFO: loaded from: classes10.dex */
public class TSPValidationException extends TSPException {
    private int failureCode;

    public TSPValidationException(String str) {
        super(str);
        this.failureCode = -1;
    }

    public int getFailureCode() {
        return this.failureCode;
    }

    public TSPValidationException(String str, int i11) {
        super(str);
        this.failureCode = i11;
    }
}
