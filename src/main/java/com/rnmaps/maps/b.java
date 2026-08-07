package com.rnmaps.maps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class b implements LocationSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FusedLocationProviderClient f49125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationRequest f49126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LocationCallback f49127c;

    class a implements OnSuccessListener<Location> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocationSource.OnLocationChangedListener f49128a;

        a(LocationSource.OnLocationChangedListener onLocationChangedListener) {
            this.f49128a = onLocationChangedListener;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Location location) {
            if (location != null) {
                this.f49128a.onLocationChanged(location);
            }
        }
    }

    /* JADX INFO: renamed from: com.rnmaps.maps.b$b, reason: collision with other inner class name */
    class C0779b extends LocationCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocationSource.OnLocationChangedListener f49130c;

        C0779b(LocationSource.OnLocationChangedListener onLocationChangedListener) {
            this.f49130c = onLocationChangedListener;
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            Iterator<Location> it = locationResult.getLocations().iterator();
            while (it.hasNext()) {
                this.f49130c.onLocationChanged(it.next());
            }
        }
    }

    public b(Context context) {
        this.f49125a = LocationServices.getFusedLocationProviderClient(context);
        LocationRequest locationRequestCreate = LocationRequest.create();
        this.f49126b = locationRequestCreate;
        locationRequestCreate.setPriority(100);
        locationRequestCreate.setInterval(DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
    }

    public void a(int i11) {
        this.f49126b.setFastestInterval(i11);
    }

    @Override // com.google.android.gms.maps.LocationSource
    @SuppressLint({"MissingPermission"})
    public void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        try {
            this.f49125a.getLastLocation().addOnSuccessListener(new a(onLocationChangedListener));
            C0779b c0779b = new C0779b(onLocationChangedListener);
            this.f49127c = c0779b;
            this.f49125a.requestLocationUpdates(this.f49126b, c0779b, Looper.myLooper());
        } catch (SecurityException e11) {
            e11.printStackTrace();
        }
    }

    public void b(int i11) {
        this.f49126b.setInterval(i11);
    }

    public void c(int i11) {
        this.f49126b.setPriority(i11);
    }

    @Override // com.google.android.gms.maps.LocationSource
    public void deactivate() {
        this.f49125a.removeLocationUpdates(this.f49127c);
    }
}
