package com.fourthline.orca.internal;

import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Eg implements DeviceDataCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25596d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f25597e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f25598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f25599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25600c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mn0.a.d(Float.valueOf(((Location) obj).getAccuracy()), Float.valueOf(((Location) obj2).getAccuracy()));
        }
    }

    public Eg(AndroidDataCollectorHelper helper, Map destination, boolean z11) {
        p013kotlin.jvm.internal.s.k(helper, "helper");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        this.f25598a = helper;
        this.f25599b = destination;
        this.f25600c = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Location a(LocationManager locationManager, String str) {
        return locationManager.getLastKnownLocation(str);
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        AndroidDataCollectorHelper androidDataCollectorHelper;
        final LocationManager locationManager;
        boolean z11;
        boolean z12;
        if (!this.f25600c || (locationManager = (androidDataCollectorHelper = this.f25598a).getLocationManager()) == null) {
            return;
        }
        if (androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_COARSE_LOCATION") || androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_FINE_LOCATION")) {
            boolean z13 = true;
            List<String> providers = locationManager.getProviders(true);
            p013kotlin.jvm.internal.s.j(providers, "getProviders(...)");
            Location location = (Location) ho0.l.T(ho0.l.Z(ho0.l.H(ho0.l.J(ho0.l.U(p013kotlin.collections.v.e0(providers), new wn0.l() { // from class: com.fourthline.orca.internal.g20
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Eg.a(locationManager, (String) obj);
                }
            })), new wn0.l() { // from class: com.fourthline.orca.internal.h20
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(Eg.a((Location) obj));
                }
            }), new b()));
            if (location != null) {
                this.f25599b.put("gpsLatitude", Double.valueOf(location.getLatitude()));
                this.f25599b.put("gpslongitude", Double.valueOf(location.getLongitude()));
                this.f25599b.put("gpsAccuracy", Float.valueOf(location.getAccuracy()));
                if (Build.VERSION.SDK_INT >= 26) {
                    float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                    z11 = false;
                    if (speedAccuracyMetersPerSecond == BitmapDescriptorFactory.HUE_RED) {
                        z12 = false;
                    } else {
                        this.f25599b.put("gpsSpeedAccuracy", Float.valueOf(speedAccuracyMetersPerSecond));
                        z12 = true;
                    }
                    float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                    if (verticalAccuracyMeters != BitmapDescriptorFactory.HUE_RED) {
                        this.f25599b.put("gpsAltitudeAccuracy", Float.valueOf(verticalAccuracyMeters));
                        z11 = true;
                    }
                    z13 = z12;
                } else {
                    z11 = true;
                }
                if (z13) {
                    this.f25599b.put("gpsSpeed", Float.valueOf(location.getSpeed()));
                }
                if (z11) {
                    this.f25599b.put("gpsAltitude", Double.valueOf(location.getAltitude()));
                }
                this.f25599b.put("gpsTimestamp", Long.valueOf(location.getTime() / ((long) 1000)));
                this.f25599b.put("gpsIsFullAccuracyGranted", Boolean.valueOf(androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_FINE_LOCATION")));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Location it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return Build.VERSION.SDK_INT < 31 || !it.isMock();
    }
}
