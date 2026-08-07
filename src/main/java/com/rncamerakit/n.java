package com.rncamerakit;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/rncamerakit/n;", "Lcom/facebook/react/y0;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/uimanager/ViewManager;", "createViewManagers", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "", "s", "reactApplicationContext", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;", "Lyn/a;", "getReactModuleInfoProvider", "()Lyn/a;", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends y0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        HashMap map = new HashMap();
        map.put(RNCameraKitModule.REACT_CLASS, new ReactModuleInfo(RNCameraKitModule.REACT_CLASS, RNCameraKitModule.REACT_CLASS, false, false, false, false));
        return map;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CKCameraManager(reactContext));
        return arrayList;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String s11, ReactApplicationContext reactApplicationContext) {
        s.k(s11, "s");
        s.k(reactApplicationContext, "reactApplicationContext");
        if (s.f(s11, RNCameraKitModule.REACT_CLASS)) {
            return new RNCameraKitModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        return new yn.a() { // from class: com.rncamerakit.m
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return n.getReactModuleInfoProvider$lambda$0();
            }
        };
    }
}
