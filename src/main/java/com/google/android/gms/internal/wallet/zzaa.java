package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.zzas;

/* JADX INFO: loaded from: classes5.dex */
final class zzaa extends zzas {
    final /* synthetic */ CreateWalletObjectsRequest zza;
    final /* synthetic */ int zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(zzab zzabVar, GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i11) {
        super(googleApiClient);
        this.zza = createWalletObjectsRequest;
        this.zzb = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.wallet.zzaq, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* JADX INFO: renamed from: zza */
    public final void doExecute(zzy zzyVar) {
        zzyVar.zzp(this.zza, this.zzb);
        setResult(Status.RESULT_SUCCESS);
    }
}
