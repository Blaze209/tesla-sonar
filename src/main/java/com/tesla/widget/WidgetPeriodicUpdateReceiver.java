package com.tesla.widget;

import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import jn0.x;
import me0.a0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import te0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tesla/widget/WidgetPeriodicUpdateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WidgetPeriodicUpdateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z11;
        Context context2;
        s.k(context, "context");
        s.k(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -747005331) {
                if (iHashCode != 1585890049 || !action.equals("com.teslamotors.tesla.action.ACTION_START_PERIODIC_UPDATE_WIDGET")) {
                    return;
                } else {
                    z11 = false;
                }
            } else if (!action.equals("com.teslamotors.tesla.action.ACTION_CANCEL_PERIODIC_UPDATE_WIDGET")) {
                return;
            } else {
                z11 = true;
            }
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            for (Pair pair : v.p(x.a(VehicleStatusWidget.class, a0.NORMAL), x.a(VehicleStatusSquareWidget.class, a0.SQUARE))) {
                Class cls = (Class) pair.a();
                a0 a0Var = (a0) pair.b();
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls));
                s.j(appWidgetIds, "getAppWidgetIds(...)");
                int length = appWidgetIds.length;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = appWidgetIds[i11];
                    if (z11) {
                        b.f113254a.h(i12, context);
                        context2 = context;
                    } else {
                        context2 = context;
                        b.m(b.f113254a, i12, context2, a0Var, null, 8, null);
                    }
                    i11++;
                    context = context2;
                }
            }
        }
    }
}
