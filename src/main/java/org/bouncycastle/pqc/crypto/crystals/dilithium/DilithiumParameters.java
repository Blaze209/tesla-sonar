package org.bouncycastle.pqc.crypto.crystals.dilithium;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public class DilithiumParameters {
    public static final DilithiumParameters dilithium2 = new DilithiumParameters("dilithium2", 2, false);
    public static final DilithiumParameters dilithium3 = new DilithiumParameters("dilithium3", 3, false);
    public static final DilithiumParameters dilithium5 = new DilithiumParameters("dilithium5", 5, false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f99041k;
    private final String name;
    private final boolean usingAES;

    private DilithiumParameters(String str, int i11, boolean z11) {
        this.name = str;
        this.f99041k = i11;
        this.usingAES = z11;
    }

    DilithiumEngine getEngine(SecureRandom secureRandom) {
        return new DilithiumEngine(this.f99041k, secureRandom, this.usingAES);
    }

    public String getName() {
        return this.name;
    }
}
