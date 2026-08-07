package com.google.android.gms.internal.nearby;

import android.util.Log;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.Payload;

/* JADX INFO: loaded from: classes5.dex */
final class zzbu extends zzby {
    final /* synthetic */ zzgr zza;
    final /* synthetic */ zzbw zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbu(zzbw zzbwVar, zzgr zzgrVar) {
        super(null);
        this.zza = zzgrVar;
        this.zzb = zzbwVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        byte[] bArrAsBytes;
        Connections.MessageListener messageListener = (Connections.MessageListener) obj;
        Payload payloadZza = zzhm.zza(this.zzb.zza, this.zza.zza());
        if (payloadZza == null) {
            Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", Long.valueOf(this.zza.zza().zzb())));
        } else if (payloadZza.getType() == 1 && (bArrAsBytes = payloadZza.asBytes()) != null) {
            zzgr zzgrVar = this.zza;
            messageListener.onMessageReceived(zzgrVar.zzb(), bArrAsBytes, zzgrVar.zzc());
        }
    }
}
