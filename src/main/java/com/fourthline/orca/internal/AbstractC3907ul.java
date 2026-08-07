package com.fourthline.orca.internal;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3907ul {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3746qv.a.C0603a b(String str) throws JSONException {
        JSONArray jSONArray;
        ArrayList arrayList;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("mobilePhoneNumber");
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        JSONArray jSONArray2 = jSONObject.getJSONArray("documentsToSign");
        p013kotlin.jvm.internal.s.j(jSONArray2, "getJSONArray(...)");
        bo0.j jVarW = bo0.n.w(0, jSONArray2.length());
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(jVarW, 10));
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(((p013kotlin.collections.s0) it).nextInt());
            p013kotlin.jvm.internal.s.j(jSONObject2, "getJSONObject(...)");
            arrayList2.add(d(jSONObject2));
        }
        JSONArray jSONArray3 = jSONObject.getJSONArray("legalDocuments");
        p013kotlin.jvm.internal.s.j(jSONArray3, "getJSONArray(...)");
        bo0.j jVarW2 = bo0.n.w(0, jSONArray3.length());
        ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(jVarW2, 10));
        Iterator<Integer> it2 = jVarW2.iterator();
        while (it2.hasNext()) {
            JSONObject jSONObject3 = jSONArray3.getJSONObject(((p013kotlin.collections.s0) it2).nextInt());
            p013kotlin.jvm.internal.s.j(jSONObject3, "getJSONObject(...)");
            arrayList3.add(b(jSONObject3));
        }
        try {
            jSONArray = jSONObject.getJSONArray("clauses");
        } catch (JSONException unused) {
            jSONArray = null;
        }
        if (jSONArray != null) {
            bo0.j jVarW3 = bo0.n.w(0, jSONArray.length());
            arrayList = new ArrayList(p013kotlin.collections.v.y(jVarW3, 10));
            Iterator<Integer> it3 = jVarW3.iterator();
            while (it3.hasNext()) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(((p013kotlin.collections.s0) it3).nextInt());
                p013kotlin.jvm.internal.s.j(jSONObject4, "getJSONObject(...)");
                arrayList.add(a(jSONObject4));
            }
        } else {
            arrayList = null;
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("otpSettings");
        p013kotlin.jvm.internal.s.j(jSONObject5, "getJSONObject(...)");
        return new InterfaceC3746qv.a.C0603a(string, arrayList2, arrayList3, arrayList, c(jSONObject5));
    }

    private static final InterfaceC3746qv.a.C0603a.c c(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("validation");
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return new InterfaceC3746qv.a.C0603a.c(string, jSONObject.getInt("length"));
    }

    private static final InterfaceC3746qv.a.C0603a.d d(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("id");
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        String string2 = jSONObject.getString("fileName");
        p013kotlin.jvm.internal.s.j(string2, "getString(...)");
        String string3 = jSONObject.getString("displayName");
        p013kotlin.jvm.internal.s.j(string3, "getString(...)");
        return new InterfaceC3746qv.a.C0603a.d(string, string2, string3);
    }

    private static final InterfaceC3746qv.a.C0603a.C0604a a(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("id");
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        String string2 = jSONObject.getString("text");
        p013kotlin.jvm.internal.s.j(string2, "getString(...)");
        return new InterfaceC3746qv.a.C0603a.C0604a(string, string2, jSONObject.getInt("version"));
    }

    private static final InterfaceC3746qv.a.C0603a.b b(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("id");
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        String string2 = jSONObject.getString("displayName");
        p013kotlin.jvm.internal.s.j(string2, "getString(...)");
        int i11 = jSONObject.getInt("version");
        String string3 = jSONObject.getString(ImagesContract.URL);
        p013kotlin.jvm.internal.s.j(string3, "getString(...)");
        return new InterfaceC3746qv.a.C0603a.b(string, string2, i11, string3);
    }
}
