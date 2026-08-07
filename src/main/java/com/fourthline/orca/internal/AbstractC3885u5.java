package com.fourthline.orca.internal;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.fourthline.orca.internal.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3885u5 {
    public static final C3842t5 a(JSONObject jSONObject) {
        p013kotlin.jvm.internal.s.k(jSONObject, "<this>");
        String string = jSONObject.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return a(string);
    }

    public static final C3842t5 a(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        byte[] bytes = str.toString().getBytes(p013kotlin.text.d.UTF_8);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        return new C3842t5(bytes);
    }
}
