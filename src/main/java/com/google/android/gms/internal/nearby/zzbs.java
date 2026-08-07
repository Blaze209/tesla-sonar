package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
final class zzbs extends zzfk {
    private final ListenerHolder zza;

    zzbs(ListenerHolder listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzfl
    public final synchronized void zzb(zzgl zzglVar) {
    }

    @Override // com.google.android.gms.internal.nearby.zzfl
    public final void zzc(zzgn zzgnVar) {
        this.zza.notifyListener(new zzbq(this, zzgnVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzfl
    public final void zzd(zzgp zzgpVar) {
        this.zza.notifyListener(new zzbr(this, zzgpVar));
    }
}
