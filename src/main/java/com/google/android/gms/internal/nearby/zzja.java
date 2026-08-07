package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes5.dex */
public final class zzja extends com.google.android.gms.nearby.messages.internal.zzx {
    private final ListenerHolder zza;

    public zzja(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzy
    public final void zzd(boolean z11) {
        this.zza.notifyListener(new zziz(this, z11));
    }
}
