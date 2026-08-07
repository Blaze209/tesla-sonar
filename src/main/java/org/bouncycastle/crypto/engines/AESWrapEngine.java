package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes9.dex */
public class AESWrapEngine extends RFC3394WrapEngine {
    public AESWrapEngine() {
        super(AESEngine.newInstance());
    }

    public AESWrapEngine(boolean z11) {
        super(AESEngine.newInstance(), z11);
    }
}
