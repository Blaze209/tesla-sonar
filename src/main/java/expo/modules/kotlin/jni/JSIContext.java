package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.soloader.SoLoader;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.ModuleRegistry;
import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.defaultmodules.CoreModule;
import expo.modules.kotlin.sharedobjects.ClassRegistry;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedObjectId;
import expo.modules.kotlin.sharedobjects.SharedObjectRegistry;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 N2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001NB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0018J%\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u0086 ¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001fH\u0086 ¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b#\u0010\u0005J \u0010'\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001fH\u0086 ¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020\u001aH\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010)\u001a\u00020\u001aH\u0007¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a00H\u0007¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u0002032\u0006\u0010&\u001a\u00020\u001fH\u0007¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u0004\u0018\u00010\u001f2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b9\u0010:J#\u0010<\u001a\u00020\u000f2\n\u00104\u001a\u0006\u0012\u0002\b\u00030;2\u0006\u0010&\u001a\u00020\u001fH\u0007¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u0004\u0018\u00010\u001f2\n\u00104\u001a\u0006\u0012\u0002\b\u00030;H\u0007¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000fH\u0004¢\u0006\u0004\bB\u0010\u0005J\u000f\u0010C\u001a\u00020\u000fH\u0016¢\u0006\u0004\bC\u0010\u0005J\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010\u0005R(\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00160E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lexpo/modules/kotlin/jni/JSIContext;", "Lexpo/modules/kotlin/jni/Destructible;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "", "jsRuntimePointer", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "jsInvokerHolder", "Ljn0/h0;", "installJSI", "(JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "installJSIForBridgeless", "(JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/bridge/RuntimeExecutor;)V", "Lexpo/modules/kotlin/RuntimeContext;", "runtimeContext", "(Lexpo/modules/kotlin/RuntimeContext;JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V", "(Lexpo/modules/kotlin/RuntimeContext;JLcom/facebook/react/bridge/RuntimeExecutor;)V", "", "script", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "evaluateScript", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "global", "()Lexpo/modules/kotlin/jni/JavaScriptObject;", "createObject", "drainJSEventLoop", "", "id", "js", "setNativeStateForSharedObject", "(ILexpo/modules/kotlin/jni/JavaScriptObject;)V", "name", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "getJavaScriptModuleObject", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "", "hasModule", "(Ljava/lang/String;)Z", "", "getJavaScriptModulesName", "()[Ljava/lang/String;", "", "native", "registerSharedObject", "(Ljava/lang/Object;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getSharedObject", "(I)Lexpo/modules/kotlin/jni/JavaScriptObject;", "deleteSharedObject", "(I)V", "Ljava/lang/Class;", "registerClass", "(Ljava/lang/Class;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getJavascriptClass", "(Ljava/lang/Class;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "getCoreModuleObject", "()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "finalize", "deallocate", "close", "Ljava/lang/ref/WeakReference;", "runtimeContextHolder", "Ljava/lang/ref/WeakReference;", "getRuntimeContextHolder", "()Ljava/lang/ref/WeakReference;", "setRuntimeContextHolder", "(Ljava/lang/ref/WeakReference;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class JSIContext implements Destructible, AutoCloseable {

    @DoNotStrip
    private final HybridData mHybridData = initHybrid();
    public WeakReference<RuntimeContext> runtimeContextHolder;

    static {
        SoLoader.t("expo-modules-core");
    }

    private final native HybridData initHybrid();

    private final native void installJSI(long jsRuntimePointer, JNIDeallocator jniDeallocator, CallInvokerHolderImpl jsInvokerHolder);

    private final native void installJSIForBridgeless(long jsRuntimePointer, JNIDeallocator jniDeallocator, RuntimeExecutor runtimeExecutor);

    @Override // java.lang.AutoCloseable
    public void close() {
        deallocate();
    }

    public final native JavaScriptObject createObject();

    @Override // expo.modules.kotlin.jni.Destructible
    public void deallocate() {
        this.mHybridData.resetNative();
    }

    @DoNotStrip
    public final void deleteSharedObject(int id2) {
        SharedObjectRegistry sharedObjectRegistry;
        RuntimeContext runtimeContext = getRuntimeContextHolder().get();
        if (runtimeContext == null || (sharedObjectRegistry = runtimeContext.getSharedObjectRegistry()) == null) {
            return;
        }
        sharedObjectRegistry.m179deletekyJHjyY$expo_modules_core_release(SharedObjectId.m166constructorimpl(id2));
    }

    public final native void drainJSEventLoop();

    public final native JavaScriptValue evaluateScript(String script);

    protected final void finalize() {
        deallocate();
    }

    @DoNotStrip
    public final JavaScriptModuleObject_ getCoreModuleObject() {
        ModuleHolder<CoreModule> coreModule$expo_modules_core_release;
        RuntimeContext runtimeContext = getRuntimeContextHolder().get();
        if (runtimeContext == null || (coreModule$expo_modules_core_release = runtimeContext.getCoreModule$expo_modules_core_release()) == null) {
            return null;
        }
        return coreModule$expo_modules_core_release.getJsObject();
    }

    @DoNotStrip
    public final JavaScriptModuleObject_ getJavaScriptModuleObject(String name) {
        ModuleRegistry registry;
        ModuleHolder<?> moduleHolder;
        s.k(name, "name");
        RuntimeContext runtimeContext = getRuntimeContextHolder().get();
        if (runtimeContext == null || (registry = runtimeContext.getRegistry()) == null || (moduleHolder = registry.getModuleHolder(name)) == null) {
            return null;
        }
        return moduleHolder.getJsObject();
    }

    @DoNotStrip
    public final String[] getJavaScriptModulesName() {
        ModuleRegistry registry;
        Map<String, ModuleHolder<?>> registry2;
        Set<String> setKeySet;
        String[] strArr;
        RuntimeContext runtimeContext = getRuntimeContextHolder().get();
        return (runtimeContext == null || (registry = runtimeContext.getRegistry()) == null || (registry2 = registry.getRegistry()) == null || (setKeySet = registry2.keySet()) == null || (strArr = (String[]) setKeySet.toArray(new String[0])) == null) ? new String[0] : strArr;
    }

    @DoNotStrip
    public final JavaScriptObject getJavascriptClass(Class<?> cls) {
        ClassRegistry classRegistry;
        s.k(cls, "native");
        RuntimeContext runtimeContext = getRuntimeContextHolder().get();
        if (runtimeContext == null || (classRegistry = runtimeContext.getClassRegistry()) == null) {
            return null;
        }
        return classRegistry.toJavaScriptObject$expo_modules_core_release(cls);
    }

    public final WeakReference<RuntimeContext> getRuntimeContextHolder() {
        WeakReference<RuntimeContext> weakReference = this.runtimeContextHolder;
        if (weakReference != null) {
            return weakReference;
        }
        s.B("runtimeContextHolder");
        return null;
    }

    @DoNotStrip
    public final JavaScriptObject getSharedObject(int id2) {
        RuntimeContext runtimeContext = getRuntimeContextHolder().get();
        if (runtimeContext == null) {
            return null;
        }
        return SharedObjectId.m170toJavaScriptObjectNullimpl(SharedObjectId.m166constructorimpl(id2), runtimeContext);
    }

    public final native JavaScriptObject global();

    @DoNotStrip
    public final boolean hasModule(String name) {
        ModuleRegistry registry;
        s.k(name, "name");
        RuntimeContext runtimeContext = getRuntimeContextHolder().get();
        if (runtimeContext == null || (registry = runtimeContext.getRegistry()) == null) {
            return false;
        }
        return registry.hasModule(name);
    }

    public final void installJSI(RuntimeContext runtimeContext, long jsRuntimePointer, CallInvokerHolderImpl jsInvokerHolder) {
        s.k(runtimeContext, "runtimeContext");
        s.k(jsInvokerHolder, "jsInvokerHolder");
        setRuntimeContextHolder(UtilsKt.weak(runtimeContext));
        installJSI(jsRuntimePointer, runtimeContext.getJniDeallocator(), jsInvokerHolder);
    }

    public final void installJSIForBridgeless(RuntimeContext runtimeContext, long jsRuntimePointer, RuntimeExecutor runtimeExecutor) {
        s.k(runtimeContext, "runtimeContext");
        s.k(runtimeExecutor, "runtimeExecutor");
        setRuntimeContextHolder(UtilsKt.weak(runtimeContext));
        installJSIForBridgeless(jsRuntimePointer, runtimeContext.getJniDeallocator(), runtimeExecutor);
    }

    @DoNotStrip
    public final void registerClass(Class<?> cls, JavaScriptObject js2) {
        ClassRegistry classRegistry;
        s.k(cls, "native");
        s.k(js2, "js");
        RuntimeContext runtimeContext = getRuntimeContextHolder().get();
        if (runtimeContext == null || (classRegistry = runtimeContext.getClassRegistry()) == null) {
            return;
        }
        classRegistry.add$expo_modules_core_release(cls, js2);
    }

    @DoNotStrip
    public final void registerSharedObject(Object obj, JavaScriptObject js2) {
        SharedObjectRegistry sharedObjectRegistry;
        s.k(obj, "native");
        s.k(js2, "js");
        RuntimeContext runtimeContext = getRuntimeContextHolder().get();
        if (runtimeContext == null || (sharedObjectRegistry = runtimeContext.getSharedObjectRegistry()) == null) {
            return;
        }
        SharedObjectId.m165boximpl(sharedObjectRegistry.m178add5WKnsLU$expo_modules_core_release((SharedObject) obj, js2));
    }

    public final native void setNativeStateForSharedObject(int id2, JavaScriptObject js2);

    public final void setRuntimeContextHolder(WeakReference<RuntimeContext> weakReference) {
        s.k(weakReference, "<set-?>");
        this.runtimeContextHolder = weakReference;
    }
}
