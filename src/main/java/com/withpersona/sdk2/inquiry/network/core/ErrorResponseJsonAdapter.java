package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import java.util.List;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class ErrorResponseJsonAdapter extends h<ErrorResponse> {
    private final h<List<ErrorResponse.Error>> nullableListOfErrorAdapter;
    private final k.b options = k.b.a("errors");

    public ErrorResponseJsonAdapter(u uVar) {
        this.nullableListOfErrorAdapter = uVar.f(y.j(List.class, ErrorResponse.Error.class), d1.d(), "errors");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ErrorResponse");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public ErrorResponse fromJson(k kVar) {
        kVar.h();
        List<ErrorResponse.Error> listFromJson = null;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0) {
                listFromJson = this.nullableListOfErrorAdapter.fromJson(kVar);
            }
        }
        kVar.j();
        return new ErrorResponse(listFromJson);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, ErrorResponse errorResponse) {
        if (errorResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("errors");
        this.nullableListOfErrorAdapter.toJson(rVar, errorResponse.getErrors());
        rVar.C();
    }
}
