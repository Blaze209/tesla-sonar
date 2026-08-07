package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class zzbh extends zzex {
    private final ListenerHolder zza;

    zzbh(ListenerHolder listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzey
    public final void zzb(zzgd zzgdVar) {
        this.zza.notifyListener(new zzbg(this, zzgdVar));
    }
}
