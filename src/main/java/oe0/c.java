package oe0;

import android.util.Pair;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import fc0.u5;
import gc0.u0;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ke0.i;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\t\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltd0/m;", "Lxc0/a;", "vehicle", "Ljn0/h0;", "f", "(Ltd0/m;Lxc0/a;)V", "", "vin", "c", "(Ltd0/m;Ljava/lang/String;)Lxc0/a;", "b", "", "skipToParseProtoData", "", DateTokenConverter.CONVERTER_KEY, "(Ltd0/m;Z)Ljava/util/List;", "a", "(Ltd0/m;)V", "widget_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            u5 vehicle_data = ((xc0.a) t11).getVehicle_data();
            Integer numValueOf = vehicle_data != null ? Integer.valueOf(wb0.e.r(vehicle_data)) : null;
            u5 vehicle_data2 = ((xc0.a) t12).getVehicle_data();
            return mn0.a.d(numValueOf, vehicle_data2 != null ? Integer.valueOf(wb0.e.r(vehicle_data2)) : null);
        }
    }

    public static final void a(m mVar) {
        s.k(mVar, "<this>");
        mVar.s(v.m(), v.e("REALM_V_DATA_PROTO_CACHE_PREFIX"));
    }

    public static final xc0.a b(m mVar, String vin) {
        Instant instantNow;
        Instant instantNow2;
        u0 vehicle_config;
        u0 vehicle_config2;
        s.k(mVar, "<this>");
        s.k(vin, "vin");
        xc0.a aVarC = c(mVar, vin);
        String strN = be0.e.INSTANCE.a().n(vin);
        xc0.a aVarD = null;
        if (strN == null) {
            return null;
        }
        String strH = mVar.h("V_" + strN);
        if (strH != null) {
            me0.c.a().a("got vehicle " + strN + " from redux");
            aVarD = oe0.a.d(oe0.a.f97213a, new JSONObject(strH), i.LOCAL_NON_REDUX_VEHICLE, false, 2, null);
        }
        if (aVarC == null) {
            return aVarD;
        }
        if (aVarD == null) {
            return aVarC;
        }
        u5 vehicle_data = aVarC.getVehicle_data();
        if (vehicle_data == null || (vehicle_config2 = vehicle_data.getVehicle_config()) == null || (instantNow = vehicle_config2.getTimestamp()) == null) {
            instantNow = Instant.now();
        }
        u5 vehicle_data2 = aVarD.getVehicle_data();
        if (vehicle_data2 == null || (vehicle_config = vehicle_data2.getVehicle_config()) == null || (instantNow2 = vehicle_config.getTimestamp()) == null) {
            instantNow2 = Instant.now();
        }
        if (instantNow.isAfter(instantNow2)) {
            return xc0.a.b(aVarC, null, aVarD.getSnapshot_hash(), false, null, null, null, null, false, null, null, null, null, 4093, null);
        }
        f(mVar, aVarD);
        me0.c.a().a("save redux vehicle " + vin + " to widget cache because the timestamp is more recent");
        return aVarD;
    }

    public static final xc0.a c(m mVar, String vin) {
        s.k(mVar, "<this>");
        s.k(vin, "vin");
        String strH = mVar.h("REALM_V_DATA_PROTO_CACHE_PREFIX" + vin);
        if (strH == null) {
            return null;
        }
        me0.c.a().a("got vehicle " + vin + " from widget cache");
        try {
            return oe0.a.f97213a.e(strH);
        } catch (Exception e11) {
            me0.c.a().d("error when decode vehicle byte array from cache", e11);
            return null;
        }
    }

    public static final List<xc0.a> d(m mVar, boolean z11) throws Throwable {
        List listM;
        s.k(mVar, "<this>");
        List<Pair<String, String>> listI = mVar.i(v.e("persist:productList"), v.m());
        s.j(listI, "get(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                listM = new ArrayList();
                JSONObject jSONObject = new JSONObject(new JSONObject((String) pair.second).getString("productMap"));
                Iterator<String> itKeys = jSONObject.keys();
                s.j(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    oe0.a aVar = oe0.a.f97213a;
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    s.j(jSONObject2, "getJSONObject(...)");
                    xc0.a aVarC = aVar.c(jSONObject2, i.PRODUCT_LIST_FETCH, z11);
                    if (aVarC != null) {
                        listM.add(aVarC);
                    }
                }
            } catch (Exception e11) {
                me0.c.a().d("error parsing product", e11);
                listM = v.m();
            }
            v.E(arrayList, listM);
        }
        return v.a1(arrayList, new a());
    }

    public static /* synthetic */ List e(m mVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return d(mVar, z11);
    }

    public static final void f(m mVar, xc0.a vehicle) {
        s.k(mVar, "<this>");
        s.k(vehicle, "vehicle");
        me0.c.a().a("saving vehicle " + vehicle.getVin() + " to widget cache");
        mVar.u("REALM_V_DATA_PROTO_CACHE_PREFIX" + vehicle.getVin(), oe0.a.f97213a.a(vehicle));
    }
}
