package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes9.dex */
public class ARIAWrapEngine extends RFC3394WrapEngine {
    public ARIAWrapEngine() {
        super(new ARIAEngine());
    }

    public ARIAWrapEngine(boolean z11) {
        super(new ARIAEngine(), z11);
    }
}
