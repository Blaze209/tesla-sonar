package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedImageErrorJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError> {
    private final h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details> detailsAdapter;
    private final k.b options = k.b.a("title", "code", "details");
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedImageErrorJsonAdapter(u uVar) {
        this.stringAdapter = uVar.f(String.class, d1.d(), "title");
        this.detailsAdapter = uVar.f(GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details.class, d1.d(), "details");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(94);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError fromJson(k kVar) {
        kVar.h();
        String strFromJson = null;
        String strFromJson2 = null;
        GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details detailsFromJson = null;
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
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError(strFromJson, strFromJson2, detailsFromJson);
        }
        throw v20.c.o("details", "details", kVar);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError malformedImageError) {
        if (malformedImageError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("title");
        this.stringAdapter.toJson(rVar, malformedImageError.getTitle());
        rVar.b0("code");
        this.stringAdapter.toJson(rVar, malformedImageError.getCode());
        rVar.b0("details");
        this.detailsAdapter.toJson(rVar, malformedImageError.getDetails());
        rVar.C();
    }
}
