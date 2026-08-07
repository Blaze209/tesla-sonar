package com.facebook.react.internal.turbomodule.core.interfaces;

import com.facebook.react.bridge.NativeModule;
import java.util.Collection;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;", "", "", "moduleName", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "", "hasModule", "(Ljava/lang/String;)Z", "Ljn0/h0;", "invalidate", "()V", "", "getModules", "()Ljava/util/Collection;", "modules", "", "getEagerInitModuleNames", "()Ljava/util/List;", "eagerInitModuleNames", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TurboModuleRegistry {
    List<String> getEagerInitModuleNames();

    NativeModule getModule(String moduleName);

    Collection<NativeModule> getModules();

    boolean hasModule(String moduleName);

    void invalidate();
}
