package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;

/* JADX INFO: loaded from: classes4.dex */
public final class Ci implements Dy {
    @Override // com.fourthline.orca.internal.Dy
    public boolean a(G5 g11, MA taxationCountry, DocumentType documentType) {
        p013kotlin.jvm.internal.s.k(taxationCountry, "taxationCountry");
        if (p013kotlin.jvm.internal.s.f(g11 != null ? g11.c() : null, taxationCountry.d())) {
            return documentType == DocumentType.ID_CARD || documentType == DocumentType.RESIDENCE_PERMIT;
        }
        return false;
    }
}
