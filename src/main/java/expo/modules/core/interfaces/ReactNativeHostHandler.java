package expo.modules.core.interfaces;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import pn.e;

/* JADX INFO: loaded from: classes8.dex */
public interface ReactNativeHostHandler {
    default String getBundleAssetName(boolean z11) {
        return null;
    }

    default Object getDevSupportManagerFactory() {
        return null;
    }

    default String getJSBundleFile(boolean z11) {
        return null;
    }

    default JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    default Boolean getUseDeveloperSupport() {
        return null;
    }

    default void onDidCreateReactInstance(boolean z11, ReactContext reactContext) {
    }

    default void onReactInstanceException(boolean z11, @NonNull Exception exc) {
    }

    default void onWillCreateReactInstance(boolean z11) {
    }

    default void onDidCreateDevSupportManager(@NonNull e eVar) {
    }
}
