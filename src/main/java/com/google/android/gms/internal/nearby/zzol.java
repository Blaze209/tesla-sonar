package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.uwb.UwbStatusCodes;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class zzol extends zzkz {
    final /* synthetic */ TaskCompletionSource zza;

    zzol(zzou zzouVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzla
    public final void zzd(int i11) {
        if (i11 == 42004) {
            this.zza.setException(new SecurityException("Missing UWB_RANGING permission"));
        } else if (i11 != 0) {
            this.zza.setException(new ApiException(new Status(i11, UwbStatusCodes.zza(i11))));
        } else {
            this.zza.setResult(null);
        }
    }
}
