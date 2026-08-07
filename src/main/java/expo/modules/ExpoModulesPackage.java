package expo.modules;

import android.util.Log;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import expo.modules.adapters.react.ModuleRegistryAdapter;
import expo.modules.core.ModulePriorities;
import expo.modules.core.interfaces.Package;
import java.util.Comparator;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/ExpoModulesPackage;", "Lcom/facebook/react/p0;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "Lcom/facebook/react/uimanager/ViewManager;", "createViewManagers", "Lexpo/modules/adapters/react/ModuleRegistryAdapter;", "moduleRegistryAdapter", "Lexpo/modules/adapters/react/ModuleRegistryAdapter;", "getModuleRegistryAdapter", "()Lexpo/modules/adapters/react/ModuleRegistryAdapter;", "Companion", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpoModulesPackage implements p0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<List<Package>> packageList$delegate = jn0.m.b(new wn0.a() { // from class: expo.modules.a
        @Override // wn0.a
        public final Object invoke() {
            return ExpoModulesPackage.packageList_delegate$lambda$1();
        }
    });
    private final ModuleRegistryAdapter moduleRegistryAdapter = new ModuleRegistryAdapter(INSTANCE.getPackageList());

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lexpo/modules/ExpoModulesPackage$Companion;", "", "<init>", "()V", "packageList", "", "Lexpo/modules/core/interfaces/Package;", "getPackageList$annotations", "getPackageList", "()Ljava/util/List;", "packageList$delegate", "Lkotlin/Lazy;", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getPackageList$annotations() {
        }

        public final List<Package> getPackageList() {
            return (List) ExpoModulesPackage.packageList$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List packageList_delegate$lambda$1() {
        try {
            Object objInvoke = ExpoModulesPackageList.class.getMethod("getPackageList", null).invoke(null, null);
            s.i(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<expo.modules.core.interfaces.Package>");
            return v.a1((List) objInvoke, new Comparator() { // from class: expo.modules.ExpoModulesPackage$packageList_delegate$lambda$1$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    ModulePriorities modulePriorities = ModulePriorities.INSTANCE;
                    return mn0.a.d(Integer.valueOf(modulePriorities.get(o0.b(((Package) t12).getClass()).c())), Integer.valueOf(modulePriorities.get(o0.b(((Package) t11).getClass()).c())));
                }
            });
        } catch (Exception e11) {
            Log.e("ExpoModulesPackage", "Couldn't get expo package list.", e11);
            return v.m();
        }
    }

    @Override // com.facebook.react.p0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        List<NativeModule> listCreateNativeModules = this.moduleRegistryAdapter.createNativeModules(reactContext);
        s.j(listCreateNativeModules, "createNativeModules(...)");
        return listCreateNativeModules;
    }

    @Override // com.facebook.react.p0
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        List<ViewManager<?, ?>> listCreateViewManagers = this.moduleRegistryAdapter.createViewManagers(reactContext);
        s.j(listCreateViewManagers, "createViewManagers(...)");
        return listCreateViewManagers;
    }

    @Override // com.facebook.react.p0
    public /* bridge */ /* synthetic */ NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return super.getModule(str, reactApplicationContext);
    }

    public final ModuleRegistryAdapter getModuleRegistryAdapter() {
        return this.moduleRegistryAdapter;
    }
}
