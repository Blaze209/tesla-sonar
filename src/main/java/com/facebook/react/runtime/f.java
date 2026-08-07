package com.facebook.react.runtime;

import com.facebook.react.bridge.JSBundleLoader;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lcom/facebook/react/runtime/f;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", AnalyticsAttribute.Error, "Ljn0/h0;", "handleInstanceException", "(Ljava/lang/Exception;)V", "", "getJsMainModulePath", "()Ljava/lang/String;", "jsMainModulePath", "Lcom/facebook/react/runtime/BindingsInstaller;", "getBindingsInstaller", "()Lcom/facebook/react/runtime/BindingsInstaller;", "bindingsInstaller", "", "Lcom/facebook/react/p0;", "getReactPackages", "()Ljava/util/List;", "reactPackages", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "getJsRuntimeFactory", "()Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "Lcom/facebook/react/bridge/JSBundleLoader;", "getJsBundleLoader", "()Lcom/facebook/react/bridge/JSBundleLoader;", "jsBundleLoader", "Lcom/facebook/react/v0$a;", "getTurboModuleManagerDelegateBuilder", "()Lcom/facebook/react/v0$a;", "turboModuleManagerDelegateBuilder", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface f {
    BindingsInstaller getBindingsInstaller();

    JSBundleLoader getJsBundleLoader();

    String getJsMainModulePath();

    JSRuntimeFactory getJsRuntimeFactory();

    List<com.facebook.react.p0> getReactPackages();

    com.facebook.react.v0.a getTurboModuleManagerDelegateBuilder();

    void handleInstanceException(Exception error);
}
