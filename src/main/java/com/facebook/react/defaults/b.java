package com.facebook.react.defaults;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.a0;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.p0;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jw\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00110\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0099\u0001\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00110\u00062\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001e\u0010\u0003R\u0018\u0010 \u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001f¨\u0006!"}, d2 = {"Lcom/facebook/react/defaults/b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lcom/facebook/react/p0;", "packageList", "", "jsMainModulePath", "jsBundleAssetPath", "jsBundleFilePath", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "", "useDevSupport", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReactContext;", "cxxReactPackageProviders", "Lcom/facebook/react/a0;", "b", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/runtime/JSRuntimeFactory;ZLjava/util/List;)Lcom/facebook/react/a0;", "Ljava/lang/Exception;", "Ljn0/h0;", "exceptionHandler", "Lcom/facebook/react/runtime/BindingsInstaller;", "bindingsInstaller", "c", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/runtime/JSRuntimeFactory;ZLjava/util/List;Lwn0/l;Lcom/facebook/react/runtime/BindingsInstaller;)Lcom/facebook/react/a0;", "f", "Lcom/facebook/react/a0;", "reactHost", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f22364a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static a0 reactHost;

    private b() {
    }

    public static final a0 b(Context context, List<? extends p0> packageList, String jsMainModulePath, String jsBundleAssetPath, String jsBundleFilePath, JSRuntimeFactory jsRuntimeFactory, boolean useDevSupport, List<? extends l<? super ReactContext, Object>> cxxReactPackageProviders) {
        s.k(context, "context");
        s.k(packageList, "packageList");
        s.k(jsMainModulePath, "jsMainModulePath");
        s.k(jsBundleAssetPath, "jsBundleAssetPath");
        s.k(cxxReactPackageProviders, "cxxReactPackageProviders");
        return c(context, packageList, jsMainModulePath, jsBundleAssetPath, jsBundleFilePath, jsRuntimeFactory, useDevSupport, cxxReactPackageProviders, new l() { // from class: com.facebook.react.defaults.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return b.e((Exception) obj);
            }
        }, null);
    }

    public static final a0 c(Context context, List<? extends p0> packageList, String jsMainModulePath, String jsBundleAssetPath, String jsBundleFilePath, JSRuntimeFactory jsRuntimeFactory, boolean useDevSupport, List<? extends l<? super ReactContext, Object>> cxxReactPackageProviders, l<? super Exception, h0> exceptionHandler, BindingsInstaller bindingsInstaller) {
        JSBundleLoader jSBundleLoaderCreateAssetLoader;
        s.k(context, "context");
        s.k(packageList, "packageList");
        s.k(jsMainModulePath, "jsMainModulePath");
        s.k(jsBundleAssetPath, "jsBundleAssetPath");
        s.k(cxxReactPackageProviders, "cxxReactPackageProviders");
        s.k(exceptionHandler, "exceptionHandler");
        if (reactHost == null) {
            if (jsBundleFilePath != null) {
                jSBundleLoaderCreateAssetLoader = t.b0(jsBundleFilePath, "assets://", false, 2, null) ? JSBundleLoader.createAssetLoader(context, jsBundleFilePath, true) : JSBundleLoader.createFileLoader(jsBundleFilePath);
            } else {
                jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(context, "assets://" + jsBundleAssetPath, true);
            }
            JSBundleLoader jSBundleLoader = jSBundleLoaderCreateAssetLoader;
            DefaultTurboModuleManagerDelegate.a aVar = new DefaultTurboModuleManagerDelegate.a();
            Iterator<T> it = cxxReactPackageProviders.iterator();
            while (it.hasNext()) {
                aVar.f((l) it.next());
            }
            s.h(jSBundleLoader);
            DefaultReactHostDelegate defaultReactHostDelegate = new DefaultReactHostDelegate(jsMainModulePath, jSBundleLoader, packageList, jsRuntimeFactory == null ? new HermesInstance() : jsRuntimeFactory, bindingsInstaller, exceptionHandler, aVar);
            ComponentFactory componentFactory = new ComponentFactory();
            DefaultComponentsRegistry.register(componentFactory);
            reactHost = new ReactHostImpl(context, defaultReactHostDelegate, componentFactory, true, useDevSupport);
        }
        a0 a0Var = reactHost;
        s.i(a0Var, "null cannot be cast to non-null type com.facebook.react.ReactHost");
        return a0Var;
    }

    public static /* synthetic */ a0 d(Context context, List list, String str, String str2, String str3, JSRuntimeFactory jSRuntimeFactory, boolean z11, List list2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "index";
        }
        if ((i11 & 8) != 0) {
            str2 = "index";
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        if ((i11 & 32) != 0) {
            jSRuntimeFactory = null;
        }
        if ((i11 & 64) != 0) {
            z11 = ln.a.DEBUG;
        }
        if ((i11 & 128) != 0) {
            list2 = v.m();
        }
        return b(context, list, str, str2, str3, jSRuntimeFactory, z11, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(Exception it) throws Exception {
        s.k(it, "it");
        throw it;
    }

    public final void f() {
        reactHost = null;
    }
}
