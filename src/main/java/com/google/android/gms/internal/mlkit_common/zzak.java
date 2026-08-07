package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes5.dex */
public final class zzak {
    static Object[] zza(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (objArr[i12] == null) {
                throw new NullPointerException("at index " + i12);
            }
        }
        return objArr;
    }
}
