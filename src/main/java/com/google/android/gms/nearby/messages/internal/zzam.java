package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.PublishOptions;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzam implements zzbc {
    public final /* synthetic */ zzbh zza;
    public final /* synthetic */ Message zzb;
    public final /* synthetic */ zzbe zzc;
    public final /* synthetic */ PublishOptions zzd;

    public /* synthetic */ zzam(zzbh zzbhVar, Message message, zzbe zzbeVar, PublishOptions publishOptions) {
        this.zza = zzbhVar;
        this.zzb = message;
        this.zzc = zzbeVar;
        this.zzd = publishOptions;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbc
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) {
        this.zza.zzb(this.zzb, this.zzc, this.zzd, zzaiVar, listenerHolder);
    }
}
