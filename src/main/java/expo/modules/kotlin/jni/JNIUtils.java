package expo.modules.kotlin.jni;

import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/kotlin/jni/JNIUtils;", "", "<init>", "()V", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JNIUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nH\u0087 ¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0087 ¢\u0006\u0004\b\r\u0010\u0011J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0087 ¢\u0006\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/kotlin/jni/JNIUtils$Companion;", "", "<init>", "()V", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "jsiThis", "Lexpo/modules/kotlin/jni/JSIContext;", "jsiContext", "", "eventName", "", "eventBody", "Ljn0/h0;", "emitEvent", "(Lexpo/modules/kotlin/jni/JavaScriptModuleObject;Lexpo/modules/kotlin/jni/JSIContext;Ljava/lang/String;Ljava/util/Map;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "", "(Lexpo/modules/kotlin/jni/JavaScriptObject;Lexpo/modules/kotlin/jni/JSIContext;Ljava/lang/String;Lkotlin/Array;)V", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "(Lexpo/modules/kotlin/jni/JavaScriptWeakObject;Lexpo/modules/kotlin/jni/JSIContext;Ljava/lang/String;Lkotlin/Array;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void emitEvent(JavaScriptModuleObject_ jsiThis, JSIContext jsiContext, String eventName, Map<String, ? extends Object> eventBody) {
            JNIUtils.emitEvent(jsiThis, jsiContext, eventName, eventBody);
        }

        private Companion() {
        }

        public final void emitEvent(JavaScriptObject javaScriptObject, JSIContext jSIContext, String str, Object[] objArr) {
            JNIUtils.emitEvent(javaScriptObject, jSIContext, str, objArr);
        }

        public final void emitEvent(JavaScriptWeakObject javaScriptWeakObject, JSIContext jSIContext, String str, Object[] objArr) {
            JNIUtils.emitEvent(javaScriptWeakObject, jSIContext, str, objArr);
        }
    }

    public static final native void emitEvent(JavaScriptModuleObject_ javaScriptModuleObject_, JSIContext jSIContext, String str, Map<String, ? extends Object> map);

    public static final native void emitEvent(JavaScriptObject javaScriptObject, JSIContext jSIContext, String str, Object[] objArr);

    public static final native void emitEvent(JavaScriptWeakObject javaScriptWeakObject, JSIContext jSIContext, String str, Object[] objArr);
}
