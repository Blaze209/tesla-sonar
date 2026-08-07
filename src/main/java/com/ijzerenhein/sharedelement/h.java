package com.ijzerenhein.sharedelement;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class h implements p0 {
    @Override // com.facebook.react.p0
    @NonNull
    public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new RNSharedElementModule(reactApplicationContext));
    }

    @Override // com.facebook.react.p0
    @NonNull
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new RNSharedElementTransitionManager(reactApplicationContext));
    }
}
