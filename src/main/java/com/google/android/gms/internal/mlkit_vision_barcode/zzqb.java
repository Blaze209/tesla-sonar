package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes5.dex */
public final class zzqb {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzqb zza(Long l11) {
        this.zzc = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzb(Long l11) {
        this.zzd = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzc(Long l11) {
        this.zza = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzd(Long l11) {
        this.zze = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zze(Long l11) {
        this.zzb = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzf(Long l11) {
        this.zzf = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqd zzg() {
        return new zzqd(this, null);
    }
}
