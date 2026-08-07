package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
public final class q0 {
    static Object a(Object obj, int i11) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i11);
    }

    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static Object[] c(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            a(objArr[i12], i12);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i11) {
        return (T[]) s0.b(tArr, i11);
    }
}
