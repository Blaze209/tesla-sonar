package com.reactnativekeyboardcontroller;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.com.reactnativekeyboardcontroller.ClippingScrollViewDecoratorViewManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/reactnativekeyboardcontroller/b;", "Lcom/facebook/react/a;", "<init>", "()V", "", "name", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;", "Lyn/a;", "getReactModuleInfoProvider", "()Lyn/a;", "", "Lcom/facebook/react/uimanager/ViewManager;", "createViewManagers", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.facebook.react.a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        HashMap map = new HashMap();
        map.put("KeyboardController", new ReactModuleInfo("KeyboardController", "KeyboardController", false, false, false, false));
        map.put("StatusBarManager", new ReactModuleInfo("StatusBarManager", "StatusBarManager", true, false, false, false));
        return map;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        return v.p(new KeyboardControllerViewManager(), new KeyboardGestureAreaViewManager(), new OverKeyboardViewManager(), new KeyboardBackgroundViewManager(), new ClippingScrollViewDecoratorViewManager(), new KeyboardToolbarGroupViewManager());
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        s.k(name, "name");
        s.k(reactContext, "reactContext");
        if (s.f(name, "KeyboardController")) {
            return new KeyboardControllerModule(reactContext);
        }
        if (s.f(name, "StatusBarManager")) {
            return new StatusBarManagerCompatModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        return new yn.a() { // from class: com.reactnativekeyboardcontroller.a
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return b.getReactModuleInfoProvider$lambda$0();
            }
        };
    }
}
