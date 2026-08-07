package me0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import fc0.u5;
import gc0.u0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\r*\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u0004\u0018\u00010\r*\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0005\u001a\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0005¨\u0006\u0018"}, d2 = {"Lxc0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "(Lxc0/a;Landroid/content/Context;)Ljava/lang/String;", "Landroid/view/View;", "vehicle", "Ljn0/h0;", "h", "(Landroid/view/View;Lxc0/a;)V", "", "isText", "", "a", "(Lxc0/a;Landroid/content/Context;Z)I", "g", "(Lxc0/a;)Z", "e", "(Lxc0/a;)I", "c", "(Lxc0/a;)Ljava/lang/Integer;", "b", "f", "widget_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b0 {
    public static final int a(xc0.a aVar, Context context, boolean z11) {
        u0.d dVar;
        u0 vehicle_config;
        gc0.o charge_state;
        Integer battery_level;
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        u5 vehicle_data = aVar.getVehicle_data();
        int iIntValue = (vehicle_data == null || (charge_state = vehicle_data.getCharge_state()) == null || (battery_level = charge_state.getBattery_level()) == null) ? 0 : battery_level.intValue();
        u5 vehicle_data2 = aVar.getVehicle_data();
        if (vehicle_data2 == null || (vehicle_config = vehicle_data2.getVehicle_config()) == null || (dVar = vehicle_config.getCar_type()) == null) {
            dVar = new u0.d(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }
        if (g(aVar)) {
            return z.d(z.f92041a, context, dVar, e.f91853a, null, false, 24, null);
        }
        if (iIntValue <= 7) {
            return z.d(z.f92041a, context, dVar, e.f91854b, null, false, 24, null);
        }
        if (iIntValue <= 20) {
            return z.d(z.f92041a, context, dVar, e.f91855c, null, false, 24, null);
        }
        return z11 ? z.d(z.f92041a, context, dVar, e.f91857e, null, false, 24, null) : z.d(z.f92041a, context, dVar, e.f91856d, null, false, 24, null);
    }

    public static final String b(xc0.a aVar, Context context) {
        gc0.x.a gui_charge_rate_units;
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        u5 vehicle_data = aVar.getVehicle_data();
        gc0.x gui_settings = vehicle_data != null ? vehicle_data.getGui_settings() : null;
        if (gui_settings == null || (gui_charge_rate_units = gui_settings.getGui_charge_rate_units()) == null) {
            return null;
        }
        if (wb0.e.k0(gui_charge_rate_units.getKW())) {
            return "%";
        }
        gc0.x.e gui_distance_units = gui_settings.getGui_distance_units();
        if (gui_distance_units == null) {
            return null;
        }
        return wb0.e.k0(gui_distance_units.getKilometersPerHour()) ? context.getString(bc0.a.K) : context.getString(bc0.a.L);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    public static final Integer c(xc0.a aVar) {
        gc0.x.a gui_charge_rate_units;
        u5 vehicle_data;
        gc0.o charge_state;
        Double dValueOf;
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        u5 vehicle_data2 = aVar.getVehicle_data();
        gc0.x gui_settings = vehicle_data2 != null ? vehicle_data2.getGui_settings() : null;
        if (gui_settings != null && (gui_charge_rate_units = gui_settings.getGui_charge_rate_units()) != null && (vehicle_data = aVar.getVehicle_data()) != null && (charge_state = vehicle_data.getCharge_state()) != null) {
            if (wb0.e.k0(gui_charge_rate_units.getKW())) {
                Integer usable_battery_level = charge_state.getUsable_battery_level();
                if (usable_battery_level != null) {
                    dValueOf = Double.valueOf(usable_battery_level.intValue());
                } else {
                    dValueOf = null;
                }
            } else {
                gc0.x.d gui_range_display = gui_settings.getGui_range_display();
                if (gui_range_display == null) {
                    return null;
                }
                Float ideal_battery_range = wb0.e.k0(gui_range_display.getIdeal()) ? charge_state.getIdeal_battery_range() : charge_state.getBattery_range();
                dValueOf = ideal_battery_range != null ? Double.valueOf(ideal_battery_range.floatValue()) : null;
                gc0.x.e gui_distance_units = gui_settings.getGui_distance_units();
                if (gui_distance_units == null) {
                    return null;
                }
                if (wb0.e.k0(gui_distance_units.getKilometersPerHour())) {
                    if (dValueOf != null) {
                        dValueOf = Double.valueOf(wb0.e.g0(dValueOf.doubleValue()));
                    } else {
                        dValueOf = null;
                    }
                }
            }
            if (dValueOf != null) {
                return Integer.valueOf(yn0.a.c(dValueOf.doubleValue()));
            }
        }
        return null;
    }

    public static final String d(xc0.a aVar, Context context) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        String snapshot_hash = aVar.getSnapshot_hash();
        if (snapshot_hash.length() <= 0) {
            snapshot_hash = null;
        }
        if (snapshot_hash == null) {
            return null;
        }
        return context.getFilesDir().getAbsolutePath() + "/snapshots/" + aVar.getSnapshot_hash() + "_THREEQUARTER.png";
    }

    public static final int e(xc0.a aVar) {
        u0 vehicle_config;
        u0.d car_type;
        u0 vehicle_config2;
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        u5 vehicle_data = aVar.getVehicle_data();
        if (vehicle_data == null || (vehicle_config = vehicle_data.getVehicle_config()) == null || (car_type = vehicle_config.getCar_type()) == null) {
            return h.f91908e;
        }
        u5 vehicle_data2 = aVar.getVehicle_data();
        boolean zV = (vehicle_data2 == null || (vehicle_config2 = vehicle_data2.getVehicle_config()) == null) ? false : wb0.e.V(vehicle_config2);
        if (wb0.e.k0(car_type.getCarTypeCybertruck())) {
            return h.f91907d;
        }
        if (wb0.e.k0(car_type.getCarTypeModel3())) {
            return zV ? h.f91912i : h.f91908e;
        }
        if (wb0.e.k0(car_type.getCarTypeModelY())) {
            return h.f91911h;
        }
        if (wb0.e.k0(car_type.getCarTypeLychee()) || wb0.e.k0(car_type.getCarTypeModelS()) || wb0.e.k0(car_type.getCarTypeModelS2())) {
            return h.f91909f;
        }
        return (wb0.e.k0(car_type.getCarTypeTamarind()) || wb0.e.k0(car_type.getCarTypeModelX())) ? h.f91910g : h.f91908e;
    }

    public static final String f(xc0.a aVar, Context context) {
        gc0.o charge_state;
        Integer minutes_to_full_charge;
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        u5 vehicle_data = aVar.getVehicle_data();
        if (vehicle_data == null || (charge_state = vehicle_data.getCharge_state()) == null || (minutes_to_full_charge = charge_state.getMinutes_to_full_charge()) == null) {
            return null;
        }
        int iIntValue = minutes_to_full_charge.intValue();
        if (iIntValue > 1440) {
            return context.getString(bc0.a.P);
        }
        if (iIntValue < 1) {
            return context.getString(bc0.a.O);
        }
        return iIntValue > 60 ? context.getString(bc0.a.M, Integer.valueOf(iIntValue / 60), Integer.valueOf(iIntValue % 60)) : context.getString(bc0.a.N, minutes_to_full_charge);
    }

    public static final boolean g(xc0.a aVar) {
        gc0.o charge_state;
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        u5 vehicle_data = aVar.getVehicle_data();
        gc0.o.f charging_state = (vehicle_data == null || (charge_state = vehicle_data.getCharge_state()) == null) ? null : charge_state.getCharging_state();
        return x20.d.d(charging_state != null ? charging_state.getCharging() : null, charging_state != null ? charging_state.getCalibrating() : null, charging_state != null ? charging_state.getStarting() : null) == 1;
    }

    public static final void h(View view, xc0.a vehicle) {
        gc0.o charge_state;
        Integer battery_level;
        p013kotlin.jvm.internal.s.k(view, "<this>");
        p013kotlin.jvm.internal.s.k(vehicle, "vehicle");
        u5 vehicle_data = vehicle.getVehicle_data();
        int iIntValue = (vehicle_data == null || (charge_state = vehicle_data.getCharge_state()) == null || (battery_level = charge_state.getBattery_level()) == null) ? 0 : battery_level.intValue();
        Context context = view.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        view.setBackgroundTintList(ColorStateList.valueOf(a(vehicle, context, false)));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        float dimension = view.getResources().getDimension(g.f91884b);
        layoutParams.width = (iIntValue >= 10 ? Float.valueOf(Math.min((iIntValue / 100.0f) * dimension, dimension)) : Double.valueOf(((double) dimension) * 0.1d)).intValue();
        if (iIntValue == 100) {
            view.setBackgroundResource(h.f91915l);
        } else {
            view.setBackgroundResource(h.f91914k);
        }
        view.setLayoutParams(layoutParams);
    }
}
