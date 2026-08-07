package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.Message;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzan implements zzbc {
    public final /* synthetic */ Message zza;

    public /* synthetic */ zzan(Message message) {
        this.zza = message;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbc
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) {
        int i11 = zzbh.zza;
        zzaiVar.zzz(listenerHolder, zzae.zza(this.zza));
    }
}
