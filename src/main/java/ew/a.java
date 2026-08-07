package ew;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.b;
import vv.c;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f63235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f63236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63237d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f63234a = contextA;
        this.f63235b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f63236c = cVar;
        this.f63237d = c();
    }

    private static Context a(Context context) {
        return b.createDeviceProtectedStorageContext(context);
    }

    private boolean c() {
        return this.f63235b.contains("firebase_data_collection_default_enabled") ? this.f63235b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f63234a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f63234a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z11) {
        if (this.f63237d != z11) {
            this.f63237d = z11;
            this.f63236c.a(new vv.a<>(com.google.firebase.b.class, new com.google.firebase.b(z11)));
        }
    }

    public synchronized boolean b() {
        return this.f63237d;
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f63235b.edit().remove("firebase_data_collection_default_enabled").apply();
                f(d());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f63235b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                f(zEquals);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
