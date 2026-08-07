package dk;

import androidx.annotation.NonNull;
import com.compassheading.CompassHeadingModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a implements p0 {
    @Override // com.facebook.react.p0
    @NonNull
    public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CompassHeadingModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.p0
    @NonNull
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
