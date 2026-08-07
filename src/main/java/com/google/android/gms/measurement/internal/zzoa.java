package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes5.dex */
final class zzoa {
    protected long zza;
    protected long zzb;
    final /* synthetic */ zzoc zzc;
    private final zzay zzd;

    public zzoa(zzoc zzocVar) {
        Objects.requireNonNull(zzocVar);
        this.zzc = zzocVar;
        this.zzd = new zznz(this, zzocVar.zzu);
        long jElapsedRealtime = zzocVar.zzu.zzaZ().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    final void zza(long j11) {
        this.zzc.zzg();
        this.zzd.zzd();
        this.zza = j11;
        this.zzb = j11;
    }

    final void zzb(long j11) {
        this.zzd.zzd();
    }

    final void zzc() {
        this.zzd.zzd();
        long jElapsedRealtime = this.zzc.zzu.zzaZ().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    public final boolean zzd(boolean z11, boolean z12, long j11) {
        zzoc zzocVar = this.zzc;
        zzocVar.zzg();
        zzocVar.zzb();
        if (zzocVar.zzu.zzB()) {
            zzic zzicVar = zzocVar.zzu;
            zzicVar.zzd().zzk.zzb(zzicVar.zzaZ().currentTimeMillis());
        }
        long j12 = j11 - this.zza;
        if (!z11 && j12 < 1000) {
            zzocVar.zzu.zzaV().zzk().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j12));
            return false;
        }
        if (!z12) {
            j12 = j11 - this.zzb;
            this.zzb = j11;
        }
        zzic zzicVar2 = zzocVar.zzu;
        zzicVar2.zzaV().zzk().zzb("Recording user engagement, ms", Long.valueOf(j12));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j12);
        boolean z13 = !zzicVar2.zzc().zzv();
        zzic zzicVar3 = zzocVar.zzu;
        zzpp.zzav(zzicVar3.zzs().zzh(z13), bundle, true);
        if (!z12) {
            zzicVar3.zzj().zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.zza = j11;
        zzay zzayVar = this.zzd;
        zzayVar.zzd();
        zzayVar.zzb(((Long) zzfy.zzaq.zzb(null)).longValue());
        return true;
    }
}
