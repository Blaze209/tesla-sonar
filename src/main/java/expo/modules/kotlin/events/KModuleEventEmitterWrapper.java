package expo.modules.kotlin.events;

import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JavaScriptModuleObject_;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.JSTypeConverterHelperKt;
import java.lang.ref.WeakReference;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u0019J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ)\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0010\u0010\u000f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001d"}, d2 = {"Lexpo/modules/kotlin/events/KModuleEventEmitterWrapper;", "Lexpo/modules/kotlin/events/KEventEmitterWrapper;", "Lexpo/modules/kotlin/ModuleHolder;", "moduleHolder", "Lexpo/modules/core/interfaces/services/EventEmitter;", "legacyEventEmitter", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContextHolder", "<init>", "(Lexpo/modules/kotlin/ModuleHolder;Lexpo/modules/core/interfaces/services/EventEmitter;Ljava/lang/ref/WeakReference;)V", "", "eventName", "", "", "eventBody", "Ljn0/h0;", "emitNative", "(Ljava/lang/String;Ljava/util/Map;)V", "checkIfEventWasExported", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "emit", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Lcom/facebook/react/bridge/WritableMap;", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lexpo/modules/kotlin/records/Record;", "(Ljava/lang/String;Lexpo/modules/kotlin/records/Record;)V", "Lexpo/modules/kotlin/ModuleHolder;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KModuleEventEmitterWrapper extends KEventEmitterWrapper {
    private final ModuleHolder<?> moduleHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KModuleEventEmitterWrapper(ModuleHolder<?> moduleHolder, expo.modules.core.interfaces.services.EventEmitter legacyEventEmitter, WeakReference<ReactApplicationContext> reactContextHolder) {
        super(legacyEventEmitter, reactContextHolder);
        s.k(moduleHolder, "moduleHolder");
        s.k(legacyEventEmitter, "legacyEventEmitter");
        s.k(reactContextHolder, "reactContextHolder");
        this.moduleHolder = moduleHolder;
    }

    private final void checkIfEventWasExported(String eventName) {
        String[] names;
        EventsDefinition eventsDefinition = this.moduleHolder.getDefinition().getEventsDefinition();
        if (eventsDefinition == null || (names = eventsDefinition.getNames()) == null || !n.e0(names, eventName)) {
            throw new IllegalArgumentException(("Unsupported event: " + eventName + ".").toString());
        }
    }

    private final void emitNative(String eventName, Map<String, ? extends Object> eventBody) throws Exception {
        RuntimeContext runtimeContext = this.moduleHolder.getModule().getRuntimeContext();
        JavaScriptModuleObject_ safeJSObject = this.moduleHolder.getSafeJSObject();
        if (safeJSObject == null) {
            return;
        }
        try {
            JNIUtils.INSTANCE.emitEvent(safeJSObject, runtimeContext.getJsiContext$expo_modules_core_release(), eventName, eventBody);
        } catch (Exception e11) {
            if (safeJSObject.isValid()) {
                throw e11;
            }
        }
    }

    @Override // expo.modules.kotlin.events.KEventEmitterWrapper, expo.modules.core.interfaces.services.EventEmitter
    public void emit(String eventName, Bundle eventBody) throws Exception {
        s.k(eventName, "eventName");
        checkIfEventWasExported(eventName);
        emitNative(eventName, eventBody != null ? JSTypeConverterHelperKt.toJSValueExperimental(eventBody) : null);
    }

    @Override // expo.modules.kotlin.events.KEventEmitterWrapper, expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, WritableMap eventBody) throws Exception {
        s.k(eventName, "eventName");
        checkIfEventWasExported(eventName);
        emitNative(eventName, eventBody != null ? eventBody.toHashMap() : null);
    }

    @Override // expo.modules.kotlin.events.KEventEmitterWrapper, expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, Record eventBody) throws Exception {
        s.k(eventName, "eventName");
        checkIfEventWasExported(eventName);
        emitNative(eventName, eventBody != null ? JSTypeConverterHelperKt.toJSValueExperimental(eventBody) : null);
    }

    @Override // expo.modules.kotlin.events.KEventEmitterWrapper, expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, Map<?, ?> eventBody) throws Exception {
        s.k(eventName, "eventName");
        checkIfEventWasExported(eventName);
        emitNative(eventName, eventBody != null ? JSTypeConverterHelperKt.toJSValueExperimental(eventBody) : null);
    }
}
