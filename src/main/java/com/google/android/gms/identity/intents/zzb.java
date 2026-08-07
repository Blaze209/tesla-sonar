package com.google.android.gms.identity.intents;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes5.dex */
final class zzb extends zzc {
    final /* synthetic */ UserAddressRequest zza;
    final /* synthetic */ int zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzb(GoogleApiClient googleApiClient, UserAddressRequest userAddressRequest, int i11) {
        super(googleApiClient);
        this.zza = userAddressRequest;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((com.google.android.gms.internal.identity.zze) anyClient).zzp(this.zza, this.zzb);
        setResult(Status.RESULT_SUCCESS);
    }
}
