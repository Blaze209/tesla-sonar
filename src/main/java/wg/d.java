package wg;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, a> f121803a = new ConcurrentHashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f121804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f121805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f121806c;
    }

    public static String a(String str) {
        Map<String, a> map;
        a aVar;
        String str2;
        if (str == null || (map = f121803a) == null || (aVar = map.get(str)) == null) {
            return null;
        }
        if (d(aVar.f121805b, aVar.f121806c) && (str2 = aVar.f121804a) != null) {
            return str2;
        }
        map.remove(str);
        return null;
    }

    public static void b(String str, String str2) {
        c(str, str2, CoreConstants.MILLIS_IN_ONE_DAY);
    }

    public static void c(String str, String str2, long j11) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (j11 == 0) {
            j11 = CoreConstants.MILLIS_IN_ONE_DAY;
        }
        Map<String, a> map = f121803a;
        a aVar = map.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.f121804a = str2;
        aVar.f121806c = j11;
        aVar.f121805b = System.currentTimeMillis();
        map.put(str, aVar);
    }

    public static boolean d(long j11, long j12) {
        return System.currentTimeMillis() - j11 < j12;
    }
}
