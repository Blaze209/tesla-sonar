package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzhv {
    private final zzhx zza = new zzhx(null);

    public final zzhv zza(zzhk zzhkVar) {
        this.zza.zzc = zzhkVar;
        return this;
    }

    public final zzhv zzb(String[] strArr) {
        this.zza.zzb = strArr;
        return this;
    }

    public final zzhv zzc(zzfs zzfsVar) {
        this.zza.zza = zzfsVar;
        return this;
    }

    public final zzhx zzd() {
        return this.zza;
    }
}
