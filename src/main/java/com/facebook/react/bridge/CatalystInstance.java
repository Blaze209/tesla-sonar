package com.facebook.react.bridge;

import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Collection;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@in.a
@jn0.e
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H'¢\u0006\u0004\b\u0017\u0010\u0006J)\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u0007\"\b\b\u0000\u0010\u0019*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH&¢\u0006\u0004\b \u0010!J)\u0010\"\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0019*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH&¢\u0006\u0004\b\"\u0010#J\u0019\u0010\"\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020\u0010H&¢\u0006\u0004\b\"\u0010%J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b.\u0010-J\u001f\u00101\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0010H&¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u0010H'¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u000207H'¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;H'¢\u0006\u0004\b=\u0010>J\u0011\u0010?\u001a\u0004\u0018\u00010;H'¢\u0006\u0004\b?\u0010@R\u001a\u0010E\u001a\u00020A8gX¦\u0004¢\u0006\f\u0012\u0004\bD\u0010\u0006\u001a\u0004\bB\u0010CR\u0016\u0010H\u001a\u0004\u0018\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\tR\u0014\u0010M\u001a\u00020J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001e0N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8gX¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0016\u0010Y\u001a\u0004\u0018\u00010V8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0016\u0010]\u001a\u0004\u0018\u00010Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/CatalystInstance;", "Lcom/facebook/react/bridge/MemoryPressureListener;", "Lcom/facebook/react/bridge/JSInstance;", "Lcom/facebook/react/bridge/JSBundleLoaderDelegate;", "Ljn0/h0;", "runJSBundle", "()V", "", "hasRunJSBundle", "()Z", "", "callbackID", "Lcom/facebook/react/bridge/NativeArrayInterface;", "arguments", "invokeCallback", "(ILcom/facebook/react/bridge/NativeArrayInterface;)V", "", "module", "method", "Lcom/facebook/react/bridge/NativeArray;", "callFunction", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V", "destroy", "initialize", "Lcom/facebook/react/bridge/JavaScriptModule;", "T", "Ljava/lang/Class;", "jsInterface", "getJSModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;", "Lcom/facebook/react/bridge/NativeModule;", "nativeModuleInterface", "hasNativeModule", "(Ljava/lang/Class;)Z", "getNativeModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "moduleName", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/bridge/NativeModuleRegistry;", "modules", "extendNativeModules", "(Lcom/facebook/react/bridge/NativeModuleRegistry;)V", "Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addBridgeIdleDebugListener", "(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V", "removeBridgeIdleDebugListener", "segmentId", "path", "registerSegment", "(ILjava/lang/String;)V", "propName", "jsonValue", "setGlobalVariable", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;", "turboModuleRegistry", "setTurboModuleRegistry", "(Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;)V", "Lcom/facebook/react/bridge/UIManager;", "fabricUIManager", "setFabricUIManager", "(Lcom/facebook/react/bridge/UIManager;)V", "getFabricUIManager", "()Lcom/facebook/react/bridge/UIManager;", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJSCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJSCallInvokerHolder$annotations", "jsCallInvokerHolder", "getSourceURL", "()Ljava/lang/String;", "sourceURL", "isDestroyed", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "getReactQueueConfiguration", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "reactQueueConfiguration", "", "getNativeModules", "()Ljava/util/Collection;", "nativeModules", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "javaScriptContextHolder", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getRuntimeExecutor", "()Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeScheduler;", "getRuntimeScheduler", "()Lcom/facebook/react/bridge/RuntimeScheduler;", "runtimeScheduler", "Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;", "getNativeMethodCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;", "nativeMethodCallInvokerHolder", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CatalystInstance extends MemoryPressureListener, JSInstance, JSBundleLoaderDelegate {
    static /* synthetic */ void getJSCallInvokerHolder$annotations() {
    }

    void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener listener);

    @in.a
    void callFunction(String module, String method, NativeArray arguments);

    void destroy();

    void extendNativeModules(NativeModuleRegistry modules);

    @jn0.e
    UIManager getFabricUIManager();

    @jn0.e
    CallInvokerHolder getJSCallInvokerHolder();

    <T extends JavaScriptModule> T getJSModule(Class<T> jsInterface);

    @jn0.e
    JavaScriptContextHolder getJavaScriptContextHolder();

    NativeMethodCallInvokerHolder getNativeMethodCallInvokerHolder();

    <T extends NativeModule> T getNativeModule(Class<T> nativeModuleInterface);

    NativeModule getNativeModule(String moduleName);

    Collection<NativeModule> getNativeModules();

    ReactQueueConfiguration getReactQueueConfiguration();

    RuntimeExecutor getRuntimeExecutor();

    RuntimeScheduler getRuntimeScheduler();

    String getSourceURL();

    <T extends NativeModule> boolean hasNativeModule(Class<T> nativeModuleInterface);

    boolean hasRunJSBundle();

    void initialize();

    @Override // com.facebook.react.bridge.JSInstance
    @in.a
    void invokeCallback(int callbackID, NativeArrayInterface arguments);

    boolean isDestroyed();

    void registerSegment(int segmentId, String path);

    void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener listener);

    void runJSBundle();

    @jn0.e
    void setFabricUIManager(UIManager fabricUIManager);

    void setGlobalVariable(String propName, String jsonValue);

    @jn0.e
    void setTurboModuleRegistry(TurboModuleRegistry turboModuleRegistry);
}
