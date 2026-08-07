package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static o f2146d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f2148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f2149c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f2150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f2151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f2152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f2153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f2154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f2155f;

        a() {
        }
    }

    o(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f2147a = context;
        this.f2148b = locationManager;
    }

    static o a(@NonNull Context context) {
        if (f2146d == null) {
            Context applicationContext = context.getApplicationContext();
            f2146d = new o(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2146d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = androidx.core.content.f.b(this.f2147a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = androidx.core.content.f.b(this.f2147a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f2148b.isProviderEnabled(str)) {
                return this.f2148b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e11) {
            Log.d("TwilightManager", "Failed to get last known location", e11);
            return null;
        }
    }

    private boolean e() {
        return this.f2149c.f2155f > System.currentTimeMillis();
    }

    private void f(@NonNull Location location) {
        long j11;
        long j12;
        a aVar = this.f2149c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        n nVarB = n.b();
        nVarB.a(jCurrentTimeMillis - CoreConstants.MILLIS_IN_ONE_DAY, location.getLatitude(), location.getLongitude());
        long j13 = nVarB.f2143a;
        nVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z11 = nVarB.f2145c == 1;
        long j14 = nVarB.f2144b;
        long j15 = nVarB.f2143a;
        nVarB.a(jCurrentTimeMillis + CoreConstants.MILLIS_IN_ONE_DAY, location.getLatitude(), location.getLongitude());
        long j16 = nVarB.f2144b;
        if (j14 == -1 || j15 == -1) {
            j11 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j15) {
                j12 = j16;
            } else {
                j12 = jCurrentTimeMillis > j14 ? j15 : j14;
            }
            j11 = j12 + 60000;
        }
        aVar.f2150a = z11;
        aVar.f2151b = j13;
        aVar.f2152c = j14;
        aVar.f2153d = j15;
        aVar.f2154e = j16;
        aVar.f2155f = j11;
    }

    boolean d() {
        a aVar = this.f2149c;
        if (e()) {
            return aVar.f2150a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f2150a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i11 = Calendar.getInstance().get(11);
        return i11 < 6 || i11 >= 22;
    }
}
