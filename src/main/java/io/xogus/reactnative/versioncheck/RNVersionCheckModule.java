package io.xogus.reactnative.versioncheck;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class RNVersionCheckModule extends ReactContextBaseJavaModule {
    private final String packageName;
    private final ReactApplicationContext reactContext;

    public RNVersionCheckModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        this.packageName = reactApplicationContext.getPackageName();
    }

    private String getCountry() {
        return getReactApplicationContext().getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("packageName", this.packageName);
        map.put(PlaceTypes.COUNTRY, getCountry());
        try {
            PackageInfo packageInfo = this.reactContext.getPackageManager().getPackageInfo(this.packageName, 0);
            map.put("currentVersion", packageInfo.versionName);
            map.put("currentBuildNumber", Integer.valueOf(packageInfo.versionCode));
            return map;
        } catch (PackageManager.NameNotFoundException unused) {
            map.put("currentVersion", null);
            map.put("currentBuildNumber", null);
            return map;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNVersionCheck";
    }
}
