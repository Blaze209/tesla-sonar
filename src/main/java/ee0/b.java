package ee0;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.sessionmanager.VehicleSessionInfo;
import ie0.n;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lee0/b;", "", "<init>", "()V", "", "vin", "", "sourcePublicKey", "Lsc0/b;", "domain", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "sessionInfo", "Ljn0/h0;", "c", "(Ljava/lang/String;[BLsc0/b;Lcom/tesla/sessionmanager/VehicleSessionInfo;)V", "b", "(Ljava/lang/String;[BLsc0/b;)Lcom/tesla/sessionmanager/VehicleSessionInfo;", "a", "(Ljava/lang/String;[BLsc0/b;)V", "sessionmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.tesla.logging.g f62849b = com.tesla.logging.g.INSTANCE.a("SessionInfoRepository");

    public final void a(String vin, byte[] sourcePublicKey, sc0.b domain) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(domain, "domain");
        try {
            qb0.a.INSTANCE.b().b(vin, n.e(sourcePublicKey, 0, 1, null), domain);
            f62849b.j("cleared persisted " + domain + " session info for " + vin + " " + n.e(sourcePublicKey, 0, 1, null));
        } catch (Exception e11) {
            f62849b.d("error clearing " + domain + " session info for " + vin + " " + n.e(sourcePublicKey, 0, 1, null), e11);
        }
    }

    public final VehicleSessionInfo b(String vin, byte[] sourcePublicKey, sc0.b domain) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(domain, "domain");
        String strV = qb0.a.INSTANCE.b().V(vin, n.e(sourcePublicKey, 0, 1, null), domain);
        if (strV != null) {
            try {
                VehicleSessionInfo vehicleSessionInfoA = h.a(strV);
                if (vehicleSessionInfoA == null) {
                    com.tesla.logging.g gVar = f62849b;
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g("could not deserialize vehicle session info JSON " + strV);
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = v0.f(x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                }
                return vehicleSessionInfoA;
            } catch (Exception e11) {
                f62849b.d("error deserializing " + domain + " session info for " + vin, e11);
            }
        }
        return null;
    }

    public final void c(String vin, byte[] sourcePublicKey, sc0.b domain, VehicleSessionInfo sessionInfo) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(domain, "domain");
        s.k(sessionInfo, "sessionInfo");
        try {
            String json = h.b().toJson(sessionInfo);
            qb0.a aVarB = qb0.a.INSTANCE.b();
            String strE = n.e(sourcePublicKey, 0, 1, null);
            s.h(json);
            aVarB.j(vin, strE, json, domain);
            f62849b.j("persisted " + domain + " session info for " + vin + " " + n.e(sourcePublicKey, 0, 1, null) + " -> " + sessionInfo);
        } catch (Exception e11) {
            f62849b.d("Error serializing or persisting " + domain + " session info for " + vin + " " + n.e(sourcePublicKey, 0, 1, null), e11);
        }
    }
}
