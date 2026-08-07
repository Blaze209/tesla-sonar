package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzhe {
    private Task zza;

    /* synthetic */ zzhe(zzhd zzhdVar) {
    }

    public abstract CancellationTokenSource zza();

    public final Task zzc() {
        return this.zza;
    }

    public final void zzd(Task task) {
        this.zza = task;
    }
}
