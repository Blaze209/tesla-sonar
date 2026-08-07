package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class zzoj extends zzlc {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzou zzb;

    zzoj(zzou zzouVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        this.zzb = zzouVar;
    }

    @Override // com.google.android.gms.internal.nearby.zzld
    public final void zzd(zzni zzniVar) {
        this.zzb.zzc = new UwbAddress(zzniVar.zzb());
        this.zza.setResult(this.zzb.zzc);
    }
}
