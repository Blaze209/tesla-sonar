package com.facebook.react;

import android.app.Application;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 {
    private final Application mApplication;
    private j0 mReactInstanceManager;

    class a implements jn.i {
        a() {
        }

        @Override // jn.i
        public jn.h d(String str) {
            return null;
        }
    }

    protected o0(Application application) {
        this.mApplication = application;
    }

    public static /* synthetic */ UIManager a(ReactApplicationContext reactApplicationContext) {
        return null;
    }

    public synchronized void clear() {
        j0 j0Var = this.mReactInstanceManager;
        if (j0Var != null) {
            j0Var.O();
            this.mReactInstanceManager = null;
        }
    }

    protected j0 createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        m0 baseReactInstanceManagerBuilder = getBaseReactInstanceManagerBuilder();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return baseReactInstanceManagerBuilder.b();
    }

    protected final Application getApplication() {
        return this.mApplication;
    }

    protected m0 getBaseReactInstanceManagerBuilder() {
        m0 m0VarQ = j0.v().d(this.mApplication).n(getJSMainModuleName()).w(getUseDeveloperSupport()).h(getDevSupportManagerFactory()).g(getDevLoadingViewManager()).t(getShouldRequireActivity()).u(getSurfaceDelegateFactory()).m(getJSExceptionHandler()).p(getLazyViewManagersEnabled()).s(getRedBoxHandler()).o(getJavaScriptExecutorFactory()).v(getUIManagerProvider()).i(LifecycleState.BEFORE_CREATE).r(getReactPackageTurboModuleManagerDelegateBuilder()).l(getJSEngineResolutionAlgorithm()).f(getChoreographerProvider()).q(getPausedInDebuggerOverlayManager());
        Iterator<p0> it = getPackages().iterator();
        while (it.hasNext()) {
            m0VarQ.a(it.next());
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile != null) {
            m0VarQ.j(jSBundleFile);
            return m0VarQ;
        }
        m0VarQ.e((String) gn.a.c(getBundleAssetName()));
        return m0VarQ;
    }

    protected String getBundleAssetName() {
        return "index.android.bundle";
    }

    protected sn.b getChoreographerProvider() {
        return null;
    }

    protected pn.c getDevLoadingViewManager() {
        return null;
    }

    protected com.facebook.react.devsupport.f0 getDevSupportManagerFactory() {
        return null;
    }

    protected String getJSBundleFile() {
        return null;
    }

    protected f getJSEngineResolutionAlgorithm() {
        return null;
    }

    protected JSExceptionHandler getJSExceptionHandler() {
        return null;
    }

    protected String getJSMainModuleName() {
        return "index.android";
    }

    protected JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    public boolean getLazyViewManagersEnabled() {
        return false;
    }

    protected abstract List<p0> getPackages();

    protected pn.i getPausedInDebuggerOverlayManager() {
        return null;
    }

    public synchronized j0 getReactInstanceManager() {
        try {
            if (this.mReactInstanceManager == null) {
                ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
                this.mReactInstanceManager = createReactInstanceManager();
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.mReactInstanceManager;
    }

    protected v0.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    protected pn.j getRedBoxHandler() {
        return null;
    }

    public boolean getShouldRequireActivity() {
        return true;
    }

    public jn.i getSurfaceDelegateFactory() {
        return new a();
    }

    protected UIManagerProvider getUIManagerProvider() {
        return new UIManagerProvider() { // from class: com.facebook.react.n0
            @Override // com.facebook.react.bridge.UIManagerProvider
            public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                return o0.a(reactApplicationContext);
            }
        };
    }

    public abstract boolean getUseDeveloperSupport();

    public synchronized boolean hasInstance() {
        return this.mReactInstanceManager != null;
    }
}
