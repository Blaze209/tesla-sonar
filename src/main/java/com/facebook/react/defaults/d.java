package com.facebook.react.defaults;

import android.app.Application;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.a0;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManagerProviderImpl;
import com.facebook.react.o0;
import com.facebook.react.p0;
import com.facebook.react.runtime.JSCInstance;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.p1;
import com.facebook.react.uimanager.q1;
import com.facebook.react.v0;
import ezvcard.property.Kind;
import java.util.Collection;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/defaults/d;", "Lcom/facebook/react/o0;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/facebook/react/v0$a;", "getReactPackageTurboModuleManagerDelegateBuilder", "()Lcom/facebook/react/v0$a;", "Lcom/facebook/react/bridge/UIManagerProvider;", "getUIManagerProvider", "()Lcom/facebook/react/bridge/UIManagerProvider;", "Lcom/facebook/react/f;", "getJSEngineResolutionAlgorithm", "()Lcom/facebook/react/f;", "Ljn0/h0;", "clear", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "Lcom/facebook/react/a0;", "toReactHost$ReactAndroid_release", "(Landroid/content/Context;Lcom/facebook/react/runtime/JSRuntimeFactory;)Lcom/facebook/react/a0;", "toReactHost", "", "isNewArchEnabled", "()Z", "isHermesEnabled", "()Ljava/lang/Boolean;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class d extends o0 {

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0010\u001e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001Jw\u0010\b\u001ab\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u00128\u00126\u0012&\u0012$\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0007 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0007 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0007\u0018\u0001 \u0006*\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004¨\u0006\u00010\u0004¨\u0006\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ3\u0010\f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/facebook/react/defaults/d$a", "Lcom/facebook/react/uimanager/q1;", "", "viewManagerName", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "Lcom/facebook/react/uimanager/i0;", "b", "(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;", "", "", "a", "()Ljava/util/Collection;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements q1 {
        a() {
        }

        @Override // com.facebook.react.uimanager.q1
        public Collection<String> a() {
            return d.this.getReactInstanceManager().K();
        }

        @Override // com.facebook.react.uimanager.q1
        public ViewManager b(String viewManagerName) {
            s.k(viewManagerName, "viewManagerName");
            return d.this.getReactInstanceManager().A(viewManagerName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected d(Application application) {
        super(application);
        s.k(application, "application");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UIManager getUIManagerProvider$lambda$0(d dVar, ReactApplicationContext reactApplicationContext) {
        s.k(reactApplicationContext, "reactApplicationContext");
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        return new FabricUIManagerProviderImpl(componentFactory, dVar.getLazyViewManagersEnabled() ? new p1(dVar.new a()) : new p1(dVar.getReactInstanceManager().J(reactApplicationContext))).createUIManager(reactApplicationContext);
    }

    public static /* synthetic */ a0 toReactHost$ReactAndroid_release$default(d dVar, Context context, JSRuntimeFactory jSRuntimeFactory, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toReactHost");
        }
        if ((i11 & 2) != 0) {
            jSRuntimeFactory = null;
        }
        return dVar.toReactHost$ReactAndroid_release(context, jSRuntimeFactory);
    }

    @Override // com.facebook.react.o0
    public void clear() {
        super.clear();
        b.f22364a.f();
    }

    @Override // com.facebook.react.o0
    protected com.facebook.react.f getJSEngineResolutionAlgorithm() {
        Boolean boolIsHermesEnabled = isHermesEnabled();
        if (s.f(boolIsHermesEnabled, Boolean.TRUE)) {
            return com.facebook.react.f.HERMES;
        }
        if (s.f(boolIsHermesEnabled, Boolean.FALSE)) {
            return com.facebook.react.f.JSC;
        }
        if (boolIsHermesEnabled == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.facebook.react.o0
    protected v0.a getReactPackageTurboModuleManagerDelegateBuilder() {
        if (isNewArchEnabled()) {
            return new DefaultTurboModuleManagerDelegate.a();
        }
        return null;
    }

    @Override // com.facebook.react.o0
    protected UIManagerProvider getUIManagerProvider() {
        if (isNewArchEnabled()) {
            return new UIManagerProvider() { // from class: com.facebook.react.defaults.c
                @Override // com.facebook.react.bridge.UIManagerProvider
                public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                    return d.getUIManagerProvider$lambda$0(this.f22366a, reactApplicationContext);
                }
            };
        }
        return null;
    }

    protected Boolean isHermesEnabled() {
        return null;
    }

    protected boolean isNewArchEnabled() {
        return false;
    }

    public final a0 toReactHost$ReactAndroid_release(Context context, JSRuntimeFactory jsRuntimeFactory) {
        s.k(context, "context");
        if (jsRuntimeFactory == null) {
            jsRuntimeFactory = s.f(isHermesEnabled(), Boolean.FALSE) ? new JSCInstance() : new HermesInstance();
        }
        JSRuntimeFactory jSRuntimeFactory = jsRuntimeFactory;
        List<p0> packages = getPackages();
        s.j(packages, "getPackages(...)");
        String jSMainModuleName = getJSMainModuleName();
        s.j(jSMainModuleName, "getJSMainModuleName(...)");
        String bundleAssetName = getBundleAssetName();
        if (bundleAssetName == null) {
            bundleAssetName = "index";
        }
        return b.d(context, packages, jSMainModuleName, bundleAssetName, getJSBundleFile(), jSRuntimeFactory, getUseDeveloperSupport(), null, 128, null);
    }
}
