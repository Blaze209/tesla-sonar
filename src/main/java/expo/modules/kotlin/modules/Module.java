package expo.modules.kotlin.modules;

import android.os.Bundle;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.ModuleRegistry;
import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.events.EventEmitter;
import expo.modules.kotlin.providers.AppContextProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.util.Map;
import jn0.m;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\u0004\b\t\u0010\rJ5\u0010\t\u001a\u00020\b\"\u0012\b\u0000\u0010\u0010*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\u0012JC\u0010\t\u001a\u00020\b\"\u0012\b\u0000\u0010\u0010*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R.\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b*\u0010$\u0012\u0004\b/\u0010\u0003\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u00101\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001eR\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/kotlin/providers/AppContextProvider;", "<init>", "()V", "", "name", "Landroid/os/Bundle;", "body", "Ljn0/h0;", "sendEvent", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "Lexpo/modules/kotlin/types/Enumerable;", "", "T", "enum", "(Ljava/lang/Enum;Landroid/os/Bundle;)V", "(Ljava/lang/Enum;Ljava/util/Map;)V", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/kotlin/RuntimeContext;", "_runtimeContext", "Lexpo/modules/kotlin/RuntimeContext;", "get_runtimeContext$expo_modules_core_release", "()Lexpo/modules/kotlin/RuntimeContext;", "set_runtimeContext$expo_modules_core_release", "(Lexpo/modules/kotlin/RuntimeContext;)V", "get_runtimeContext$expo_modules_core_release$annotations", "Lexpo/modules/kotlin/events/EventEmitter;", "moduleEventEmitter$delegate", "Lkotlin/Lazy;", "getModuleEventEmitter", "()Lexpo/modules/kotlin/events/EventEmitter;", "moduleEventEmitter", "Lkotlin/Lazy;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeDelegate", "getCoroutineScopeDelegate", "()Lkotlin/Lazy;", "setCoroutineScopeDelegate", "(Lkotlin/Lazy;)V", "getCoroutineScopeDelegate$annotations", "getRuntimeContext", "runtimeContext", "Lexpo/modules/kotlin/AppContext;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/kotlin/ModuleRegistry;", "getRegistry", "()Lexpo/modules/kotlin/ModuleRegistry;", "registry", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Module implements AppContextProvider {
    private RuntimeContext _runtimeContext;
    public Lazy<? extends CoroutineScope> coroutineScopeDelegate;

    /* JADX INFO: renamed from: moduleEventEmitter$delegate, reason: from kotlin metadata */
    private final Lazy moduleEventEmitter = m.b(new wn0.a() { // from class: expo.modules.kotlin.modules.a
        @Override // wn0.a
        public final Object invoke() {
            return Module.moduleEventEmitter_delegate$lambda$2(this.f63375a);
        }
    });

    public static /* synthetic */ void getCoroutineScopeDelegate$annotations() {
    }

    private final EventEmitter getModuleEventEmitter() {
        return (EventEmitter) this.moduleEventEmitter.getValue();
    }

    public static /* synthetic */ void get_runtimeContext$expo_modules_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventEmitter moduleEventEmitter_delegate$lambda$2(Module module) {
        return module.getAppContext().eventEmitter(module);
    }

    public static /* synthetic */ void sendEvent$default(Module module, String str, Bundle bundle, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
        if ((i11 & 2) != 0) {
            bundle = Bundle.EMPTY;
        }
        module.sendEvent(str, bundle);
    }

    public TypeConverterProvider converters() {
        return null;
    }

    public abstract ModuleDefinitionData definition();

    @Override // expo.modules.kotlin.providers.AppContextProvider
    public AppContext getAppContext() {
        RuntimeContext runtimeContext = this._runtimeContext;
        AppContext appContext = runtimeContext != null ? runtimeContext.getAppContext() : null;
        if (appContext != null) {
            return appContext;
        }
        throw new IllegalArgumentException("You attempted to access the app context before the module was created. Defer accessing the context until after the module initializes.");
    }

    public final Lazy<CoroutineScope> getCoroutineScopeDelegate() {
        Lazy lazy = this.coroutineScopeDelegate;
        if (lazy != null) {
            return lazy;
        }
        s.B("coroutineScopeDelegate");
        return null;
    }

    public final ModuleRegistry getRegistry() {
        return getRuntimeContext().getRegistry();
    }

    public final RuntimeContext getRuntimeContext() {
        RuntimeContext runtimeContext = this._runtimeContext;
        if (runtimeContext != null) {
            return runtimeContext;
        }
        throw new IllegalArgumentException("The module wasn't created! You can't access the runtime context.");
    }

    /* JADX INFO: renamed from: get_runtimeContext$expo_modules_core_release, reason: from getter */
    public final RuntimeContext get_runtimeContext() {
        return this._runtimeContext;
    }

    public final void sendEvent(String name, Bundle body) {
        s.k(name, "name");
        EventEmitter moduleEventEmitter = getModuleEventEmitter();
        if (moduleEventEmitter != null) {
            moduleEventEmitter.emit(name, body);
        }
    }

    public final void setCoroutineScopeDelegate(Lazy<? extends CoroutineScope> lazy) {
        s.k(lazy, "<set-?>");
        this.coroutineScopeDelegate = lazy;
    }

    public final void set_runtimeContext$expo_modules_core_release(RuntimeContext runtimeContext) {
        this._runtimeContext = runtimeContext;
    }

    public static /* synthetic */ void sendEvent$default(Module module, Enum r11, Bundle bundle, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
        if ((i11 & 2) != 0) {
            bundle = Bundle.EMPTY;
        }
        module.sendEvent(r11, bundle);
    }

    public final void sendEvent(String name, Map<String, ? extends Object> body) {
        s.k(name, "name");
        s.k(body, "body");
        EventEmitter moduleEventEmitter = getModuleEventEmitter();
        if (moduleEventEmitter != null) {
            moduleEventEmitter.emit(name, body);
        }
    }

    public static /* synthetic */ void sendEvent$default(Module module, Enum r11, Map map, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
        if ((i11 & 2) != 0) {
            map = null;
        }
        module.sendEvent(r11, map);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;Landroid/os/Bundle;)V */
    public final void sendEvent(Enum r11, Bundle body) {
        s.k(r11, "enum");
        EventEmitter moduleEventEmitter = getModuleEventEmitter();
        if (moduleEventEmitter != null) {
            moduleEventEmitter.emit(ModuleUtilsKt.convertEnumToString(r11), body);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;)V */
    public final void sendEvent(Enum r11, Map body) {
        s.k(r11, "enum");
        EventEmitter moduleEventEmitter = getModuleEventEmitter();
        if (moduleEventEmitter != null) {
            moduleEventEmitter.emit(ModuleUtilsKt.convertEnumToString(r11), (Map<?, ?>) body);
        }
    }
}
