package me0;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.widget.RemoteViews;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import fc0.u5;
import gc0.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\u001aA\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\f*\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u001b\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010 \u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\u001a7\u0010&\u001a\u00020\f*\u00020\u00002\b\b\u0001\u0010\"\u001a\u00020\u00052\b\b\u0001\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001eH\u0002¢\u0006\u0004\b&\u0010'\u001a/\u0010(\u001a\u00020\u0005*\u00020\u001e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010+\u001a\u00020\u001e*\u00020\b2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010-\u001a\u00020\u001e*\u00020\b2\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b-\u0010,\u001a)\u0010.\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u0019H\u0003¢\u0006\u0004\b.\u0010/\"\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00100\"\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00100\"\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00100\"\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00100¨\u00065"}, d2 = {"Landroid/widget/RemoteViews;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxc0/a;", "vehicle", "", "appWidgetId", "", "Lne0/c;", "vehicleCommands", "Lne0/b;", "vehicleCommandMarker", "Ljn0/h0;", "h", "(Landroid/widget/RemoteViews;Landroid/content/Context;Lxc0/a;ILjava/util/List;Lne0/b;)V", "commands", "e", "(Landroid/widget/RemoteViews;Ljava/util/List;)V", "Lme0/b;", "commandExecution", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/widget/RemoteViews;Landroid/content/Context;Lme0/b;)V", "buttonId", "iconID", "command", "Lme0/a;", "type", "g", "(Landroid/widget/RemoteViews;Lxc0/a;Landroid/content/Context;IIILne0/c;Lme0/a;)V", "widgetVehicleCommand", "", "buttonEnabled", "j", "(Lne0/c;Z)Z", "flipper", "loading", "buttonType", "commandExecuting", "f", "(Landroid/widget/RemoteViews;IILme0/a;Z)V", "c", "(ZLne0/c;Lxc0/a;Landroid/content/Context;)I", "appVehicle", "a", "(Lne0/c;Lxc0/a;)Z", DateTokenConverter.CONVERTER_KEY, "b", "(ZLne0/c;Lme0/a;)I", "Ljava/util/List;", "WIDGET_BUTTONS", "WIDGET_ICONS", "WIDGET_LOADING", "WIDGET_FLIPPERS", "widget_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Integer> f91958a = p013kotlin.collections.v.p(Integer.valueOf(i.A), Integer.valueOf(i.B), Integer.valueOf(i.C), Integer.valueOf(i.D), Integer.valueOf(i.E));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<Integer> f91959b = p013kotlin.collections.v.p(Integer.valueOf(i.W), Integer.valueOf(i.X), Integer.valueOf(i.Y), Integer.valueOf(i.Z), Integer.valueOf(i.f91917a0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<Integer> f91960c = p013kotlin.collections.v.p(Integer.valueOf(i.f91919b0), Integer.valueOf(i.f91921c0), Integer.valueOf(i.f91923d0), Integer.valueOf(i.f91925e0), Integer.valueOf(i.f91927f0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<Integer> f91961d = p013kotlin.collections.v.p(Integer.valueOf(i.R), Integer.valueOf(i.S), Integer.valueOf(i.T), Integer.valueOf(i.U), Integer.valueOf(i.V));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91962a;

        static {
            int[] iArr = new int[ne0.c.values().length];
            try {
                iArr[ne0.c.CHARGE_PORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ne0.c.TRUNK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ne0.c.FRUNK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ne0.c.REMOTE_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ne0.c.HOME_LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ne0.c.SUNROOF_CONTROL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ne0.c.LOW_POWER_MODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ne0.c.LOCK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ne0.c.CLIMATE_TOGGLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ne0.c.BIOWEAPON.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ne0.c.SUMMON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ne0.c.LIGHT_SHOW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ne0.c.SUSPENSION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ne0.c.FLASH_LIGHTS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ne0.c.HONK_HORN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ne0.c.SENTRY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ne0.c.VENT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ne0.c.MAX_DEFROST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ne0.c.ACTUATE_ALL_DOORS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ne0.c.UNLATCH_DRIVER_DOOR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ne0.c.REMOTE_BOOMBOX.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ne0.c.TONNEAU.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ne0.c.POWER_OUTLETS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            f91962a = iArr;
        }
    }

    private static final boolean a(ne0.c cVar, xc0.a aVar) {
        u5 vehicle_data = aVar.getVehicle_data();
        if (vehicle_data == null || wb0.e.P(vehicle_data)) {
            return true;
        }
        switch (a.f91962a[cVar.ordinal()]) {
            case 1:
                return b0.g(aVar) || (!wb0.e.x(vehicle_data) && wb0.e.H(aVar));
            case 2:
                return !wb0.e.U(vehicle_data) || (!wb0.e.z(vehicle_data) && wb0.e.b0(aVar));
            case 3:
                return !wb0.e.U(vehicle_data) || (!wb0.e.A(vehicle_data) && wb0.e.O(aVar));
            case 4:
                return wb0.e.W(vehicle_data);
            case 5:
                return !wb0.e.w(vehicle_data);
            case 6:
                return (wb0.e.Z(vehicle_data) || wb0.e.Y(vehicle_data)) ? false : true;
            case 7:
                return wb0.e.Q(vehicle_data);
            default:
                return false;
        }
    }

    private static final int b(boolean z11, ne0.c cVar, me0.a aVar) {
        return (cVar == ne0.c.SUNROOF_CONTROL || !z11) ? aVar.getBackgroundRes() : f.f91879a;
    }

    private static final int c(boolean z11, ne0.c cVar, xc0.a aVar, Context context) {
        u0 vehicle_config;
        u5 vehicle_data = aVar.getVehicle_data();
        u0.d car_type = (vehicle_data == null || (vehicle_config = vehicle_data.getVehicle_config()) == null) ? null : vehicle_config.getCar_type();
        if (cVar == ne0.c.MAX_DEFROST && z11) {
            return z.d(z.f92041a, context, car_type, e.f91858f, null, false, 24, null);
        }
        if (cVar == ne0.c.CHARGE_PORT && b0.g(aVar)) {
            return z.d(z.f92041a, context, car_type, e.f91853a, null, false, 24, null);
        }
        if (cVar == ne0.c.POWER_OUTLETS) {
            u5 vehicle_data2 = aVar.getVehicle_data();
            if ((vehicle_data2 != null ? Boolean.valueOf(wb0.e.e0(vehicle_data2)) : null) == Boolean.TRUE) {
                return z.d(z.f92041a, context, car_type, e.f91861i, null, false, 24, null);
            }
        }
        return z11 ? z.d(z.f92041a, context, car_type, e.f91859g, null, false, 24, null) : z.d(z.f92041a, context, car_type, e.f91860h, null, false, 24, null);
    }

    public static final boolean d(ne0.c cVar, xc0.a appVehicle) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        p013kotlin.jvm.internal.s.k(appVehicle, "appVehicle");
        u5 vehicle_data = appVehicle.getVehicle_data();
        if (vehicle_data == null) {
            return true;
        }
        switch (a.f91962a[cVar.ordinal()]) {
            case 1:
                return wb0.e.H(appVehicle);
            case 2:
                return wb0.e.b0(appVehicle);
            case 3:
                return wb0.e.O(appVehicle);
            case 4:
                return wb0.e.W(vehicle_data);
            case 5:
                return false;
            case 6:
                return wb0.e.Z(vehicle_data);
            case 7:
                return wb0.e.R(vehicle_data) && !wb0.e.Q(vehicle_data);
            case 8:
                return wb0.e.c0(appVehicle);
            case 9:
                return wb0.e.J(vehicle_data);
            case 10:
                return wb0.e.G(vehicle_data);
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return false;
            case 16:
                return wb0.e.X(vehicle_data);
            case 17:
                return !wb0.e.d0(vehicle_data);
            case 18:
                return wb0.e.S(vehicle_data);
            case 19:
                return wb0.e.D(appVehicle);
            case 20:
            case 21:
                return false;
            case 22:
                return wb0.e.a0(appVehicle);
            case 23:
                return wb0.e.e0(vehicle_data);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void e(RemoteViews remoteViews, List<? extends ne0.c> commands) {
        p013kotlin.jvm.internal.s.k(remoteViews, "<this>");
        p013kotlin.jvm.internal.s.k(commands, "commands");
        int size = f91958a.size();
        for (int size2 = commands.size(); size2 < size; size2++) {
            remoteViews.setViewVisibility(i.I, 8);
            remoteViews.setViewVisibility(f91961d.get(size2).intValue(), 8);
        }
    }

    private static final void f(RemoteViews remoteViews, int i11, int i12, me0.a aVar, boolean z11) {
        if (z11) {
            remoteViews.setDisplayedChild(i11, 1);
        } else {
            remoteViews.setDisplayedChild(i11, 0);
        }
        remoteViews.setViewVisibility(i11, 0);
        remoteViews.setInt(i12, "setBackgroundResource", aVar.getBackgroundRes());
    }

    private static final void g(RemoteViews remoteViews, xc0.a aVar, Context context, int i11, int i12, int i13, ne0.c cVar, me0.a aVar2) {
        boolean zD = d(cVar, aVar);
        Icon iconCreateWithResource = Icon.createWithResource(context, cVar.getIcon(zD, aVar.getVehicle_data(), context));
        p013kotlin.jvm.internal.s.j(iconCreateWithResource, "createWithResource(...)");
        if (!j(cVar, zD)) {
            iconCreateWithResource.setTint(c(zD, cVar, aVar, context));
        }
        remoteViews.setImageViewIcon(i13, iconCreateWithResource);
        remoteViews.setInt(i12, "setBackgroundResource", b(zD, cVar, aVar2));
        boolean zA = a(cVar, aVar);
        remoteViews.setOnClickPendingIntent(i12, x.i(context, aVar, cVar, i11));
        remoteViews.setBoolean(i12, "setEnabled", !zA);
    }

    public static final void h(RemoteViews remoteViews, Context context, xc0.a vehicle, int i11, List<? extends ne0.c> vehicleCommands, ne0.b vehicleCommandMarker) {
        Object next;
        p013kotlin.jvm.internal.s.k(remoteViews, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(vehicle, "vehicle");
        p013kotlin.jvm.internal.s.k(vehicleCommands, "vehicleCommands");
        p013kotlin.jvm.internal.s.k(vehicleCommandMarker, "vehicleCommandMarker");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(p013kotlin.collections.v.d1(vehicleCommands, 5));
        if (vehicle.getHide_private()) {
            arrayList.remove(ne0.c.SUMMON);
        }
        if (arrayList.size() == 0) {
            arrayList.addAll(oe0.d.INSTANCE.a());
        } else if (arrayList.size() < 4) {
            Iterator<T> it = oe0.d.INSTANCE.a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (arrayList.contains((ne0.c) next));
            ne0.c cVar = (ne0.c) next;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.contains(ne0.c.SENTRY)) {
            remoteViews.setViewVisibility(i.f91947y, 8);
        }
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                p013kotlin.collections.v.x();
            }
            ne0.c cVar2 = (ne0.c) obj;
            me0.a aVar = i12 == 0 ? me0.a.LEFT : i12 == p013kotlin.collections.v.o(arrayList) ? me0.a.RIGHT : me0.a.NORMAL;
            g(remoteViews, vehicle, context, i11, f91958a.get(i12).intValue(), f91959b.get(i12).intValue(), cVar2, aVar);
            f(remoteViews, f91961d.get(i12).intValue(), f91960c.get(i12).intValue(), aVar, vehicleCommandMarker.b(vehicle.getVin(), cVar2));
            i12 = i13;
        }
        e(remoteViews, arrayList);
    }

    public static final void i(RemoteViews remoteViews, Context context, b commandExecution) {
        p013kotlin.jvm.internal.s.k(remoteViews, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(commandExecution, "commandExecution");
        int i11 = i.f91924e;
        if (commandExecution == b.NONE) {
            remoteViews.setViewVisibility(i.f91932j, 0);
            remoteViews.setViewVisibility(i11, 8);
            remoteViews.setDisplayedChild(i.f91931i, 1);
        } else {
            remoteViews.setViewVisibility(i.f91932j, 8);
            remoteViews.setViewVisibility(i11, 0);
            String string = context.getString(commandExecution.getExecutionLabel());
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            remoteViews.setTextViewText(i11, string);
        }
    }

    private static final boolean j(ne0.c cVar, boolean z11) {
        return (cVar == ne0.c.SENTRY && z11) || cVar == ne0.c.LOW_POWER_MODE;
    }
}
