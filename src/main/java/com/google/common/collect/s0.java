package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class s0 {
    static <T> T[] a(Object[] objArr, int i11, int i12, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i11, i12, tArr.getClass());
    }

    static <T> T[] b(T[] tArr, int i11) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i11);
    }

    static <K, V> Map<K, V> c(int i11) {
        return m.z(i11);
    }

    static <K, V> Map<K, V> d() {
        return m.u();
    }
}
