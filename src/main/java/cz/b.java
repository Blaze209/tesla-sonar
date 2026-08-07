package cz;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Map<String, a> f59226a;

    static {
        HashMap map = new HashMap();
        f59226a = map;
        map.put("impactLight", new d(new long[]{0, 20}));
        f59226a.put("impactMedium", new d(new long[]{0, 40}));
        f59226a.put("impactHeavy", new d(new long[]{0, 60}));
        f59226a.put("notificationSuccess", new d(new long[]{0, 40, 60, 20}));
        f59226a.put("notificationWarning", new d(new long[]{0, 20, 60, 40}));
        f59226a.put("notificationError", new d(new long[]{0, 20, 40, 30, 40, 40}));
        f59226a.put("rigid", new d(new long[]{0, 30}));
        f59226a.put("soft", new d(new long[]{0, 10}));
        f59226a.put("clockTick", new e(4));
        f59226a.put("contextClick", new e(6));
        f59226a.put("keyboardPress", new e(3));
        f59226a.put("keyboardRelease", new e(7));
        f59226a.put("keyboardTap", new e(3));
        f59226a.put("longPress", new e(0));
        f59226a.put("textHandleMove", new e(9));
        f59226a.put("virtualKey", new e(1));
        f59226a.put("virtualKeyRelease", new e(8));
        f59226a.put("effectClick", new c(0));
        f59226a.put("effectDoubleClick", new c(1));
        f59226a.put("effectHeavyClick", new c(5));
        f59226a.put("effectTick", new c(2));
    }

    public static a a(String str) {
        return f59226a.get(str);
    }
}
