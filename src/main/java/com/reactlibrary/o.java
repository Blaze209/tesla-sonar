package com.reactlibrary;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class o implements p0 {
    @Override // com.facebook.react.p0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new AdyenBridgeModule(reactApplicationContext), new GooglePayBridgeModule(reactApplicationContext), new AlipayBridgeModule(reactApplicationContext), new WeChatBridgeModule(reactApplicationContext), new CmbBridgeModule(reactApplicationContext), new UPPayBridgeModule(reactApplicationContext), new DlocalBridgeModule(reactApplicationContext), new KcpPayBridgeModule(reactApplicationContext));
    }

    @Override // com.facebook.react.p0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new BacsViewManager(), new BacsMandateViewManager(), new GooglePayButtonViewManager());
    }
}
