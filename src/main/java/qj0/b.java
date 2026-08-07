package qj0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static int a(int i11) {
        if (i11 < 3) {
            return i11 + 1;
        }
        if (i11 < 1073741824) {
            return (int) ((i11 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    static <T> HashSet<T> b(int i11) {
        return new HashSet<>(a(i11));
    }

    public static <K, V> LinkedHashMap<K, V> c(int i11) {
        return new LinkedHashMap<>(a(i11));
    }

    public static <T> List<T> d(int i11) {
        return i11 == 0 ? Collections.EMPTY_LIST : new ArrayList(i11);
    }
}
