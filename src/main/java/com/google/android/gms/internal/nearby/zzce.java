package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
final class zzce extends zzfr {
    private final BaseImplementation.ResultHolder zza;

    zzce(BaseImplementation.ResultHolder resultHolder) {
        this.zza = (BaseImplementation.ResultHolder) Preconditions.checkNotNull(resultHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzfs
    public final void zzb(int i11) {
        Status statusZzG = zzch.zzG(i11);
        if (statusZzG.isSuccess()) {
            this.zza.setResult(statusZzG);
        } else {
            this.zza.setFailedResult(statusZzG);
        }
    }
}
