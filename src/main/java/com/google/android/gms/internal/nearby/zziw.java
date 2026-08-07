package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes5.dex */
final class zziw extends zziy {
    final /* synthetic */ Status zza;

    zziw(zzix zzixVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        BaseImplementation.ResultHolder resultHolder = (BaseImplementation.ResultHolder) obj;
        if (this.zza.isSuccess()) {
            resultHolder.setResult(this.zza);
        } else {
            resultHolder.setFailedResult(this.zza);
        }
    }
}
