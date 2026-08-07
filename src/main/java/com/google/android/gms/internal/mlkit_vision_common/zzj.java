package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class zzj extends zzk {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzj(int i11) {
    }

    private final void zzb(int i11) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i11) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i12 = length + (length >> 1) + 1;
        if (i12 < i11) {
            int iHighestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        if (i12 < 0) {
            i12 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i12);
        this.zzc = false;
    }

    public final zzj zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        objArr[i11] = obj;
        return this;
    }
}
