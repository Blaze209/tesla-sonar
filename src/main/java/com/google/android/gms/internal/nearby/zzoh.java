package com.google.android.gms.internal.nearby;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class zzoh extends zzkp {
    final /* synthetic */ TaskCompletionSource zza;

    zzoh(zzou zzouVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzkq
    public final void zzd(boolean z11) {
        this.zza.setResult(Boolean.valueOf(z11));
    }
}
