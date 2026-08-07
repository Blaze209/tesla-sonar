package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class ErrorResponse_Error_UnknownErrorJsonAdapter extends h<ErrorResponse.Error.UnknownError> {
    private final h<String> nullableStringAdapter;
    private final k.b options = k.b.a("title", "originalCode");

    public ErrorResponse_Error_UnknownErrorJsonAdapter(u uVar) {
        this.nullableStringAdapter = uVar.f(String.class, d1.d(), "title");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ErrorResponse.Error.UnknownError");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public ErrorResponse.Error.UnknownError fromJson(k kVar) {
        kVar.h();
        String strFromJson = null;
        String strFromJson2 = null;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(kVar);
            } else if (iT == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(kVar);
            }
        }
        kVar.j();
        return new ErrorResponse.Error.UnknownError(strFromJson, strFromJson2);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, ErrorResponse.Error.UnknownError unknownError) {
        if (unknownError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("title");
        this.nullableStringAdapter.toJson(rVar, unknownError.getTitle());
        rVar.b0("originalCode");
        this.nullableStringAdapter.toJson(rVar, unknownError.getOriginalCode());
        rVar.C();
    }
}
