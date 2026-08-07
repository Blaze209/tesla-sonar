package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44005a;

    m0() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.f44005a == null) {
                this.f44005a = b(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return "".equals(this.f44005a) ? null : this.f44005a;
    }
}
