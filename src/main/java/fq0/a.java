package fq0;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<String, List<Locale>> f66327a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, List<Locale>> f66328b = new ConcurrentHashMap();

    private static boolean a(String str) {
        return b.b(str) && str.length() == 2;
    }

    private static boolean b(String str) {
        if (b.a(str)) {
            return str.length() == 2 || str.length() == 3;
        }
        return false;
    }

    private static boolean c(String str) {
        return b.d(str) && str.length() == 3;
    }

    private static Locale d(String str) {
        if (b(str)) {
            return new Locale(str);
        }
        String[] strArrSplit = str.split("_", -1);
        String str2 = strArrSplit[0];
        if (strArrSplit.length == 2) {
            String str3 = strArrSplit[1];
            if ((b(str2) && a(str3)) || c(str3)) {
                return new Locale(str2, str3);
            }
        } else if (strArrSplit.length == 3) {
            String str4 = strArrSplit[1];
            String str5 = strArrSplit[2];
            if (b(str2) && ((str4.isEmpty() || a(str4) || c(str4)) && !str5.isEmpty())) {
                return new Locale(str2, str4, str5);
            }
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }

    public static Locale e(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new Locale("", "");
        }
        if (str.contains("#")) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        int length = str.length();
        if (length < 2) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        if (str.charAt(0) != '_') {
            return d(str);
        }
        if (length < 3) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        char cCharAt = str.charAt(1);
        char cCharAt2 = str.charAt(2);
        if (!Character.isUpperCase(cCharAt) || !Character.isUpperCase(cCharAt2)) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        if (length == 3) {
            return new Locale("", str.substring(1, 3));
        }
        if (length < 5) {
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        if (str.charAt(3) == '_') {
            return new Locale("", str.substring(1, 3), str.substring(4));
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }
}
