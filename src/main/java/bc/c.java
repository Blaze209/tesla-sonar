package bc;

import cl.json.RNShare;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.y0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class c extends y0 {
    public static /* synthetic */ Map c() {
        HashMap map = new HashMap();
        map.put("RNShare", new ReactModuleInfo("RNShare", "RNShare", false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNShare")) {
            return new RNShare(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        return new yn.a() { // from class: bc.b
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return c.c();
            }
        };
    }
}
