package com.oney.WebRTCModule;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class MediaProjectionService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45806a = "MediaProjectionService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f45807b = new Random().nextInt(99999) + 10000;

    public static void a(Context context) {
        if (r2.a().f46078h) {
            context.stopService(new Intent(context, (Class<?>) MediaProjectionService.class));
        }
    }

    public static void b(Context context) {
        if (r2.a().f46078h) {
            q.b(context);
            Intent intent = new Intent(context, (Class<?>) MediaProjectionService.class);
            try {
                if ((Build.VERSION.SDK_INT >= 26 ? context.startForegroundService(intent) : context.startService(intent)) == null) {
                    Log.w(f45806a, "Media projection service not started");
                } else {
                    Log.i(f45806a, "Media projection service started");
                }
            } catch (RuntimeException e11) {
                Log.w(f45806a, "Media projection service not started", e11);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        Notification notificationA = q.a(this);
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(f45807b, notificationA, 32);
            return 2;
        }
        startForeground(f45807b, notificationA);
        return 2;
    }
}
