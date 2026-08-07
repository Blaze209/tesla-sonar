package io.realm.mongodb.sync;

import io.realm.internal.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public interface SubscriptionSet$StateChangeCallback {
    void onError(Throwable th2);

    void onStateChange(SubscriptionSet subscriptionSet);
}
