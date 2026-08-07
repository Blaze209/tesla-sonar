package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f43961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f43962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f43963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    TaskCompletionSource<Void> f43964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f43965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f43966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f43967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TaskCompletionSource<Void> f43968h;

    public f0(com.google.firebase.f fVar) {
        Object obj = new Object();
        this.f43963c = obj;
        this.f43964d = new TaskCompletionSource<>();
        this.f43965e = false;
        this.f43966f = false;
        this.f43968h = new TaskCompletionSource<>();
        Context contextK = fVar.k();
        this.f43962b = fVar;
        this.f43961a = i.q(contextK);
        Boolean boolB = b();
        this.f43967g = boolB == null ? a(contextK) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f43964d.trySetResult(null);
                    this.f43965e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f43966f = false;
            return null;
        }
        this.f43966f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolG));
    }

    private Boolean b() {
        if (!this.f43961a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f43966f = false;
        return Boolean.valueOf(this.f43961a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f43962b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z11) {
        String str;
        String str2 = z11 ? "ENABLED" : "DISABLED";
        if (this.f43967g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f43966f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        bv.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e11) {
            bv.g.f().e("Could not read data collection permission from manifest", e11);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
    }

    public void c(boolean z11) {
        if (!z11) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f43968h.trySetResult(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f43967g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (Throwable th2) {
            throw th2;
        }
        return zBooleanValue;
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f43966f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f43967g = bool != null ? bool : a(this.f43962b.k());
        i(this.f43961a, bool);
        synchronized (this.f43963c) {
            try {
                if (d()) {
                    if (!this.f43965e) {
                        this.f43964d.trySetResult(null);
                        this.f43965e = true;
                    }
                } else if (this.f43965e) {
                    this.f43964d = new TaskCompletionSource<>();
                    this.f43965e = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public Task<Void> j() {
        Task<Void> task;
        synchronized (this.f43963c) {
            task = this.f43964d.getTask();
        }
        return task;
    }

    public Task<Void> k() {
        return ev.b.b(this.f43968h.getTask(), j());
    }
}
