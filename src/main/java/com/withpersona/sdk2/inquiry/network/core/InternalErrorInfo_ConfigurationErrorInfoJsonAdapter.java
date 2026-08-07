package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class InternalErrorInfo_ConfigurationErrorInfoJsonAdapter extends h<InternalErrorInfo.ConfigurationErrorInfo> {
    private final k.b options = k.b.a("message");
    private final h<String> stringAdapter;

    public InternalErrorInfo_ConfigurationErrorInfoJsonAdapter(u uVar) {
        this.stringAdapter = uVar.f(String.class, d1.d(), "message");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("InternalErrorInfo.ConfigurationErrorInfo");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public InternalErrorInfo.ConfigurationErrorInfo fromJson(k kVar) {
        kVar.h();
        String strFromJson = null;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0 && (strFromJson = this.stringAdapter.fromJson(kVar)) == null) {
                throw v20.c.x("message", "message", kVar);
            }
        }
        kVar.j();
        if (strFromJson != null) {
            return new InternalErrorInfo.ConfigurationErrorInfo(strFromJson);
        }
        throw v20.c.o("message", "message", kVar);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, InternalErrorInfo.ConfigurationErrorInfo configurationErrorInfo) {
        if (configurationErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("message");
        this.stringAdapter.toJson(rVar, configurationErrorInfo.getMessage());
        rVar.C();
    }
}
