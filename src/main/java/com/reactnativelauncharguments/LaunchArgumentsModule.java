package com.reactnativelauncharguments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class LaunchArgumentsModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    LaunchArgumentsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void foo() {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Intent intent;
        HashMap map = new HashMap();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && (intent = currentActivity.getIntent()) != null) {
            Bundle bundleExtra = intent.getBundleExtra("launchArgs");
            if (bundleExtra != null) {
                for (String str : bundleExtra.keySet()) {
                    map.put(str, bundleExtra.getString(str));
                }
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str2 : extras.keySet()) {
                    if (!"launchArgs".equals(str2)) {
                        if (Serializable.class.isInstance(extras.get(str2))) {
                            map.put(str2, extras.get(str2));
                        } else {
                            map.put(str2, extras.getString(str2));
                        }
                    }
                }
            }
        }
        HashMap map2 = new HashMap();
        map2.put("value", map);
        return map2;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "LaunchArguments";
    }
}
