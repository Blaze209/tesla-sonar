package fv;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f66622a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f66624c;

    public e(int i11, int i12) {
        this.f66623b = i11;
        this.f66624c = i12;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f66624c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i11) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i11 ? strTrim.substring(0, i11) : strTrim;
    }

    @NonNull
    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f66622a));
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f66622a.size() >= this.f66623b && !this.f66622a.containsKey(strB)) {
            bv.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f66623b);
            return false;
        }
        String strC = c(str2, this.f66624c);
        if (com.google.firebase.crashlytics.internal.common.i.z(this.f66622a.get(strB), strC)) {
            return false;
        }
        Map<String, String> map = this.f66622a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        try {
            int i11 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strB = b(entry.getKey());
                if (this.f66622a.size() < this.f66623b || this.f66622a.containsKey(strB)) {
                    String value = entry.getValue();
                    this.f66622a.put(strB, value == null ? "" : c(value, this.f66624c));
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                bv.g.f().k("Ignored " + i11 + " entries when adding custom keys. Maximum allowable: " + this.f66623b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
