package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes5.dex */
final class zzbq extends zzby {
    final /* synthetic */ zzgn zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbq(zzbs zzbsVar, zzgn zzgnVar) {
        super(null);
        this.zza = zzgnVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzgn zzgnVar = this.zza;
        ((Connections.EndpointDiscoveryListener) obj).onEndpointFound(zzgnVar.zzb(), zzgnVar.zzd(), zzgnVar.zzc());
    }
}
