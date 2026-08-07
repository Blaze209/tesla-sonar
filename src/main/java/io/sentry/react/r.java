package io.sentry.react;

import androidx.annotation.NonNull;
import c0.h0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.y0;
import io.sentry.react.replay.RNSentryReplayMaskManager;
import io.sentry.react.replay.RNSentryReplayUnmaskManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class r extends y0 {
    public static /* synthetic */ Map c() {
        HashMap map = new HashMap();
        map.put("RNSentry", new ReactModuleInfo("RNSentry", "RNSentry", false, false, true, false, false));
        return map;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    @NonNull
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return h0.a(new Object[]{new RNSentryOnDrawReporterManager(reactApplicationContext), new RNSentryReplayMaskManager(), new RNSentryReplayUnmaskManager()});
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if ("RNSentry".equals(str)) {
            return new RNSentryModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        return new yn.a() { // from class: io.sentry.react.q
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return r.c();
            }
        };
    }
}
