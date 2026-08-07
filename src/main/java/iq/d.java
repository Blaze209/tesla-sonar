package iq;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;

/* JADX INFO: loaded from: classes4.dex */
public class d implements iq.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f81773a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81775c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f81774b = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LocationListener f81776d = new a();

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f81778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f81779b;

        /* JADX INFO: Access modifiers changed from: private */
        public static b d(ReactApplicationContext reactApplicationContext, ReadableMap readableMap) {
            float f11;
            boolean z11 = false;
            if (readableMap.hasKey("desiredAccuracy")) {
                if (readableMap.getType("desiredAccuracy") == ReadableType.Map) {
                    ReadableMap map = readableMap.getMap("desiredAccuracy");
                    if (map.hasKey("android")) {
                        if (map.getType("android") == ReadableType.String) {
                            String string = map.getString("android");
                            string.getClass();
                            switch (string) {
                                case "lowPower":
                                case "balancedPowerAccuracy":
                                case "noPower":
                                    break;
                                case "highAccuracy":
                                    z11 = true;
                                    break;
                                default:
                                    f.b(reactApplicationContext, "desiredAccuracy.android was passed an unknown value: " + string, "401");
                                    break;
                            }
                        } else {
                            f.b(reactApplicationContext, "desiredAccuracy.android must be a string", "401");
                        }
                    }
                } else {
                    f.b(reactApplicationContext, "desiredAccuracy must be an object", "401");
                }
            }
            if (!readableMap.hasKey("distanceFilter")) {
                f11 = 100.0f;
            } else if (readableMap.getType("distanceFilter") == ReadableType.Number) {
                f11 = (float) readableMap.getDouble("distanceFilter");
            } else {
                f.b(reactApplicationContext, "distanceFilter must be a number", "401");
                f11 = 100.0f;
            }
            return new b(z11, f11);
        }

        private b() {
            this.f81778a = false;
            this.f81779b = 100.0f;
        }

        private b(boolean z11, float f11) {
            this.f81778a = z11;
            this.f81779b = f11;
        }
    }

    public d(ReactApplicationContext reactApplicationContext) {
        this.f81773a = reactApplicationContext;
    }

    private String f(LocationManager locationManager, boolean z11) {
        String str = z11 ? "gps" : "network";
        if (locationManager.isProviderEnabled(str)) {
            return str;
        }
        String str2 = str.equals("gps") ? "network" : "gps";
        if (locationManager.isProviderEnabled(str2)) {
            return str2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Location location) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushMap(f.d(location));
        f.a(this.f81773a, "locationUpdated", writableArrayCreateArray);
    }

    private void h() {
        try {
            LocationManager locationManager = (LocationManager) this.f81773a.getSystemService("location");
            if (locationManager == null) {
                f.b(this.f81773a, "No location manager is available.", "502");
                return;
            }
            String strF = f(locationManager, this.f81774b.f81778a);
            if (strF == null) {
                f.b(this.f81773a, "There is no valid location provider available.", "503");
                return;
            }
            if (!strF.equals(this.f81775c)) {
                locationManager.removeUpdates(this.f81776d);
                locationManager.requestLocationUpdates(strF, 1000L, this.f81774b.f81779b, this.f81776d);
                Location lastKnownLocation = locationManager.getLastKnownLocation(strF);
                if (lastKnownLocation != null) {
                    g(lastKnownLocation);
                }
            }
            this.f81775c = strF;
        } catch (SecurityException e11) {
            f.b(this.f81773a, "Attempted to start updating the location without location permissions. Detail: " + e11.getLocalizedMessage(), "403");
        }
    }

    @Override // iq.b
    public void a() {
        h();
    }

    @Override // iq.b
    public void b() {
        LocationManager locationManager = (LocationManager) this.f81773a.getSystemService("location");
        if (locationManager == null) {
            return;
        }
        locationManager.removeUpdates(this.f81776d);
        this.f81775c = null;
    }

    @Override // iq.b
    public void c(Activity activity, ReadableMap readableMap, Promise promise) {
        this.f81774b = b.d(this.f81773a, readableMap);
        if (this.f81775c != null) {
            h();
        }
        promise.resolve(null);
    }

    class a implements LocationListener {
        a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            d.this.g(location);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i11, Bundle bundle) {
            if (i11 == 0) {
                f.b(d.this.f81773a, "Provider " + str + " is out of service.", "500");
                return;
            }
            if (i11 == 1) {
                f.b(d.this.f81773a, "Provider " + str + " is temporarily unavailable.", "501");
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }
    }
}
