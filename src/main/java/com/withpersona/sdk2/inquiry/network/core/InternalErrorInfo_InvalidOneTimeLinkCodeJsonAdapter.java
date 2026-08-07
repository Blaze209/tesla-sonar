package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class InternalErrorInfo_InvalidOneTimeLinkCodeJsonAdapter extends h<InternalErrorInfo.InvalidOneTimeLinkCode> {
    private final k.b options = k.b.a("oneTimeLinkCode");
    private final h<String> stringAdapter;

    public InternalErrorInfo_InvalidOneTimeLinkCodeJsonAdapter(u uVar) {
        this.stringAdapter = uVar.f(String.class, d1.d(), "oneTimeLinkCode");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("InternalErrorInfo.InvalidOneTimeLinkCode");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public InternalErrorInfo.InvalidOneTimeLinkCode fromJson(k kVar) {
        kVar.h();
        String strFromJson = null;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0 && (strFromJson = this.stringAdapter.fromJson(kVar)) == null) {
                throw v20.c.x("oneTimeLinkCode", "oneTimeLinkCode", kVar);
            }
        }
        kVar.j();
        if (strFromJson != null) {
            return new InternalErrorInfo.InvalidOneTimeLinkCode(strFromJson);
        }
        throw v20.c.o("oneTimeLinkCode", "oneTimeLinkCode", kVar);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, InternalErrorInfo.InvalidOneTimeLinkCode invalidOneTimeLinkCode) {
        if (invalidOneTimeLinkCode == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("oneTimeLinkCode");
        this.stringAdapter.toJson(rVar, invalidOneTimeLinkCode.getOneTimeLinkCode());
        rVar.C();
    }
}
