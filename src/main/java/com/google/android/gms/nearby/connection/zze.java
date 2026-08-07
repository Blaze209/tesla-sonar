package com.google.android.gms.nearby.connection;

/* JADX INFO: loaded from: classes5.dex */
public final class zze {
    private int zza;
    private int zzb;

    public final zze zza(int i11) {
        this.zzb = i11;
        return this;
    }

    public final zze zzb(int i11) {
        this.zza = i11;
        return this;
    }

    public final BandwidthInfo zzc() {
        return new BandwidthInfo(this.zza, this.zzb, null);
    }
}
