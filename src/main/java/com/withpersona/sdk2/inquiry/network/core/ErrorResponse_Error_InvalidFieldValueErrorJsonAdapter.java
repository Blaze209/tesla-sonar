package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.util.Map;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class ErrorResponse_Error_InvalidFieldValueErrorJsonAdapter extends h<ErrorResponse.Error.InvalidFieldValueError> {
    private final h<Map<String, UiComponentError>> nullableMapOfStringUiComponentErrorAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options = k.b.a("title", "details");

    public ErrorResponse_Error_InvalidFieldValueErrorJsonAdapter(u uVar) {
        this.nullableStringAdapter = uVar.f(String.class, d1.d(), "title");
        this.nullableMapOfStringUiComponentErrorAdapter = uVar.f(y.j(Map.class, String.class, UiComponentError.class), d1.d(), "details");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ErrorResponse.Error.InvalidFieldValueError");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public ErrorResponse.Error.InvalidFieldValueError fromJson(k kVar) {
        kVar.h();
        String strFromJson = null;
        Map<String, UiComponentError> mapFromJson = null;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(kVar);
            } else if (iT == 1) {
                mapFromJson = this.nullableMapOfStringUiComponentErrorAdapter.fromJson(kVar);
            }
        }
        kVar.j();
        return new ErrorResponse.Error.InvalidFieldValueError(strFromJson, mapFromJson);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, ErrorResponse.Error.InvalidFieldValueError invalidFieldValueError) {
        if (invalidFieldValueError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("title");
        this.nullableStringAdapter.toJson(rVar, invalidFieldValueError.getTitle());
        rVar.b0("details");
        this.nullableMapOfStringUiComponentErrorAdapter.toJson(rVar, invalidFieldValueError.getDetails());
        rVar.C();
    }
}
