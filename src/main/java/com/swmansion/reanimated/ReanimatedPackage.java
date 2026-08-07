package com.swmansion.reanimated;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.j0;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.x;
import com.swmansion.worklets.WorkletsModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class ReanimatedPackage extends com.facebook.react.a implements p0 {
    public static /* synthetic */ Map c(Map map) {
        return map;
    }

    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        ep.a.c(0L, "createUIManagerModule");
        try {
            return ReanimatedUIManagerFactory.create(reactApplicationContext, getReactInstanceManager(reactApplicationContext).J(reactApplicationContext), -1);
        } finally {
            ep.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(@NonNull String str, @NonNull ReactApplicationContext reactApplicationContext) {
        str.getClass();
        switch (str) {
            case "WorkletsModule":
                return new WorkletsModule(reactApplicationContext);
            case "ReanimatedModule":
                return new ReanimatedModule(reactApplicationContext);
            case "UIManager":
                return createUIManager(reactApplicationContext);
            default:
                return null;
        }
    }

    public j0 getReactInstanceManager(ReactApplicationContext reactApplicationContext) {
        return ((x) reactApplicationContext.getApplicationContext()).d().getReactInstanceManager();
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        Class[] clsArr = {WorkletsModule.class, ReanimatedModule.class, ReanimatedUIManager.class};
        final HashMap map = new HashMap();
        for (int i11 = 0; i11 < 3; i11++) {
            Class cls = clsArr[i11];
            xn.a aVar = (xn.a) cls.getAnnotation(xn.a.class);
            Objects.requireNonNull(aVar);
            xn.a aVar2 = aVar;
            map.put(aVar2.name(), new ReactModuleInfo(aVar2.name(), cls.getName(), true, aVar2.needsEagerInit(), aVar2.isCxxModule(), false));
        }
        return new yn.a() { // from class: com.swmansion.reanimated.j
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return ReanimatedPackage.c(map);
            }
        };
    }
}
