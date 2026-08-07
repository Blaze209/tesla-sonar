package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
final class zzac extends zzae {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzaf zzafVar, GoogleApiClient googleApiClient, long j11, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = j11;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        PendingIntent pendingIntent = this.zzb;
        C4338zzg c4338zzg = (C4338zzg) anyClient;
        Preconditions.checkNotNull(pendingIntent);
        long j11 = this.zza;
        Preconditions.checkArgument(j11 >= 0, "detectionIntervalMillis must be >= 0");
        ((zzv) c4338zzg.getService()).zzh(j11, true, pendingIntent);
        setResult(Status.RESULT_SUCCESS);
    }
}
