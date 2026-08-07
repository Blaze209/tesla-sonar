package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.internal.nearby.zziy;
import com.google.android.gms.nearby.messages.PublishCallback;

/* JADX INFO: loaded from: classes5.dex */
final class zzbd extends zziy {
    zzbd() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((PublishCallback) obj).onExpired();
    }
}
