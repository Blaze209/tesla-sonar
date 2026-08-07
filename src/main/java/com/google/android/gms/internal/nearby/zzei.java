package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* JADX INFO: loaded from: classes5.dex */
final class zzei extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ ListenerHolder zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzei(zzer zzerVar, GoogleApiClient googleApiClient, String str, long j11, ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = j11;
        this.zzc = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        DiscoveryOptions.Builder builder = new DiscoveryOptions.Builder();
        builder.setStrategy(Strategy.P2P_CLUSTER);
        DiscoveryOptions discoveryOptionsBuild = builder.build();
        zzfm zzfmVar = (zzfm) ((zzch) anyClient).getService();
        zzid zzidVar = new zzid();
        zzidVar.zzd(new zzce(this));
        zzidVar.zze(this.zza);
        zzidVar.zzb(this.zzb);
        zzidVar.zza(new zzbs(this.zzc));
        zzidVar.zzc(discoveryOptionsBuild);
        zzfmVar.zzl(zzidVar.zzf());
    }
}
