package expo.modules.kotlin;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import expo.modules.adapters.react.NativeModulesProxy;
import java.lang.ref.WeakReference;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/ExpoBridgeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/adapters/react/NativeModulesProxy;", "nativeModulesProxy", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/ref/WeakReference;)V", "", "waitMs", "", "retries", "Lkotlin/Function0;", "", "predicate", "Ljn0/h0;", "tryWaitSync", "(JILwn0/a;)V", "", "getName", "()Ljava/lang/String;", "installModules", "()Z", "Ljava/lang/ref/WeakReference;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpoBridgeModule extends ReactContextBaseJavaModule {
    private final WeakReference<NativeModulesProxy> nativeModulesProxy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpoBridgeModule(ReactApplicationContext reactContext, WeakReference<NativeModulesProxy> nativeModulesProxy) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        s.k(nativeModulesProxy, "nativeModulesProxy");
        this.nativeModulesProxy = nativeModulesProxy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean installModules$lambda$0(ExpoBridgeModule expoBridgeModule) {
        return expoBridgeModule.getReactApplicationContext().hasActiveReactInstance();
    }

    private final void tryWaitSync(long waitMs, int retries, wn0.a<Boolean> predicate) throws InterruptedException {
        for (int i11 = 0; i11 < retries && !predicate.invoke().booleanValue(); i11++) {
            Thread.sleep(waitMs);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ExpoModulesCore";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean installModules() throws InterruptedException {
        KotlinInteropModuleRegistry kotlinInteropModuleRegistry;
        tryWaitSync(100L, 10, new wn0.a() { // from class: expo.modules.kotlin.b
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(ExpoBridgeModule.installModules$lambda$0(this.f63351a));
            }
        });
        NativeModulesProxy nativeModulesProxy = this.nativeModulesProxy.get();
        if (nativeModulesProxy == null || (kotlinInteropModuleRegistry = nativeModulesProxy.getKotlinInteropModuleRegistry()) == null) {
            throw new IllegalStateException("Couldn't find KotlinInteropModuleRegistry");
        }
        kotlinInteropModuleRegistry.installJSIInterop();
        return true;
    }
}
