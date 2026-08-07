package com.wix.reactnativenotifications.core;

import android.app.IntentService;
import android.content.Intent;
import com.wix.reactnativenotifications.core.notification.IPushNotification;
import com.wix.reactnativenotifications.core.notification.a;
import gj0.f;

/* JADX INFO: loaded from: classes8.dex */
public class ProxyService extends IntentService {
    public ProxyService() {
        super("notificationsProxyService");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        IPushNotification iPushNotificationL = a.l(this, f.d(intent));
        if (iPushNotificationL != null) {
            iPushNotificationL.c();
        }
    }
}
