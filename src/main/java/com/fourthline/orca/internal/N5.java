package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes4.dex */
public final class N5 implements ro0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to0.f f27014a = to0.m.e("CountryNetworkModel", new to0.f[0], null, 4, null);

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CountryNetworkModel deserialize(uo0.e decoder) {
        String strA;
        JsonArray jsonArrayN;
        JsonArray jsonArrayN2;
        DocumentType documentType;
        JsonPrimitive jsonPrimitiveP;
        String strA2;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        if (!(decoder instanceof wo0.h)) {
            throw new IllegalStateException("No valid JsonDecoder found.");
        }
        JsonObject jsonObjectO = wo0.j.o(((wo0.h) decoder).y());
        JsonElement jsonElement = (JsonElement) jsonObjectO.get(WorkflowKeys.ISSUING_COUNTRY);
        if (jsonElement == null || (strA = a(jsonElement)) == null) {
            throw new IllegalStateException("Missing field 'issuingCountry' during deserialization of CountryNetworkModel.");
        }
        JsonElement jsonElement2 = (JsonElement) jsonObjectO.get("idDocuments");
        if (jsonElement2 == null || (jsonArrayN = wo0.j.n(jsonElement2)) == null) {
            throw new IllegalStateException("Missing field 'idDocuments' during deserialization of CountryNetworkModel.");
        }
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(jsonArrayN, 10));
        Iterator<JsonElement> it = jsonArrayN.iterator();
        while (it.hasNext()) {
            JsonObject jsonObjectO2 = wo0.j.o(it.next());
            JsonElement jsonElement3 = (JsonElement) jsonObjectO2.get("type");
            Integer numM = null;
            String strA3 = jsonElement3 != null ? a(jsonElement3) : null;
            JsonElement jsonElement4 = (JsonElement) jsonObjectO2.get("nationalities");
            if (jsonElement4 == null || (jsonArrayN2 = wo0.j.n(jsonElement4)) == null) {
                throw new IllegalStateException("Missing field 'nationalities' during deserialization of CountryNetworkModel.Document.");
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<JsonElement> it2 = jsonArrayN2.iterator();
            while (it2.hasNext()) {
                String strA4 = a(it2.next());
                if (strA4 != null) {
                    arrayList2.add(strA4);
                }
            }
            if (strA3 == null || (documentType = CountryNetworkModelKt.toDocumentType(strA3, strA)) == null) {
                throw new IllegalStateException("Missing valid value for 'type' during deserialization of CountryNetworkModel.Document.");
            }
            JsonElement jsonElement5 = (JsonElement) jsonObjectO2.get("nfcIssueDate");
            Date dateA = (jsonElement5 == null || (strA2 = a(jsonElement5)) == null) ? null : a(strA2);
            JsonElement jsonElement6 = (JsonElement) jsonObjectO2.get("validityPeriod");
            if (jsonElement6 != null && (jsonPrimitiveP = wo0.j.p(jsonElement6)) != null) {
                numM = wo0.j.m(jsonPrimitiveP);
            }
            arrayList.add(new CountryNetworkModel.Document(documentType, arrayList2, dateA, numM));
        }
        return new CountryNetworkModel(strA, arrayList);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.f27014a;
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, CountryNetworkModel value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        throw new jn0.q(null, 1, null);
    }

    private final Date a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.parse(str);
    }

    private final String a(JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonPrimitive)) {
            return null;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        if (jsonPrimitive.getIsString()) {
            return jsonPrimitive.getContent();
        }
        return null;
    }
}
