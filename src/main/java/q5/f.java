package q5;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales((LocaleList) localeListCompat.j());
        }
    }

    public static LocaleListCompat a(Configuration configuration) {
        return LocaleListCompat.k(a.a(configuration));
    }

    public static void b(Configuration configuration, LocaleListCompat localeListCompat) {
        a.b(configuration, localeListCompat);
    }
}
