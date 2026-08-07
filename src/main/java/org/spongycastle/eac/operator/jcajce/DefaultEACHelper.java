package org.spongycastle.eac.operator.jcajce;

import java.security.Signature;

/* JADX INFO: loaded from: classes10.dex */
class DefaultEACHelper extends EACHelper {
    DefaultEACHelper() {
    }

    @Override // org.spongycastle.eac.operator.jcajce.EACHelper
    protected Signature createSignature(String str) {
        return Signature.getInstance(str);
    }
}
