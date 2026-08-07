package com.wix.reactnativenotifications;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import com.wix.reactnativenotifications.core.notification.IPushNotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class d implements p0, gj0.b.a, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f58815a;

    public d(Application application) {
        this.f58815a = application;
        gj0.c.a().b(this);
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // gj0.b.a
    public void a() {
        ij0.c.g(this.f58815a.getApplicationContext()).a();
    }

    @Override // gj0.b.a
    public void b() {
    }

    @Override // com.facebook.react.p0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNNotificationsModule(reactApplicationContext));
        arrayList.addAll(k.f58819a.createNativeModules(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.p0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ij0.c.g(this.f58815a.getApplicationContext()).c(activity);
        Intent intent = activity.getIntent();
        if (gj0.f.a(intent)) {
            IPushNotification iPushNotificationL = com.wix.reactnativenotifications.core.notification.a.l(this.f58815a.getApplicationContext(), gj0.f.c(intent));
            if (iPushNotificationL != null) {
                iPushNotificationL.c();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            com.wix.reactnativenotifications.core.notification.b bVar = new com.wix.reactnativenotifications.core.notification.b(extras);
            if (bVar.b()) {
                gj0.d.c().d(bVar);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
