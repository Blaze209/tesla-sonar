package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* JADX INFO: loaded from: classes5.dex */
final class zzeh extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ ListenerHolder zzb;
    final /* synthetic */ DiscoveryOptions zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeh(zzer zzerVar, GoogleApiClient googleApiClient, String str, ListenerHolder listenerHolder, DiscoveryOptions discoveryOptions) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = listenerHolder;
        this.zzc = discoveryOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzch) anyClient).zzC(this, this.zza, this.zzb, this.zzc);
    }
}
