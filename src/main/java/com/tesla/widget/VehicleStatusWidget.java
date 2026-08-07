package com.tesla.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.widget.VehicleStatusWidget;
import com.teslamotors.plugins.ble.i;
import jn0.m;
import me0.a0;
import me0.b;
import me0.c;
import oe0.e;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import wn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJA\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\nR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/tesla/widget/VehicleStatusWidget;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "e", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "appWidgetId", "", "delay", "Lme0/b;", "commandExecution", "", "withCache", "c", "(Landroid/content/Context;ILjava/lang/Long;Lme0/b;Z)V", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetIds", "onUpdate", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V", "onDeleted", "(Landroid/content/Context;[I)V", "onReceive", "Loe0/e;", "a", "Lkotlin/Lazy;", "b", "()Loe0/e;", "vehicleRepo", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VehicleStatusWidget extends AppWidgetProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy vehicleRepo = m.b(new a() { // from class: me0.n
        @Override // wn0.a
        public final Object invoke() {
            return VehicleStatusWidget.f();
        }
    });

    private final e b() {
        return (e) this.vehicleRepo.getValue();
    }

    private final void c(Context context, int appWidgetId, Long delay, b commandExecution, boolean withCache) {
        te0.b.f113254a.j(appWidgetId, context, a0.NORMAL, commandExecution, delay, withCache);
    }

    static /* synthetic */ void d(VehicleStatusWidget vehicleStatusWidget, Context context, int i11, Long l11, b bVar, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            l11 = null;
        }
        if ((i12 & 8) != 0) {
            bVar = null;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        vehicleStatusWidget.c(context, i11, l11, bVar, z11);
    }

    private final void e(Context context, Intent intent) {
        b bVar;
        String queryParameter;
        String queryParameter2;
        Object obj;
        String queryParameter3;
        Integer numX;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        ComponentName componentName = new ComponentName(context, (Class<?>) VehicleStatusWidget.class);
        Uri data = intent.getData();
        int iIntValue = (data == null || (queryParameter3 = data.getQueryParameter("app_widget_id")) == null || (numX = t.x(queryParameter3)) == null) ? 0 : numX.intValue();
        Uri data2 = intent.getData();
        Boolean boolValueOf = null;
        if (data2 == null || (queryParameter2 = data2.getQueryParameter("execution")) == null) {
            bVar = null;
        } else {
            Object[] enumConstants = b.class.getEnumConstants();
            s.j(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i11];
                if (s.f(((Enum) obj).name(), queryParameter2)) {
                    break;
                } else {
                    i11++;
                }
            }
            bVar = (b) ((Enum) obj);
        }
        Uri data3 = intent.getData();
        if (data3 != null && (queryParameter = data3.getQueryParameter("app_widget_update_with_delay")) != null) {
            boolValueOf = Boolean.valueOf(Boolean.parseBoolean(queryParameter));
        }
        long j11 = s.f(boolValueOf, Boolean.TRUE) ? 1000L : 0L;
        if (iIntValue == 0) {
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
            s.j(appWidgetIds, "getAppWidgetIds(...)");
            for (int i12 : appWidgetIds) {
                c.a().j("updating widget: " + i12 + " for type " + a0.NORMAL);
                d(this, context, i12, Long.valueOf(j11), null, false, 24, null);
            }
        } else {
            d(this, context, iIntValue, Long.valueOf(j11), bVar, false, 16, null);
        }
        i.B(context, "from VehicleStatusWidget#updateWidget").z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e f() {
        return qe0.c.f105355a.c();
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] appWidgetIds) {
        s.k(context, "context");
        s.k(appWidgetIds, "appWidgetIds");
        for (int i11 : appWidgetIds) {
            c.a().a("deleting widget id : " + i11);
            b().f(i11);
            te0.b.f113254a.h(i11, context);
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        s.k(context, "context");
        s.k(intent, "intent");
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action != null && action.hashCode() == -1365770836 && action.equals("com.teslamotors.tesla.action.ACTION_UPDATE_WIDGET")) {
            e(context, intent);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        s.k(context, "context");
        s.k(appWidgetManager, "appWidgetManager");
        s.k(appWidgetIds, "appWidgetIds");
        c.a().a("onUpdate");
        for (int i11 : appWidgetIds) {
            d(this, context, i11, null, null, false, 28, null);
        }
    }
}
