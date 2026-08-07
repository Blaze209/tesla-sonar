package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes5.dex */
final class zzbv extends zzby {
    final /* synthetic */ zzgj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbv(zzbw zzbwVar, zzgj zzgjVar) {
        super(null);
        this.zza = zzgjVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((Connections.MessageListener) obj).onDisconnected(this.zza.zza());
    }
}
