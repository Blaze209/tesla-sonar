package expo.modules.adapters.react;

import com.facebook.react.p0;
import expo.modules.core.interfaces.InternalModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ReactPackagesProvider implements InternalModule {
    private Collection<p0> mReactPackages = new ArrayList();

    public void addPackage(p0 p0Var) {
        this.mReactPackages.add(p0Var);
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<? extends Class> getExportedInterfaces() {
        return Collections.singletonList(ReactPackagesProvider.class);
    }

    public Collection<p0> getReactPackages() {
        return this.mReactPackages;
    }
}
