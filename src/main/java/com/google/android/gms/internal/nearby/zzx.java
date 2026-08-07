package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class zzx extends zzab {
    final /* synthetic */ TaskCompletionSource zza;

    zzx(zzz zzzVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzac
    public final void zzb(Status status, boolean z11) {
        TaskUtil.trySetResultOrApiException(status, Boolean.valueOf(z11), this.zza);
    }
}
