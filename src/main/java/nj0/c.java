package nj0;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.y0;
import com.zoontek.rnpermissions.RNPermissionsModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class c extends y0 {
    public static /* synthetic */ Map c() {
        HashMap map = new HashMap();
        map.put("RNPermissions", new ReactModuleInfo("RNPermissions", "RNPermissions", false, false, true, false, false));
        return map;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNPermissions")) {
            return new RNPermissionsModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        return new yn.a() { // from class: nj0.b
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return c.c();
            }
        };
    }
}
