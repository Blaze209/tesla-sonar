package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzei extends zzeq {
    final /* synthetic */ zzco zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzei(zzfb zzfbVar, zzco zzcoVar, int i11) {
        super(zzfbVar, true);
        this.zza = zzcoVar;
        this.zzb = i11;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() {
        ((zzcr) Preconditions.checkNotNull(this.zzc.zzQ())).getTestFlag(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    protected final void zzb() {
        this.zza.zzb(null);
    }
}
