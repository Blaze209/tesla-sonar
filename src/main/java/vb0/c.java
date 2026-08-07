package vb0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import fc0.u5;
import gc0.a1;
import gc0.v;
import gc0.v0;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wb0.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\"\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\u0011\u001a\u00020\u000e*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfc0/u5;", "Lgc0/v;", "bit", "", "minApiVersion", "", "a", "(Lfc0/u5;Lgc0/v;Ljava/lang/Integer;)Z", "", "b", "(Ljava/util/List;Lgc0/v;)Z", "e", "(Lfc0/u5;)Ljava/util/List;", "vehicleFeatureBitmask", "", DateTokenConverter.CONVERTER_KEY, "(Lfc0/u5;)Ljava/lang/String;", "carVersion", "domain_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final boolean a(u5 u5Var, v bit, Integer num) {
        s.k(u5Var, "<this>");
        s.k(bit, "bit");
        if (b(e(u5Var), bit)) {
            return true;
        }
        Integer numG = e.g(u5Var);
        return (num == null || numG == null || numG.intValue() < num.intValue()) ? false : true;
    }

    public static final boolean b(List<Integer> list, v bit) {
        int value;
        s.k(list, "<this>");
        s.k(bit, "bit");
        if (!list.isEmpty() && list.size() > (value = bit.getValue() / 32)) {
            int iIntValue = list.get(value).intValue();
            int value2 = bit.getValue() % 32;
            if ((iIntValue & (1 << (value2 + ((((value2 ^ 32) & ((-value2) | value2)) >> 31) & 32)))) > 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean c(u5 u5Var, v vVar, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        return a(u5Var, vVar, num);
    }

    public static final String d(u5 u5Var) {
        String car_version;
        s.k(u5Var, "<this>");
        v0 vehicle_detail_state = u5Var.getVehicle_detail_state();
        return (vehicle_detail_state == null || (car_version = vehicle_detail_state.getCar_version()) == null) ? "" : car_version;
    }

    public static final List<Integer> e(u5 u5Var) {
        List<Integer> listT;
        s.k(u5Var, "<this>");
        a1 vehicle_state = u5Var.getVehicle_state();
        return (vehicle_state == null || (listT = vehicle_state.t()) == null) ? p013kotlin.collections.v.m() : listT;
    }
}
