package ou;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends g {
    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(Object... objArr) {
        return Objects.hash(objArr);
    }
}
