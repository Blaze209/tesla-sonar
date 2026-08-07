package expo.modules.kotlin;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.modules.ModuleDefinitionBuilderKt;
import expo.modules.kotlin.views.GroupViewManagerWrapper;
import expo.modules.kotlin.views.SimpleViewManagerWrapper;
import expo.modules.kotlin.views.ViewManagerDefinition;
import expo.modules.kotlin.views.ViewManagerType;
import expo.modules.kotlin.views.ViewManagerWrapperDelegate;
import expo.modules.kotlin.views.ViewWrapperDelegateHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u001d0\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00192\u0014\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a0\u0019¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u0019¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0016¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\u0016¢\u0006\u0004\b*\u0010(J\u0015\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lexpo/modules/kotlin/KotlinInteropModuleRegistry;", "", "Lexpo/modules/kotlin/ModulesProvider;", "modulesProvider", "Lexpo/modules/core/ModuleRegistry;", "legacyModuleRegistry", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lexpo/modules/kotlin/ModulesProvider;Lexpo/modules/core/ModuleRegistry;Ljava/lang/ref/WeakReference;)V", "", "name", "", "hasModule", "(Ljava/lang/String;)Z", "moduleName", "method", "Lcom/facebook/react/bridge/ReadableArray;", "arguments", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "callMethod", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lexpo/modules/kotlin/Promise;)V", "", "Lcom/facebook/react/uimanager/ViewManager;", "exportViewManagers", "()Ljava/util/List;", "", "viewManagersMetadata", "()Ljava/util/Map;", "viewManagers", "Lexpo/modules/kotlin/views/ViewWrapperDelegateHolder;", "extractViewManagersDelegateHolders", "(Ljava/util/List;)Ljava/util/List;", "viewWrapperHolders", "updateModuleHoldersInViewManagers", "(Ljava/util/List;)V", "onDestroy", "()V", "installJSIInterop", "emitOnCreate", "Lexpo/modules/adapters/react/NativeModulesProxy;", "proxyModule", "setLegacyModulesProxy", "(Lexpo/modules/adapters/react/NativeModulesProxy;)V", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/kotlin/AppContext;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "Lexpo/modules/kotlin/ModuleRegistry;", "getRegistry", "()Lexpo/modules/kotlin/ModuleRegistry;", "registry", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KotlinInteropModuleRegistry {
    private final AppContext appContext;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewManagerType.values().length];
            try {
                iArr[ViewManagerType.SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewManagerType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KotlinInteropModuleRegistry(ModulesProvider modulesProvider, expo.modules.core.ModuleRegistry legacyModuleRegistry, WeakReference<ReactApplicationContext> reactContext) {
        s.k(modulesProvider, "modulesProvider");
        s.k(legacyModuleRegistry, "legacyModuleRegistry");
        s.k(reactContext, "reactContext");
        this.appContext = new AppContext(modulesProvider, legacyModuleRegistry, reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleRegistry getRegistry() {
        return this.appContext.getHostingRuntimeContext().getRegistry();
    }

    public final void callMethod(String moduleName, String method, ReadableArray arguments, Promise promise) {
        s.k(moduleName, "moduleName");
        s.k(method, "method");
        s.k(arguments, "arguments");
        s.k(promise, "promise");
        try {
            ModuleHolder<?> moduleHolder = getRegistry().getModuleHolder(moduleName);
            if (moduleHolder != null) {
                Object[] array = arguments.toArrayList().toArray();
                s.j(array, "toArray(...)");
                moduleHolder.call(method, array, promise);
            } else {
                throw new IllegalArgumentException(("Trying to call '" + method + "' on the non-existing module '" + moduleName + "'").toString());
            }
        } catch (CodedException e11) {
            promise.reject(e11);
        } catch (Throwable th2) {
            promise.reject(new UnexpectedException(th2));
        }
    }

    public final void emitOnCreate() {
        this.appContext.onCreate();
    }

    public final List<ViewManager<?, ?>> exportViewManagers() {
        BaseViewManager simpleViewManagerWrapper;
        eb.a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.exportViewManagers");
        try {
            ModuleRegistry registry = getRegistry();
            ArrayList arrayList = new ArrayList();
            for (ModuleHolder<?> moduleHolder : registry) {
                Map<String, ViewManagerDefinition> viewManagerDefinitions = moduleHolder.getDefinition().getViewManagerDefinitions();
                ArrayList arrayList2 = new ArrayList(viewManagerDefinitions.size());
                for (Map.Entry<String, ViewManagerDefinition> entry : viewManagerDefinitions.entrySet()) {
                    String key = entry.getKey();
                    ViewManagerDefinition value = entry.getValue();
                    ViewManagerWrapperDelegate viewManagerWrapperDelegate = new ViewManagerWrapperDelegate(moduleHolder, value, s.f(key, ModuleDefinitionBuilderKt.DEFAULT_MODULE_VIEW) ? moduleHolder.getName() : null);
                    int i11 = WhenMappings.$EnumSwitchMapping$0[value.getViewManagerType().ordinal()];
                    if (i11 == 1) {
                        simpleViewManagerWrapper = new SimpleViewManagerWrapper(viewManagerWrapperDelegate);
                    } else {
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        simpleViewManagerWrapper = new GroupViewManagerWrapper(viewManagerWrapperDelegate);
                    }
                    arrayList2.add(simpleViewManagerWrapper);
                }
                v.E(arrayList, arrayList2);
            }
            eb.a.f();
            return arrayList;
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    public final List<ViewWrapperDelegateHolder> extractViewManagersDelegateHolders(List<? extends ViewManager<?, ?>> viewManagers) {
        s.k(viewManagers, "viewManagers");
        eb.a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.extractViewManagersDelegateHolders");
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : viewManagers) {
                if (obj instanceof ViewWrapperDelegateHolder) {
                    arrayList.add(obj);
                }
            }
            eb.a.f();
            return arrayList;
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    public final AppContext getAppContext() {
        return this.appContext;
    }

    public final boolean hasModule(String name) {
        s.k(name, "name");
        return getRegistry().hasModule(name);
    }

    public final void installJSIInterop() {
        this.appContext.installJSIInterop();
    }

    public final void onDestroy() {
        this.appContext.onDestroy$expo_modules_core_release();
        CoreLoggerKt.getLogger().info("✅ KotlinInteropModuleRegistry was destroyed");
    }

    public final void setLegacyModulesProxy(NativeModulesProxy proxyModule) {
        s.k(proxyModule, "proxyModule");
        this.appContext.setLegacyModulesProxyHolder$expo_modules_core_release(new WeakReference<>(proxyModule));
    }

    public final void updateModuleHoldersInViewManagers(List<? extends ViewWrapperDelegateHolder> viewWrapperHolders) {
        s.k(viewWrapperHolders, "viewWrapperHolders");
        eb.a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.updateModuleHoldersInViewManagers");
        try {
            List<? extends ViewWrapperDelegateHolder> list = viewWrapperHolders;
            ArrayList<ViewManagerWrapperDelegate> arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ViewWrapperDelegateHolder) it.next()).getViewWrapperDelegate());
            }
            for (ViewManagerWrapperDelegate viewManagerWrapperDelegate : arrayList) {
                ModuleHolder<?> moduleHolder = getRegistry().getModuleHolder(viewManagerWrapperDelegate.getModuleHolder$expo_modules_core_release().getName());
                if (moduleHolder == null) {
                    throw new IllegalArgumentException(("Cannot update the module holder for " + viewManagerWrapperDelegate.getModuleHolder$expo_modules_core_release().getName() + ".").toString());
                }
                viewManagerWrapperDelegate.setModuleHolder$expo_modules_core_release(moduleHolder);
            }
            h0 h0Var = h0.f84049a;
            eb.a.f();
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    public final Map<String, Map<String, Object>> viewManagersMetadata() {
        eb.a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.viewManagersMetadata");
        try {
            ModuleRegistry registry = getRegistry();
            ArrayList arrayList = new ArrayList();
            for (ModuleHolder<?> moduleHolder : registry) {
                Map<String, ViewManagerDefinition> viewManagerDefinitions = moduleHolder.getDefinition().getViewManagerDefinitions();
                ArrayList arrayList2 = new ArrayList(viewManagerDefinitions.size());
                for (Map.Entry<String, ViewManagerDefinition> entry : viewManagerDefinitions.entrySet()) {
                    String key = entry.getKey();
                    ViewManagerDefinition value = entry.getValue();
                    arrayList2.add(x.a(s.f(key, ModuleDefinitionBuilderKt.DEFAULT_MODULE_VIEW) ? moduleHolder.getName() : moduleHolder.getName() + "_" + key, v0.f(x.a("propsNames", value.getPropsNames()))));
                }
                v.E(arrayList, arrayList2);
            }
            return v0.y(arrayList);
        } finally {
            eb.a.f();
        }
    }
}
