package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class M7 implements InterfaceC3974w7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f26897b = OcrCountryAndTypeValidator.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OcrCountryAndTypeValidator f26898a;

    public M7(OcrCountryAndTypeValidator ocrValidator) {
        p013kotlin.jvm.internal.s.k(ocrValidator, "ocrValidator");
        this.f26898a = ocrValidator;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3974w7
    public Object a(C3893uD c3893uD, C3936vD c3936vD, Continuation continuation) {
        jn0.w<String, ? extends DocumentType, String> wVarA = a(c3893uD);
        if (wVarA == null) {
            return p013kotlin.collections.v.m();
        }
        List listM1 = p013kotlin.collections.v.m1(this.f26898a.validate2(wVarA));
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listM1, 10));
        Iterator it = listM1.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4017x7.a((OcrValidationError) it.next()));
        }
        return arrayList;
    }

    private final jn0.w a(C3893uD c3893uD) {
        String strC;
        String strB;
        DocumentType documentType;
        C4023xD c4023xDB = c3893uD.b();
        if (c4023xDB == null || (strC = c4023xDB.c()) == null || (strB = c3893uD.b().b()) == null || (documentType = CountryNetworkModelKt.toDocumentType(strB, strC)) == null) {
            return null;
        }
        C3980wD c3980wDA = c3893uD.a();
        return new jn0.w(strC, documentType, c3980wDA != null ? c3980wDA.c() : null);
    }
}
