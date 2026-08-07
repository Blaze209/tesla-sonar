package me0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.tesla.widget.VehicleStatusSquareWidget;
import com.tesla.widget.VehicleStatusWidget;
import com.tesla.widget.VehicleStatusWidgetConfigureActivity;
import com.tesla.widget.WidgetCommandReceiver;
import com.tesla.widget.WidgetPeriodicUpdateReceiver;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u0004*\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001a;\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a/\u0010#\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b#\u0010$\u001a'\u0010&\u001a\u00020%2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010)\u001a\u00020(*\u00020\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\u00020(*\u00020\u00002\u0006\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u0010-\u001a\u0011\u0010.\u001a\u00020(*\u00020\u0000¢\u0006\u0004\b.\u0010*\u001a\u0011\u0010/\u001a\u00020(*\u00020\u0000¢\u0006\u0004\b/\u0010*¨\u00060"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "appWidgetId", "Landroid/app/PendingIntent;", "l", "(Landroid/content/Context;I)Landroid/app/PendingIntent;", "Lxc0/a;", "vehicle", "k", "(Landroid/content/Context;Lxc0/a;)Landroid/app/PendingIntent;", "", "vin", "j", "(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;", "b", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "Lqe0/a;", "widgetDependencies", "c", "(Landroid/content/Context;Lqe0/a;)Landroid/app/PendingIntent;", "Landroid/content/Intent;", "o", "(Landroid/content/Intent;Landroid/content/Context;)Landroid/app/PendingIntent;", "p", "Lme0/b;", "commandExecution", "", "shouldDelayUpdate", "f", "(Landroid/content/Context;Ljava/lang/Integer;Lme0/b;Ljava/lang/Boolean;)Landroid/content/Intent;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Boolean;)Landroid/content/Intent;", "Lne0/c;", "command", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Lxc0/a;Lne0/c;I)Landroid/app/PendingIntent;", "Landroid/net/Uri;", "h", "(Lxc0/a;Lne0/c;I)Landroid/net/Uri;", "Ljn0/h0;", "q", "(Landroid/content/Context;)V", "action", "m", "(Landroid/content/Context;Ljava/lang/String;)V", "n", "a", "widget_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class x {
    public static final void a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        m(context, "com.teslamotors.tesla.action.ACTION_CANCEL_PERIODIC_UPDATE_WIDGET");
    }

    public static final PendingIntent b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return o(new Intent("android.intent.action.VIEW", Uri.parse("tesla://non_owner_screen")), context);
    }

    public static final PendingIntent c(Context context, qe0.a widgetDependencies) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(widgetDependencies, "widgetDependencies");
        return o(widgetDependencies.a() ? new Intent("android.intent.action.VIEW", Uri.parse("tesla://")) : widgetDependencies.b(context), context);
    }

    public static final Intent d(Context context, Integer num, Boolean bool) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Intent intent = new Intent(context, (Class<?>) VehicleStatusSquareWidget.class);
        if (num != null) {
            intent.setData(Uri.parse("widget://update?app_widget_id=" + num + "&app_widget_update_with_delay=" + bool));
        }
        intent.setAction("com.teslamotors.tesla.action.ACTION_UPDATE_WIDGET");
        return intent;
    }

    public static /* synthetic */ Intent e(Context context, Integer num, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            bool = Boolean.FALSE;
        }
        return d(context, num, bool);
    }

    public static final Intent f(Context context, Integer num, b bVar, Boolean bool) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Intent intent = new Intent(context, (Class<?>) VehicleStatusWidget.class);
        intent.setData(Uri.parse("widget://update?app_widget_id=" + num + "&execution=" + bVar + "&app_widget_update_with_delay=" + bool));
        intent.setAction("com.teslamotors.tesla.action.ACTION_UPDATE_WIDGET");
        return intent;
    }

    public static /* synthetic */ Intent g(Context context, Integer num, b bVar, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            bVar = null;
        }
        if ((i11 & 8) != 0) {
            bool = Boolean.FALSE;
        }
        return f(context, num, bVar, bool);
    }

    public static final Uri h(xc0.a vehicle, ne0.c command, int i11) {
        p013kotlin.jvm.internal.s.k(vehicle, "vehicle");
        p013kotlin.jvm.internal.s.k(command, "command");
        return Uri.parse("widget://command?vin=" + vehicle.getVin() + "&command=" + command.name() + "&state=" + l.d(command, vehicle) + "&app_widget_id=" + i11);
    }

    public static final PendingIntent i(Context context, xc0.a vehicle, ne0.c command, int i11) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(vehicle, "vehicle");
        p013kotlin.jvm.internal.s.k(command, "command");
        if (!ne0.d.d(command, vehicle)) {
            Intent intent = new Intent(context, (Class<?>) WidgetCommandReceiver.class);
            intent.setAction("com.teslamotors.tesla.action.ACTION_VEHICLE_COMMAND");
            intent.setData(h(vehicle, command, i11));
            return p(intent, context);
        }
        return o(new Intent("android.intent.action.VIEW", Uri.parse("tesla://product_home/" + vehicle.getVehicle_id() + "/" + command.name())), context);
    }

    public static final PendingIntent j(Context context, String vin) {
        String str;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(vin, "vin");
        String strN = be0.e.INSTANCE.a().n(vin);
        if (strN == null || strN.length() == 0) {
            str = "tesla://";
        } else {
            str = "tesla://product_home/" + strN;
        }
        return o(new Intent("android.intent.action.VIEW", Uri.parse(str)), context);
    }

    public static final PendingIntent k(Context context, xc0.a vehicle) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(vehicle, "vehicle");
        return j(context, vehicle.getVin());
    }

    public static final PendingIntent l(Context context, int i11) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Intent intent = new Intent(context, (Class<?>) VehicleStatusWidgetConfigureActivity.class);
        intent.putExtra("appWidgetId", i11);
        intent.putExtra("com.teslamotors.tesla.key-from-widget", true);
        intent.setAction("android.appwidget.action.APPWIDGET_CONFIGURE" + i11);
        PendingIntent activity = PendingIntent.getActivity(context, i11, intent, 201326592);
        p013kotlin.jvm.internal.s.j(activity, "getActivity(...)");
        return activity;
    }

    private static final void m(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WidgetPeriodicUpdateReceiver.class);
        intent.setAction(str);
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent);
    }

    public static final void n(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        m(context, "com.teslamotors.tesla.action.ACTION_START_PERIODIC_UPDATE_WIDGET");
    }

    public static final PendingIntent o(Intent intent, Context context) {
        p013kotlin.jvm.internal.s.k(intent, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        p013kotlin.jvm.internal.s.j(activity, "getActivity(...)");
        return activity;
    }

    public static final PendingIntent p(Intent intent, Context context) {
        p013kotlin.jvm.internal.s.k(intent, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        p013kotlin.jvm.internal.s.j(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public static final void q(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        Boolean bool = Boolean.TRUE;
        context.sendBroadcast(g(context, null, null, bool, 6, null).setPackage(context.getPackageName()));
        context.sendBroadcast(e(context, null, bool, 2, null).setPackage(context.getPackageName()));
    }
}
