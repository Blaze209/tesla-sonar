package com.fourthline.orca.internal;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wo0.b f26583a = wo0.u.b(null, new wn0.l() { // from class: com.fourthline.orca.internal.lh0
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return Ki.a((wo0.d) obj);
        }
    }, 1, null);

    public static final wo0.b a() {
        return f26583a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wo0.d Json) {
        p013kotlin.jvm.internal.s.k(Json, "$this$Json");
        Json.h(true);
        Json.e(true);
        return jn0.h0.f84049a;
    }

    public static final JsonElement a(JsonObject jsonObject, String key) {
        p013kotlin.jvm.internal.s.k(jsonObject, "<this>");
        p013kotlin.jvm.internal.s.k(key, "key");
        JsonElement jsonElement = (JsonElement) jsonObject.get(key);
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalStateException(("FL Developer Error. Missing key '" + key + "' during serialization of json object.").toString());
    }
}
