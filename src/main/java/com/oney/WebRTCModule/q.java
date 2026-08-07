package com.oney.WebRTCModule;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f46054a = "q";

    static Notification a(Context context) {
        androidx.core.app.o.e eVar = new androidx.core.app.o.e(context, "OngoingConferenceChannel");
        eVar.g("call").m(context.getString(e0.f45910b)).l(context.getString(e0.f45909a)).A(-1).y(false).I(false).f(true).K(1).z(true).D(context.getResources().getIdentifier("ic_notification", "drawable", context.getPackageName())).s(1);
        return eVar.c();
    }

    static void b(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (context == null) {
            Log.d(f46054a, " Cannot create notification channel: no current context");
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager.getNotificationChannel("OngoingConferenceChannel") != null) {
            return;
        }
        com.brentvatne.exoplayer.v0.a();
        NotificationChannel notificationChannelA = ga.c.a("OngoingConferenceChannel", context.getString(e0.f45911c), 3);
        notificationChannelA.enableLights(false);
        notificationChannelA.enableVibration(false);
        notificationChannelA.setShowBadge(false);
        notificationManager.createNotificationChannel(notificationChannelA);
    }
}
