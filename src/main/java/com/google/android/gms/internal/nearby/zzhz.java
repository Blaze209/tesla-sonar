package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzhz {
    private final zzib zza = new zzib(null);

    public final zzhz zza(zzey zzeyVar) {
        this.zza.zzb = zzeyVar;
        return this;
    }

    public final zzhz zzb(zzfe zzfeVar) {
        this.zza.zzg = zzfeVar;
        return this;
    }

    public final zzhz zzc(long j11) {
        this.zza.zze = j11;
        return this;
    }

    public final zzhz zzd(byte[] bArr) {
        this.zza.zzh = bArr;
        return this;
    }

    public final zzhz zze(String str) {
        this.zza.zzc = str;
        return this;
    }

    public final zzhz zzf(AdvertisingOptions advertisingOptions) {
        this.zza.zzf = advertisingOptions;
        return this;
    }

    public final zzhz zzg(zzfv zzfvVar) {
        this.zza.zza = zzfvVar;
        return this;
    }

    public final zzhz zzh(String str) {
        this.zza.zzd = str;
        return this;
    }

    public final zzib zzi() {
        return this.zza;
    }
}
