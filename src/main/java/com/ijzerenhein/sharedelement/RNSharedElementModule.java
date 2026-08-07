package com.ijzerenhein.sharedelement;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.z0;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = "RNSharedElementTransition")
public class RNSharedElementModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "RNSharedElementTransition";
    private final g mNodeManager;

    public RNSharedElementModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mNodeManager = new g(reactApplicationContext);
    }

    @ReactMethod
    public void configure(ReadableMap readableMap, Promise promise) {
        UIManagerModule uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class);
        final g gVar = this.mNodeManager;
        Objects.requireNonNull(gVar);
        uIManagerModule.prependUIBlock(new z0() { // from class: com.ijzerenhein.sharedelement.e
            @Override // com.facebook.react.uimanager.z0
            public final void execute(t tVar) {
                gVar.d(tVar);
            }
        });
        promise.resolve(Boolean.TRUE);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNSharedElementTransition";
    }

    g getNodeManager() {
        return this.mNodeManager;
    }
}
