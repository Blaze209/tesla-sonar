package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes5.dex */
final class zzdv extends zzeq {
    final /* synthetic */ long zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdv(zzer zzerVar, GoogleApiClient googleApiClient, long j11) {
        super(googleApiClient, null);
        this.zza = j11;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzch) anyClient).zzs(this, this.zza);
    }
}
