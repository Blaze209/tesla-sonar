package com.facebook.react;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public class e extends com.facebook.react.a implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, ModuleSpec> f22587a;

    class a implements yn.a {
        a() {
        }

        @Override // yn.a
        public Map<String, ReactModuleInfo> getReactModuleInfos() {
            return Collections.EMPTY_MAP;
        }
    }

    private Map<String, ModuleSpec> c() {
        if (this.f22587a == null) {
            HashMap map = new HashMap();
            map.put(DebuggingOverlayManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Provider() { // from class: com.facebook.react.d
                @Override // javax.inject.Provider
                public final Object get() {
                    return new DebuggingOverlayManager();
                }
            }));
            this.f22587a = map;
        }
        return this.f22587a;
    }

    @Override // com.facebook.react.z0
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = c().get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return null;
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        return new a();
    }

    @Override // com.facebook.react.z0
    public Collection<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return c().keySet();
    }

    @Override // com.facebook.react.a
    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(c().values());
    }
}
