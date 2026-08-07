package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v0 extends TurboModuleManagerDelegate {
    private final List<b> mModuleProviders;
    private final Map<b, Map<String, ReactModuleInfo>> mPackageModuleInfos;
    private List<p0> mPackages;
    private ReactApplicationContext mReactContext;
    private final boolean mShouldEnableLegacyModuleInterop;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<p0> f23437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ReactApplicationContext f23438b;

        public v0 a() {
            gn.a.d(this.f23438b, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            gn.a.d(this.f23437a, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
            return b(this.f23438b, this.f23437a);
        }

        protected abstract v0 b(ReactApplicationContext reactApplicationContext, List<p0> list);

        public a c(List<p0> list) {
            this.f23437a = new ArrayList(list);
            return this;
        }

        public a d(ReactApplicationContext reactApplicationContext) {
            this.f23438b = reactApplicationContext;
            return this;
        }
    }

    interface b {
        NativeModule getModule(String str);
    }

    protected v0(ReactApplicationContext reactApplicationContext, List<p0> list) {
        this.mModuleProviders = new ArrayList();
        this.mPackageModuleInfos = new HashMap();
        this.mShouldEnableLegacyModuleInterop = tn.b.c() && tn.b.q();
        initialize(reactApplicationContext, list);
    }

    public static /* synthetic */ NativeModule b(Map map, String str) {
        Provider provider = (Provider) map.get(str);
        if (provider != null) {
            return (NativeModule) provider.get();
        }
        return null;
    }

    private void initialize(final ReactApplicationContext reactApplicationContext, List<p0> list) {
        for (p0 p0Var : list) {
            if (p0Var instanceof com.facebook.react.a) {
                final com.facebook.react.a aVar = (com.facebook.react.a) p0Var;
                b bVar = new b() { // from class: com.facebook.react.s0
                    @Override // com.facebook.react.v0.b
                    public final NativeModule getModule(String str) {
                        return aVar.getModule(str, reactApplicationContext);
                    }
                };
                this.mModuleProviders.add(bVar);
                this.mPackageModuleInfos.put(bVar, aVar.getReactModuleInfoProvider().getReactModuleInfos());
            } else if (shouldSupportLegacyPackages() && (p0Var instanceof g)) {
                g gVar = (g) p0Var;
                List<ModuleSpec> listB = gVar.b(reactApplicationContext);
                final HashMap map = new HashMap();
                for (ModuleSpec moduleSpec : listB) {
                    map.put(moduleSpec.getName(), moduleSpec.getProvider());
                }
                b bVar2 = new b() { // from class: com.facebook.react.t0
                    @Override // com.facebook.react.v0.b
                    public final NativeModule getModule(String str) {
                        return v0.b(map, str);
                    }
                };
                this.mModuleProviders.add(bVar2);
                this.mPackageModuleInfos.put(bVar2, gVar.c().getReactModuleInfos());
            } else if (shouldSupportLegacyPackages()) {
                List<NativeModule> listCreateNativeModules = p0Var.createNativeModules(reactApplicationContext);
                final HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                for (NativeModule nativeModule : listCreateNativeModules) {
                    Class<?> cls = nativeModule.getClass();
                    xn.a aVar2 = (xn.a) cls.getAnnotation(xn.a.class);
                    String strName = aVar2 != null ? aVar2.name() : nativeModule.getName();
                    map3.put(strName, aVar2 != null ? new ReactModuleInfo(strName, cls.getName(), aVar2.canOverrideExistingModule(), true, aVar2.isCxxModule(), ReactModuleInfo.b(cls)) : new ReactModuleInfo(strName, cls.getName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), ReactModuleInfo.b(cls)));
                    map2.put(strName, nativeModule);
                }
                b bVar3 = new b() { // from class: com.facebook.react.u0
                    @Override // com.facebook.react.v0.b
                    public final NativeModule getModule(String str) {
                        return (NativeModule) map2.get(str);
                    }
                };
                this.mModuleProviders.add(bVar3);
                this.mPackageModuleInfos.put(bVar3, map3);
            }
        }
    }

    private boolean shouldSupportLegacyPackages() {
        return unstable_shouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public List<String> getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.mModuleProviders.iterator();
        while (it.hasNext()) {
            for (ReactModuleInfo reactModuleInfo : this.mPackageModuleInfos.get(it.next()).values()) {
                if (reactModuleInfo.getIsTurboModule() && reactModuleInfo.getNeedsEagerInit()) {
                    arrayList.add(reactModuleInfo.getName());
                }
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public NativeModule getLegacyModule(String str) {
        if (!unstable_shouldEnableLegacyModuleInterop()) {
            return null;
        }
        NativeModule nativeModule = null;
        for (b bVar : this.mModuleProviders) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(bVar).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.getIsTurboModule() && (nativeModule == null || reactModuleInfo.getCanOverrideExistingModule())) {
                NativeModule module = bVar.getModule(str);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return null;
        }
        return nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public TurboModule getModule(String str) {
        NativeModule nativeModule = null;
        for (b bVar : this.mModuleProviders) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(bVar).get(str);
            if (reactModuleInfo != null && reactModuleInfo.getIsTurboModule() && (nativeModule == null || reactModuleInfo.getCanOverrideExistingModule())) {
                NativeModule module = bVar.getModule(str);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return (TurboModule) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isLegacyModuleRegistered(String str) {
        Iterator<b> it = this.mModuleProviders.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(it.next()).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.getIsTurboModule()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isModuleRegistered(String str) {
        Iterator<b> it = this.mModuleProviders.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(it.next()).get(str);
            if (reactModuleInfo != null && reactModuleInfo.getIsTurboModule()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return this.mShouldEnableLegacyModuleInterop;
    }

    protected v0(ReactApplicationContext reactApplicationContext, List<p0> list, HybridData hybridData) {
        super(hybridData);
        this.mModuleProviders = new ArrayList();
        this.mPackageModuleInfos = new HashMap();
        this.mShouldEnableLegacyModuleInterop = tn.b.c() && tn.b.q();
        initialize(reactApplicationContext, list);
    }
}
