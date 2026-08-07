package com.facebook.react.runtime;

import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.JavaScriptModuleRegistry;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
class b extends ReactApplicationContext implements com.facebook.react.uimanager.events.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactHostImpl f22981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<String> f22982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22983c;

    private static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReactHostImpl f22984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<? extends JavaScriptModule> f22985b;

        public a(ReactHostImpl reactHostImpl, Class<? extends JavaScriptModule> cls) {
            this.f22984a = reactHostImpl;
            this.f22985b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            this.f22984a.f0(JavaScriptModuleRegistry.getJSModuleName(this.f22985b), method.getName(), objArr != null ? Arguments.fromJavaArgs(objArr) : new WritableNativeArray());
            return null;
        }
    }

    b(Context context, ReactHostImpl reactHostImpl) {
        super(context);
        this.f22982b = new AtomicReference<>();
        this.f22983c = getClass().getSimpleName();
        this.f22981a = reactHostImpl;
        if (tn.b.n()) {
            initializeInteropModules();
        }
    }

    co.a b() {
        return this.f22981a.l0();
    }

    pn.e c() {
        return this.f22981a.i();
    }

    public void d(String str) {
        this.f22982b.set(str);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void emitDeviceEvent(String str, Object obj) {
        this.f22981a.f0("RCTDeviceEventEmitter", "emit", Arguments.fromJavaArgs(new Object[]{str, obj}));
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        Log.w(this.f22983c, "[WARNING] Bridgeless doesn't support CatalystInstance. Accessing an API that's not part of the new architecture is not encouraged usage.");
        return new BridgelessCatalystInstance(this.f22981a);
    }

    @Override // com.facebook.react.uimanager.events.h
    public EventDispatcher getEventDispatcher() {
        return this.f22981a.m0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public UIManager getFabricUIManager() {
        return this.f22981a.D0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.f22981a.n0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        return (interopModuleRegistry == null || !interopModuleRegistry.shouldReturnInteropModule(cls)) ? (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(this.f22981a, cls)) : (T) this.mInteropModuleRegistry.getInteropModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.f22981a.o0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return (T) this.f22981a.r0(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection<NativeModule> getNativeModules() {
        return this.f22981a.t0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        return this.f22982b.get();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        this.f22981a.E0(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.f22981a.G0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCatalystInstance() {
        return false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        return this.f22981a.F0(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.f22981a.G0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i11, String str, Callback callback) {
        this.f22981a.z1(i11, str, callback);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String str) {
        return this.f22981a.s0(str);
    }
}
