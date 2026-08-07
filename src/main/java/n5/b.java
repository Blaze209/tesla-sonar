package n5;

import android.location.LocationManager;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final WeakHashMap<Object, WeakReference<Object>> f93341a = new WeakHashMap<>();

    private static class a {
        static boolean a(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    public static boolean a(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(locationManager);
        }
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }
}
