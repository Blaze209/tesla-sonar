package com.facebook.react.bridge.interop;

import com.facebook.react.bridge.JavaScriptModule;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import tn.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u0004\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\u0011\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0015\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/bridge/interop/InteropModuleRegistry;", "", "<init>", "()V", "", "checkReactFeatureFlagsConditions", "()Z", "Lcom/facebook/react/bridge/JavaScriptModule;", "T", "Ljava/lang/Class;", "requestedModule", "shouldReturnInteropModule", "(Ljava/lang/Class;)Z", "getInteropModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;", "interopModuleInterface", "interopModule", "Ljn0/h0;", "registerInteropModule", "(Ljava/lang/Class;Ljava/lang/Object;)V", "", "supportedModules", "Ljava/util/Map;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InteropModuleRegistry {
    private final Map<Class<?>, Object> supportedModules = new LinkedHashMap();

    private final boolean checkReactFeatureFlagsConditions() {
        return b.f() && b.n();
    }

    public final <T extends JavaScriptModule> T getInteropModule(Class<T> requestedModule) {
        s.k(requestedModule, "requestedModule");
        if (checkReactFeatureFlagsConditions()) {
            Object obj = this.supportedModules.get(requestedModule);
            if (obj instanceof JavaScriptModule) {
                return (T) obj;
            }
        }
        return null;
    }

    public final <T extends JavaScriptModule> void registerInteropModule(Class<T> interopModuleInterface, Object interopModule) {
        s.k(interopModuleInterface, "interopModuleInterface");
        s.k(interopModule, "interopModule");
        if (checkReactFeatureFlagsConditions()) {
            this.supportedModules.put(interopModuleInterface, interopModule);
        }
    }

    public final <T extends JavaScriptModule> boolean shouldReturnInteropModule(Class<T> requestedModule) {
        s.k(requestedModule, "requestedModule");
        return checkReactFeatureFlagsConditions() && this.supportedModules.containsKey(requestedModule);
    }
}
