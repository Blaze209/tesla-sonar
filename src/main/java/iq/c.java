package iq;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class c implements iq.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f81757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FusedLocationProviderClient f81758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SettingsClient f81759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LocationRequest f81760d = new LocationRequest();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f81761e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference<Activity> f81762f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ReadableMap f81763g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Promise f81764h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LocationCallback f81765i = new C1714c();

    class a implements OnSuccessListener<LocationSettingsResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f81766a;

        a(Promise promise) {
            this.f81766a = promise;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(LocationSettingsResponse locationSettingsResponse) {
            c.this.k();
            this.f81766a.resolve(null);
        }
    }

    class b implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f81768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableMap f81769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f81770c;

        b(Activity activity, ReadableMap readableMap, Promise promise) {
            this.f81768a = activity;
            this.f81769b = readableMap;
            this.f81770c = promise;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@NonNull Exception exc) {
            if (!(exc instanceof ResolvableApiException)) {
                this.f81770c.reject("500", "Error configuring react-native-location", exc);
                return;
            }
            try {
                c.this.f81762f = new WeakReference(this.f81768a);
                c.this.f81763g = this.f81769b;
                c.this.f81764h = this.f81770c;
                ((ResolvableApiException) exc).startResolutionForResult(this.f81768a, 1234);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: iq.c$c, reason: collision with other inner class name */
    class C1714c extends LocationCallback {
        C1714c() {
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            if (locationResult == null || !c.this.f81761e) {
                return;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<Location> it = locationResult.getLocations().iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushMap(f.d(it.next()));
            }
            f.a(c.this.f81757a, "locationUpdated", writableArrayCreateArray);
        }
    }

    public c(Activity activity, ReactApplicationContext reactApplicationContext) {
        this.f81757a = reactApplicationContext;
        if (activity != null) {
            this.f81758b = LocationServices.getFusedLocationProviderClient(activity);
            this.f81759c = LocationServices.getSettingsClient(activity);
        } else {
            this.f81758b = LocationServices.getFusedLocationProviderClient(reactApplicationContext);
            this.f81759c = LocationServices.getSettingsClient(reactApplicationContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (!this.f81761e) {
            this.f81758b.removeLocationUpdates(this.f81765i);
            return;
        }
        int iCheckSelfPermission = androidx.core.content.b.checkSelfPermission(this.f81757a, "android.permission.ACCESS_FINE_LOCATION");
        int iCheckSelfPermission2 = androidx.core.content.b.checkSelfPermission(this.f81757a, "android.permission.ACCESS_COARSE_LOCATION");
        if (iCheckSelfPermission == 0 || iCheckSelfPermission2 == 0) {
            this.f81758b.requestLocationUpdates(this.f81760d, this.f81765i, (Looper) null);
        } else {
            f.b(this.f81757a, "Attempted to start updating the location without location permissions", "403");
        }
    }

    @Override // iq.b
    public void a() {
        this.f81761e = true;
        k();
    }

    @Override // iq.b
    public void b() {
        this.f81761e = false;
        k();
    }

    @Override // iq.b
    public void c(Activity activity, ReadableMap readableMap, Promise promise) {
        boolean z11;
        boolean z12 = true;
        if (!readableMap.hasKey("distanceFilter")) {
            z11 = false;
        } else if (readableMap.getType("distanceFilter") == ReadableType.Number) {
            this.f81760d.setSmallestDisplacement(Double.valueOf(readableMap.getDouble("distanceFilter")).floatValue());
            z11 = true;
        } else {
            f.b(this.f81757a, "distanceFilter must be a number", "401");
            z11 = false;
        }
        if (readableMap.hasKey("desiredAccuracy")) {
            if (readableMap.getType("desiredAccuracy") == ReadableType.Map) {
                ReadableMap map = readableMap.getMap("desiredAccuracy");
                if (map.hasKey("android")) {
                    if (map.getType("android") == ReadableType.String) {
                        String string = map.getString("android");
                        if (string.equals("balancedPowerAccuracy")) {
                            this.f81760d.setPriority(102);
                        } else if (string.equals("highAccuracy")) {
                            this.f81760d.setPriority(100);
                        } else if (string.equals("lowPower")) {
                            this.f81760d.setPriority(104);
                        } else if (string.equals("noPower")) {
                            this.f81760d.setPriority(105);
                        } else {
                            f.b(this.f81757a, "desiredAccuracy.android was passed an unknown value: " + string, "401");
                        }
                        z11 = true;
                    } else {
                        f.b(this.f81757a, "desiredAccuracy.android must be a string", "401");
                    }
                }
            } else {
                f.b(this.f81757a, "desiredAccuracy must be an object", "401");
            }
        }
        if (readableMap.hasKey("interval")) {
            if (readableMap.getType("interval") == ReadableType.Number) {
                this.f81760d.setInterval(Double.valueOf(readableMap.getDouble("interval")).longValue());
                z11 = true;
            } else {
                f.b(this.f81757a, "interval must be a number", "401");
            }
        }
        if (readableMap.hasKey("fastestInterval")) {
            if (readableMap.getType("fastestInterval") == ReadableType.Number) {
                this.f81760d.setFastestInterval(Double.valueOf(readableMap.getDouble("fastestInterval")).longValue());
                z11 = true;
            } else {
                f.b(this.f81757a, "fastestInterval must be a number", "401");
            }
        }
        if (!readableMap.hasKey("maxWaitTime")) {
            z12 = z11;
        } else if (readableMap.getType("maxWaitTime") == ReadableType.Number) {
            this.f81760d.setMaxWaitTime(Double.valueOf(readableMap.getDouble("maxWaitTime")).longValue());
        } else {
            f.b(this.f81757a, "maxWaitTime must be a number", "401");
            z12 = z11;
        }
        if (!z12) {
            promise.resolve(null);
            return;
        }
        Task<LocationSettingsResponse> taskCheckLocationSettings = this.f81759c.checkLocationSettings(new LocationSettingsRequest.Builder().addLocationRequest(this.f81760d).build());
        taskCheckLocationSettings.addOnSuccessListener(new a(promise));
        taskCheckLocationSettings.addOnFailureListener(new b(activity, readableMap, promise));
    }

    public void j(int i11, int i12, Intent intent) {
        WeakReference<Activity> weakReference;
        if (i11 != 1234) {
            return;
        }
        if (i12 != -1 || (weakReference = this.f81762f) == null || weakReference.get() == null || this.f81763g == null || this.f81764h == null) {
            Promise promise = this.f81764h;
            if (promise != null) {
                promise.reject("500", "Error configuring react-native-location");
            }
        } else {
            c(this.f81762f.get(), this.f81763g, this.f81764h);
        }
        this.f81762f = null;
        this.f81763g = null;
        this.f81764h = null;
    }
}
