package com.fourthline.orca.internal;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4123zl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(InterfaceC3106bw.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        List listA = aVar.a();
        JSONArray jSONArray = new JSONArray();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            jSONArray.put(a((InterfaceC3106bw.a.b) it.next()));
        }
        jSONObject.put("authorizedDocuments", jSONArray);
        List listB = aVar.b();
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = listB.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(a((InterfaceC3106bw.a.C0545a) it2.next()));
        }
        jSONObject.put("legalDocumentsAccepted", jSONArray2);
        return jSONObject;
    }

    private static final JSONObject a(InterfaceC3106bw.a.b bVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("documentId", bVar.b());
        jSONObject.put("documentHash", bVar.a());
        return jSONObject;
    }

    private static final JSONObject a(InterfaceC3106bw.a.C0545a c0545a) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", c0545a.b());
        jSONObject.putOpt(ImagesContract.URL, c0545a.c());
        jSONObject.put("version", c0545a.d());
        jSONObject.putOpt("displayName", c0545a.a());
        return jSONObject;
    }
}
