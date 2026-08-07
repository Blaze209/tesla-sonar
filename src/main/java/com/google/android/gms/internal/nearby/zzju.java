package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzju {
    private final zzjw zza = new zzjw(null);

    public final zzju zza(zzmc zzmcVar) {
        this.zza.zzb = zzmcVar;
        return this;
    }

    public final zzju zzb(zzla zzlaVar) {
        this.zza.zza = zzlaVar;
        return this;
    }

    public final zzjw zzc() {
        return this.zza;
    }
}
