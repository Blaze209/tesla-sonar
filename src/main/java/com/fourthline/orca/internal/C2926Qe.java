package com.fourthline.orca.internal;

import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2926Qe implements DeviceDataCollector {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f27465h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f27466i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f27467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f27468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Float f27470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Float f27471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f27472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f27473g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Qe$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Qe$b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f27474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f27475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f27476c;

        public b(float f11, float f12, float f13) {
            this.f27474a = f11;
            this.f27475b = f12;
            this.f27476c = f13;
        }

        public final float a() {
            return this.f27474a;
        }

        public final float b() {
            return this.f27475b;
        }

        public final float c() {
            return this.f27476c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f27474a, bVar.f27474a) == 0 && Float.compare(this.f27475b, bVar.f27475b) == 0 && Float.compare(this.f27476c, bVar.f27476c) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f27474a) * 31) + Float.hashCode(this.f27475b)) * 31) + Float.hashCode(this.f27476c);
        }

        public String toString() {
            return "MagneticField(x=" + this.f27474a + ", y=" + this.f27475b + ", z=" + this.f27476c + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Qe$c */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mn0.a.d(Float.valueOf(((Location) obj).getAccuracy()), Float.valueOf(((Location) obj2).getAccuracy()));
        }
    }

    public C2926Qe(AndroidDataCollectorHelper helper, Map destination, boolean z11) {
        p013kotlin.jvm.internal.s.k(helper, "helper");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        this.f27467a = helper;
        this.f27468b = destination;
        this.f27469c = z11;
    }

    private final float a(float f11) {
        return f11 * 0.1f;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f27469c) {
            AndroidDataCollectorHelper androidDataCollectorHelper = this.f27467a;
            Float f11 = this.f27470d;
            if (f11 != null) {
                float fFloatValue = f11.floatValue();
                this.f27468b.put("pressure", Float.valueOf(a(fFloatValue)));
                this.f27468b.put("altitudeRelative", Float.valueOf(SensorManager.getAltitude(1013.25f, fFloatValue)));
            }
            Float f12 = this.f27471e;
            if (f12 != null) {
                this.f27468b.put("humidityRelative", Float.valueOf(f12.floatValue()));
            }
            b bVar = this.f27472f;
            if (bVar != null) {
                this.f27468b.put("magneticFieldValues", "[" + bVar.a() + ", " + bVar.b() + ", " + bVar.c() + "]");
            }
            String str = this.f27473g;
            if (str != null) {
                this.f27468b.put("magneticFieldAccuracy", str);
            }
            final LocationManager locationManager = androidDataCollectorHelper.getLocationManager();
            if (locationManager != null && (androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_COARSE_LOCATION") || androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_FINE_LOCATION"))) {
                List<String> providers = locationManager.getProviders(true);
                p013kotlin.jvm.internal.s.j(providers, "getProviders(...)");
                Location location = (Location) ho0.l.T(ho0.l.Z(ho0.l.H(ho0.l.J(ho0.l.U(p013kotlin.collections.v.e0(providers), new wn0.l() { // from class: com.fourthline.orca.internal.cm0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return C2926Qe.a(locationManager, (String) obj);
                    }
                })), new wn0.l() { // from class: com.fourthline.orca.internal.dm0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(C2926Qe.a((Location) obj));
                    }
                }), new c()));
                if (location != null) {
                    GeomagneticField geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), location.getTime());
                    this.f27468b.put("magneticFieldDeclination", Float.valueOf(geomagneticField.getDeclination()));
                    this.f27468b.put("magneticFieldInclination", Float.valueOf(geomagneticField.getInclination()));
                    this.f27468b.put("magneticFieldStrengthTotal", Float.valueOf(geomagneticField.getFieldStrength()));
                    this.f27468b.put("magneticFieldStrengthHorizontal", Float.valueOf(geomagneticField.getHorizontalStrength()));
                }
            }
            androidDataCollectorHelper.onSensorChanged(new wn0.l() { // from class: com.fourthline.orca.internal.em0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return C2926Qe.a(this.f31478a, (SensorEvent) obj);
                }
            });
            androidDataCollectorHelper.onAccuracyChanged(new wn0.p() { // from class: com.fourthline.orca.internal.fm0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return C2926Qe.a(this.f31792a, (Sensor) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Location a(LocationManager locationManager, String str) {
        return locationManager.getLastKnownLocation(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Location it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return Build.VERSION.SDK_INT < 31 || !it.isMock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C2926Qe c2926Qe, SensorEvent sensorEvent) {
        Sensor sensor;
        Integer numValueOf = (sensorEvent == null || (sensor = sensorEvent.sensor) == null) ? null : Integer.valueOf(sensor.getType());
        if (numValueOf != null && numValueOf.intValue() == 6) {
            c2926Qe.f27470d = Float.valueOf(sensorEvent.values[0]);
        } else if (numValueOf != null && numValueOf.intValue() == 12) {
            c2926Qe.f27471e = Float.valueOf(sensorEvent.values[0]);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            float[] fArr = sensorEvent.values;
            c2926Qe.f27472f = new b(fArr[0], fArr[1], fArr[2]);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C2926Qe c2926Qe, Sensor sensor, int i11) {
        String str = null;
        Integer numValueOf = sensor != null ? Integer.valueOf(sensor.getType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            if (i11 == 0) {
                str = "uncalibrated";
            } else if (i11 == 1) {
                str = "low";
            } else if (i11 == 2) {
                str = "medium";
            } else if (i11 == 3) {
                str = "high";
            }
            c2926Qe.f27473g = str;
        }
        return jn0.h0.f84049a;
    }
}
