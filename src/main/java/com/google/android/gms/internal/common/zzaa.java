package com.google.android.gms.internal.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzaa(int i11) {
    }

    public final zzaa zza(Object obj) {
        int i11;
        obj.getClass();
        int length = this.zza.length;
        int i12 = this.zzb;
        int i13 = i12 + 1;
        if (i13 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i13 <= length) {
            i11 = length;
        } else {
            i11 = (length >> 1) + length + 1;
            if (i11 < i13) {
                int iHighestOneBit = Integer.highestOneBit(i12);
                i11 = iHighestOneBit + iHighestOneBit;
            }
            if (i11 < 0) {
                i11 = Integer.MAX_VALUE;
            }
        }
        if (i11 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i11);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i14 = this.zzb;
        this.zzb = i14 + 1;
        objArr[i14] = obj;
        return this;
    }
}
