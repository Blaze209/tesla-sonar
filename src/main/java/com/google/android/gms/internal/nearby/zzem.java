package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes5.dex */
final class zzem implements Connections.StartAdvertisingResult {
    final /* synthetic */ Status zza;

    zzem(zzeo zzeoVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult
    public final String getLocalEndpointName() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
