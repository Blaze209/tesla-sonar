package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzhn {
    private final zzhp zza = new zzhp(null);

    public final zzhn zza(String str) {
        this.zza.zzb = str;
        return this;
    }

    public final zzhn zzb(zzfs zzfsVar) {
        this.zza.zza = zzfsVar;
        return this;
    }

    public final zzhp zzc() {
        return this.zza;
    }
}
