package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;

/* JADX INFO: loaded from: classes4.dex */
public final class Ow implements Dy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27254a;

    public Ow(boolean z11) {
        this.f27254a = z11;
    }

    @Override // com.fourthline.orca.internal.Dy
    public boolean a(G5 g11, MA taxationCountry, DocumentType documentType) {
        p013kotlin.jvm.internal.s.k(taxationCountry, "taxationCountry");
        return !this.f27254a;
    }
}
