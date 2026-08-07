package ob0;

import android.annotation.SuppressLint;
import com.tesla.logging.g;
import gc0.u0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lob0/d;", "", "<init>", "()V", "", "vin", "", "apiVersion", "Lgc0/u0$d;", "carType", "", "c", "(Ljava/lang/String;ILgc0/u0$d;)Z", "isRemoteBuiltCommand", "Lsc0/b;", "domain", "isFetchingSessionInfo", "a", "(Ljava/lang/String;IZLsc0/b;Lgc0/u0$d;Z)Z", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"WrongCommentType"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f97093a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("SignedCommandUtils");

    private d() {
    }

    public static /* synthetic */ boolean b(d dVar, String str, int i11, boolean z11, sc0.b bVar, u0.d dVar2, boolean z12, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        return dVar.a(str, i11, z11, bVar, dVar2, z12);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    public static final boolean c(String vin, int apiVersion, u0.d carType) {
        s.k(vin, "vin");
        boolean z11 = true;
        boolean z12 = apiVersion >= 74;
        boolean z13 = apiVersion >= 80;
        boolean zB0 = t.b0(vin, "ROB", false, 2, null);
        if (!z13) {
            if (z12) {
                if (!wb0.e.k0(carType != null ? carType.getCarTypeCybertruck() : null)) {
                    if (!zB0) {
                        z11 = false;
                    }
                }
            } else if (!zB0) {
                z11 = false;
            }
        }
        logger.j("vehicleSupportsRoutableOverBle: " + z11 + " for " + vin + " apiVersion:" + apiVersion + " apiVersionSupported: " + z13 + " cybertruckApiVersionSupported: " + z12 + " RT: " + zB0);
        return z11;
    }

    public final boolean a(String vin, int apiVersion, boolean isRemoteBuiltCommand, sc0.b domain, u0.d carType, boolean isFetchingSessionInfo) {
        s.k(vin, "vin");
        s.k(domain, "domain");
        if (isRemoteBuiltCommand || (isFetchingSessionInfo && domain == sc0.b.DOMAIN_VEHICLE_SECURITY)) {
            return apiVersion < 49;
        }
        return !c(vin, apiVersion, carType);
    }
}
