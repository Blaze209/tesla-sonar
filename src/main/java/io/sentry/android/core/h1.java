package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h1 f79409b = new h1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f79410a;

    private h1() {
    }

    public static h1 c() {
        return f79409b;
    }

    public void a(Activity activity) {
        WeakReference<Activity> weakReference = this.f79410a;
        if (weakReference == null || weakReference.get() == activity) {
            this.f79410a = null;
        }
    }

    public Activity b() {
        WeakReference<Activity> weakReference = this.f79410a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void d(Activity activity) {
        WeakReference<Activity> weakReference = this.f79410a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f79410a = new WeakReference<>(activity);
        }
    }
}
