package ke0;

import android.util.Base64;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lke0/f;", "", "<init>", "()V", "", "vin", "base64VehicleData", "Lke0/i;", "origin", "a", "(Ljava/lang/String;Ljava/lang/String;Lke0/i;)Ljava/lang/String;", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "()Lcom/tesla/logging/g;", "logger", "vehicledata_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f85990a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("VehicleDataMigration");

    private f() {
    }

    public final String a(String vin, String base64VehicleData, i origin) {
        s.k(vin, "vin");
        s.k(base64VehicleData, "base64VehicleData");
        s.k(origin, "origin");
        if (t.y0(base64VehicleData)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(base64VehicleData, 0);
            s.j(bArrDecode, "decode(...)");
            return h.e(h.b(bArrDecode, vin, origin));
        } catch (Throwable th2) {
            logger.d("[" + origin + "] Error decoding base64 vehicle data into VehicleData", th2);
            return null;
        }
    }

    public final com.tesla.logging.g b() {
        return logger;
    }
}
