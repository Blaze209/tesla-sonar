package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingCapabilities;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class zzoi extends zzkt {
    final /* synthetic */ TaskCompletionSource zza;

    zzoi(zzou zzouVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzku
    public final void zzd(zzly zzlyVar) {
        this.zza.setResult(new RangingCapabilities(zzlyVar.zze(), zzlyVar.zzc(), zzlyVar.zzf(), zzlyVar.zzb(), zzlyVar.zza(), zzpt.zzj(zzqk.zzb(zzlyVar.zzg())), zzpt.zzj(zzqk.zzb(zzlyVar.zzi())), zzpt.zzj(zzqk.zzb(zzlyVar.zzh())), zzpt.zzj(zzqk.zzb(zzlyVar.zzk())), zzpt.zzj(zzqk.zzb(zzlyVar.zzj())), zzlyVar.zzd()));
    }
}
