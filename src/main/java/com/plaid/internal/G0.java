package com.plaid.internal;

import android.app.Application;
import android.provider.Settings;

/* JADX INFO: loaded from: classes6.dex */
public final class G0 {
    public static String a(Application application) {
        p013kotlin.jvm.internal.s.k(application, "application");
        return Settings.Secure.getString(application.getApplicationContext().getContentResolver(), "android_id");
    }
}
