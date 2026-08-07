package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.ocr.ExpirationDateData;
import com.fourthline.vision.document.ocr.OcrBirthDateValidator;
import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.fourthline.vision.document.ocr.OcrDocumentExpirationDateValidator;
import com.fourthline.vision.document.ocr.OcrValidationError;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class N6 implements InterfaceC3974w7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27015e = (OcrDocumentExpirationDateValidator.$stable | OcrCountryAndTypeValidator.$stable) | OcrBirthDateValidator.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OcrBirthDateValidator f27016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OcrCountryAndTypeValidator f27017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OcrDocumentExpirationDateValidator f27018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3974w7 f27019d;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27022c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27024e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27022c = obj;
            this.f27024e |= Integer.MIN_VALUE;
            return N6.this.a(null, null, this);
        }
    }

    public N6(OcrBirthDateValidator birthDateValidator, OcrCountryAndTypeValidator countryAndTypeValidator, OcrDocumentExpirationDateValidator documentExpirationDateValidator, InterfaceC3974w7 documentSelectionValidator) {
        p013kotlin.jvm.internal.s.k(birthDateValidator, "birthDateValidator");
        p013kotlin.jvm.internal.s.k(countryAndTypeValidator, "countryAndTypeValidator");
        p013kotlin.jvm.internal.s.k(documentExpirationDateValidator, "documentExpirationDateValidator");
        p013kotlin.jvm.internal.s.k(documentSelectionValidator, "documentSelectionValidator");
        this.f27016a = birthDateValidator;
        this.f27017b = countryAndTypeValidator;
        this.f27018c = documentExpirationDateValidator;
        this.f27019d = documentSelectionValidator;
    }

    private final Date b(C3980wD c3980wD) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String strB = c3980wD.b();
        if (strB != null) {
            return simpleDateFormat.parse(strB);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3974w7
    public Object a(C3893uD c3893uD, C3936vD c3936vD, Continuation continuation) {
        a aVar;
        List list;
        List list2;
        Date dateB;
        Date dateA;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f27024e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f27024e = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f27022c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f27024e;
        if (i12 == 0) {
            jn0.t.b(objA);
            ArrayList arrayList = new ArrayList();
            jn0.w<String, ? extends DocumentType, String> wVarA = a(c3893uD);
            if (wVarA != null) {
                Boxing.boxBoolean(arrayList.addAll(this.f27017b.validate2(wVarA)));
            }
            C3980wD c3980wDA = c3893uD.a();
            if (c3980wDA != null && (dateA = a(c3980wDA)) != null) {
                Boxing.boxBoolean(arrayList.addAll(this.f27016a.validate(dateA)));
            }
            C3980wD c3980wDA2 = c3893uD.a();
            if (c3980wDA2 != null && (dateB = b(c3980wDA2)) != null) {
                Boxing.boxBoolean(arrayList.addAll(this.f27018c.validate(new ExpirationDateData(c3936vD != null ? c3936vD.d() : null, c3936vD != null ? c3936vD.c() : null, dateB))));
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(AbstractC4017x7.a((OcrValidationError) it.next()));
            }
            arrayList2.addAll(arrayList3);
            InterfaceC3974w7 interfaceC3974w7 = this.f27019d;
            aVar.f27020a = arrayList2;
            aVar.f27021b = arrayList2;
            aVar.f27024e = 1;
            objA = interfaceC3974w7.a(c3893uD, c3936vD, aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList2;
            list2 = list;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) aVar.f27021b;
            list2 = (List) aVar.f27020a;
            jn0.t.b(objA);
        }
        list.addAll((Collection) objA);
        return list2;
    }

    private final jn0.w a(C3893uD c3893uD) {
        String strC;
        C4023xD c4023xDB = c3893uD.b();
        if (c4023xDB == null || (strC = c4023xDB.c()) == null) {
            return null;
        }
        String strB = c3893uD.b().b();
        DocumentType documentType = strB != null ? CountryNetworkModelKt.toDocumentType(strB, strC) : null;
        C3980wD c3980wDA = c3893uD.a();
        return O6.b(strC, documentType, c3980wDA != null ? c3980wDA.c() : null);
    }

    private final Date a(C3980wD c3980wD) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String strA = c3980wD.a();
        if (strA != null) {
            return simpleDateFormat.parse(strA);
        }
        return null;
    }
}
