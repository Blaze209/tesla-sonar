package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class N4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46538a = new a();

    public static final class a {
        public final synchronized String a(Application application) {
            String string;
            try {
                p013kotlin.jvm.internal.s.k(application, "application");
                SharedPreferences sharedPreferences = application.getSharedPreferences("link_persistent_uuid", 0);
                string = sharedPreferences.getString("link_persistent_uuid", "");
                if (string == null || string.length() == 0) {
                    string = UUID.randomUUID().toString();
                    p013kotlin.jvm.internal.s.j(string, "toString(...)");
                    sharedPreferences.edit().putString("link_persistent_uuid", string).apply();
                    X5.a.a(X5.f46812a, "Creating new persistent link id: " + string);
                } else {
                    X5.a.a(X5.f46812a, "Reusing existing persistent link id: " + string);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return string;
        }
    }
}
