package com.google.android.gms.internal.nearby;

import android.content.Context;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class zzbw extends zzfa {
    private final Context zza;
    private final ListenerHolder zzb;

    zzbw(Context context, ListenerHolder listenerHolder) {
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzb = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzfb
    public final void zzc(zzgj zzgjVar) {
        this.zzb.notifyListener(new zzbv(this, zzgjVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzfb
    public final void zzd(zzgr zzgrVar) {
        this.zzb.notifyListener(new zzbu(this, zzgrVar));
    }
}
