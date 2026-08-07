package ee0;

import com.squareup.moshi.u;
import com.tesla.sessionmanager.VehicleSessionInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "a", "(Ljava/lang/String;)Lcom/tesla/sessionmanager/VehicleSessionInfo;", "Lcom/squareup/moshi/h;", "Lcom/squareup/moshi/h;", "b", "()Lcom/squareup/moshi/h;", "vehicleSessionInfoJsonAdapter", "sessionmanager_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.squareup.moshi.h<VehicleSessionInfo> f62872a;

    static {
        com.squareup.moshi.h<VehicleSessionInfo> hVarC = new u.b().d().c(VehicleSessionInfo.class);
        s.j(hVarC, "adapter(...)");
        f62872a = hVarC;
    }

    public static final VehicleSessionInfo a(String str) {
        s.k(str, "<this>");
        try {
            return f62872a.fromJson(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final com.squareup.moshi.h<VehicleSessionInfo> b() {
        return f62872a;
    }
}
