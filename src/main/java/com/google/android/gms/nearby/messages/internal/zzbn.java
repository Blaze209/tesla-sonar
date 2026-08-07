package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* JADX INFO: loaded from: classes5.dex */
final class zzbn extends zzbu {
    final /* synthetic */ PendingIntent zza;
    final /* synthetic */ zzbw zzb;
    final /* synthetic */ SubscribeOptions zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbn(zzbx zzbxVar, GoogleApiClient googleApiClient, PendingIntent pendingIntent, zzbw zzbwVar, SubscribeOptions subscribeOptions) {
        super(googleApiClient);
        this.zza = pendingIntent;
        this.zzb = zzbwVar;
        this.zzc = subscribeOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzai) anyClient).zzv(zza(), this.zza, this.zzb, this.zzc);
    }
}
