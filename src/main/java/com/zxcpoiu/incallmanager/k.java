package com.zxcpoiu.incallmanager;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.PowerManager;
import android.util.Log;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Method f58878b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PowerManager.WakeLock f58877a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f58879c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private oj0.c f58880d = null;

    private k(final Context context, final InCallManagerModule inCallManagerModule) {
        Log.d("InCallProximityManager", "InCallProximityManager");
        f(context);
        if (this.f58879c) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zxcpoiu.incallmanager.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f58870a.k(context, inCallManagerModule);
                }
            });
        }
    }

    private void f(Context context) {
        Class cls = Integer.TYPE;
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) {
            this.f58879c = false;
            return;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        this.f58879c = true;
        try {
            Integer num = (Integer) PowerManager.class.getDeclaredField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").get(null);
            int iIntValue = num.intValue();
            if (((Boolean) powerManager.getClass().getDeclaredMethod("isWakeLockLevelSupported", cls).invoke(powerManager, num)).booleanValue()) {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(iIntValue, "InCallProximityManager");
                this.f58877a = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        } catch (Exception e11) {
            Log.d("InCallProximityManager", "Failed to get proximity screen locker. exception: ", e11);
        }
        if (this.f58877a == null) {
            Log.d("InCallProximityManager", "fallback to old school screen locker...");
            return;
        }
        Log.d("InCallProximityManager", "use native screen locker...");
        try {
            this.f58878b = this.f58877a.getClass().getDeclaredMethod("release", cls);
        } catch (Exception e12) {
            Log.d("InCallProximityManager", "failed to get proximity screen locker: `release()`. exception: ", e12);
        }
    }

    static k g(Context context, InCallManagerModule inCallManagerModule) {
        return new k(context, inCallManagerModule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(InCallManagerModule inCallManagerModule) {
        inCallManagerModule.onProximitySensorChangedState(this.f58880d.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Context context, final InCallManagerModule inCallManagerModule) {
        this.f58880d = oj0.c.a(context, new Runnable() { // from class: com.zxcpoiu.incallmanager.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f58875a.j(inCallManagerModule);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f58880d.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f58880d.f();
    }

    public void e() {
        if (i()) {
            synchronized (this.f58877a) {
                try {
                    if (!this.f58877a.isHeld()) {
                        Log.d("InCallProximityManager", "acquireProximityWakeLock()");
                        this.f58877a.acquire();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean h() {
        return this.f58879c;
    }

    public boolean i() {
        return this.f58877a != null;
    }

    public void n(boolean z11) {
        if (i()) {
            synchronized (this.f58877a) {
                if (this.f58877a.isHeld()) {
                    try {
                        this.f58878b.invoke(this.f58877a, Integer.valueOf(z11 ? 1 : 0));
                        Log.d("InCallProximityManager", "releaseProximityWakeLock()");
                    } catch (Exception e11) {
                        Log.e("InCallProximityManager", "failed to release proximity lock. e: ", e11);
                    }
                }
            }
        }
    }

    public boolean o() {
        if (!this.f58879c) {
            return false;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zxcpoiu.incallmanager.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f58874a.l();
            }
        });
        return true;
    }

    public void p() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zxcpoiu.incallmanager.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f58873a.m();
            }
        });
    }
}
