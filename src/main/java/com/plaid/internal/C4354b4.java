package com.plaid.internal;

import java.util.Map;

/* JADX INFO: renamed from: com.plaid.internal.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4354b4 {
    public static final String a(Map<String, String> map, String key, String str) {
        p013kotlin.jvm.internal.s.k(map, "<this>");
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(str, "default");
        String str2 = map.get(key);
        if (str2 != null) {
            return str2;
        }
        X5.a.b(X5.f46812a, "Missing field: " + key);
        return str;
    }
}
