package com.google.android.gms.internal.nearby;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes5.dex */
public final class zzix extends com.google.android.gms.nearby.messages.internal.zzq {
    private final ListenerHolder zza;
    private boolean zzb = false;

    public zzix(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzr
    public final synchronized void zzd(Status status) {
        if (!this.zzb) {
            this.zza.notifyListener(new zziw(this, status));
            this.zzb = true;
        } else {
            String strValueOf = String.valueOf(status);
            Log.wtf("NearbyMessagesCallbackWrapper", "Received multiple statuses: ".concat(strValueOf), new Exception());
        }
    }
}
