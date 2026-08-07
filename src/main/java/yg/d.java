package yg;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static synchronized void a(Context context, String str, String str2, String str3) {
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
    }
}
