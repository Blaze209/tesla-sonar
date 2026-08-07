package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.messages.Message;

/* JADX INFO: loaded from: classes5.dex */
final class zzbl extends zzbu {
    final /* synthetic */ Message zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbl(zzbx zzbxVar, GoogleApiClient googleApiClient, Message message) {
        super(googleApiClient);
        this.zza = message;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzai) anyClient).zzz(zza(), zzae.zza(this.zza));
    }
}
