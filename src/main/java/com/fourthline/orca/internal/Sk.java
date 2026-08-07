package com.fourthline.orca.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Sk {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        return new JSONObject(str).getJSONObject("bankAccountVerification").getString("deeplink");
    }
}
