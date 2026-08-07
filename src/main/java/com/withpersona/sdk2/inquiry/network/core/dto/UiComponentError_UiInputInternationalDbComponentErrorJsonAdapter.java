package com.withpersona.sdk2.inquiry.network.core.dto;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import java.util.Map;
import p013kotlin.collections.d1;
import v20.c;

/* JADX INFO: loaded from: classes8.dex */
public final class UiComponentError_UiInputInternationalDbComponentErrorJsonAdapter extends h<UiComponentError.UiInputInternationalDbComponentError> {
    private final h<Map<String, String>> mapOfStringStringAdapter;
    private final k.b options = k.b.a("name", "type", "message");
    private final h<String> stringAdapter;

    public UiComponentError_UiInputInternationalDbComponentErrorJsonAdapter(u uVar) {
        this.stringAdapter = uVar.f(String.class, d1.d(), "name");
        this.mapOfStringStringAdapter = uVar.f(y.j(Map.class, String.class, String.class), d1.d(), "message");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UiComponentError.UiInputInternationalDbComponentError");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public UiComponentError.UiInputInternationalDbComponentError fromJson(k kVar) {
        kVar.h();
        String strFromJson = null;
        String strFromJson2 = null;
        Map<String, String> mapFromJson = null;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0) {
                strFromJson = this.stringAdapter.fromJson(kVar);
                if (strFromJson == null) {
                    throw c.x("name", "name", kVar);
                }
            } else if (iT == 1) {
                strFromJson2 = this.stringAdapter.fromJson(kVar);
                if (strFromJson2 == null) {
                    throw c.x("type", "type", kVar);
                }
            } else if (iT == 2 && (mapFromJson = this.mapOfStringStringAdapter.fromJson(kVar)) == null) {
                throw c.x("message", "message", kVar);
            }
        }
        kVar.j();
        if (strFromJson == null) {
            throw c.o("name", "name", kVar);
        }
        if (strFromJson2 == null) {
            throw c.o("type", "type", kVar);
        }
        if (mapFromJson != null) {
            return new UiComponentError.UiInputInternationalDbComponentError(strFromJson, strFromJson2, mapFromJson);
        }
        throw c.o("message", "message", kVar);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, UiComponentError.UiInputInternationalDbComponentError uiInputInternationalDbComponentError) {
        if (uiInputInternationalDbComponentError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("name");
        this.stringAdapter.toJson(rVar, uiInputInternationalDbComponentError.getName());
        rVar.b0("type");
        this.stringAdapter.toJson(rVar, uiInputInternationalDbComponentError.getType());
        rVar.b0("message");
        this.mapOfStringStringAdapter.toJson(rVar, uiInputInternationalDbComponentError.getMessage());
        rVar.C();
    }
}
