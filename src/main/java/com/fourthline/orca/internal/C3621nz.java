package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3621nz implements InterfaceC3974w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f34023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f34024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2933Sb f34025c;

    public C3621nz(wn0.a selectedDocumentTypeProvider, wn0.a selectedIssuingCountryProvider, C2933Sb validator) {
        p013kotlin.jvm.internal.s.k(selectedDocumentTypeProvider, "selectedDocumentTypeProvider");
        p013kotlin.jvm.internal.s.k(selectedIssuingCountryProvider, "selectedIssuingCountryProvider");
        p013kotlin.jvm.internal.s.k(validator, "validator");
        this.f34023a = selectedDocumentTypeProvider;
        this.f34024b = selectedIssuingCountryProvider;
        this.f34025c = validator;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3974w7
    public Object a(C3893uD c3893uD, C3936vD c3936vD, Continuation continuation) {
        G5 g11 = (G5) this.f34024b.invoke();
        C3936vD c3936vD2 = null;
        String strC = g11 != null ? g11.c() : null;
        DocumentType documentType = (DocumentType) this.f34023a.invoke();
        if (strC != null && documentType != null) {
            c3936vD2 = new C3936vD(strC, documentType, null, Boxing.boxBoolean(false));
        }
        return this.f34025c.a(c3893uD, c3936vD2, continuation);
    }
}
