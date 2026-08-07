package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzpi {
    private long zza;
    private com.google.android.gms.internal.measurement.zzib zzb;
    private String zzc;
    private Map zzd;
    private zzls zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private int zzi;

    zzpi() {
    }

    public final zzpj zza() {
        return new zzpj(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, null);
    }

    public final zzpi zzb(long j11) {
        this.zza = j11;
        return this;
    }

    public final zzpi zzc(com.google.android.gms.internal.measurement.zzib zzibVar) {
        this.zzb = zzibVar;
        return this;
    }

    public final zzpi zzd(String str) {
        this.zzc = str;
        return this;
    }

    public final zzpi zze(Map map) {
        this.zzd = map;
        return this;
    }

    public final zzpi zzf(zzls zzlsVar) {
        this.zze = zzlsVar;
        return this;
    }

    public final zzpi zzg(long j11) {
        this.zzf = j11;
        return this;
    }

    public final zzpi zzh(long j11) {
        this.zzg = j11;
        return this;
    }

    public final zzpi zzi(long j11) {
        this.zzh = j11;
        return this;
    }

    public final zzpi zzj(int i11) {
        this.zzi = i11;
        return this;
    }
}
