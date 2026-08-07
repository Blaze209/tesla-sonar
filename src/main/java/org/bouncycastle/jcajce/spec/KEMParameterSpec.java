package org.bouncycastle.jcajce.spec;

/* JADX INFO: loaded from: classes9.dex */
public class KEMParameterSpec extends KTSParameterSpec {
    public KEMParameterSpec(String str) {
        this(str, 256);
    }

    public int getKeySizeInBits() {
        return getKeySize();
    }

    public KEMParameterSpec(String str, int i11) {
        super(str, i11, null, null, null);
    }
}
