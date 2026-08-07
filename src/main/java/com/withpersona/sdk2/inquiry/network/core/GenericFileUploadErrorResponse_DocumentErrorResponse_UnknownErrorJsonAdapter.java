package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import java.lang.reflect.Constructor;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> {
    private volatile Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> constructorRef;
    private final h<ErrorDetails> nullableErrorDetailsAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options = k.b.a("title", "code", "details");
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter(u uVar) {
        this.stringAdapter = uVar.f(String.class, d1.d(), "title");
        this.nullableStringAdapter = uVar.f(String.class, d1.d(), "code");
        this.nullableErrorDetailsAdapter = uVar.f(ErrorDetails.class, d1.d(), "details");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(87);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError fromJson(k kVar) throws NoSuchMethodException {
        kVar.h();
        String strFromJson = null;
        String strFromJson2 = null;
        ErrorDetails errorDetailsFromJson = null;
        int i11 = -1;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0) {
                strFromJson = this.stringAdapter.fromJson(kVar);
                if (strFromJson == null) {
                    throw v20.c.x("title", "title", kVar);
                }
                i11 &= -2;
            } else if (iT == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(kVar);
                i11 &= -3;
            } else if (iT == 2) {
                errorDetailsFromJson = this.nullableErrorDetailsAdapter.fromJson(kVar);
                i11 &= -5;
            }
        }
        kVar.j();
        if (i11 == -8) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(strFromJson, strFromJson2, errorDetailsFromJson);
        }
        Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError.class.getDeclaredConstructor(String.class, String.class, ErrorDetails.class, Integer.TYPE, v20.c.f117643c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(strFromJson, strFromJson2, errorDetailsFromJson, Integer.valueOf(i11), null);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError unknownError) {
        if (unknownError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("title");
        this.stringAdapter.toJson(rVar, unknownError.getTitle());
        rVar.b0("code");
        this.nullableStringAdapter.toJson(rVar, unknownError.getCode());
        rVar.b0("details");
        this.nullableErrorDetailsAdapter.toJson(rVar, unknownError.getDetails());
        rVar.C();
    }
}
