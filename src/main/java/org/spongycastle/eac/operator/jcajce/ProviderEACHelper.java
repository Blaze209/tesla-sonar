package org.spongycastle.eac.operator.jcajce;

import java.security.Provider;
import java.security.Signature;

/* JADX INFO: loaded from: classes10.dex */
class ProviderEACHelper extends EACHelper {
    private final Provider provider;

    ProviderEACHelper(Provider provider) {
        this.provider = provider;
    }

    @Override // org.spongycastle.eac.operator.jcajce.EACHelper
    protected Signature createSignature(String str) {
        return Signature.getInstance(str, this.provider);
    }
}
