package expo.modules.kotlin.sharedobjects;

import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.types.JSTypeConverter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0011\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\"R(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObject;", "", "Lexpo/modules/kotlin/RuntimeContext;", "runtimeContext", "<init>", "(Lexpo/modules/kotlin/RuntimeContext;)V", "Lexpo/modules/kotlin/AppContext;", "appContext", "(Lexpo/modules/kotlin/AppContext;)V", "", "getSharedObjectId", "()I", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "getJavaScriptObject", "()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "", "eventName", "", "args", "Ljn0/h0;", "emit", "(Ljava/lang/String;[Ljava/lang/Object;)V", "onStartListeningToEvent", "(Ljava/lang/String;)V", "onStopListeningToEvent", "sharedObjectDidRelease", "()V", "deallocate", "getAdditionalMemoryPressure", "Lexpo/modules/kotlin/sharedobjects/SharedObjectId;", "sharedObjectId", "I", "getSharedObjectId-HSeVr_g$expo_modules_core_release", "setSharedObjectId-kyJHjyY$expo_modules_core_release", "(I)V", "Ljava/lang/ref/WeakReference;", "runtimeContextHolder", "Ljava/lang/ref/WeakReference;", "getRuntimeContextHolder", "()Ljava/lang/ref/WeakReference;", "setRuntimeContextHolder", "(Ljava/lang/ref/WeakReference;)V", "getRuntimeContext", "()Lexpo/modules/kotlin/RuntimeContext;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public class SharedObject {
    private WeakReference<RuntimeContext> runtimeContextHolder;
    private int sharedObjectId;

    /* JADX WARN: Multi-variable type inference failed */
    public SharedObject() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final JavaScriptWeakObject getJavaScriptObject() {
        int iM166constructorimpl = SharedObjectId.m166constructorimpl(this.sharedObjectId);
        RuntimeContext runtimeContext = getRuntimeContext();
        if (runtimeContext == null) {
            return null;
        }
        return SharedObjectId.m174toWeakJavaScriptObjectNullimpl(iM166constructorimpl, runtimeContext);
    }

    private final RuntimeContext getRuntimeContext() {
        return this.runtimeContextHolder.get();
    }

    @DoNotStrip
    private final int getSharedObjectId() {
        return this.sharedObjectId;
    }

    @e
    public void deallocate() {
    }

    public final void emit(String eventName, Object... args) {
        RuntimeContext runtimeContext;
        JSIContext jsiContext$expo_modules_core_release;
        s.k(eventName, "eventName");
        s.k(args, "args");
        JavaScriptWeakObject javaScriptObject = getJavaScriptObject();
        if (javaScriptObject == null || (runtimeContext = getRuntimeContext()) == null || (jsiContext$expo_modules_core_release = runtimeContext.getJsiContext$expo_modules_core_release()) == null) {
            return;
        }
        try {
            JNIUtils.Companion companion = JNIUtils.INSTANCE;
            ArrayList arrayList = new ArrayList(args.length);
            for (Object obj : args) {
                arrayList.add(JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, obj, null, false, 6, null));
            }
            companion.emitEvent(javaScriptObject, jsiContext$expo_modules_core_release, eventName, arrayList.toArray(new Object[0]));
        } catch (Throwable th2) {
            CoreLoggerKt.getLogger().error("Unable to send event '" + eventName + "' by shared object of type " + getClass().getSimpleName(), th2);
        }
    }

    public int getAdditionalMemoryPressure() {
        return 0;
    }

    public final AppContext getAppContext() {
        RuntimeContext runtimeContext = getRuntimeContext();
        if (runtimeContext != null) {
            return runtimeContext.getAppContext();
        }
        return null;
    }

    public final WeakReference<RuntimeContext> getRuntimeContextHolder() {
        return this.runtimeContextHolder;
    }

    /* JADX INFO: renamed from: getSharedObjectId-HSeVr_g$expo_modules_core_release, reason: not valid java name */
    public final int m163getSharedObjectIdHSeVr_g$expo_modules_core_release() {
        return this.sharedObjectId;
    }

    public void onStartListeningToEvent(String eventName) {
        s.k(eventName, "eventName");
    }

    public void onStopListeningToEvent(String eventName) {
        s.k(eventName, "eventName");
    }

    public final void setRuntimeContextHolder(WeakReference<RuntimeContext> weakReference) {
        s.k(weakReference, "<set-?>");
        this.runtimeContextHolder = weakReference;
    }

    /* JADX INFO: renamed from: setSharedObjectId-kyJHjyY$expo_modules_core_release, reason: not valid java name */
    public final void m164setSharedObjectIdkyJHjyY$expo_modules_core_release(int i11) {
        this.sharedObjectId = i11;
    }

    public void sharedObjectDidRelease() {
        deallocate();
    }

    public SharedObject(RuntimeContext runtimeContext) {
        this.sharedObjectId = SharedObjectId.m166constructorimpl(0);
        this.runtimeContextHolder = UtilsKt.weak(runtimeContext);
    }

    public /* synthetic */ SharedObject(RuntimeContext runtimeContext, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : runtimeContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedObject(AppContext appContext) {
        this(appContext.getHostingRuntimeContext());
        s.k(appContext, "appContext");
    }
}
