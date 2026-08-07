package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    static class a {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    public static LocaleListCompat a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return LocaleListCompat.b(f.a(context));
        }
        Object objB = b(context);
        return objB != null ? LocaleListCompat.k(a.a(objB)) : LocaleListCompat.f();
    }

    private static Object b(Context context) {
        return context.getSystemService("locale");
    }
}
