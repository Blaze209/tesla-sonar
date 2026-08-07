package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes5.dex */
final class zzdy extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ byte[] zzc;
    final /* synthetic */ ListenerHolder zzd;
    final /* synthetic */ ListenerHolder zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdy(zzer zzerVar, GoogleApiClient googleApiClient, String str, String str2, byte[] bArr, ListenerHolder listenerHolder, ListenerHolder listenerHolder2) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = listenerHolder;
        this.zze = listenerHolder2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzch zzchVar = (zzch) anyClient;
        zzfm zzfmVar = (zzfm) zzchVar.getService();
        zzhr zzhrVar = new zzhr();
        zzhrVar.zzi(new zzce(this));
        zzhrVar.zzf(this.zza);
        zzhrVar.zzh(this.zzb);
        zzhrVar.zze(this.zzc);
        zzhrVar.zza(new zzbw(zzchVar.getContext(), this.zze));
        zzhrVar.zzc(new zzbj(this.zzd));
        zzfmVar.zzi(zzhrVar.zzj());
    }
}
