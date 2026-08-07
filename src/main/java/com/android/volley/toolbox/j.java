package com.android.volley.toolbox;

import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class j extends k<JSONObject> {
    public j(String str, com.android.volley.k.b<JSONObject> bVar, com.android.volley.k.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    @Override // com.android.volley.toolbox.k, com.android.volley.i
    protected com.android.volley.k<JSONObject> parseNetworkResponse(com.android.volley.h hVar) {
        try {
            return com.android.volley.k.c(new JSONObject(new String(hVar.f20192b, e.f(hVar.f20193c, "utf-8"))), e.e(hVar));
        } catch (UnsupportedEncodingException e11) {
            return com.android.volley.k.a(new ParseError(e11));
        } catch (JSONException e12) {
            return com.android.volley.k.a(new ParseError(e12));
        }
    }

    @Deprecated
    public j(String str, JSONObject jSONObject, com.android.volley.k.b<JSONObject> bVar, com.android.volley.k.a aVar) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    public j(int i11, String str, JSONObject jSONObject, com.android.volley.k.b<JSONObject> bVar, com.android.volley.k.a aVar) {
        super(i11, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }
}
