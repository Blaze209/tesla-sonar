package com.facebook.react.runtime;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;

/* JADX INFO: loaded from: classes4.dex */
class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LifecycleState f23001a = LifecycleState.BEFORE_CREATE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f23002b;

    e1(c cVar) {
        this.f23002b = cVar;
    }

    public LifecycleState a() {
        return this.f23001a;
    }

    public void b(ReactContext reactContext) {
        if (reactContext != null) {
            LifecycleState lifecycleState = this.f23001a;
            if (lifecycleState == LifecycleState.BEFORE_RESUME) {
                this.f23002b.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            } else if (lifecycleState == LifecycleState.RESUMED) {
                this.f23002b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
                this.f23002b.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            }
        }
        this.f23001a = LifecycleState.BEFORE_CREATE;
    }

    public void c(ReactContext reactContext, Activity activity) {
        if (reactContext != null) {
            LifecycleState lifecycleState = this.f23001a;
            if (lifecycleState == LifecycleState.BEFORE_CREATE) {
                this.f23002b.a("ReactContext.onHostResume()");
                reactContext.onHostResume(activity);
                this.f23002b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
            } else if (lifecycleState == LifecycleState.RESUMED) {
                this.f23002b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
            }
        }
        this.f23001a = LifecycleState.BEFORE_RESUME;
    }

    public void d(ReactContext reactContext, Activity activity) {
        LifecycleState lifecycleState = this.f23001a;
        LifecycleState lifecycleState2 = LifecycleState.RESUMED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        if (reactContext != null) {
            this.f23002b.a("ReactContext.onHostResume()");
            reactContext.onHostResume(activity);
        }
        this.f23001a = lifecycleState2;
    }

    public void e(ReactContext reactContext, Activity activity) {
        if (this.f23001a == LifecycleState.RESUMED) {
            this.f23002b.a("ReactContext.onHostResume()");
            reactContext.onHostResume(activity);
        }
    }
}
