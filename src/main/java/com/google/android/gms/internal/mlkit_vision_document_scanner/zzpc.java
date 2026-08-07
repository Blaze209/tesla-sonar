package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes5.dex */
public final class zzpc {
    private Long zza;
    private zznt zzb;
    private zzmz zzc;
    private Integer zzd;

    public final zzpc zza(Long l11) {
        this.zza = Long.valueOf(l11.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzpc zzb(zznt zzntVar) {
        this.zzb = zzntVar;
        return this;
    }

    public final zzpc zzc(zzmz zzmzVar) {
        this.zzc = zzmzVar;
        return this;
    }

    public final zzpc zzd(Integer num) {
        this.zzd = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzpd zze() {
        return new zzpd(this, null);
    }

    final /* synthetic */ Long zzf() {
        return this.zza;
    }

    final /* synthetic */ zznt zzg() {
        return this.zzb;
    }

    final /* synthetic */ zzmz zzh() {
        return this.zzc;
    }

    final /* synthetic */ Integer zzi() {
        return this.zzd;
    }
}
