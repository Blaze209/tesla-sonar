package com.fourthline.core;

import co0.d;
import com.adyen.checkout.components.core.Address;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\b\u001a\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0004\u001a\u001f\u0010\u000b\u001a\u00020\n*\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u0003\u001a\u0004\u0018\u00010\r*\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u000e\u001a\u001d\u0010\t\u001a\u0004\u0018\u00010\u0005*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0011\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lorg/json/JSONArray;", "", "Lcom/fourthline/core/CountryNetworkModel;", "a", "(Lorg/json/JSONArray;)Ljava/util/List;", "", "countryCode", "Lcom/fourthline/core/CountryNetworkModel$Document;", "(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/util/List;", "b", "Lcom/fourthline/core/DocumentType;", "toDocumentType", "(Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/core/DocumentType;", "Ljava/util/Date;", "(Ljava/lang/String;)Ljava/util/Date;", "Lorg/json/JSONObject;", "name", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "fourthline-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CountryNetworkModelKt {
    private static final Date a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.parse(str);
    }

    private static final String b(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString(str);
            if (s.f(string, Address.ADDRESS_NULL_PLACEHOLDER)) {
                return null;
            }
            return string;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final DocumentType toDocumentType(String str, String str2) throws JSONException {
        s.k(str, "<this>");
        if (t.M(str, "Passport", true)) {
            return DocumentType.PASSPORT;
        }
        if (t.M(str, "National ID Card", true) || t.M(str, "NationalIDCard", true)) {
            return s.f(str2, "FRA") ? DocumentType.FRENCH_ID_CARD : DocumentType.ID_CARD;
        }
        if (t.M(str, "Driving License", true) || t.M(str, "DrivingLicense", true)) {
            return s.f(str2, "NLD") ? DocumentType.DUTCH_DRIVERS_LICENSE : DocumentType.DRIVERS_LICENSE;
        }
        if (t.M(str, "Residence Permit", true) || t.M(str, "ResidencePermit", true)) {
            return DocumentType.RESIDENCE_PERMIT;
        }
        if (t.M(str, "Paper ID", true) || t.M(str, "PaperID", true)) {
            return DocumentType.PAPER_ID;
        }
        throw new JSONException("Cannot parse IDS document type");
    }

    public static /* synthetic */ DocumentType toDocumentType$default(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = null;
        }
        return toDocumentType(str, str2);
    }

    private static final List b(JSONArray jSONArray) throws JSONException {
        String string;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            d dVarB = o0.b(String.class);
            if (s.f(dVarB, o0.b(Boolean.TYPE))) {
                string = (String) Boolean.valueOf(jSONArray.getBoolean(i11));
            } else if (s.f(dVarB, o0.b(String.class))) {
                string = jSONArray.getString(i11);
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (s.f(dVarB, o0.b(Integer.TYPE))) {
                string = (String) Integer.valueOf(jSONArray.getInt(i11));
            } else if (s.f(dVarB, o0.b(Long.TYPE))) {
                string = (String) Long.valueOf(jSONArray.getLong(i11));
            } else if (s.f(dVarB, o0.b(Double.TYPE))) {
                string = (String) Double.valueOf(jSONArray.getDouble(i11));
            } else if (s.f(dVarB, o0.b(JSONObject.class))) {
                Object jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject;
            } else if (s.f(dVarB, o0.b(JSONArray.class))) {
                Object jSONArray2 = jSONArray.getJSONArray(i11);
                if (jSONArray2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray2;
            } else {
                if (!s.f(dVarB, o0.b(Object.class))) {
                    throw new IllegalArgumentException(o0.b(String.class).l() + " is not supported!");
                }
                Object obj = jSONArray.get(i11);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj;
            }
            arrayList.add(string);
        }
        return arrayList;
    }

    private static final Integer a(JSONObject jSONObject, String str) {
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            d dVarB = o0.b(JSONObject.class);
            if (s.f(dVarB, o0.b(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(jSONArray.getBoolean(i11));
            } else if (s.f(dVarB, o0.b(String.class))) {
                Object string = jSONArray.getString(i11);
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (s.f(dVarB, o0.b(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(jSONArray.getInt(i11));
            } else if (s.f(dVarB, o0.b(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(jSONArray.getLong(i11));
            } else if (s.f(dVarB, o0.b(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(jSONArray.getDouble(i11));
            } else if (s.f(dVarB, o0.b(JSONObject.class))) {
                jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else if (s.f(dVarB, o0.b(JSONArray.class))) {
                Object jSONArray2 = jSONArray.getJSONArray(i11);
                if (jSONArray2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray2;
            } else {
                if (!s.f(dVarB, o0.b(Object.class))) {
                    throw new IllegalArgumentException(o0.b(JSONObject.class).l() + " is not supported!");
                }
                Object obj = jSONArray.get(i11);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
            String string2 = jSONObject.getString(WorkflowKeys.ISSUING_COUNTRY);
            s.h(string2);
            JSONArray jSONArray3 = jSONObject.getJSONArray("idDocuments");
            s.j(jSONArray3, "getJSONArray(...)");
            arrayList.add(new CountryNetworkModel(string2, a(jSONArray3, string2)));
        }
        return arrayList;
    }

    private static final List a(JSONArray jSONArray, String str) throws JSONException {
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            d dVarB = o0.b(JSONObject.class);
            if (s.f(dVarB, o0.b(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(jSONArray.getBoolean(i11));
            } else if (s.f(dVarB, o0.b(String.class))) {
                Object string = jSONArray.getString(i11);
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (s.f(dVarB, o0.b(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(jSONArray.getInt(i11));
            } else if (s.f(dVarB, o0.b(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(jSONArray.getLong(i11));
            } else if (s.f(dVarB, o0.b(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(jSONArray.getDouble(i11));
            } else if (s.f(dVarB, o0.b(JSONObject.class))) {
                jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else if (s.f(dVarB, o0.b(JSONArray.class))) {
                Object jSONArray2 = jSONArray.getJSONArray(i11);
                if (jSONArray2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray2;
            } else {
                if (!s.f(dVarB, o0.b(Object.class))) {
                    throw new IllegalArgumentException(o0.b(JSONObject.class).l() + " is not supported!");
                }
                Object obj = jSONArray.get(i11);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
            String string2 = jSONObject.getString("type");
            s.j(string2, "getString(...)");
            DocumentType documentType = toDocumentType(string2, str);
            JSONArray jSONArray3 = jSONObject.getJSONArray("nationalities");
            s.j(jSONArray3, "getJSONArray(...)");
            List listB = b(jSONArray3);
            String strB = b(jSONObject, "nfcIssueDate");
            arrayList.add(new CountryNetworkModel.Document(documentType, listB, strB != null ? a(strB) : null, a(jSONObject, "validityPeriod")));
        }
        return arrayList;
    }
}
