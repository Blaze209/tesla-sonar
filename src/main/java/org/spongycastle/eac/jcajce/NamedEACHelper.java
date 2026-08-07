package org.spongycastle.eac.jcajce;

import java.security.KeyFactory;

/* JADX INFO: loaded from: classes10.dex */
class NamedEACHelper implements EACHelper {
    private final String providerName;

    NamedEACHelper(String str) {
        this.providerName = str;
    }

    @Override // org.spongycastle.eac.jcajce.EACHelper
    public KeyFactory createKeyFactory(String str) {
        return KeyFactory.getInstance(str, this.providerName);
    }
}
