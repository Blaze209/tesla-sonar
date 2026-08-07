package hi0;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lhi0/b;", "a", "(Landroid/content/Context;)Lhi0/b;", "", "b", "(Landroid/content/Context;)Z", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f {
    public static final GpsData a(Context context) {
        Location lastKnownLocation;
        c cVar;
        s.k(context, "context");
        Object systemService = context.getSystemService("location");
        s.i(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        try {
            int iCheckSelfPermission = androidx.core.content.b.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION");
            int iCheckSelfPermission2 = androidx.core.content.b.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
            if (iCheckSelfPermission == 0) {
                lastKnownLocation = locationManager.getLastKnownLocation("gps");
            } else {
                lastKnownLocation = iCheckSelfPermission2 == 0 ? locationManager.getLastKnownLocation("network") : null;
            }
            if (iCheckSelfPermission == 0) {
                cVar = c.PRECISE;
            } else {
                cVar = iCheckSelfPermission2 == 0 ? c.ROUGH : null;
            }
            if (lastKnownLocation != null && cVar != null) {
                return new GpsData(lastKnownLocation, cVar);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final boolean b(Context context) {
        s.k(context, "context");
        Object systemService = context.getSystemService("location");
        s.i(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return ((LocationManager) systemService).isProviderEnabled("gps");
    }
}
