package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public final class zzai {
    static Object[] zza(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (objArr[i12] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 9);
                sb2.append("at index ");
                sb2.append(i12);
                throw new NullPointerException(sb2.toString());
            }
        }
        return objArr;
    }
}
