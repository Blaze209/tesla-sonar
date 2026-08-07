package expo.modules.kotlin;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import expo.modules.core.logging.Logger;
import expo.modules.kotlin.defaultmodules.CoreModule;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.sharedobjects.ClassRegistry;
import expo.modules.kotlin.sharedobjects.SharedObjectRegistry;
import java.lang.ref.WeakReference;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u0004\u0018\u00010\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lexpo/modules/kotlin/RuntimeContext;", "", "Lexpo/modules/kotlin/AppContext;", "appContext", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContextHolder", "<init>", "(Lexpo/modules/kotlin/AppContext;Ljava/lang/ref/WeakReference;)V", "", "isJSIContextInitialized", "()Z", "", "source", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "eval", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "Ljn0/h0;", "installJSIContext", "()V", "deallocate", "Ljava/lang/ref/WeakReference;", "getReactContextHolder", "()Ljava/lang/ref/WeakReference;", "appContextHolder", "Lexpo/modules/kotlin/ModuleRegistry;", "registry", "Lexpo/modules/kotlin/ModuleRegistry;", "getRegistry", "()Lexpo/modules/kotlin/ModuleRegistry;", "Lexpo/modules/kotlin/jni/JSIContext;", "jsiContext", "Lexpo/modules/kotlin/jni/JSIContext;", "getJsiContext$expo_modules_core_release", "()Lexpo/modules/kotlin/jni/JSIContext;", "setJsiContext$expo_modules_core_release", "(Lexpo/modules/kotlin/jni/JSIContext;)V", "Lexpo/modules/kotlin/ModuleHolder;", "Lexpo/modules/kotlin/defaultmodules/CoreModule;", "coreModule", "Lexpo/modules/kotlin/ModuleHolder;", "getCoreModule$expo_modules_core_release", "()Lexpo/modules/kotlin/ModuleHolder;", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "getJniDeallocator", "()Lexpo/modules/kotlin/jni/JNIDeallocator;", "Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "sharedObjectRegistry", "Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "getSharedObjectRegistry$expo_modules_core_release", "()Lexpo/modules/kotlin/sharedobjects/SharedObjectRegistry;", "Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "classRegistry", "Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "getClassRegistry$expo_modules_core_release", "()Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RuntimeContext {
    private final WeakReference<AppContext> appContextHolder;
    private final ClassRegistry classRegistry;
    private final ModuleHolder<CoreModule> coreModule;
    private final JNIDeallocator jniDeallocator;
    public JSIContext jsiContext;
    private final WeakReference<ReactApplicationContext> reactContextHolder;
    private final ModuleRegistry registry;
    private final SharedObjectRegistry sharedObjectRegistry;

    public RuntimeContext(AppContext appContext, WeakReference<ReactApplicationContext> reactContextHolder) {
        s.k(appContext, "appContext");
        s.k(reactContextHolder, "reactContextHolder");
        this.reactContextHolder = reactContextHolder;
        this.appContextHolder = UtilsKt.weak(appContext);
        this.registry = new ModuleRegistry(UtilsKt.weak(this));
        CoreModule coreModule = new CoreModule();
        coreModule.set_runtimeContext$expo_modules_core_release(this);
        this.coreModule = new ModuleHolder<>(coreModule);
        this.jniDeallocator = new JNIDeallocator(false, 1, null);
        this.sharedObjectRegistry = new SharedObjectRegistry(this);
        this.classRegistry = new ClassRegistry();
    }

    private final boolean isJSIContextInitialized() {
        return this.jsiContext != null;
    }

    public final void deallocate() {
        ((CoreModule) this.coreModule.getModule()).set_runtimeContext$expo_modules_core_release(null);
        this.jniDeallocator.deallocate$expo_modules_core_release();
    }

    public final JavaScriptValue eval(String source) {
        s.k(source, "source");
        return getJsiContext$expo_modules_core_release().evaluateScript(source);
    }

    public final AppContext getAppContext() {
        return this.appContextHolder.get();
    }

    /* JADX INFO: renamed from: getClassRegistry$expo_modules_core_release, reason: from getter */
    public final ClassRegistry getClassRegistry() {
        return this.classRegistry;
    }

    public final ModuleHolder<CoreModule> getCoreModule$expo_modules_core_release() {
        return this.coreModule;
    }

    public final JNIDeallocator getJniDeallocator() {
        return this.jniDeallocator;
    }

    public final JSIContext getJsiContext$expo_modules_core_release() {
        JSIContext jSIContext = this.jsiContext;
        if (jSIContext != null) {
            return jSIContext;
        }
        s.B("jsiContext");
        return null;
    }

    public final ReactApplicationContext getReactContext() {
        return getReactContextHolder().get();
    }

    public final WeakReference<ReactApplicationContext> getReactContextHolder() {
        return this.reactContextHolder;
    }

    public final ModuleRegistry getRegistry() {
        return this.registry;
    }

    /* JADX INFO: renamed from: getSharedObjectRegistry$expo_modules_core_release, reason: from getter */
    public final SharedObjectRegistry getSharedObjectRegistry() {
        return this.sharedObjectRegistry;
    }

    public final void installJSIContext() {
        JavaScriptContextHolder javaScriptContextHolder;
        synchronized (this) {
            if (isJSIContextInitialized()) {
                Logger.warn$default(CoreLoggerKt.getLogger(), "⚠️ JSI interop was already installed", null, 2, null);
                return;
            }
            eb.a.c("[ExpoModulesCore] " + (this + ".installJSIContext"));
            try {
                try {
                    setJsiContext$expo_modules_core_release(new JSIContext());
                    ReactApplicationContext reactApplicationContext = getReactContextHolder().get();
                    if (reactApplicationContext != null && (javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder()) != null) {
                        Long lValueOf = Long.valueOf(javaScriptContextHolder.get());
                        if (lValueOf.longValue() == 0) {
                            lValueOf = null;
                        }
                        if (lValueOf == null) {
                            Logger.error$default(CoreLoggerKt.getLogger(), "❌ Cannot install JSI interop - JS runtime pointer is null", null, 2, null);
                        } else {
                            long jLongValue = lValueOf.longValue();
                            if (reactApplicationContext.isBridgeless()) {
                                JSIContext jsiContext$expo_modules_core_release = getJsiContext$expo_modules_core_release();
                                RuntimeExecutor runtimeExecutor = reactApplicationContext.getCatalystInstance().getRuntimeExecutor();
                                s.h(runtimeExecutor);
                                jsiContext$expo_modules_core_release.installJSIForBridgeless(this, jLongValue, runtimeExecutor);
                            } else {
                                JSIContext jsiContext$expo_modules_core_release2 = getJsiContext$expo_modules_core_release();
                                CallInvokerHolder jSCallInvokerHolder = reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
                                s.i(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
                                jsiContext$expo_modules_core_release2.installJSI(this, jLongValue, (CallInvokerHolderImpl) jSCallInvokerHolder);
                            }
                            CoreLoggerKt.getLogger().info("✅ JSI interop was installed");
                        }
                    }
                } catch (Throwable th2) {
                    CoreLoggerKt.getLogger().error("❌ Cannot install JSI interop: " + th2, th2);
                }
                h0 h0Var = h0.f84049a;
                eb.a.f();
            } catch (Throwable th3) {
                eb.a.f();
                throw th3;
            }
        }
    }

    public final void setJsiContext$expo_modules_core_release(JSIContext jSIContext) {
        s.k(jSIContext, "<set-?>");
        this.jsiContext = jSIContext;
    }
}
