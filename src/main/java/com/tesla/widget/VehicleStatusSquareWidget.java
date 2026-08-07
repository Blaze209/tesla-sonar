package com.tesla.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.widget.VehicleStatusSquareWidget;
import jn0.m;
import me0.a0;
import oe0.e;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import qe0.c;
import te0.b;
import wn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/tesla/widget/VehicleStatusSquareWidget;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "appWidgetId", "", "shouldDelayUpdate", "Ljn0/h0;", "c", "(Landroid/content/Context;ILjava/lang/Boolean;)V", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetIds", "onUpdate", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V", "onDeleted", "(Landroid/content/Context;[I)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Loe0/e;", "a", "Lkotlin/Lazy;", "b", "()Loe0/e;", "vehicleRepo", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VehicleStatusSquareWidget extends AppWidgetProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy vehicleRepo = m.b(new a() { // from class: me0.m
        @Override // wn0.a
        public final Object invoke() {
            return VehicleStatusSquareWidget.e();
        }
    });

    private final e b() {
        return (e) this.vehicleRepo.getValue();
    }

    private final void c(Context context, int appWidgetId, Boolean shouldDelayUpdate) {
        b.k(b.f113254a, appWidgetId, context, a0.SQUARE, null, Long.valueOf(s.f(shouldDelayUpdate, Boolean.TRUE) ? 1000L : 0L), false, 40, null);
    }

    static /* synthetic */ void d(VehicleStatusSquareWidget vehicleStatusSquareWidget, Context context, int i11, Boolean bool, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            bool = Boolean.FALSE;
        }
        vehicleStatusSquareWidget.c(context, i11, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e e() {
        return c.f105355a.c();
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] appWidgetIds) {
        s.k(context, "context");
        s.k(appWidgetIds, "appWidgetIds");
        for (int i11 : appWidgetIds) {
            me0.c.a().a("deleting widget id : " + i11);
            b().f(i11);
            b.f113254a.h(i11, context);
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter;
        String queryParameter2;
        Integer numX;
        s.k(context, "context");
        s.k(intent, "intent");
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action != null && action.hashCode() == -1365770836 && action.equals("com.teslamotors.tesla.action.ACTION_UPDATE_WIDGET")) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            ComponentName componentName = new ComponentName(context, (Class<?>) VehicleStatusSquareWidget.class);
            Uri data = intent.getData();
            int iIntValue = (data == null || (queryParameter2 = data.getQueryParameter("app_widget_id")) == null || (numX = t.x(queryParameter2)) == null) ? 0 : numX.intValue();
            Uri data2 = intent.getData();
            Boolean boolValueOf = (data2 == null || (queryParameter = data2.getQueryParameter("app_widget_update_with_delay")) == null) ? null : Boolean.valueOf(Boolean.parseBoolean(queryParameter));
            if (iIntValue != 0) {
                c(context, iIntValue, boolValueOf);
                return;
            }
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
            s.j(appWidgetIds, "getAppWidgetIds(...)");
            for (int i11 : appWidgetIds) {
                me0.c.a().j("updating widget: " + i11 + " for type " + a0.SQUARE);
                c(context, i11, boolValueOf);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        s.k(context, "context");
        s.k(appWidgetManager, "appWidgetManager");
        s.k(appWidgetIds, "appWidgetIds");
        me0.c.a().j("onUpdate");
        for (int i11 : appWidgetIds) {
            d(this, context, i11, null, 4, null);
        }
    }
}
