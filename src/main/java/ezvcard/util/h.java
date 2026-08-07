package ezvcard.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63685a = System.getProperty("line.separator");

    public static String a(Collection<?> collection, String str) {
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (Object obj : collection) {
            if (!z11) {
                sb2.append(str);
            }
            sb2.append(obj);
            z11 = false;
        }
        return sb2.toString();
    }

    public static Map<String, String> b(Map<String, String> map) {
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String lowerCase = null;
            String lowerCase2 = key == null ? null : key.toLowerCase();
            String value = entry.getValue();
            if (value != null) {
                lowerCase = value.toLowerCase();
            }
            map2.put(lowerCase2, lowerCase);
        }
        return map2;
    }
}
