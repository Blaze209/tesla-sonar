package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzmy {
    private final zzna zza = new zzna(null);

    public final zzmy zza(zzkx zzkxVar) {
        this.zza.zzc = zzkxVar;
        return this;
    }

    public final zzmy zzb(zzmi zzmiVar) {
        this.zza.zzb = zzmiVar;
        return this;
    }

    public final zzmy zzc(zzla zzlaVar) {
        this.zza.zza = zzlaVar;
        return this;
    }

    public final zzna zzd() {
        return this.zza;
    }
}
