package io.sentry.android.core;

import android.os.Build;
import com.adyen.checkout.components.core.action.SdkAction;
import io.sentry.ILogger;
import io.sentry.b7;

/* JADX INFO: loaded from: classes9.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ILogger f79825a;

    public z0(ILogger iLogger) {
        this.f79825a = (ILogger) io.sentry.util.y.c(iLogger, "The ILogger object is required.");
    }

    public String a() {
        return Build.TAGS;
    }

    public String b() {
        return Build.MANUFACTURER;
    }

    public String c() {
        return Build.MODEL;
    }

    public int d() {
        return Build.VERSION.SDK_INT;
    }

    public String e() {
        return Build.VERSION.RELEASE;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    public Boolean f() {
        boolean z11;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z11 = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z11 = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z11 = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z11 = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains(SdkAction.ACTION_TYPE) || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z11);
        } catch (Throwable th2) {
            this.f79825a.a(b7.ERROR, "Error checking whether application is running in an emulator.", th2);
            return null;
        }
    }
}
