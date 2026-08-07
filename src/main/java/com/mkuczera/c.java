package com.mkuczera;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.y0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class c extends y0 {
    public static /* synthetic */ Map c() {
        HashMap map = new HashMap();
        map.put("RNHapticFeedback", new ReactModuleInfo("RNHapticFeedback", "RNHapticFeedback", false, false, true, false, false));
        return map;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNHapticFeedback")) {
            return new RNReactNativeHapticFeedbackModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        return new yn.a() { // from class: com.mkuczera.b
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return c.c();
            }
        };
    }
}
