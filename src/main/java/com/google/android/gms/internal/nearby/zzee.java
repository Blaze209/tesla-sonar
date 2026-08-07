package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.AdvertisingOptions;

/* JADX INFO: loaded from: classes5.dex */
final class zzee extends zzeo {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ ListenerHolder zzc;
    final /* synthetic */ AdvertisingOptions zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzee(zzer zzerVar, GoogleApiClient googleApiClient, String str, String str2, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = str2;
        this.zzc = listenerHolder;
        this.zzd = advertisingOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzch) anyClient).zzA(this, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
