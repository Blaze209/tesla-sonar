package com.fourthline.core.mrz.internal.validation.mrtd;

import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.internal.parsing.model.c;
import com.fourthline.core.mrz.internal.validation.d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f24312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.fourthline.core.mrz.internal.validation.b f24313b;

    public b(Map supportedCountries, com.fourthline.core.mrz.internal.validation.b checksumValidator) {
        s.k(supportedCountries, "supportedCountries");
        s.k(checksumValidator, "checksumValidator");
        this.f24312a = supportedCountries;
        this.f24313b = checksumValidator;
    }

    private final MrtdMrzInfoValidationError b(c cVar) {
        if (cVar.d().length() == 0 || cVar.d().length() > 2 || c(cVar.d())) {
            return MrtdMrzInfoValidationError.INVALID_DOCUMENT_CODE;
        }
        return null;
    }

    private final MrtdMrzInfoValidationError c(c cVar) {
        com.fourthline.core.mrz.internal.parsing.model.a aVarE = cVar.e();
        String strA = aVarE.a();
        for (int i11 = 0; i11 < strA.length(); i11++) {
            if (strA.charAt(i11) == '<') {
                return MrtdMrzInfoValidationError.INVALID_DOCUMENT_NUMBER;
            }
        }
        if (this.f24313b.a(aVarE.d(), aVarE.b())) {
            return null;
        }
        return MrtdMrzInfoValidationError.INVALID_DOCUMENT_NUMBER;
    }

    private final MrtdMrzInfoValidationError d(c cVar) {
        if (s.f(cVar.d() + cVar.k(), "IDFRA")) {
            return null;
        }
        if (cVar.f() != null) {
            String strH = cVar.h();
            if (strH.length() == 6 && !b(strH) && this.f24313b.a(strH, cVar.g())) {
                return null;
            }
        }
        return MrtdMrzInfoValidationError.INVALID_EXPIRATION_DATE;
    }

    private final MrtdMrzInfoValidationError e(c cVar) {
        if (a(cVar.i())) {
            return MrtdMrzInfoValidationError.INVALID_FIRST_NAMES;
        }
        return null;
    }

    private final MrtdMrzInfoValidationError f(c cVar) {
        String strJ = cVar.j();
        for (int i11 = 0; i11 < strJ.length(); i11++) {
            char cCharAt = strJ.charAt(i11);
            if (cCharAt == 'F' || cCharAt == 'M' || cCharAt == '<') {
                return null;
            }
        }
        return MrtdMrzInfoValidationError.INVALID_GENDER;
    }

    private final MrtdMrzInfoValidationError g(c cVar) {
        if (a(cVar.k())) {
            return MrtdMrzInfoValidationError.INVALID_ISSUING_COUNTRY;
        }
        return null;
    }

    private final MrtdMrzInfoValidationError h(c cVar) {
        if (a(cVar.l())) {
            return MrtdMrzInfoValidationError.INVALID_LAST_NAMES;
        }
        return null;
    }

    private final MrtdMrzInfoValidationError i(c cVar) {
        if (a(cVar.m())) {
            return MrtdMrzInfoValidationError.INVALID_NATIONALITY;
        }
        return null;
    }

    private final MrtdMrzInfoValidationError j(c cVar) {
        if (this.f24313b.a(cVar.p(), cVar.o())) {
            return null;
        }
        return MrtdMrzInfoValidationError.INVALID_TOTAL_CHECKSUM;
    }

    private final MrtdMrzInfoValidationError k(c cVar) {
        if (cVar.q()) {
            return MrtdMrzInfoValidationError.TRUNCATED_NAMES;
        }
        return null;
    }

    @Override // com.fourthline.core.mrz.internal.validation.d
    public List a(com.fourthline.core.mrz.internal.parsing.model.d parsedMrz) {
        s.k(parsedMrz, "parsedMrz");
        if (!(parsedMrz instanceof c)) {
            throw new IllegalArgumentException("This PARSED MRZ type is not supported.");
        }
        c cVar = (c) parsedMrz;
        return v.r(b(cVar), e(cVar), h(cVar), k(cVar), g(cVar), i(cVar), a(cVar), d(cVar), f(cVar), c(cVar), j(cVar));
    }

    private final boolean b(String str) {
        boolean z11 = false;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if ('0' > cCharAt || cCharAt >= ':') {
                return !z11;
            }
        }
        z11 = true;
        return !z11;
    }

    public /* synthetic */ b(Map map, com.fourthline.core.mrz.internal.validation.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new com.fourthline.core.mrz.internal.validation.c().a() : map, (i11 & 2) != 0 ? new com.fourthline.core.mrz.internal.validation.b() : bVar);
    }

    private final boolean c(String str) {
        boolean z11 = false;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if ('A' > cCharAt || cCharAt >= '[') {
                return !z11;
            }
        }
        z11 = true;
        return !z11;
    }

    private final MrtdMrzInfoValidationError a(c cVar) {
        if (cVar.a() != null) {
            String strC = cVar.c();
            if (strC.length() <= 6 && !b(strC) && this.f24313b.a(strC, cVar.b())) {
                return null;
            }
        }
        return MrtdMrzInfoValidationError.INVALID_BIRTH_DATE;
    }

    private final boolean a(List list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() == 0 || c(str)) {
                return true;
            }
        }
        return false;
    }

    private final boolean a(String str) {
        Map map = this.f24312a;
        if (map.isEmpty()) {
            return true;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (s.f(((Map.Entry) it.next()).getValue(), str)) {
                return false;
            }
        }
        return true;
    }
}
