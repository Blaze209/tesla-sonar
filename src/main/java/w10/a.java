package w10;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import com.sensors.RNSensor;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class a implements p0 {
    @Override // com.facebook.react.p0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNSensor(reactApplicationContext, "RNSensorsGyroscope", 4), new RNSensor(reactApplicationContext, "RNSensorsAccelerometer", 1), new RNSensor(reactApplicationContext, "RNSensorsGravity", 9), new RNSensor(reactApplicationContext, "RNSensorsMagnetometer", 2), new RNSensor(reactApplicationContext, "RNSensorsBarometer", 6), new RNSensor(reactApplicationContext, "RNSensorsOrientation", 11));
    }

    @Override // com.facebook.react.p0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
