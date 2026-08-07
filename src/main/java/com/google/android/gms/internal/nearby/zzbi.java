package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes5.dex */
final class zzbi extends zzby {
    final /* synthetic */ zzgf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbi(zzbj zzbjVar, zzgf zzgfVar) {
        super(null);
        this.zza = zzgfVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        Connections.ConnectionResponseCallback connectionResponseCallback = (Connections.ConnectionResponseCallback) obj;
        byte[] bArrZzc = this.zza.zzc();
        if (bArrZzc != null) {
            zzgf zzgfVar = this.zza;
            connectionResponseCallback.onConnectionResponse(zzgfVar.zzb(), zzch.zzG(zzgfVar.zza()), bArrZzc);
        }
    }
}
