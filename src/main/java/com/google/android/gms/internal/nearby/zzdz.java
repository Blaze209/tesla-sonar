package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes5.dex */
final class zzdz extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ byte[] zzb;
    final /* synthetic */ ListenerHolder zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdz(zzer zzerVar, GoogleApiClient googleApiClient, String str, byte[] bArr, ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = bArr;
        this.zzc = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzch zzchVar = (zzch) anyClient;
        zzfm zzfmVar = (zzfm) zzchVar.getService();
        zzap zzapVar = new zzap();
        zzapVar.zze(new zzce(this));
        zzapVar.zzd(this.zza);
        zzapVar.zzb(this.zzb);
        zzapVar.zza(new zzbw(zzchVar.getContext(), this.zzc));
        zzfmVar.zzd(zzapVar.zzf());
    }
}
