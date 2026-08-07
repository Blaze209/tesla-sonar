package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedFileErrorJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError> {
    private final h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError.Details> detailsAdapter;
    private final k.b options = k.b.a("title", "code", "details");
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedFileErrorJsonAdapter(u uVar) {
        this.stringAdapter = uVar.f(String.class, d1.d(), "title");
        this.detailsAdapter = uVar.f(GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError.Details.class, d1.d(), "details");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(93);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError fromJson(k kVar) {
        kVar.h();
        String strFromJson = null;
        String strFromJson2 = null;
        GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError.Details detailsFromJson = null;
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
            } else if (iT == 1) {
                strFromJson2 = this.stringAdapter.fromJson(kVar);
                if (strFromJson2 == null) {
                    throw v20.c.x("code", "code", kVar);
                }
            } else if (iT == 2 && (detailsFromJson = this.detailsAdapter.fromJson(kVar)) == null) {
                throw v20.c.x("details", "details", kVar);
            }
        }
        kVar.j();
        if (strFromJson == null) {
            throw v20.c.o("title", "title", kVar);
        }
        if (strFromJson2 == null) {
            throw v20.c.o("code", "code", kVar);
        }
        if (detailsFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError(strFromJson, strFromJson2, detailsFromJson);
        }
        throw v20.c.o("details", "details", kVar);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError malformedFileError) {
        if (malformedFileError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("title");
        this.stringAdapter.toJson(rVar, malformedFileError.getTitle());
        rVar.b0("code");
        this.stringAdapter.toJson(rVar, malformedFileError.getCode());
        rVar.b0("details");
        this.detailsAdapter.toJson(rVar, malformedFileError.getDetails());
        rVar.C();
    }
}
