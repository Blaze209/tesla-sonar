package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;

/* JADX INFO: loaded from: classes8.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedImageError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details> {
    private final k.b options = k.b.a(new String[0]);

    public GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedImageError_DetailsJsonAdapter(u uVar) {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(102);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details fromJson(k kVar) {
        kVar.h();
        while (kVar.hasNext()) {
            if (kVar.T(this.options) == -1) {
                kVar.e0();
                kVar.F();
            }
        }
        kVar.j();
        return new GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details();
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.C();
    }
}
