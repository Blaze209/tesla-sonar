package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzka implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzlj zzb;

    zzka(zzlj zzljVar, long j11) {
        this.zza = j11;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzic zzicVar = this.zzb.zzu;
        zzhe zzheVar = zzicVar.zzd().zzf;
        long j11 = this.zza;
        zzheVar.zzb(j11);
        zzicVar.zzaV().zzj().zzb("Session timeout duration set", Long.valueOf(j11));
    }
}
