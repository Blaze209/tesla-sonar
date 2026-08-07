package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zzbh extends zzbd {
    public zzbh() {
        super(4);
    }

    public final zzbh zza(Object obj) {
        obj.getClass();
        int i11 = this.zzb;
        int i12 = i11 + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i12) {
            int i13 = length + (length >> 1) + 1;
            if (i13 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i13 = iHighestOneBit + iHighestOneBit;
            }
            if (i13 < 0) {
                i13 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i13);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i14 = this.zzb;
        this.zzb = i14 + 1;
        objArr2[i14] = obj;
        return this;
    }

    public final zzbk zzb() {
        this.zzc = true;
        return zzbk.zzg(this.zza, this.zzb);
    }
}
