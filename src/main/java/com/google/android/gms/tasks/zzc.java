package com.google.android.gms.tasks;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    zzc(zzd zzdVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzdVar);
        this.zzb = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task = this.zza;
        if (task.isCanceled()) {
            this.zzb.zzd().zze();
            return;
        }
        try {
            this.zzb.zzd().zza(this.zzb.zzc().then(task));
        } catch (RuntimeExecutionException e11) {
            if (!(e11.getCause() instanceof Exception)) {
                this.zzb.zzd().zzc(e11);
                return;
            }
            zzd zzdVar = this.zzb;
            zzdVar.zzd().zzc((Exception) e11.getCause());
        } catch (Exception e12) {
            this.zzb.zzd().zzc(e12);
        }
    }
}
