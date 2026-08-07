package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes5.dex */
final class zzbr extends zzby {
    final /* synthetic */ zzgp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbr(zzbs zzbsVar, zzgp zzgpVar) {
        super(null);
        this.zza = zzgpVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((Connections.EndpointDiscoveryListener) obj).onEndpointLost(this.zza.zza());
    }
}
