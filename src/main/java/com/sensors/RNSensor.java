package com.sensors;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: loaded from: classes6.dex */
public class RNSensor extends ReactContextBaseJavaModule implements SensorEventListener {
    private Arguments arguments;
    private int interval;
    private Boolean isBeingObserved;
    private double lastReading;
    private int logLevel;
    private float[] orientation;
    private float[] quaternion;
    private final ReactApplicationContext reactContext;
    private float[] rotation;
    private final Sensor sensor;
    private final SensorManager sensorManager;
    private String sensorName;
    private int sensorType;

    public RNSensor(ReactApplicationContext reactApplicationContext, String str, int i11) {
        super(reactApplicationContext);
        this.lastReading = System.currentTimeMillis();
        this.logLevel = 0;
        this.rotation = new float[9];
        this.orientation = new float[3];
        this.quaternion = new float[4];
        this.isBeingObserved = Boolean.FALSE;
        this.reactContext = reactApplicationContext;
        this.sensorType = i11;
        this.sensorName = str;
        SensorManager sensorManager = (SensorManager) reactApplicationContext.getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.sensor = sensorManager.getDefaultSensor(this.sensorType);
    }

    private void sendEvent(String str, WritableMap writableMap) {
        try {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        } catch (RuntimeException unused) {
            Log.e("ERROR", "java.lang.RuntimeException: Trying to invoke Javascript before CatalystInstance has been set!");
        }
    }

    private static double sensorTimestampToEpochMilliseconds(long j11) {
        return System.currentTimeMillis() + ((j11 - SystemClock.elapsedRealtimeNanos()) / 1000000);
    }

    @ReactMethod
    public void addListener(String str) {
        this.isBeingObserved = Boolean.TRUE;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.sensorName;
    }

    @ReactMethod
    public void isAvailable(Promise promise) {
        if (this.sensor != null) {
            promise.resolve(null);
            return;
        }
        promise.reject(new RuntimeException("No " + this.sensorName + " found"));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c5  */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int type;
        if (this.isBeingObserved.booleanValue() && (type = sensorEvent.sensor.getType()) == this.sensorType) {
            double dCurrentTimeMillis = System.currentTimeMillis();
            if (dCurrentTimeMillis - this.lastReading >= this.interval) {
                this.lastReading = dCurrentTimeMillis;
                WritableMap writableMapCreateMap = Arguments.createMap();
                if (type == 1 || type == 2 || type == 4) {
                    writableMapCreateMap.putDouble("x", sensorEvent.values[0]);
                    writableMapCreateMap.putDouble("y", sensorEvent.values[1]);
                    writableMapCreateMap.putDouble("z", sensorEvent.values[2]);
                } else if (type == 6) {
                    writableMapCreateMap.putDouble("pressure", sensorEvent.values[0]);
                } else if (type == 9) {
                    writableMapCreateMap.putDouble("x", sensorEvent.values[0]);
                    writableMapCreateMap.putDouble("y", sensorEvent.values[1]);
                    writableMapCreateMap.putDouble("z", sensorEvent.values[2]);
                } else {
                    if (type != 11) {
                        Log.e("ERROR", "Sensor type '" + type + "' not implemented!");
                        return;
                    }
                    SensorManager.getQuaternionFromVector(this.quaternion, sensorEvent.values);
                    SensorManager.getRotationMatrixFromVector(this.rotation, sensorEvent.values);
                    SensorManager.getOrientation(this.rotation, this.orientation);
                    writableMapCreateMap.putDouble("qw", this.quaternion[0]);
                    writableMapCreateMap.putDouble("qx", this.quaternion[1]);
                    writableMapCreateMap.putDouble("qy", this.quaternion[2]);
                    writableMapCreateMap.putDouble("qz", this.quaternion[3]);
                    writableMapCreateMap.putDouble("yaw", this.orientation[0]);
                    writableMapCreateMap.putDouble("pitch", this.orientation[1]);
                    writableMapCreateMap.putDouble("roll", this.orientation[2]);
                }
                writableMapCreateMap.putDouble("timestamp", sensorTimestampToEpochMilliseconds(sensorEvent.timestamp));
                sendEvent(this.sensorName, writableMapCreateMap);
            }
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        this.isBeingObserved = Boolean.FALSE;
        stopUpdates();
    }

    @ReactMethod
    public void setLogLevel(int i11) {
        this.logLevel = i11;
    }

    @ReactMethod
    public void setUpdateInterval(int i11) {
        this.interval = i11;
    }

    @ReactMethod
    public void startUpdates() {
        this.sensorManager.registerListener(this, this.sensor, this.interval * 1000);
    }

    @ReactMethod
    public void stopUpdates() {
        this.sensorManager.unregisterListener(this);
    }
}
