package xj;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static void a(boolean z11, @NonNull String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    @NonNull
    public static <T extends Collection<Y>, Y> T c(@NonNull T t11) {
        if (t11.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t11;
    }

    @NonNull
    public static <T> T d(T t11) {
        return (T) e(t11, "Argument must not be null");
    }

    @NonNull
    public static <T> T e(T t11, @NonNull String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }
}
