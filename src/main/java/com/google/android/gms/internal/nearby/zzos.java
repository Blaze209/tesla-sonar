package com.google.android.gms.internal.nearby;

import android.annotation.SuppressLint;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbDevice;

/* JADX INFO: loaded from: classes5.dex */
final class zzos extends zziy {
    final /* synthetic */ zzls zza;
    final /* synthetic */ zzot zzb;

    zzos(zzot zzotVar, zzls zzlsVar) {
        this.zza = zzlsVar;
        this.zzb = zzotVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @SuppressLint({"WrongConstant"})
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzls zzlsVar = this.zza;
        zzot zzotVar = this.zzb;
        ((RangingSessionCallback) obj).onRangingSuspended(UwbDevice.createForAddress(zzlsVar.zzb().zza().zzb()), this.zza.zza());
    }

    @Override // com.google.android.gms.internal.nearby.zziy, com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @SuppressLint({"WrongConstant"})
    public final void onNotifyListenerFailed() {
        this.zzb.zzc.onRangingSuspended(UwbDevice.createForAddress(this.zza.zzb().zza().zzb()), this.zza.zza());
    }
}
