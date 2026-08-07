package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.internal.nearby.zziy;
import com.google.android.gms.nearby.messages.SubscribeCallback;

/* JADX INFO: loaded from: classes5.dex */
final class zzbf extends zziy {
    zzbf() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((SubscribeCallback) obj).onExpired();
    }
}
