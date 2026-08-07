package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbDevice;

/* JADX INFO: loaded from: classes5.dex */
final class zzor extends zziy {
    final /* synthetic */ zzlq zza;
    final /* synthetic */ zzot zzb;

    zzor(zzot zzotVar, zzlq zzlqVar) {
        this.zza = zzlqVar;
        this.zzb = zzotVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzlq zzlqVar = this.zza;
        zzot zzotVar = this.zzb;
        ((RangingSessionCallback) obj).onRangingResult(UwbDevice.createForAddress(zzlqVar.zzb().zza().zzb()), zzot.zzb(this.zzb, this.zza.zza()));
    }
}
