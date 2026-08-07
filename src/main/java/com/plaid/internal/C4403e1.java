package com.plaid.internal;

import com.adyen.checkout.components.core.Address;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.plaid.internal.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4403e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C4572x0 f47631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4403e1 f47632c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f47633a = new LinkedHashMap();

    static {
        W3 w11 = Z3.f46846a;
        f47631b = new C4572x0(AnalyticsContext.Features);
        f47632c = new C4403e1();
    }

    public final void a(String str, Object obj) {
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean)) {
            f47631b.a(W3.INFO, "set feature %s=%s", str, obj);
            this.f47633a.put(str, obj);
        } else {
            f47631b.a(W3.WARN, "ignore feature %s of type %s", str, obj == null ? Address.ADDRESS_NULL_PLACEHOLDER : obj.getClass().getSimpleName());
        }
    }

    public final boolean a(String str) {
        Object objA = a(str, null, Object.class);
        if (objA instanceof Boolean) {
            return Boolean.TRUE.equals(objA);
        }
        if (objA instanceof Number) {
            return ((Number) objA).intValue() != 0;
        }
        return objA != null;
    }

    public final Object a(String str, Object obj, Class<?> cls) {
        Object obj2 = !str.startsWith("android.") ? this.f47633a.get("android.".concat(str)) : null;
        if (obj2 == null) {
            obj2 = this.f47633a.get(str);
        }
        return cls.isInstance(obj2) ? obj2 : obj;
    }

    public final C4403e1 a(HashMap map) {
        C4403e1 c4403e1 = new C4403e1();
        LinkedHashMap linkedHashMap = this.f47633a;
        c4403e1.f47633a.clear();
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c4403e1.a((String) entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            c4403e1.a((String) entry2.getKey(), entry2.getValue());
        }
        return c4403e1;
    }
}
