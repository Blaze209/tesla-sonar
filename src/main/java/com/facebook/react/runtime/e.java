package com.facebook.react.runtime;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class e extends com.facebook.react.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pn.e f22999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final co.a f23000b;

    public e(pn.e eVar, co.a aVar) {
        this.f22999a = eVar;
        this.f23000b = aVar;
    }

    public static /* synthetic */ Map c(Map map) {
        return map;
    }

    private yn.a d() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceInfoModule.class, SourceCodeModule.class, DevMenuModule.class, DevSettingsModule.class, DeviceEventManagerModule.class, LogBoxModule.class, ExceptionsManagerModule.class};
        final HashMap map = new HashMap();
        for (int i11 = 0; i11 < 8; i11++) {
            Class cls = clsArr[i11];
            xn.a aVar = (xn.a) cls.getAnnotation(xn.a.class);
            if (aVar != null) {
                map.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.b(cls)));
            }
        }
        return new yn.a() { // from class: com.facebook.react.runtime.d
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return e.c(map);
            }
        };
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, this.f22999a);
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, this.f22999a);
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DevMenu":
                return new DevMenuModule(reactApplicationContext, this.f22999a);
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.f23000b);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(this.f22999a);
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            default:
                return null;
        }
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        if (!jn.a.a()) {
            return d();
        }
        try {
            return (yn.a) ((Class) gn.a.c(jn.a.b(e.class.getName() + "$$ReactModuleInfoProvider"))).newInstance();
        } catch (ClassNotFoundException unused) {
            return d();
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + e.class.getName() + "$$ReactModuleInfoProvider", e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + e.class.getName() + "$$ReactModuleInfoProvider", e12);
        }
    }
}
