package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.UwbComplexChannel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class zzok extends zzli {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzou zzb;

    zzok(zzou zzouVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        this.zzb = zzouVar;
    }

    @Override // com.google.android.gms.internal.nearby.zzlj
    public final void zzd(zznr zznrVar) {
        UwbComplexChannel.Builder builder = new UwbComplexChannel.Builder();
        builder.setChannel(zznrVar.zza());
        builder.setPreambleIndex(zznrVar.zzb());
        this.zzb.zzf = builder.build();
        this.zza.setResult(this.zzb.zzf);
    }
}
