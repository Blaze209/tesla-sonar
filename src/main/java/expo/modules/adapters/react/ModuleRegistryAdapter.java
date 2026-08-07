package expo.modules.adapters.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.interfaces.Consumer;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.Package;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.ExpoBridgeModule;
import expo.modules.kotlin.KotlinInteropModuleRegistry;
import expo.modules.kotlin.ModulesProvider;
import expo.modules.kotlin.views.ViewWrapperDelegateHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class ModuleRegistryAdapter implements p0 {
    protected ReactModuleRegistryProvider mModuleRegistryProvider;
    protected ModulesProvider mModulesProvider;
    private NativeModulesProxy mModulesProxy;
    protected ReactAdapterPackage mReactAdapterPackage = new ReactAdapterPackage();
    private List<ViewWrapperDelegateHolder> mWrapperDelegateHolders = null;
    private FabricComponentsRegistry mFabricComponentsRegistry = null;

    public ModuleRegistryAdapter(List<Package> list) {
        this.mModuleRegistryProvider = new ReactModuleRegistryProvider(list, null);
    }

    private synchronized NativeModulesProxy getOrCreateNativeModulesProxy(ReactApplicationContext reactApplicationContext, ModuleRegistry moduleRegistry) {
        try {
            NativeModulesProxy nativeModulesProxy = this.mModulesProxy;
            if (nativeModulesProxy != null && nativeModulesProxy.getReactContext() != reactApplicationContext) {
                setModulesProxy(null);
            }
            if (this.mModulesProxy == null) {
                ModuleRegistry moduleRegistry2 = moduleRegistry != null ? moduleRegistry : this.mModuleRegistryProvider.get(reactApplicationContext);
                ModulesProvider modulesProvider = this.mModulesProvider;
                if (modulesProvider != null) {
                    setModulesProxy(new NativeModulesProxy(reactApplicationContext, moduleRegistry2, modulesProvider));
                } else {
                    setModulesProxy(new NativeModulesProxy(reactApplicationContext, moduleRegistry2));
                }
            }
            if (moduleRegistry != null && moduleRegistry != this.mModulesProxy.getModuleRegistry()) {
                CoreLoggerKt.getLogger().error("❌ NativeModuleProxy was configured with a different instance of the modules registry.", null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.mModulesProxy;
    }

    private void setModulesProxy(NativeModulesProxy nativeModulesProxy) {
        this.mModulesProxy = nativeModulesProxy;
        if (nativeModulesProxy != null) {
            nativeModulesProxy.getKotlinInteropModuleRegistry().setLegacyModulesProxy(this.mModulesProxy);
        }
    }

    @Override // com.facebook.react.p0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        NativeModulesProxy orCreateNativeModulesProxy = getOrCreateNativeModulesProxy(reactApplicationContext, null);
        ModuleRegistry moduleRegistry = orCreateNativeModulesProxy.getModuleRegistry();
        Iterator<InternalModule> it = this.mReactAdapterPackage.createInternalModules(reactApplicationContext).iterator();
        while (it.hasNext()) {
            moduleRegistry.registerInternalModule(it.next());
        }
        List<NativeModule> nativeModulesFromModuleRegistry = getNativeModulesFromModuleRegistry(reactApplicationContext, moduleRegistry, null);
        if (this.mWrapperDelegateHolders != null) {
            orCreateNativeModulesProxy.getKotlinInteropModuleRegistry().updateModuleHoldersInViewManagers(this.mWrapperDelegateHolders);
        }
        return nativeModulesFromModuleRegistry;
    }

    @Override // com.facebook.react.p0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList(this.mModuleRegistryProvider.getReactViewManagers(reactApplicationContext));
        NativeModulesProxy orCreateNativeModulesProxy = getOrCreateNativeModulesProxy(reactApplicationContext, null);
        Objects.requireNonNull(orCreateNativeModulesProxy);
        KotlinInteropModuleRegistry kotlinInteropModuleRegistry = orCreateNativeModulesProxy.getKotlinInteropModuleRegistry();
        List<ViewManager<?, ?>> listExportViewManagers = kotlinInteropModuleRegistry.exportViewManagers();
        this.mWrapperDelegateHolders = kotlinInteropModuleRegistry.extractViewManagersDelegateHolders(listExportViewManagers);
        arrayList.addAll(listExportViewManagers);
        return arrayList;
    }

    @Override // com.facebook.react.p0
    public /* bridge */ /* synthetic */ NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return super.getModule(str, reactApplicationContext);
    }

    protected List<NativeModule> getNativeModulesFromModuleRegistry(ReactApplicationContext reactApplicationContext, ModuleRegistry moduleRegistry, Consumer<AppContext> consumer) {
        ArrayList arrayList = new ArrayList(2);
        NativeModulesProxy orCreateNativeModulesProxy = getOrCreateNativeModulesProxy(reactApplicationContext, moduleRegistry);
        if (consumer != null) {
            consumer.apply(orCreateNativeModulesProxy.getKotlinInteropModuleRegistry().getAppContext());
        }
        arrayList.add(orCreateNativeModulesProxy);
        arrayList.add(new ModuleRegistryReadyNotifier(moduleRegistry));
        Iterator<p0> it = ((ReactPackagesProvider) moduleRegistry.getModule(ReactPackagesProvider.class)).getReactPackages().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().createNativeModules(reactApplicationContext));
        }
        arrayList.add(new ExpoBridgeModule(reactApplicationContext, new WeakReference(orCreateNativeModulesProxy)));
        return arrayList;
    }

    public ModuleRegistryAdapter(ReactModuleRegistryProvider reactModuleRegistryProvider) {
        this.mModuleRegistryProvider = reactModuleRegistryProvider;
    }

    public ModuleRegistryAdapter(ReactModuleRegistryProvider reactModuleRegistryProvider, ModulesProvider modulesProvider) {
        this.mModuleRegistryProvider = reactModuleRegistryProvider;
        this.mModulesProvider = modulesProvider;
    }
}
