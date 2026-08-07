package com.tesla.widget;

import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.widget.WidgetBleUpdateReceiver;
import ef0.g;
import jn0.m;
import me0.a0;
import oe0.e;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import qe0.c;
import te0.b;
import wn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/tesla/widget/WidgetBleUpdateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Loe0/e;", "a", "Lkotlin/Lazy;", "b", "()Loe0/e;", "vehicleRepo", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WidgetBleUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f56598b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy vehicleRepo = m.b(new a() { // from class: me0.v
        @Override // wn0.a
        public final Object invoke() {
            return WidgetBleUpdateReceiver.c();
        }
    });

    private final e b() {
        return (e) this.vehicleRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e c() {
        return c.f105355a.c();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        s.k(context, "context");
        s.k(intent, "intent");
        if (s.f(intent.getAction(), "com.teslamotors.tesla.action.ACTION_VEHICLE_BLE_UPDATE")) {
            hf0.m mVar = (hf0.m) intent.getParcelableExtra("com.teslamotors.tesla.action.ACTION_VEHICLE_BLE_UPDATE_KEY");
            String str = mVar != null ? mVar.f72682o : null;
            if (str == null) {
                me0.c.a().j("Widget received a BLE update but data is null");
                return;
            }
            b().a(str, g.g(mVar));
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) VehicleStatusWidget.class));
            e eVarB = b();
            s.h(appWidgetIds);
            Integer numValueOf = Integer.valueOf(eVarB.j(str, appWidgetIds));
            Integer num = numValueOf.intValue() != 0 ? numValueOf : null;
            if (num == null) {
                me0.c.a().j("Widget received a BLE update data but can not find associated widget");
                return;
            }
            b.k(b.f113254a, num.intValue(), context, a0.NORMAL, null, null, true, 24, null);
            me0.c.a().j("Widget received a BLE update data appId for : " + num);
        }
    }
}
