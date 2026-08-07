package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes5.dex */
final class zzdr extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ ListenerHolder zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdr(zzer zzerVar, GoogleApiClient googleApiClient, String str, ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzch) anyClient).zzr(this, this.zza, this.zzb);
    }
}
