package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzmq {
    private final zzms zza = new zzms(null);

    public final zzmq zza(int i11) {
        this.zza.zzb = i11;
        return this;
    }

    public final zzmq zzb(zzla zzlaVar) {
        this.zza.zza = zzlaVar;
        return this;
    }

    public final zzms zzc() {
        return this.zza;
    }
}
