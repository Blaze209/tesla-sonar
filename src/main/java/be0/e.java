package be0;

import android.annotation.SuppressLint;
import android.util.Pair;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import fc0.u5;
import ho0.l;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import ke0.i;
import okio.k;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\nJ\u0017\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u0011J\u001f\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001c0\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lbe0/e;", "", "Ltd0/m;", "realmHelper", "<init>", "(Ltd0/m;)V", "", "id", "Lorg/json/JSONObject;", "g", "(Ljava/lang/String;)Lorg/json/JSONObject;", "vin", "Lfc0/u5;", "m", "(Ljava/lang/String;)Lfc0/u5;", "Lbe0/g;", "j", "(Ljava/lang/String;)Lbe0/g;", "e", "(Ljava/lang/String;)Ljava/lang/String;", "o", "()Lorg/json/JSONObject;", "c", "n", "h", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "", "Landroid/util/Pair;", "f", "()Ljava/util/List;", "a", "Ltd0/m;", "b", "repository_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.tesla.logging.g f17058c = com.tesla.logging.g.INSTANCE.a("GetVehicleData");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m realmHelper;

    /* JADX INFO: renamed from: be0.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbe0/e$a;", "", "<init>", "()V", "Lbe0/e;", "a", "()Lbe0/e;", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "repository_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            m mVarJ = m.j();
            s.j(mVarJ, "getDB(...)");
            return new e(mVarJ, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ e(m mVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar);
    }

    private final String e(String vin) {
        return "ID_FROM_VIN_" + vin;
    }

    private final JSONObject g(String id2) {
        JSONObject jSONObjectO = o();
        if (jSONObjectO != null) {
            return jSONObjectO.optJSONObject(id2);
        }
        return null;
    }

    private final VehicleDataInfo j(final String vin) {
        Object obj;
        Iterator it = l.H(l.J(l.U(v.e0(f()), new wn0.l() { // from class: be0.c
            @Override // wn0.l
            public final Object invoke(Object obj2) {
                return e.k((Pair) obj2);
            }
        })), new wn0.l() { // from class: be0.d
            @Override // wn0.l
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(e.l(vin, (VehicleDataInfo) obj2));
            }
        }).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                VehicleDataInfo vehicleDataInfo = (VehicleDataInfo) next;
                Instant instantS = wb0.e.s(vehicleDataInfo.getVehicleData());
                f17058c.j("id: " + vehicleDataInfo.getVehicleId() + ", timestamp: " + instantS);
                do {
                    Object next2 = it.next();
                    VehicleDataInfo vehicleDataInfo2 = (VehicleDataInfo) next2;
                    Instant instantS2 = wb0.e.s(vehicleDataInfo2.getVehicleData());
                    f17058c.j("id: " + vehicleDataInfo2.getVehicleId() + ", timestamp: " + instantS2);
                    if (instantS.compareTo(instantS2) < 0) {
                        next = next2;
                        instantS = instantS2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (VehicleDataInfo) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VehicleDataInfo k(Pair keyValuePair) {
        s.k(keyValuePair, "keyValuePair");
        Object first = keyValuePair.first;
        s.j(first, "first");
        String strT0 = t.T0((String) first, "V_");
        JSONObject jSONObject = new JSONObject((String) keyValuePair.second);
        u5 u5VarE = ke0.b.f85979a.e(jSONObject, i.LOCAL_NON_REDUX_VEHICLE);
        com.tesla.logging.g gVar = f17058c;
        String strV = u5VarE != null ? wb0.e.v(u5VarE) : null;
        gVar.j("vehicleId: " + strT0 + ", vin: " + strV + " vehicleDataProto: " + jSONObject.optString("proto_vehicle_data_raw"));
        if (u5VarE == null) {
            return null;
        }
        gVar.j("vehicleId: " + strT0 + ", vehicleData: " + keyValuePair.second);
        return new VehicleDataInfo(strT0, u5VarE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(String str, VehicleDataInfo it) {
        s.k(it, "it");
        return s.f(wb0.e.v(it.getVehicleData()), str);
    }

    private final u5 m(String vin) {
        k kVarB;
        String strH = this.realmHelper.h("VD_" + vin);
        if (strH == null || (kVarB = k.INSTANCE.b(strH)) == null) {
            return null;
        }
        return u5.F.decode(kVarB);
    }

    private final JSONObject o() {
        String strH = this.realmHelper.h("persist:vehicleList");
        if (strH != null) {
            return new JSONObject(new JSONObject(strH).optString("byId"));
        }
        return null;
    }

    public static final e p() {
        return INSTANCE.a();
    }

    public final u5 c(String id2) {
        JSONObject jSONObject;
        u5 u5VarE;
        s.k(id2, "id");
        try {
            String strH = this.realmHelper.h("V_" + id2);
            if (strH == null) {
                f17058c.j("Failed to find vehicle by direct `V_{id}` lookup, trying selected vehicle...");
                strH = this.realmHelper.h("SELECTED_PRODUCT");
            }
            if (strH == null || t.y0(strH) || (u5VarE = ke0.b.f85979a.e((jSONObject = new JSONObject(strH)), i.LOCAL_NON_REDUX_VEHICLE)) == null || !s.f(jSONObject.optString("id"), id2)) {
                return null;
            }
            return u5VarE;
        } catch (Exception unused) {
        }
        return null;
    }

    public final u5 d(String vin) {
        s.k(vin, "vin");
        u5 u5VarM = m(vin);
        if (u5VarM != null) {
            return u5VarM;
        }
        VehicleDataInfo vehicleDataInfoI = i(vin);
        if (vehicleDataInfoI != null) {
            return vehicleDataInfoI.getVehicleData();
        }
        return null;
    }

    public final List<Pair<String, String>> f() {
        try {
            return this.realmHelper.i(v.m(), v.e("V_"));
        } catch (Exception e11) {
            f17058c.d("getting exception! ", e11);
            return v.m();
        }
    }

    public final JSONObject h(String vin) {
        String vehicleId;
        s.k(vin, "vin");
        VehicleDataInfo vehicleDataInfoI = i(vin);
        if (vehicleDataInfoI == null || (vehicleId = vehicleDataInfoI.getVehicleId()) == null) {
            return null;
        }
        return g(vehicleId);
    }

    @SuppressLint({"NewApi"})
    public final VehicleDataInfo i(String vin) {
        u5 u5VarC;
        s.k(vin, "vin");
        String strN = n(vin);
        return (strN == null || (u5VarC = c(strN)) == null) ? j(vin) : new VehicleDataInfo(strN, u5VarC);
    }

    public final String n(String vin) {
        s.k(vin, "vin");
        String strH = this.realmHelper.h(e(vin));
        if (strH != null) {
            return strH;
        }
        VehicleDataInfo vehicleDataInfoJ = j(vin);
        if (vehicleDataInfoJ != null) {
            return vehicleDataInfoJ.getVehicleId();
        }
        return null;
    }

    private e(m mVar) {
        this.realmHelper = mVar;
    }
}
