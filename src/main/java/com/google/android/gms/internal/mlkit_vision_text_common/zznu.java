package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes5.dex */
public final class zznu {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zznu zza(Long l11) {
        this.zzc = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzb(Long l11) {
        this.zzd = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzc(Long l11) {
        this.zza = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzd(Long l11) {
        this.zze = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zze(Long l11) {
        this.zzb = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzf(Long l11) {
        this.zzf = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznw zzg() {
        return new zznw(this, null);
    }
}
