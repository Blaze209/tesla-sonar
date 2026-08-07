package com.tesla.TeslaV4.reactnative.module;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: loaded from: classes7.dex */
public class ProximitySensorModule extends ReactContextBaseJavaModule implements SensorEventListener {
    private static final String PROXIMITY_SENSOR_NEAR = "near";
    private static final String REACT_CLASS = "ProximitySensor";
    private static final String TAG = "ProximitySensorModule";

    public ProximitySensorModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private WritableMap createProximitySensorStateMap(boolean z11) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean(PROXIMITY_SENSOR_NEAR, z11);
        return writableMapCreateMap;
    }

    @NonNull
    private SensorManager getSensorManager() {
        return (SensorManager) getReactApplicationContext().getSystemService("sensor");
    }

    private void sendProximitySensorStateChangedEvent(boolean z11) {
        if (getReactApplicationContext().hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("proximitySensorStateChanged", createProximitySensorStateMap(z11));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z11 = false;
        float f11 = sensorEvent.values[0];
        if (f11 != getSensorManager().getDefaultSensor(8).getMaximumRange() && f11 <= 3.0f) {
            z11 = true;
        }
        sendProximitySensorStateChangedEvent(z11);
    }

    @ReactMethod
    public void setProximitySensorMonitoringEnabled(Boolean bool, Promise promise) {
        SensorManager sensorManager = getSensorManager();
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        if (bool.booleanValue()) {
            sensorManager.registerListener(this, defaultSensor, 0);
        } else {
            sensorManager.unregisterListener(this);
        }
    }
}
