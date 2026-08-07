package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.q1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class c extends com.facebook.react.a implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f22319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final co.a f22320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22322d;

    class a implements q1 {
        a() {
        }

        @Override // com.facebook.react.uimanager.q1
        public Collection<String> a() {
            return c.this.f22319a.K();
        }

        @Override // com.facebook.react.uimanager.q1
        public ViewManager b(String str) {
            return c.this.f22319a.A(str);
        }
    }

    public c(j0 j0Var, co.a aVar, boolean z11, int i11) {
        this.f22319a = j0Var;
        this.f22320b = aVar;
        this.f22321c = z11;
        this.f22322d = i11;
    }

    public static /* synthetic */ Map c(Map map) {
        return map;
    }

    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        ep.a.c(0L, "createUIManagerModule");
        try {
            return this.f22321c ? new UIManagerModule(reactApplicationContext, new a(), this.f22322d) : new UIManagerModule(reactApplicationContext, this.f22319a.J(reactApplicationContext), this.f22322d);
        } finally {
            ep.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    private yn.a e() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevMenuModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
        final HashMap map = new HashMap();
        for (int i11 = 0; i11 < 11; i11++) {
            Class cls = clsArr[i11];
            xn.a aVar = (xn.a) cls.getAnnotation(xn.a.class);
            map.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.b(cls)));
        }
        return new yn.a() { // from class: com.facebook.react.b
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return c.c(map);
            }
        };
    }

    @Override // com.facebook.react.r0
    public void a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // com.facebook.react.r0
    public void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, this.f22319a.F());
            case "Timing":
                return new TimingModule(reactApplicationContext, this.f22319a.F());
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, this.f22319a.F());
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DevMenu":
                return new DevMenuModule(reactApplicationContext, this.f22319a.F());
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.f22320b);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(this.f22319a.F());
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            case "HeadlessJsTaskSupport":
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case "UIManager":
                return createUIManager(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        if (!jn.a.a()) {
            return e();
        }
        try {
            return (yn.a) jn.a.b("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return e();
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e12);
        }
    }
}
