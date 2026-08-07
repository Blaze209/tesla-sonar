package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details> {
    private final h<Integer> intAdapter;
    private final k.b options = k.b.a("min_dimension_size", "max_dimension_size");

    public GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter(u uVar) {
        this.intAdapter = uVar.f(Integer.TYPE, d1.d(), "minDimensionSize");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(113);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details fromJson(k kVar) {
        kVar.h();
        Integer numFromJson = null;
        Integer numFromJson2 = null;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0) {
                numFromJson = this.intAdapter.fromJson(kVar);
                if (numFromJson == null) {
                    throw v20.c.x("minDimensionSize", "min_dimension_size", kVar);
                }
            } else if (iT == 1 && (numFromJson2 = this.intAdapter.fromJson(kVar)) == null) {
                throw v20.c.x("maxDimensionSize", "max_dimension_size", kVar);
            }
        }
        kVar.j();
        if (numFromJson == null) {
            throw v20.c.o("minDimensionSize", "min_dimension_size", kVar);
        }
        int iIntValue = numFromJson.intValue();
        if (numFromJson2 != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details(iIntValue, numFromJson2.intValue());
        }
        throw v20.c.o("maxDimensionSize", "max_dimension_size", kVar);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("min_dimension_size");
        this.intAdapter.toJson(rVar, Integer.valueOf(details.getMinDimensionSize()));
        rVar.b0("max_dimension_size");
        this.intAdapter.toJson(rVar, Integer.valueOf(details.getMaxDimensionSize()));
        rVar.C();
    }
}
