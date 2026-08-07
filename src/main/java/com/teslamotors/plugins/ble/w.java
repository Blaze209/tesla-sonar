package com.teslamotors.plugins.ble;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/teslamotors/plugins/ble/w;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "e", "(Landroid/content/Context;)V", "a", "Landroid/app/PendingIntent;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Landroid/app/PendingIntent;", "f", "b", "c", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f57010a = new w();

    private w() {
    }

    public static final void a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("alarm");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        PendingIntent pendingIntentD = d(context);
        if (pendingIntentD != null) {
            alarmManager.cancel(pendingIntentD);
        }
    }

    public static final void b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("alarm");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        PendingIntent pendingIntentC = c(context);
        if (pendingIntentC != null) {
            alarmManager.cancel(pendingIntentC);
        }
    }

    public static final PendingIntent c(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Intent intent = new Intent(context, (Class<?>) BLEService.class);
        intent.setAction("com.teslamotors.plugins.ble.action.REINITIALIZE_CONNECTION");
        return PendingIntent.getService(context, 0, intent, 67108864);
    }

    public static final PendingIntent d(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Intent intent = new Intent(context, (Class<?>) BLEService.class);
        intent.setAction("com.teslamotors.plugins.ble.action.RESTART_BG_SCAN");
        return PendingIntent.getService(context, 0, intent, 67108864);
    }

    public static final void e(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("alarm");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        PendingIntent pendingIntentD = d(context);
        if (pendingIntentD != null) {
            alarmManager.setWindow(0, System.currentTimeMillis() + 1200000, 600000L, pendingIntentD);
        }
    }

    public static final void f(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("alarm");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        PendingIntent pendingIntentC = c(context);
        if (pendingIntentC != null) {
            alarmManager.setWindow(0, System.currentTimeMillis() + 14400000, 14400000L, pendingIntentC);
        }
    }
}
