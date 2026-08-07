package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.messages.MessageListener;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zziu extends zziy {
    final /* synthetic */ List zza;

    zziu(zziv zzivVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        zziv.zzc(this.zza, (MessageListener) obj);
    }
}
