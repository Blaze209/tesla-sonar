package com.swmansion.reanimated;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.x;

/* JADX INFO: loaded from: classes7.dex */
public class DevMenuUtils {
    public static void addDevMenuOption(ReactApplicationContext reactApplicationContext, pn.d dVar) {
        if (reactApplicationContext.getApplicationContext() instanceof x) {
            pn.e eVarI = reactApplicationContext.isBridgeless() ? ((x) reactApplicationContext.getApplicationContext()).e().i() : ((x) reactApplicationContext.getApplicationContext()).d().getReactInstanceManager().F();
            if (eVarI == null) {
                throw new RuntimeException("[Reanimated] DevSupportManager is not available");
            }
            eVarI.n("Toggle slow animations (Reanimated)", dVar);
        }
    }
}
