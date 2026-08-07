package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
final class zzcg extends zzfu {
    private final BaseImplementation.ResultHolder zza;

    zzcg(BaseImplementation.ResultHolder resultHolder) {
        this.zza = (BaseImplementation.ResultHolder) Preconditions.checkNotNull(resultHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzfv
    public final void zzb(zzgv zzgvVar) {
        Status statusZzG = zzch.zzG(zzgvVar.zza());
        if (statusZzG.isSuccess()) {
            this.zza.setResult(new zzcf(statusZzG, zzgvVar.zzb()));
        } else {
            this.zza.setFailedResult(statusZzG);
        }
    }
}
