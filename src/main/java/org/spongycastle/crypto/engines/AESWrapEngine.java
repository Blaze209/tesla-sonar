package org.spongycastle.crypto.engines;

/* JADX INFO: loaded from: classes10.dex */
public class AESWrapEngine extends RFC3394WrapEngine {
    public AESWrapEngine() {
        super(new AESEngine());
    }

    public AESWrapEngine(boolean z11) {
        super(new AESEngine(), z11);
    }
}
