package com.facebook.react.defaults;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.p0;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.v0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u00100\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00102\n\u0010\u0016\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u0010\u0011\u001a\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u00100\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactHostDelegate;", "Lcom/facebook/react/runtime/f;", "", "jsMainModulePath", "Lcom/facebook/react/bridge/JSBundleLoader;", "jsBundleLoader", "", "Lcom/facebook/react/p0;", "reactPackages", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "Lcom/facebook/react/runtime/BindingsInstaller;", "bindingsInstaller", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljn0/h0;", "exceptionHandler", "Lcom/facebook/react/v0$a;", "turboModuleManagerDelegateBuilder", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/util/List;Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/runtime/BindingsInstaller;Lwn0/l;Lcom/facebook/react/v0$a;)V", AnalyticsAttribute.Error, "handleInstanceException", "(Ljava/lang/Exception;)V", "a", "Ljava/lang/String;", "getJsMainModulePath", "()Ljava/lang/String;", "b", "Lcom/facebook/react/bridge/JSBundleLoader;", "getJsBundleLoader", "()Lcom/facebook/react/bridge/JSBundleLoader;", "c", "Ljava/util/List;", "getReactPackages", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/runtime/JSRuntimeFactory;", "getJsRuntimeFactory", "()Lcom/facebook/react/runtime/JSRuntimeFactory;", "e", "Lcom/facebook/react/runtime/BindingsInstaller;", "getBindingsInstaller", "()Lcom/facebook/react/runtime/BindingsInstaller;", "f", "Lwn0/l;", "g", "Lcom/facebook/react/v0$a;", "getTurboModuleManagerDelegateBuilder", "()Lcom/facebook/react/v0$a;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultReactHostDelegate implements com.facebook.react.runtime.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String jsMainModulePath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JSBundleLoader jsBundleLoader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<p0> reactPackages;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final JSRuntimeFactory jsRuntimeFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final BindingsInstaller bindingsInstaller;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l<Exception, h0> exceptionHandler;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final v0.a turboModuleManagerDelegateBuilder;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultReactHostDelegate(String jsMainModulePath, JSBundleLoader jsBundleLoader, List<? extends p0> reactPackages, JSRuntimeFactory jsRuntimeFactory, BindingsInstaller bindingsInstaller, l<? super Exception, h0> exceptionHandler, v0.a turboModuleManagerDelegateBuilder) {
        s.k(jsMainModulePath, "jsMainModulePath");
        s.k(jsBundleLoader, "jsBundleLoader");
        s.k(reactPackages, "reactPackages");
        s.k(jsRuntimeFactory, "jsRuntimeFactory");
        s.k(exceptionHandler, "exceptionHandler");
        s.k(turboModuleManagerDelegateBuilder, "turboModuleManagerDelegateBuilder");
        this.jsMainModulePath = jsMainModulePath;
        this.jsBundleLoader = jsBundleLoader;
        this.reactPackages = reactPackages;
        this.jsRuntimeFactory = jsRuntimeFactory;
        this.bindingsInstaller = bindingsInstaller;
        this.exceptionHandler = exceptionHandler;
        this.turboModuleManagerDelegateBuilder = turboModuleManagerDelegateBuilder;
    }

    @Override // com.facebook.react.runtime.f
    public BindingsInstaller getBindingsInstaller() {
        return this.bindingsInstaller;
    }

    @Override // com.facebook.react.runtime.f
    public JSBundleLoader getJsBundleLoader() {
        return this.jsBundleLoader;
    }

    @Override // com.facebook.react.runtime.f
    public String getJsMainModulePath() {
        return this.jsMainModulePath;
    }

    @Override // com.facebook.react.runtime.f
    public JSRuntimeFactory getJsRuntimeFactory() {
        return this.jsRuntimeFactory;
    }

    @Override // com.facebook.react.runtime.f
    public List<p0> getReactPackages() {
        return this.reactPackages;
    }

    @Override // com.facebook.react.runtime.f
    public v0.a getTurboModuleManagerDelegateBuilder() {
        return this.turboModuleManagerDelegateBuilder;
    }

    @Override // com.facebook.react.runtime.f
    public void handleInstanceException(Exception error) {
        s.k(error, "error");
        this.exceptionHandler.invoke(error);
    }
}
