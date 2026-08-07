package rd0;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import fc0.u5;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lrd0/l;", "", "Lcom/tesla/logging/g;", "logger", "Lbe0/e;", "getVehicleData", "<init>", "(Lcom/tesla/logging/g;Lbe0/e;)V", "", "vin", "", "a", "(Ljava/lang/String;)Z", "Lcom/tesla/logging/g;", "b", "Lbe0/e;", "", "c", "Ljava/util/Map;", "vinToEligibility", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final be0.e getVehicleData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Boolean> vinToEligibility;

    public l(com.tesla.logging.g logger, be0.e getVehicleData) {
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(getVehicleData, "getVehicleData");
        this.logger = logger;
        this.getVehicleData = getVehicleData;
        this.vinToEligibility = new LinkedHashMap();
    }

    public final boolean a(String vin) {
        p013kotlin.jvm.internal.s.k(vin, "vin");
        synchronized (this) {
            if (this.vinToEligibility.containsKey(vin)) {
                return ((Boolean) v0.j(this.vinToEligibility, vin)).booleanValue();
            }
            u5 u5VarD = this.getVehicleData.d(vin);
            if (u5VarD == null) {
                com.tesla.logging.g gVar = this.logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("No vehicle found in realm. Can't compute eligibility for rejection");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = v0.f(x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                return false;
            }
            if (wb0.e.g(u5VarD) != null) {
                boolean zC = vb0.c.c(u5VarD, gc0.v.MOBILE_APP_FEATURE_IMU_ALERT_IS_VISIBLE, null, 2, null);
                this.vinToEligibility.put(vin, Boolean.valueOf(zC));
                return zC;
            }
            com.tesla.logging.g gVar2 = this.logger;
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String tag2 = gVar2.getTag();
            String strG2 = gVar2.g("Vehicle API version null. Can't compute eligibility for rejection");
            zb0.a aVar2 = zb0.a.f128044a;
            Map mapF2 = v0.f(x.a(tag2, strG2));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF2.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception(strG2));
            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
            vr0.a.INSTANCE.a(strG2, new Object[0]);
            return false;
        }
    }
}
