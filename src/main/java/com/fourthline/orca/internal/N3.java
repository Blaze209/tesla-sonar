package com.fourthline.orca.internal;

import com.fourthline.nfc.NfcScannerSecurityKey;

/* JADX INFO: loaded from: classes4.dex */
public final class N3 implements Qn {
    @Override // com.fourthline.orca.internal.Qn
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Jn.b a(C4104z8 bundle, Jp personBundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        String strF = bundle.f();
        if (strF != null) {
            return new Jn.b(NfcScannerSecurityKey.INSTANCE.createWithMrtdCanNumber(strF));
        }
        return null;
    }
}
