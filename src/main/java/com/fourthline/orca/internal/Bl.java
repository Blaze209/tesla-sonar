package com.fourthline.orca.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Bl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(C3148cw c3148cw) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("otp", c3148cw.a());
        return jSONObject;
    }
}
