package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzak implements zzbc {
    public final /* synthetic */ zzbh zza;
    public final /* synthetic */ PendingIntent zzb;
    public final /* synthetic */ zzbg zzc;
    public final /* synthetic */ SubscribeOptions zzd;

    public /* synthetic */ zzak(zzbh zzbhVar, PendingIntent pendingIntent, zzbg zzbgVar, SubscribeOptions subscribeOptions) {
        this.zza = zzbhVar;
        this.zzb = pendingIntent;
        this.zzc = zzbgVar;
        this.zzd = subscribeOptions;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbc
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) {
        this.zza.zzf(this.zzb, this.zzc, this.zzd, zzaiVar, listenerHolder);
    }
}
