package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.util.Log;
import androidx.collection.a;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzcd extends zzfo implements zzbt {
    private final Context zza;
    private final ListenerHolder zzb;
    private final Map zzc = new a();
    private final zzhc zzd;

    zzcd(Context context, ListenerHolder listenerHolder, zzhc zzhcVar) {
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzb = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
        this.zzd = zzhcVar;
    }

    @Override // com.google.android.gms.internal.nearby.zzfp
    public final synchronized void zzb(zzgr zzgrVar) {
        Payload payloadZza = zzhm.zza(this.zza, zzgrVar.zza());
        if (payloadZza == null) {
            Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", Long.valueOf(zzgrVar.zza().zzb())));
            return;
        }
        Map map = this.zzc;
        zzcc zzccVar = new zzcc(zzgrVar.zzb(), zzgrVar.zza().zzb());
        PayloadTransferUpdate.Builder builder = new PayloadTransferUpdate.Builder();
        builder.setPayloadId(zzgrVar.zza().zzb());
        map.put(zzccVar, builder.build());
        this.zzb.notifyListener(new zzbz(this, zzgrVar, payloadZza));
    }

    @Override // com.google.android.gms.internal.nearby.zzfp
    public final synchronized void zzc(zzgt zzgtVar) {
        try {
            if (zzgtVar.zza().getStatus() == 3) {
                this.zzc.put(new zzcc(zzgtVar.zzb(), zzgtVar.zza().getPayloadId()), zzgtVar.zza());
            } else {
                this.zzc.remove(new zzcc(zzgtVar.zzb(), zzgtVar.zza().getPayloadId()));
                zzhc zzhcVar = this.zzd;
                if (zzhcVar != null) {
                    zzhcVar.zzb(zzgtVar.zza().getPayloadId());
                }
            }
            this.zzb.notifyListener(new zzca(this, zzgtVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.nearby.zzbt
    public final synchronized void zzf() {
        try {
            for (Map.Entry entry : this.zzc.entrySet()) {
                this.zzb.notifyListener(new zzcb(this, ((zzcc) entry.getKey()).zza(), (PayloadTransferUpdate) entry.getValue()));
            }
            this.zzc.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
