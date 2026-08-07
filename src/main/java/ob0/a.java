package ob0;

import fc0.u5;
import gc0.u0;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbe0/e;", "", "vin", "", "fallbackKeyVersion", "fallbackApiVersion", "Lob0/b;", "a", "(Lbe0/e;Ljava/lang/String;II)Lob0/b;", "command-utils_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final RequestVehicleData a(be0.e eVar, String vin, int i11, int i12) {
        List<Integer> listM;
        Integer numG;
        Integer numO;
        u0 vehicle_config;
        s.k(eVar, "<this>");
        s.k(vin, "vin");
        u5 u5VarD = eVar.d(vin);
        u0.d car_type = (u5VarD == null || (vehicle_config = u5VarD.getVehicle_config()) == null) ? null : vehicle_config.getCar_type();
        if (u5VarD != null && (numO = wb0.e.o(u5VarD)) != null) {
            i11 = numO.intValue();
        }
        if (u5VarD != null && (numG = wb0.e.g(u5VarD)) != null) {
            i12 = numG.intValue();
        }
        if (u5VarD == null || (listM = vb0.c.e(u5VarD)) == null) {
            listM = v.m();
        }
        return new RequestVehicleData(car_type, i11, i12, listM);
    }

    public static /* synthetic */ RequestVehicleData b(be0.e eVar, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        return a(eVar, str, i11, i12);
    }
}
