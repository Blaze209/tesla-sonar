package q5;

import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    static class a {
        static <T> T a(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }
    }

    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(bundle, str, cls);
        }
        T t11 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t11)) {
            return t11;
        }
        return null;
    }
}
