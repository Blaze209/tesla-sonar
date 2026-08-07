package com.google.android.gms.internal.wallet;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.wobs.WalletObjects;

/* JADX INFO: loaded from: classes5.dex */
public final class zzab implements WalletObjects {
    @Override // com.google.android.gms.wallet.wobs.WalletObjects
    @SuppressLint({"MissingRemoteException"})
    public final void createWalletObjects(GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i11) {
        googleApiClient.enqueue(new zzaa(this, googleApiClient, createWalletObjectsRequest, i11));
    }
}
