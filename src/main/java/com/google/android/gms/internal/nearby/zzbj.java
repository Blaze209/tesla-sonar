package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class zzbj extends zzfg {
    private final ListenerHolder zza;

    public zzbj(ListenerHolder listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzfh
    public final void zzb(zzgf zzgfVar) {
        this.zza.notifyListener(new zzbi(this, zzgfVar));
    }
}
