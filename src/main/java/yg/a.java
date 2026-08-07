package yg;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        synchronized (a.class) {
            String strG = null;
            if (context != null) {
                if (!sg.a.c(str) && !sg.a.c(str2)) {
                    try {
                        String strC = e.c(context, str, str2, "");
                        if (!sg.a.c(strC)) {
                            strG = ug.c.g(ug.c.a(), strC);
                            return strG;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return null;
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        synchronized (a.class) {
            try {
                if (sg.a.c(str) || sg.a.c(str2) || context == null) {
                    return;
                }
                try {
                    String strB = ug.c.b(ug.c.a(), str3);
                    HashMap map = new HashMap();
                    map.put(str2, strB);
                    e.b(context, str, map);
                } catch (Throwable unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
