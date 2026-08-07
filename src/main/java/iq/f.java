package iq;

import android.location.Location;
import android.os.Build;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.fourthline.adapters.serialization.OrcaKeys;

/* JADX INFO: loaded from: classes4.dex */
public class f {
    public static void a(ReactApplicationContext reactApplicationContext, String str, Object obj) {
        ((RCTNativeAppEventEmitter) reactApplicationContext.getJSModule(RCTNativeAppEventEmitter.class)).emit(str, obj);
    }

    public static void b(ReactApplicationContext reactApplicationContext, String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", str);
        writableMapCreateMap.putString("type", str2);
        a(reactApplicationContext, "onWarning", writableMapCreateMap);
    }

    public static boolean c() {
        return true;
    }

    public static WritableMap d(Location location) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(OrcaKeys.LATITUDE, location.getLatitude());
        writableMapCreateMap.putDouble(OrcaKeys.LONGITUDE, location.getLongitude());
        writableMapCreateMap.putDouble("accuracy", location.getAccuracy());
        writableMapCreateMap.putDouble("altitude", location.getAltitude());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            writableMapCreateMap.putDouble("altitudeAccuracy", location.getVerticalAccuracyMeters());
        } else {
            writableMapCreateMap.putDouble("altitudeAccuracy", 0.0d);
        }
        writableMapCreateMap.putDouble("course", location.getBearing());
        if (i11 >= 26) {
            writableMapCreateMap.putDouble("courseAccuracy", location.getBearingAccuracyDegrees());
        } else {
            writableMapCreateMap.putDouble("courseAccuracy", 0.0d);
        }
        writableMapCreateMap.putDouble("speed", location.getSpeed());
        if (i11 >= 26) {
            writableMapCreateMap.putDouble("speedAccuracy", location.getSpeedAccuracyMetersPerSecond());
        } else {
            writableMapCreateMap.putDouble("speedAccuracy", 0.0d);
        }
        writableMapCreateMap.putDouble("timestamp", location.getTime());
        writableMapCreateMap.putBoolean("fromMockProvider", location.isFromMockProvider());
        return writableMapCreateMap;
    }
}
