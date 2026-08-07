package com.plaid.internal;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.plaid.internal.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4528s1 {
    public static final boolean a(AbstractC4442i4.a<Object> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        Object obj = aVar.f47733a;
        if (obj instanceof bx.b0) {
            String upperCase = String.valueOf(((Map) obj).get("error_code")).toUpperCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
            if (aVar.f47734b == 400 && p013kotlin.jvm.internal.s.f("INVALID_CHANNEL_ID", upperCase)) {
                return true;
            }
        }
        return false;
    }
}
