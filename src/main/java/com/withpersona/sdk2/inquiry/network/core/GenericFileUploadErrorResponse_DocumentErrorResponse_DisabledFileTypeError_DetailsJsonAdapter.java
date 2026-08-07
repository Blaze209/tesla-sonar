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
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details> {
    private final h<List<String>> listOfStringAdapter;
    private final k.b options = k.b.a("uploaded_file_type", "enabled_file_types");
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeError_DetailsJsonAdapter(u uVar) {
        this.stringAdapter = uVar.f(String.class, d1.d(), "uploadedFileType");
        this.listOfStringAdapter = uVar.f(y.j(List.class, String.class), d1.d(), "enabledFileTypes");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(104);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details fromJson(k kVar) {
        kVar.h();
        String strFromJson = null;
        List<String> listFromJson = null;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0) {
                strFromJson = this.stringAdapter.fromJson(kVar);
                if (strFromJson == null) {
                    throw v20.c.x("uploadedFileType", "uploaded_file_type", kVar);
                }
            } else if (iT == 1 && (listFromJson = this.listOfStringAdapter.fromJson(kVar)) == null) {
                throw v20.c.x("enabledFileTypes", "enabled_file_types", kVar);
            }
        }
        kVar.j();
        if (strFromJson == null) {
            throw v20.c.o("uploadedFileType", "uploaded_file_type", kVar);
        }
        if (listFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details(strFromJson, listFromJson);
        }
        throw v20.c.o("enabledFileTypes", "enabled_file_types", kVar);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("uploaded_file_type");
        this.stringAdapter.toJson(rVar, details.getUploadedFileType());
        rVar.b0("enabled_file_types");
        this.listOfStringAdapter.toJson(rVar, details.getEnabledFileTypes());
        rVar.C();
    }
}
