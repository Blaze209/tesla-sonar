package com.swmansion.worklets;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class AndroidUIScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f55525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f55526b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f55527c = new Runnable() { // from class: com.swmansion.worklets.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f55530a.d();
        }
    };

    @in.a
    private final HybridData mHybridData = initHybrid();

    class a extends GuardedRunnable {
        a(JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            AndroidUIScheduler.this.f55527c.run();
        }
    }

    public AndroidUIScheduler(ReactApplicationContext reactApplicationContext) {
        this.f55525a = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        synchronized (this.f55526b) {
            try {
                if (this.f55526b.get()) {
                    triggerUI();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private native HybridData initHybrid();

    @in.a
    private void scheduleTriggerOnUI() {
        UiThreadUtil.runOnUiThread(new a(this.f55525a.getExceptionHandler()));
    }

    public void c() {
        synchronized (this.f55526b) {
            this.f55526b.set(false);
            invalidate();
        }
    }

    public native void invalidate();

    public native void triggerUI();
}
