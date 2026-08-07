package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.nearby.zzix;

/* JADX INFO: loaded from: classes5.dex */
final class zzbq extends zzbu {
    zzbq(zzbx zzbxVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzs) ((zzai) anyClient).getService()).zzd(new zzh(1, new zzix(zza()), null, null));
    }
}
