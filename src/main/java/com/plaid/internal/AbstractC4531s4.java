package com.plaid.internal;

import com.google.android.gms.common.internal.ImagesContract;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: renamed from: com.plaid.internal.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4531s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48107a;

    /* JADX INFO: renamed from: com.plaid.internal.s4$a */
    public static final class a {
        public static AbstractC4531s4 a(String jsonString) throws Exception {
            JsonPrimitive jsonPrimitiveP;
            Integer numM;
            JsonElement jsonElement;
            JsonPrimitive jsonPrimitiveP2;
            JsonPrimitive jsonPrimitiveP3;
            p013kotlin.jvm.internal.s.k(jsonString, "jsonString");
            JsonObject jsonObjectO = wo0.j.o(wo0.b.INSTANCE.h(jsonString));
            JsonElement jsonElement2 = (JsonElement) jsonObjectO.get(ImagesContract.URL);
            String strB = null;
            String strB2 = (jsonElement2 == null || (jsonPrimitiveP3 = wo0.j.p(jsonElement2)) == null) ? null : jsonPrimitiveP3.b();
            p013kotlin.jvm.internal.s.h(strB2);
            JsonElement jsonElement3 = (JsonElement) jsonObjectO.get("mobile_sdk_url_open_message");
            JsonObject jsonObjectO2 = jsonElement3 != null ? wo0.j.o(jsonElement3) : null;
            if (jsonObjectO2 != null && (jsonElement = (JsonElement) jsonObjectO2.get("android_url_open_behavior")) != null && (jsonPrimitiveP2 = wo0.j.p(jsonElement)) != null) {
                strB = jsonPrimitiveP2.b();
            }
            if (strB != null) {
                int iHashCode = strB.hashCode();
                int iIntValue = 0;
                if (iHashCode != -1436496974) {
                    if (iHashCode != -844381507) {
                        if (iHashCode != 1225038860) {
                            if (iHashCode == 1926770975 && strB.equals("ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB")) {
                                return new c(strB2);
                            }
                        } else if (strB.equals("ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER")) {
                            return new b(strB2);
                        }
                    } else if (strB.equals("ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB")) {
                        JsonElement jsonElement4 = (JsonElement) jsonObjectO2.get("android_partial_custom_tab_screen_height_pixels");
                        if (jsonElement4 != null && (jsonPrimitiveP = wo0.j.p(jsonElement4)) != null && (numM = wo0.j.m(jsonPrimitiveP)) != null) {
                            iIntValue = numM.intValue();
                        }
                        return new d(strB2, iIntValue);
                    }
                } else if (strB.equals("ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN")) {
                    return new d(strB2, 0);
                }
            }
            throw new Exception("android_url_open_behavior not supported :" + strB);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.s4$b */
    public static final class b extends AbstractC4531s4 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String url) {
            super(url);
            p013kotlin.jvm.internal.s.k(url, "url");
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.s4$c */
    public static final class c extends AbstractC4531s4 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String url) {
            super(url);
            p013kotlin.jvm.internal.s.k(url, "url");
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.s4$d */
    public static final class d extends AbstractC4531s4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48108b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String url, int i11) {
            super(url);
            p013kotlin.jvm.internal.s.k(url, "url");
            this.f48108b = i11;
        }
    }

    public AbstractC4531s4(String str) {
        this.f48107a = str;
    }
}
