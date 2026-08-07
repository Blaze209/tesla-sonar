package com.fourthline.core.mrz.internal.validation.idl;

import com.fourthline.core.mrz.IdlMrzInfoValidationError;
import com.fourthline.core.mrz.internal.validation.d;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.fourthline.core.mrz.internal.validation.b f24309a;

    public b(com.fourthline.core.mrz.internal.validation.b checksumValidator) {
        s.k(checksumValidator, "checksumValidator");
        this.f24309a = checksumValidator;
    }

    private final IdlMrzInfoValidationError b(com.fourthline.core.mrz.internal.parsing.model.b bVar) {
        if (this.f24309a.a(bVar.c(), bVar.b())) {
            return null;
        }
        return IdlMrzInfoValidationError.INVALID_TOTAL_CHECKSUM;
    }

    @Override // com.fourthline.core.mrz.internal.validation.d
    public List a(com.fourthline.core.mrz.internal.parsing.model.d parsedMrz) {
        s.k(parsedMrz, "parsedMrz");
        if (!(parsedMrz instanceof com.fourthline.core.mrz.internal.parsing.model.b)) {
            throw new IllegalArgumentException("This PARSED MRZ type is not supported.");
        }
        com.fourthline.core.mrz.internal.parsing.model.b bVar = (com.fourthline.core.mrz.internal.parsing.model.b) parsedMrz;
        return v.r(a(bVar), b(bVar));
    }

    public /* synthetic */ b(com.fourthline.core.mrz.internal.validation.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new com.fourthline.core.mrz.internal.validation.b() : bVar);
    }

    private final IdlMrzInfoValidationError a(com.fourthline.core.mrz.internal.parsing.model.b bVar) {
        String strA = bVar.a();
        for (int i11 = 0; i11 < strA.length(); i11++) {
            if (!Character.isDigit(strA.charAt(i11))) {
                return IdlMrzInfoValidationError.INVALID_DOCUMENT_NUMBER;
            }
        }
        return null;
    }
}
