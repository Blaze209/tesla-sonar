package org.spongycastle.asn1.x9;

/* JADX INFO: loaded from: classes10.dex */
public abstract class X9ECParametersHolder {
    private X9ECParameters params;

    protected abstract X9ECParameters createParameters();

    public synchronized X9ECParameters getParameters() {
        try {
            if (this.params == null) {
                this.params = createParameters();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.params;
    }
}
