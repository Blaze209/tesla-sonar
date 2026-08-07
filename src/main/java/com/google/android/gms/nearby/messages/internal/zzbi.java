package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes5.dex */
final class zzbi extends zzbu {
    final /* synthetic */ ListenerHolder zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbi(zzbx zzbxVar, GoogleApiClient googleApiClient, ListenerHolder listenerHolder) {
        super(googleApiClient);
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzai) anyClient).zzA(zza(), this.zza);
    }
}
