package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
final class k {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    static int b(int i11, String str) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i11);
    }

    static void c(boolean z11) {
        ou.p.s(z11, "no calls to next() since the last call to remove()");
    }
}
