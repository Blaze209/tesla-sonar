package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes5.dex */
final class zzbg extends zzby {
    final /* synthetic */ zzgd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbg(zzbh zzbhVar, zzgd zzgdVar) {
        super(null);
        this.zza = zzgdVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzgd zzgdVar = this.zza;
        ((Connections.ConnectionRequestListener) obj).onConnectionRequest(zzgdVar.zza(), zzgdVar.zzb(), (byte[]) Preconditions.checkNotNull(zzgdVar.zzc()));
    }
}
