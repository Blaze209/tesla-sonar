package dz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.location.DeviceOrientationRequest;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J+\u0010\u0018\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0014\u0010&\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010%¨\u0006("}, d2 = {"Ldz/d1;", "Landroid/location/LocationListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "enable", "Ljn0/h0;", "a", "(Z)V", "Landroid/location/Location;", "location", "onLocationChanged", "(Landroid/location/Location;)V", "", "provider", "onProviderDisabled", "(Ljava/lang/String;)V", "onProviderEnabled", "", PermissionsResponse.STATUS_KEY, "Landroid/os/Bundle;", "extras", "onStatusChanged", "(Ljava/lang/String;ILandroid/os/Bundle;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/location/LocationManager;", "b", "Landroid/location/LocationManager;", "locationManager", "value", "c", "Landroid/location/Location;", "()Landroid/location/Location;", "()Z", "hasLocationPermission", DateTokenConverter.CONVERTER_KEY, "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d1 implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocationManager locationManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Location location;

    public d1(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("location");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.locationManager = (LocationManager) systemService;
    }

    private final boolean b() {
        return androidx.core.content.b.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0 || androidx.core.content.b.checkSelfPermission(this.context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    @SuppressLint({"MissingPermission"})
    public final void a(boolean enable) throws a1 {
        if (!enable) {
            Log.i("MetadataProvider", "Stopping location updates...");
            this.locationManager.removeUpdates(this);
        } else {
            if (!b()) {
                throw new a1();
            }
            Log.i("MetadataProvider", "Start updating location...");
            this.locationManager.requestLocationUpdates("gps", DeviceOrientationRequest.OUTPUT_PERIOD_FAST, 5.0f, this);
            Location lastKnownLocation = this.locationManager.getLastKnownLocation("gps");
            this.location = lastKnownLocation;
            if (lastKnownLocation == null) {
                this.locationManager.requestSingleUpdate("gps", this, (Looper) null);
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        p013kotlin.jvm.internal.s.k(location, "location");
        Log.i("MetadataProvider", "Location updated: " + location.getLatitude() + ", " + location.getLongitude());
        this.location = location;
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String provider) {
        p013kotlin.jvm.internal.s.k(provider, "provider");
        Log.i("MetadataProvider", "Location Provider " + provider + " has been disabled.");
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String provider) {
        p013kotlin.jvm.internal.s.k(provider, "provider");
        Log.i("MetadataProvider", "Location Provider " + provider + " has been enabled.");
    }

    @Override // android.location.LocationListener
    @jn0.e
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Log.i("MetadataProvider", "Location Provider " + provider + " status changed: " + status);
    }
}
