package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import com.adyen.checkout.components.core.action.SdkAction;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class JA implements DeviceDataCollector {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26443e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26444f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f26446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f26447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26448d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public JA(Context context, Activity activity, Map destination, boolean z11) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        this.f26445a = context;
        this.f26446b = activity;
        this.f26447c = destination;
        this.f26448d = z11;
    }

    private final boolean a() {
        return Settings.Secure.getInt(this.f26445a.getContentResolver(), "adb_enabled", 0) > 0;
    }

    private final boolean b() {
        return new DeviceMetadata(null, null, null, null, null, null, null, false, 255, null).getOsCompromised();
    }

    private final String c() {
        String string = Settings.Secure.getString(this.f26445a.getContentResolver(), "android_id");
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return string;
    }

    private final String d() {
        String property = System.getProperty("os.version");
        return property == null ? "unknown" : property;
    }

    private final String e() {
        String installingPackageName;
        String packageName = this.f26445a.getPackageName();
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                installingPackageName = this.f26445a.getPackageManager().getInstallSourceInfo(packageName).getInstallingPackageName();
            } catch (PackageManager.NameNotFoundException unused) {
                installingPackageName = "unknown";
            }
        } else {
            installingPackageName = this.f26445a.getPackageManager().getInstallerPackageName(packageName);
            if (installingPackageName == null) {
                installingPackageName = "unknown";
            }
        }
        if (installingPackageName == null) {
            return "unknown";
        }
        int iHashCode = installingPackageName.hashCode();
        if (iHashCode == -1859733809) {
            return !installingPackageName.equals("com.amazon.venezia") ? "unknown" : "amazon_app_store";
        }
        if (iHashCode != -1637701853) {
            return (iHashCode == -1046965711 && installingPackageName.equals("com.android.vending")) ? "google_play" : "unknown";
        }
        return !installingPackageName.equals("com.huawei.appmarket") ? "unknown" : "huawei_app_gallery";
    }

    private final int f() {
        return Process.myPid();
    }

    private final long g() {
        return SystemClock.elapsedRealtime() / ((long) 1000);
    }

    private final boolean h() {
        return Settings.Secure.getInt(this.f26445a.getContentResolver(), "development_settings_enabled", 0) > 0;
    }

    private final boolean i() {
        String MODEL = Build.MODEL;
        p013kotlin.jvm.internal.s.j(MODEL, "MODEL");
        if (p013kotlin.text.t.h0(MODEL, SdkAction.ACTION_TYPE, false, 2, null)) {
            return true;
        }
        p013kotlin.jvm.internal.s.j(MODEL, "MODEL");
        if (p013kotlin.text.t.h0(MODEL, "Emulator", false, 2, null)) {
            return true;
        }
        p013kotlin.jvm.internal.s.j(MODEL, "MODEL");
        return p013kotlin.text.t.h0(MODEL, "Android SDK built for x86", false, 2, null);
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f26448d) {
            this.f26447c.put("isOsCompromised", Boolean.valueOf(b()));
            this.f26447c.put("isAdbEnabled", Boolean.valueOf(a()));
            this.f26447c.put("applicationOrigin", e());
            this.f26447c.put("isDeveloperModeEnabled", Boolean.valueOf(h()));
            this.f26447c.put("processIdentifier", Integer.valueOf(f()));
            this.f26447c.put("processEnvironmentalVariables", System.getenv());
            this.f26447c.put("isRunOnSimulator", Boolean.valueOf(i()));
            this.f26447c.put("systemRelease", d());
            this.f26447c.put("deviceVendorId", c());
            this.f26447c.put("systemUptime", Long.valueOf(g()));
            Activity activity = this.f26446b;
            if (activity != null) {
                this.f26447c.put("isRunInSplitMode", Boolean.valueOf(activity.isInMultiWindowMode()));
            }
        }
    }
}
