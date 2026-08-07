package com.compassheading;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.plaid.internal.EnumC4419g;
import xn.a;

/* JADX INFO: loaded from: classes3.dex */
@a(name = CompassHeadingModule.NAME)
public class CompassHeadingModule extends ReactContextBaseJavaModule implements SensorEventListener {
    public static final String NAME = "CompassHeading";
    private static Context mApplicationContext;
    private final float[] I;
    private final float[] R;
    private int mAzimuth;
    private int mFilter;
    private final float[] mGeomagnetic;
    private final float[] mGravity;
    private SensorManager sensorManager;

    public CompassHeadingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mAzimuth = 0;
        this.mFilter = 1;
        this.mGravity = new float[3];
        this.mGeomagnetic = new float[3];
        this.R = new float[9];
        this.I = new float[9];
        mApplicationContext = reactApplicationContext.getApplicationContext();
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void hasCompass(Promise promise) {
        try {
            SensorManager sensorManager = (SensorManager) mApplicationContext.getSystemService("sensor");
            boolean z11 = true;
            if (sensorManager.getDefaultSensor(1) == null || sensorManager.getDefaultSensor(2) == null) {
                z11 = false;
            }
            promise.resolve(Boolean.valueOf(z11));
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        Display defaultDisplay;
        synchronized (this) {
            try {
                if (sensorEvent.sensor.getType() == 1) {
                    float[] fArr = this.mGravity;
                    float f11 = fArr[0] * 0.97f;
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f11 + (fArr2[0] * 0.029999971f);
                    fArr[1] = (fArr[1] * 0.97f) + (fArr2[1] * 0.029999971f);
                    fArr[2] = (fArr[2] * 0.97f) + (fArr2[2] * 0.029999971f);
                }
                if (sensorEvent.sensor.getType() == 2) {
                    float[] fArr3 = this.mGeomagnetic;
                    float f12 = fArr3[0] * 0.97f;
                    float[] fArr4 = sensorEvent.values;
                    fArr3[0] = f12 + (fArr4[0] * 0.029999971f);
                    fArr3[1] = (fArr3[1] * 0.97f) + (fArr4[1] * 0.029999971f);
                    fArr3[2] = (fArr3[2] * 0.97f) + (fArr4[2] * 0.029999971f);
                }
                if (SensorManager.getRotationMatrix(this.R, this.I, this.mGravity, this.mGeomagnetic)) {
                    float[] fArr5 = new float[3];
                    SensorManager.getOrientation(this.R, fArr5);
                    int degrees = (((int) Math.toDegrees(fArr5[0])) + 360) % 360;
                    if (Build.VERSION.SDK_INT >= 30) {
                        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                        defaultDisplay = currentActivity != null ? currentActivity.getDisplay() : null;
                    } else {
                        defaultDisplay = ((WindowManager) mApplicationContext.getSystemService("window")).getDefaultDisplay();
                    }
                    if (defaultDisplay != null) {
                        int rotation = defaultDisplay.getRotation();
                        if (rotation == 1) {
                            degrees = (degrees + 90) % 360;
                        } else if (rotation == 3) {
                            degrees = (degrees + EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE) % 360;
                        } else if (rotation == 2) {
                            degrees = (degrees + 180) % 360;
                        }
                    }
                    if (Math.abs(this.mAzimuth - degrees) > this.mFilter) {
                        this.mAzimuth = degrees;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putDouble("heading", this.mAzimuth);
                        writableMapCreateMap.putDouble("accuracy", 1.0d);
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("HeadingUpdated", writableMapCreateMap);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void start(int i11, Promise promise) {
        try {
            SensorManager sensorManager = (SensorManager) mApplicationContext.getSystemService("sensor");
            this.sensorManager = sensorManager;
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            Sensor defaultSensor2 = this.sensorManager.getDefaultSensor(2);
            this.sensorManager.registerListener(this, defaultSensor, 1);
            this.sensorManager.registerListener(this, defaultSensor2, 1);
            this.mFilter = i11;
            promise.resolve(Boolean.TRUE);
        } catch (Exception e11) {
            promise.reject("failed_start", e11.getMessage());
        }
    }

    @ReactMethod
    public void stop() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }
}
