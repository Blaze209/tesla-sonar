package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.PublishOptions;

/* JADX INFO: loaded from: classes5.dex */
final class zzbk extends zzbu {
    final /* synthetic */ Message zza;
    final /* synthetic */ zzbt zzb;
    final /* synthetic */ PublishOptions zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbk(zzbx zzbxVar, GoogleApiClient googleApiClient, Message message, zzbt zzbtVar, PublishOptions publishOptions) {
        super(googleApiClient);
        this.zza = message;
        this.zzb = zzbtVar;
        this.zzc = publishOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzai) anyClient).zzs(zza(), zzae.zza(this.zza), this.zzb, this.zzc);
    }
}
