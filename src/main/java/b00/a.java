package b00;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, d> f15248a = new HashMap();

    public static c a(String str) {
        if (f15248a.containsKey(str)) {
            return f15248a.get(str).build();
        }
        return null;
    }
}
