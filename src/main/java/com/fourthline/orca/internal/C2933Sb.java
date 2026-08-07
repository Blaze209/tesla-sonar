package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import java.util.ArrayList;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2933Sb implements InterfaceC3974w7 {
    @Override // com.fourthline.orca.internal.InterfaceC3974w7
    public Object a(C3893uD c3893uD, C3936vD c3936vD, Continuation continuation) {
        ArrayList arrayList = new ArrayList();
        String strD = c3936vD != null ? c3936vD.d() : null;
        if (strD != null && !a(c3893uD, strD)) {
            arrayList.add(AbstractC3641oc.f.f34199a);
        }
        if (strD != null && !a(c3893uD, c3936vD.c(), strD)) {
            arrayList.add(AbstractC3641oc.d.f34197a);
        }
        return arrayList;
    }

    private final boolean a(C3893uD c3893uD, String str) {
        String strC;
        C4023xD c4023xDB = c3893uD.b();
        if (c4023xDB == null || (strC = c4023xDB.c()) == null) {
            return true;
        }
        return p013kotlin.text.t.M(strC, str, true);
    }

    private final boolean a(C3893uD c3893uD, DocumentType documentType, String str) {
        String strB;
        C4023xD c4023xDB = c3893uD.b();
        return c4023xDB == null || (strB = c4023xDB.b()) == null || a(CountryNetworkModelKt.toDocumentType(strB, str)) == a(documentType);
    }

    private final DocumentType a(DocumentType documentType) {
        return documentType == DocumentType.FRENCH_ID_CARD ? DocumentType.ID_CARD : documentType;
    }
}
