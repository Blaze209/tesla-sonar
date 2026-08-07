package expo.modules.adapters.react;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ModuleRegistryProvider;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.SingletonModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ReactModuleRegistryProvider extends ModuleRegistryProvider {
    private Collection<ViewManager> mReactViewManagers;
    private Collection<SingletonModule> mSingletonModules;

    public ReactModuleRegistryProvider(List<Package> list) {
        this(list, null);
    }

    private Collection<SingletonModule> getSingletonModules(Context context) {
        Collection<SingletonModule> collection = this.mSingletonModules;
        if (collection != null) {
            return collection;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Package> it = getPackages().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().createSingletonModules(context));
        }
        return arrayList;
    }

    @Override // expo.modules.core.ModuleRegistryProvider
    public ModuleRegistry get(Context context) {
        ArrayList arrayList = new ArrayList();
        ReactPackagesProvider reactPackagesProvider = new ReactPackagesProvider();
        for (Package r11 : getPackages()) {
            arrayList.addAll(r11.createInternalModules(context));
            if (r11 instanceof p0) {
                reactPackagesProvider.addPackage((p0) r11);
            }
        }
        arrayList.add(reactPackagesProvider);
        return new ModuleRegistry(arrayList, getSingletonModules(context));
    }

    public Collection<ViewManager> getReactViewManagers(ReactApplicationContext reactApplicationContext) {
        Collection<ViewManager> collection = this.mReactViewManagers;
        if (collection != null) {
            return collection;
        }
        this.mReactViewManagers = new HashSet();
        for (Package r11 : getPackages()) {
            if (r11 instanceof p0) {
                this.mReactViewManagers.addAll(((p0) r11).createViewManagers(reactApplicationContext));
            }
        }
        return this.mReactViewManagers;
    }

    public ReactModuleRegistryProvider(List<Package> list, List<SingletonModule> list2) {
        super(list);
        this.mSingletonModules = list2;
    }
}
