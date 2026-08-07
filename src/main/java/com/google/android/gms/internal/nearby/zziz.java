package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.messages.StatusCallback;

/* JADX INFO: loaded from: classes5.dex */
final class zziz extends zziy {
    final /* synthetic */ boolean zza;

    zziz(zzja zzjaVar, boolean z11) {
        this.zza = z11;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((StatusCallback) obj).onPermissionChanged(this.zza);
    }
}
