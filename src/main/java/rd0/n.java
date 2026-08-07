package rd0;

import fc0.u5;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR,\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lrd0/n;", "", "Lbe0/e;", "getVehicleData", "<init>", "(Lbe0/e;)V", "", "vin", "", "a", "(Ljava/lang/String;)Ljava/util/Map;", "Lbe0/e;", "", "b", "Ljava/util/Map;", "vinToTelemetry", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final be0.e getVehicleData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Map<String, String>> vinToTelemetry;

    public n(be0.e getVehicleData) {
        p013kotlin.jvm.internal.s.k(getVehicleData, "getVehicleData");
        this.getVehicleData = getVehicleData;
        this.vinToTelemetry = new LinkedHashMap();
    }

    public final Map<String, String> a(String vin) {
        p013kotlin.jvm.internal.s.k(vin, "vin");
        synchronized (this) {
            if (this.vinToTelemetry.containsKey(vin)) {
                return (Map) v0.j(this.vinToTelemetry, vin);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            u5 u5VarD = this.getVehicleData.d(vin);
            if (u5VarD != null) {
                linkedHashMap.put("car_type", wb0.e.i(u5VarD));
                linkedHashMap.put("car_version", vb0.c.d(u5VarD));
                this.vinToTelemetry.put(vin, linkedHashMap);
            }
            return linkedHashMap;
        }
    }
}
