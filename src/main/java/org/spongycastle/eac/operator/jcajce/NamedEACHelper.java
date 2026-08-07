package org.spongycastle.eac.operator.jcajce;

import java.security.Signature;

/* JADX INFO: loaded from: classes10.dex */
class NamedEACHelper extends EACHelper {
    private final String providerName;

    NamedEACHelper(String str) {
        this.providerName = str;
    }

    @Override // org.spongycastle.eac.operator.jcajce.EACHelper
    protected Signature createSignature(String str) {
        return Signature.getInstance(str, this.providerName);
    }
}
