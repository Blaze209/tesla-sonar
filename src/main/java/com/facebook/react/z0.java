package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collection;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000b\u001a\u0014\u0012\u0006\b\u0000\u0012\u00020\n\u0012\u0006\b\u0000\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/z0;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "", "getViewManagerNames", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Collection;", "viewManagerName", "Lcom/facebook/react/uimanager/ViewManager;", "", "createViewManager", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface z0 {
    ViewManager createViewManager(ReactApplicationContext reactContext, String viewManagerName);

    Collection<String> getViewManagerNames(ReactApplicationContext reactContext);
}
