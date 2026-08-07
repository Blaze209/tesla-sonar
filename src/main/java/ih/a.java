package ih;

import android.content.Context;
import ng.b;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static boolean a() {
        if (ng.a.f94989a) {
            return ng.a.f94990b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String b(Context context) {
        if (ng.a.f94989a) {
            return b.C2023b.f94997a.a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void c(Context context) {
        ng.a.f94990b = b.C2023b.f94997a.b(context.getApplicationContext());
        ng.a.f94989a = true;
    }
}
