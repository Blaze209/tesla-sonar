package com.teslamotors.plugins.ble;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.identity.intents.AddressConstants;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJi\u0010*\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 0\"2\b\u0010%\u001a\u0004\u0018\u00010$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010,\u001a\u00020$H\u0002¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103R\u0018\u00107\u001a\u000204*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/teslamotors/plugins/ble/y0;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "k", "(Landroid/content/Context;)V", "a", "m", "b", "l", "", "vin", "n", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/app/Notification;", "g", "(Landroid/content/Context;)Landroid/app/Notification;", "text", "Landroid/os/Bundle;", "bundle", "Landroidx/core/app/o$e;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/core/app/o$e;", "Landroid/content/Intent;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Landroid/content/Intent;", "j", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", Scopes.EMAIL, "Lcom/teslamotors/plugins/ble/g0;", "vehicleController", "", "vehicleControllers", "Lhf0/m;", "vehicleStatus", "", "recentlySelectedVins", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/teslamotors/plugins/ble/g0;Ljava/util/Map;Lhf0/m;Ljava/util/List;Landroid/bluetooth/BluetoothAdapter;)Landroidx/core/app/o$e;", PermissionsResponse.STATUS_KEY, "h", "(Landroid/content/Context;Ljava/lang/String;Lhf0/m;)Landroidx/core/app/o$e;", "Lhf0/f;", "messageType", "Landroid/app/PendingIntent;", "c", "(Landroid/content/Context;Lhf0/f;)Landroid/app/PendingIntent;", "Landroidx/core/app/r;", "f", "(Landroid/content/Context;)Landroidx/core/app/r;", "manager", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f57032a = new y0();

    private y0() {
    }

    public static final void a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        f57032a.f(context).b(444);
    }

    public static final void b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        f57032a.f(context).b(444);
    }

    private final PendingIntent c(Context context, hf0.f messageType) {
        Intent intent = new Intent(context, (Class<?>) PhoneKeyCommandReceiver.class);
        intent.setAction("com.teslamotors.ble.action.COMMAND");
        intent.putExtra("command_id", messageType.getWhat());
        return PendingIntent.getBroadcast(context, messageType.getWhat(), intent, 67108864);
    }

    public static final androidx.core.app.o.e d(Context context, String text, Bundle bundle) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Intent intentA = ie0.a.a(context);
        if (bundle != null) {
            p013kotlin.jvm.internal.s.h(intentA);
            intentA.putExtra("pushNotification", bundle);
        }
        androidx.core.app.o.e eVarK = nd0.k.INSTANCE.b(context).h("phone_key_service_channel").m(context.getString(bc0.a.f16990i0)).l(text).t("com.teslamotors.plugins.ble.BLE_SERVICE").z(true).k(PendingIntent.getActivity(context, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES, intentA, 201326592));
        p013kotlin.jvm.internal.s.j(eVarK, "setContentIntent(...)");
        return eVarK;
    }

    public static final androidx.core.app.o.e e(Context context, String email, String vin, g0 vehicleController, Map<String, ? extends g0> vehicleControllers, hf0.m vehicleStatus, List<String> recentlySelectedVins, BluetoothAdapter bluetoothAdapter) {
        g0 g0Var;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(vehicleController, "vehicleController");
        p013kotlin.jvm.internal.s.k(vehicleControllers, "vehicleControllers");
        p013kotlin.jvm.internal.s.k(recentlySelectedVins, "recentlySelectedVins");
        String string = "";
        if (z0.e(context, vin, email) && !z0.c(vehicleController, vehicleStatus)) {
            String strY = he0.b.m(context).y(vin);
            Bundle bundleA = vehicleStatus != null ? vehicleStatus.a() : null;
            if (vehicleStatus != null) {
                string = context.getString(vehicleStatus.b());
                p013kotlin.jvm.internal.s.j(string, "getString(...)");
            }
            androidx.core.app.o.e eVarM = d(context, string, bundleA).m(strY);
            p013kotlin.jvm.internal.s.j(eVarM, "setContentTitle(...)");
            return eVarM;
        }
        androidx.core.app.o.e eVarH = null;
        for (String str : recentlySelectedVins) {
            if (z0.e(context, str, email) && (g0Var = vehicleControllers.get(str)) != null) {
                hf0.m mVar = new hf0.m();
                mVar.f72688u = bluetoothAdapter != null && bluetoothAdapter.isEnabled();
                g0Var.w(mVar, false);
                if (eVarH == null) {
                    eVarH = f57032a.h(context, str, mVar);
                }
                if (z0.c(g0Var, mVar)) {
                    y0 y0Var = f57032a;
                    androidx.core.app.o.e eVarH2 = y0Var.h(context, str, mVar);
                    if (mVar.f72678k) {
                        eVarH2.a(nd0.g.f93834a, context.getString(bc0.a.f16966a0), y0Var.c(context, hf0.f.UnlockCar));
                    } else {
                        eVarH2.a(nd0.g.f93834a, context.getString(bc0.a.Y), y0Var.c(context, hf0.f.LockCar));
                    }
                    eVarH2.a(nd0.g.f93834a, context.getString(bc0.a.X), y0Var.c(context, hf0.f.OpenFrunk));
                    eVarH2.a(nd0.g.f93834a, context.getString(bc0.a.Z), y0Var.c(context, hf0.f.OpenTrunk));
                    return eVarH2;
                }
            }
        }
        return eVarH == null ? d(context, "", null) : eVarH;
    }

    private final androidx.core.app.r f(Context context) {
        androidx.core.app.r rVarE = androidx.core.app.r.e(context);
        p013kotlin.jvm.internal.s.j(rVarE, "from(...)");
        return rVarE;
    }

    public static final Notification g(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Notification notificationC = d(context, "", null).m(context.getString(bc0.a.f16972c0)).l(context.getString(bc0.a.f16969b0)).k(PendingIntent.getActivity(context, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES, f57032a.i(context), 67108864)).c();
        p013kotlin.jvm.internal.s.j(notificationC, "build(...)");
        return notificationC;
    }

    private final androidx.core.app.o.e h(Context context, String vin, hf0.m status) {
        String strY = he0.b.m(context).y(vin);
        Bundle bundleA = status.a();
        String string = context.getString(status.b());
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return d(context, string, bundleA).m(strY);
    }

    private final Intent i(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        intent.addFlags(268435456);
        return intent;
    }

    private final Intent j(Context context, String vin) {
        Intent intentA = ie0.a.a(context);
        if (intentA == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("vin", vin);
        bundle.putString("alert_id", "UPGRADE_UWB_RANGING_PERMISSION_PROMPT");
        intentA.putExtra("pushNotification", bundle);
        intentA.addFlags(268435456);
        return intentA;
    }

    @SuppressLint({"MissingPermission"})
    public static final void k(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Notification notificationC = nd0.k.INSTANCE.b(context).m(context.getString(bc0.a.f16981f0)).l(context.getString(bc0.a.f16978e0)).A(0).c();
        p013kotlin.jvm.internal.s.j(notificationC, "build(...)");
        f57032a.f(context).g(444, notificationC);
    }

    @SuppressLint({"MissingPermission"})
    public static final void l(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Notification notificationC = nd0.k.INSTANCE.b(context).m(context.getString(bc0.a.f16987h0)).l(context.getString(bc0.a.f16984g0)).A(0).c();
        p013kotlin.jvm.internal.s.j(notificationC, "build(...)");
        f57032a.f(context).g(777, notificationC);
    }

    @SuppressLint({"MissingPermission"})
    public static final void m(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Notification notificationC = nd0.k.INSTANCE.b(context).m(context.getString(bc0.a.f16990i0)).l(context.getString(bc0.a.f16975d0)).A(0).c();
        p013kotlin.jvm.internal.s.j(notificationC, "build(...)");
        f57032a.f(context).g(444, notificationC);
    }

    @SuppressLint({"MissingPermission"})
    public static final void n(Context context, String vin) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(vin, "vin");
        androidx.core.app.o.e eVarL = d(context, "", null).m(context.getString(bc0.a.f16990i0)).l(context.getString(bc0.a.G0));
        y0 y0Var = f57032a;
        Notification notificationC = eVarL.k(PendingIntent.getActivity(context, 666, y0Var.j(context, vin), 67108864)).A(0).c();
        p013kotlin.jvm.internal.s.j(notificationC, "build(...)");
        y0Var.f(context).g(500, notificationC);
        ef0.m.b();
    }
}
