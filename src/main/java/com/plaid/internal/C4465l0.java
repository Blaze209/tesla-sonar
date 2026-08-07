package com.plaid.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.plaid.BuildConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.plaid.internal.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4465l0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f47820a = new WeakReference<>(null);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        String name = activity.getClass().getName();
        p013kotlin.jvm.internal.s.j(name, "getName(...)");
        if (p013kotlin.text.t.h0(name, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null)) {
            this.f47820a = new WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        String name = activity.getClass().getName();
        p013kotlin.jvm.internal.s.j(name, "getName(...)");
        if (p013kotlin.text.t.h0(name, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null)) {
            this.f47820a = new WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        p013kotlin.jvm.internal.s.k(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        String name = activity.getClass().getName();
        p013kotlin.jvm.internal.s.j(name, "getName(...)");
        if (p013kotlin.text.t.h0(name, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null)) {
            this.f47820a = new WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
    }
}
