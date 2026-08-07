package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzid {
    private final zzif zza = new zzif(null);

    public final zzid zza(zzfl zzflVar) {
        this.zza.zze = zzflVar;
        return this;
    }

    public final zzid zzb(long j11) {
        this.zza.zzc = j11;
        return this;
    }

    public final zzid zzc(DiscoveryOptions discoveryOptions) {
        this.zza.zzd = discoveryOptions;
        return this;
    }

    public final zzid zzd(zzfs zzfsVar) {
        this.zza.zza = zzfsVar;
        return this;
    }

    public final zzid zze(String str) {
        this.zza.zzb = str;
        return this;
    }

    public final zzif zzf() {
        return this.zza;
    }
}
