package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzkd implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzlj zze;

    zzkd(zzlj zzljVar, String str, String str2, Object obj, long j11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j11;
        Objects.requireNonNull(zzljVar);
        this.zze = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzN(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
