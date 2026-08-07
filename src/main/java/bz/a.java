package bz;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import com.lugg.RNCConfig.RNCConfigModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class a implements p0 {
    @Override // com.facebook.react.p0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNCConfigModule(reactApplicationContext));
    }

    @Override // com.facebook.react.p0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
