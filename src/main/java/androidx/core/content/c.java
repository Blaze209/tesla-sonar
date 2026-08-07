package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    static class a {
        static <T> ArrayList<T> a(Intent intent, String str, Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        static <T> T b(Intent intent, String str, Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }
    }

    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> a(Intent intent, String str, Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? a.a(intent, str, cls) : intent.getParcelableArrayListExtra(str);
    }

    public static <T> T b(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.b(intent, str, cls);
        }
        T t11 = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t11)) {
            return t11;
        }
        return null;
    }
}
