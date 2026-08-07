package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class zzu extends zzt {
    private final TaskCompletionSource zza;

    zzu(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzc(Status status, boolean z11, Bundle bundle) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z11), this.zza);
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzg(int i11, boolean z11, Bundle bundle) {
        TaskUtil.setResultOrApiException(new Status(i11), Boolean.valueOf(z11), this.zza);
    }
}
