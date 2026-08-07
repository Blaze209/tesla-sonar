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
public final class GenericFileUploadErrorResponseJsonAdapter extends h<GenericFileUploadErrorResponse> {
    private final h<List<GenericFileUploadErrorResponse.DocumentErrorResponse>> listOfDocumentErrorResponseAdapter;
    private final k.b options = k.b.a("errors");

    public GenericFileUploadErrorResponseJsonAdapter(u uVar) {
        this.listOfDocumentErrorResponseAdapter = uVar.f(y.j(List.class, GenericFileUploadErrorResponse.DocumentErrorResponse.class), d1.d(), "errors");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("GenericFileUploadErrorResponse");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public GenericFileUploadErrorResponse fromJson(k kVar) {
        kVar.h();
        List<GenericFileUploadErrorResponse.DocumentErrorResponse> listFromJson = null;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0 && (listFromJson = this.listOfDocumentErrorResponseAdapter.fromJson(kVar)) == null) {
                throw v20.c.x("errors", "errors", kVar);
            }
        }
        kVar.j();
        if (listFromJson != null) {
            return new GenericFileUploadErrorResponse(listFromJson);
        }
        throw v20.c.o("errors", "errors", kVar);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, GenericFileUploadErrorResponse genericFileUploadErrorResponse) {
        if (genericFileUploadErrorResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("errors");
        this.listOfDocumentErrorResponseAdapter.toJson(rVar, genericFileUploadErrorResponse.getErrors());
        rVar.C();
    }
}
