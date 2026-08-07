package expo.modules.kotlin.sharedobjects;

import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.sharedobjects.ClassRegistry;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fR2\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\t0\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/ClassRegistry;", "", "<init>", "()V", "Ljava/lang/Class;", "native", "Ljn0/h0;", "delete", "(Ljava/lang/Class;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "js", "add$expo_modules_core_release", "(Ljava/lang/Class;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "add", "toJavaScriptObject$expo_modules_core_release", "(Ljava/lang/Class;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "toJavaScriptObject", "", "pairs", "Ljava/util/Map;", "getPairs$expo_modules_core_release", "()Ljava/util/Map;", "setPairs$expo_modules_core_release", "(Ljava/util/Map;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClassRegistry {
    private Map<Class<?>, JavaScriptObject> pairs = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 add$lambda$0(ClassRegistry classRegistry, Class cls) {
        classRegistry.delete(cls);
        return h0.f84049a;
    }

    private final void delete(Class<?> cls) {
        this.pairs.remove(cls);
    }

    public final void add$expo_modules_core_release(final Class<?> cls, JavaScriptObject js2) {
        s.k(cls, "native");
        s.k(js2, "js");
        js2.defineDeallocator$expo_modules_core_release(new a() { // from class: wj0.a
            @Override // wn0.a
            public final Object invoke() {
                return ClassRegistry.add$lambda$0(this.f121981a, cls);
            }
        });
        this.pairs.put(cls, js2);
    }

    public final Map<Class<?>, JavaScriptObject> getPairs$expo_modules_core_release() {
        return this.pairs;
    }

    public final void setPairs$expo_modules_core_release(Map<Class<?>, JavaScriptObject> map) {
        s.k(map, "<set-?>");
        this.pairs = map;
    }

    public final JavaScriptObject toJavaScriptObject$expo_modules_core_release(Class<?> cls) {
        s.k(cls, "native");
        return this.pairs.get(cls);
    }
}
