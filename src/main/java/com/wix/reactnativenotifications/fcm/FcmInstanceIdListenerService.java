package com.wix.reactnativenotifications.fcm;

import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.r0;
import com.tesla.logging.g;
import com.wix.reactnativenotifications.core.notification.IPushNotification;
import com.wix.reactnativenotifications.core.notification.a;
import kj0.b;

/* JADX INFO: loaded from: classes8.dex */
public class FcmInstanceIdListenerService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g f58817h = g.h("ReactNativeNotifs");

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void p(r0 r0Var) {
        try {
            a.l(getApplicationContext(), r0Var.T().getExtras()).a();
        } catch (IPushNotification.InvalidNotificationException unused) {
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(@NonNull String str) {
        super.r(str);
        b.e(getApplicationContext()).setToken(str);
    }
}
