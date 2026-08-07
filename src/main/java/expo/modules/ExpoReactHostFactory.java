package expo.modules;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.a0;
import com.facebook.react.b0;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.defaults.DefaultComponentsRegistry;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.o0;
import com.facebook.react.p0;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSCInstance;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.facebook.react.v0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import expo.modules.core.interfaces.ReactNativeHostHandler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lexpo/modules/ExpoReactHostFactory;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/o0;", "reactNativeHost", "Lcom/facebook/react/a0;", "createFromReactNativeHost", "(Landroid/content/Context;Lcom/facebook/react/o0;)Lcom/facebook/react/a0;", "reactHost", "Lcom/facebook/react/a0;", "ExpoReactHostDelegate", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpoReactHostFactory {
    public static final ExpoReactHostFactory INSTANCE = new ExpoReactHostFactory();
    private static a0 reactHost;

    private ExpoReactHostFactory() {
    }

    public static final a0 createFromReactNativeHost(Context context, final o0 reactNativeHost) {
        s.k(context, "context");
        s.k(reactNativeHost, "reactNativeHost");
        if (!(reactNativeHost instanceof ReactNativeHostWrapper)) {
            throw new IllegalArgumentException("You can call createFromReactNativeHost only with instances of ReactNativeHostWrapper");
        }
        if (reactHost == null) {
            ReactNativeHostWrapper reactNativeHostWrapper = (ReactNativeHostWrapper) reactNativeHost;
            final boolean useDeveloperSupport = reactNativeHostWrapper.getUseDeveloperSupport();
            ExpoReactHostDelegate expoReactHostDelegate = new ExpoReactHostDelegate(new WeakReference(context), reactNativeHostWrapper, null, null, 12, null);
            ComponentFactory componentFactory = new ComponentFactory();
            DefaultComponentsRegistry.register(componentFactory);
            Iterator<T> it = reactNativeHostWrapper.getReactNativeHostHandlers().iterator();
            while (it.hasNext()) {
                ((ReactNativeHostHandler) it.next()).onWillCreateReactInstance(useDeveloperSupport);
            }
            ReactHostImpl reactHostImpl = new ReactHostImpl(context, expoReactHostDelegate, componentFactory, true, useDeveloperSupport);
            Iterator<T> it2 = reactNativeHostWrapper.getReactNativeHostHandlers().iterator();
            while (it2.hasNext()) {
                ((ReactNativeHostHandler) it2.next()).onDidCreateDevSupportManager(reactHostImpl.i());
            }
            reactHostImpl.c0(new b0() { // from class: expo.modules.ExpoReactHostFactory.createFromReactNativeHost.4
                @Override // com.facebook.react.b0
                public void onReactContextInitialized(ReactContext context2) {
                    s.k(context2, "context");
                    List<ReactNativeHostHandler> reactNativeHostHandlers = ((ReactNativeHostWrapper) reactNativeHost).getReactNativeHostHandlers();
                    boolean z11 = useDeveloperSupport;
                    Iterator<T> it3 = reactNativeHostHandlers.iterator();
                    while (it3.hasNext()) {
                        ((ReactNativeHostHandler) it3.next()).onDidCreateReactInstance(z11, context2);
                    }
                }
            });
            reactHost = reactHostImpl;
        }
        a0 a0Var = reactHost;
        s.i(a0Var, "null cannot be cast to non-null type com.facebook.react.ReactHost");
        return a0Var;
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lexpo/modules/ExpoReactHostFactory$ExpoReactHostDelegate;", "Lcom/facebook/react/runtime/f;", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "weakContext", "Lexpo/modules/ReactNativeHostWrapper;", "reactNativeHostWrapper", "Lcom/facebook/react/runtime/BindingsInstaller;", "bindingsInstaller", "Lcom/facebook/react/v0$a;", "turboModuleManagerDelegateBuilder", "<init>", "(Ljava/lang/ref/WeakReference;Lexpo/modules/ReactNativeHostWrapper;Lcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/v0$a;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", AnalyticsAttribute.Error, "Ljn0/h0;", "handleInstanceException", "(Ljava/lang/Exception;)V", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/ReactNativeHostWrapper;", "Lcom/facebook/react/runtime/BindingsInstaller;", "getBindingsInstaller", "()Lcom/facebook/react/runtime/BindingsInstaller;", "Lcom/facebook/react/v0$a;", "getTurboModuleManagerDelegateBuilder", "()Lcom/facebook/react/v0$a;", "Lcom/facebook/react/bridge/JSBundleLoader;", "_jsBundleLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "getJsBundleLoader", "()Lcom/facebook/react/bridge/JSBundleLoader;", "jsBundleLoader", "", "getJsMainModulePath", "()Ljava/lang/String;", "jsMainModulePath", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "getJsRuntimeFactory", "()Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "", "Lcom/facebook/react/p0;", "getReactPackages", "()Ljava/util/List;", "reactPackages", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ExpoReactHostDelegate implements com.facebook.react.runtime.f {
        private JSBundleLoader _jsBundleLoader;
        private final BindingsInstaller bindingsInstaller;
        private final ReactNativeHostWrapper reactNativeHostWrapper;
        private final v0.a turboModuleManagerDelegateBuilder;
        private final WeakReference<Context> weakContext;

        public ExpoReactHostDelegate(WeakReference<Context> weakContext, ReactNativeHostWrapper reactNativeHostWrapper, BindingsInstaller bindingsInstaller, v0.a turboModuleManagerDelegateBuilder) {
            s.k(weakContext, "weakContext");
            s.k(reactNativeHostWrapper, "reactNativeHostWrapper");
            s.k(turboModuleManagerDelegateBuilder, "turboModuleManagerDelegateBuilder");
            this.weakContext = weakContext;
            this.reactNativeHostWrapper = reactNativeHostWrapper;
            this.bindingsInstaller = bindingsInstaller;
            this.turboModuleManagerDelegateBuilder = turboModuleManagerDelegateBuilder;
        }

        @Override // com.facebook.react.runtime.f
        public BindingsInstaller getBindingsInstaller() {
            return this.bindingsInstaller;
        }

        @Override // com.facebook.react.runtime.f
        public JSBundleLoader getJsBundleLoader() {
            JSBundleLoader jSBundleLoader = this._jsBundleLoader;
            if (jSBundleLoader != null) {
                return jSBundleLoader;
            }
            Context context = this.weakContext.get();
            if (context == null) {
                throw new IllegalStateException("Unable to get concrete Context");
            }
            String jSBundleFile = this.reactNativeHostWrapper.getJSBundleFile();
            if (jSBundleFile != null) {
                if (t.b0(jSBundleFile, "assets://", false, 2, null)) {
                    JSBundleLoader jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(context, jSBundleFile, true);
                    s.j(jSBundleLoaderCreateAssetLoader, "createAssetLoader(...)");
                    return jSBundleLoaderCreateAssetLoader;
                }
                JSBundleLoader jSBundleLoaderCreateFileLoader = JSBundleLoader.createFileLoader(jSBundleFile);
                s.j(jSBundleLoaderCreateFileLoader, "createFileLoader(...)");
                return jSBundleLoaderCreateFileLoader;
            }
            JSBundleLoader jSBundleLoaderCreateAssetLoader2 = JSBundleLoader.createAssetLoader(context, "assets://" + this.reactNativeHostWrapper.getBundleAssetName(), true);
            s.j(jSBundleLoaderCreateAssetLoader2, "createAssetLoader(...)");
            return jSBundleLoaderCreateAssetLoader2;
        }

        @Override // com.facebook.react.runtime.f
        public String getJsMainModulePath() {
            return this.reactNativeHostWrapper.getJSMainModuleName();
        }

        @Override // com.facebook.react.runtime.f
        public JSRuntimeFactory getJsRuntimeFactory() {
            return this.reactNativeHostWrapper.getJSEngineResolutionAlgorithm() == com.facebook.react.f.HERMES ? new HermesInstance() : new JSCInstance();
        }

        @Override // com.facebook.react.runtime.f
        public List<p0> getReactPackages() {
            return this.reactNativeHostWrapper.getPackages();
        }

        @Override // com.facebook.react.runtime.f
        public v0.a getTurboModuleManagerDelegateBuilder() {
            return this.turboModuleManagerDelegateBuilder;
        }

        @Override // com.facebook.react.runtime.f
        public void handleInstanceException(Exception error) throws Exception {
            s.k(error, "error");
            List<ReactNativeHostHandler> reactNativeHostHandlers = this.reactNativeHostWrapper.getReactNativeHostHandlers();
            if (reactNativeHostHandlers.isEmpty()) {
                throw error;
            }
            boolean useDeveloperSupport = this.reactNativeHostWrapper.getUseDeveloperSupport();
            Iterator<T> it = reactNativeHostHandlers.iterator();
            while (it.hasNext()) {
                ((ReactNativeHostHandler) it.next()).onReactInstanceException(useDeveloperSupport, error);
            }
        }

        public /* synthetic */ ExpoReactHostDelegate(WeakReference weakReference, ReactNativeHostWrapper reactNativeHostWrapper, BindingsInstaller bindingsInstaller, v0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(weakReference, reactNativeHostWrapper, (i11 & 4) != 0 ? null : bindingsInstaller, (i11 & 8) != 0 ? new DefaultTurboModuleManagerDelegate.a() : aVar);
        }
    }
}
