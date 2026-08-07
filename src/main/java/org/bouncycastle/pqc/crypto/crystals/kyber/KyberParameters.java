package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes10.dex */
public class KyberParameters implements KEMParameters {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f99050k;
    private final String name;
    private final int sessionKeySize;
    private final boolean usingAes;
    public static final KyberParameters kyber512 = new KyberParameters("kyber512", 2, 256, false);
    public static final KyberParameters kyber768 = new KyberParameters("kyber768", 3, 256, false);
    public static final KyberParameters kyber1024 = new KyberParameters("kyber1024", 4, 256, false);

    private KyberParameters(String str, int i11, int i12, boolean z11) {
        this.name = str;
        this.f99050k = i11;
        this.sessionKeySize = i12;
        this.usingAes = z11;
    }

    KyberEngine getEngine() {
        return new KyberEngine(this.f99050k, this.usingAes);
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return this.sessionKeySize;
    }
}
