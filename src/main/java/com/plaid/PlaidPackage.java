package com.plaid;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.y0;
import com.facebook.react.z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public class PlaidPackage extends y0 implements z0 {
    private Map<String, ModuleSpec> mViewManagers;

    private Map<String, ModuleSpec> getViewManagersMap(ReactApplicationContext reactApplicationContext) {
        if (this.mViewManagers == null) {
            HashMap mapB = jn.c.b();
            mapB.put(PLKEmbeddedViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Provider<NativeModule>() { // from class: com.plaid.PlaidPackage.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // javax.inject.Provider
                public NativeModule get() {
                    return new PLKEmbeddedViewManager();
                }
            }));
            this.mViewManagers = mapB;
        }
        return this.mViewManagers;
    }

    @Override // com.facebook.react.z0
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = getViewManagersMap(reactApplicationContext).get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (str.equals("PlaidAndroid")) {
            return new PlaidModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        try {
            return (yn.a) Class.forName("com.plaid.PlaidPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new yn.a() { // from class: com.plaid.PlaidPackage.2
                @Override // yn.a
                public Map<String, ReactModuleInfo> getReactModuleInfos() {
                    HashMap map = new HashMap();
                    Class cls = new Class[]{PlaidModule.class}[0];
                    xn.a aVar = (xn.a) cls.getAnnotation(xn.a.class);
                    map.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), false));
                    return map;
                }
            };
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new RuntimeException("No ReactModuleInfoProvider for com.plaid.PlaidPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("No ReactModuleInfoProvider for com.plaid.PlaidPackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // com.facebook.react.a
    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).values());
    }

    @Override // com.facebook.react.z0
    public List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).keySet());
    }
}
