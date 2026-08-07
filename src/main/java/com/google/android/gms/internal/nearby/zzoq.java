package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbDevice;

/* JADX INFO: loaded from: classes5.dex */
final class zzoq extends zziy {
    final /* synthetic */ zzlo zza;
    final /* synthetic */ zzot zzb;

    zzoq(zzot zzotVar, zzlo zzloVar) {
        this.zza = zzloVar;
        this.zzb = zzotVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzlo zzloVar = this.zza;
        zzot zzotVar = this.zzb;
        ((RangingSessionCallback) obj).onRangingInitialized(UwbDevice.createForAddress(zzloVar.zza().zza().zzb()));
    }
}
