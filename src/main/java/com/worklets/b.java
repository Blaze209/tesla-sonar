package com.worklets;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.y0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class b extends y0 {
    public static /* synthetic */ Map c() {
        HashMap map = new HashMap();
        xn.a aVar = (xn.a) WorkletsModule.class.getAnnotation(xn.a.class);
        map.put(aVar.name(), new ReactModuleInfo(aVar.name(), WorkletsModule.class.getName(), true, aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(WorkletsModule.class)));
        return map;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(WorkletsModule.NAME)) {
            return new WorkletsModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        return new yn.a() { // from class: com.worklets.a
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return b.c();
            }
        };
    }
}
