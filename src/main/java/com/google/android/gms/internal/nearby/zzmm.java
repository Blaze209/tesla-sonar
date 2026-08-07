package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzmm {
    private final zzmo zza = new zzmo(null);

    public final zzmm zza(zzlw zzlwVar) {
        this.zza.zzb = zzlwVar;
        return this;
    }

    public final zzmm zzb(zzla zzlaVar) {
        this.zza.zza = zzlaVar;
        return this;
    }

    public final zzmo zzc() {
        return this.zza;
    }
}
