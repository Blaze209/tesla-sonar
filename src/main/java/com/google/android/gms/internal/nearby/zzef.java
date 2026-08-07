package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* JADX INFO: loaded from: classes5.dex */
final class zzef extends zzeo {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ ListenerHolder zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzef(zzer zzerVar, GoogleApiClient googleApiClient, String str, long j11, ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = j11;
        this.zzc = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        AdvertisingOptions.Builder builder = new AdvertisingOptions.Builder();
        builder.setStrategy(Strategy.P2P_CLUSTER);
        AdvertisingOptions advertisingOptionsBuild = builder.build();
        zzfm zzfmVar = (zzfm) ((zzch) anyClient).getService();
        zzhz zzhzVar = new zzhz();
        zzhzVar.zzg(new zzcg(this));
        zzhzVar.zze(this.zza);
        zzhzVar.zzh("__LEGACY_SERVICE_ID__");
        zzhzVar.zzc(this.zzb);
        zzhzVar.zza(new zzbh(this.zzc));
        zzhzVar.zzf(advertisingOptionsBuild);
        zzfmVar.zzk(zzhzVar.zzi());
    }
}
