package oj0;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class c implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e.a f97857a = new e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f97858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SensorManager f97859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Sensor f97860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f97861e;

    private c(Context context, Runnable runnable) {
        Log.d("AppRTCProximitySensor", "AppRTCProximitySensor" + d.b());
        this.f97858b = runnable;
        this.f97859c = (SensorManager) context.getSystemService("sensor");
    }

    public static c a(Context context, Runnable runnable) {
        return new c(context, runnable);
    }

    private boolean b() {
        if (this.f97860d != null) {
            return true;
        }
        Sensor defaultSensor = this.f97859c.getDefaultSensor(8);
        this.f97860d = defaultSensor;
        if (defaultSensor == null) {
            return false;
        }
        c();
        return true;
    }

    private void c() {
        if (this.f97860d == null) {
            return;
        }
        Log.d("AppRTCProximitySensor", "Proximity sensor: name=" + this.f97860d.getName() + ", vendor: " + this.f97860d.getVendor() + ", power: " + this.f97860d.getPower() + ", resolution: " + this.f97860d.getResolution() + ", max range: " + this.f97860d.getMaximumRange() + ", min delay: " + this.f97860d.getMinDelay() + ", type: " + this.f97860d.getStringType() + ", max delay: " + this.f97860d.getMaxDelay() + ", reporting mode: " + this.f97860d.getReportingMode() + ", isWakeUpSensor: " + this.f97860d.isWakeUpSensor());
    }

    public boolean d() {
        this.f97857a.a();
        return this.f97861e;
    }

    public boolean e() {
        this.f97857a.a();
        Log.d("AppRTCProximitySensor", "start" + d.b());
        if (!b()) {
            return false;
        }
        this.f97859c.registerListener(this, this.f97860d, 3);
        return true;
    }

    public void f() {
        this.f97857a.a();
        Log.d("AppRTCProximitySensor", "stop" + d.b());
        Sensor sensor = this.f97860d;
        if (sensor == null) {
            return;
        }
        this.f97859c.unregisterListener(this, sensor);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
        this.f97857a.a();
        d.a(sensor.getType() == 8);
        if (i11 == 0) {
            Log.e("AppRTCProximitySensor", "The values returned by this sensor cannot be trusted");
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f97857a.a();
        d.a(sensorEvent.sensor.getType() == 8);
        if (sensorEvent.values[0] < this.f97860d.getMaximumRange()) {
            Log.d("AppRTCProximitySensor", "Proximity sensor => NEAR state");
            this.f97861e = true;
        } else {
            Log.d("AppRTCProximitySensor", "Proximity sensor => FAR state");
            this.f97861e = false;
        }
        Runnable runnable = this.f97858b;
        if (runnable != null) {
            runnable.run();
        }
        Log.d("AppRTCProximitySensor", "onSensorChanged" + d.b() + ": accuracy=" + sensorEvent.accuracy + ", timestamp=" + sensorEvent.timestamp + ", distance=" + sensorEvent.values[0]);
    }
}
