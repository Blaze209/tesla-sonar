package expo.modules.kotlin.jni;

import com.adyen.checkout.components.core.Address;
import com.facebook.jni.HybridData;
import expo.modules.core.interfaces.DoNotStrip;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001:\u0001QB\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0012H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001f\u0010 J*\u0010!\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b!\u0010\"J*\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0082 ¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b-\u0010.J\u001a\u0010/\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b/\u0010.J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0086 ¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203H\u0086 ¢\u0006\u0004\b4\u00105J\u001d\u00109\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n06H\u0000¢\u0006\u0004\b7\u00108J\u0018\u0010;\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u0019H\u0086 ¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b=\u0010\fJ \u0010>\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b>\u0010\fJ\u001d\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0019¢\u0006\u0004\b=\u0010?J \u0010>\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0019H\u0086\u0002¢\u0006\u0004\b>\u0010?J\u001d\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b=\u0010\u000fJ \u0010>\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b>\u0010\u000fJ\u001f\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b=\u0010\u0011J\"\u0010>\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0086\u0002¢\u0006\u0004\b>\u0010\u0011J\u001f\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b=\u0010\u0014J\"\u0010>\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0012H\u0086\u0002¢\u0006\u0004\b>\u0010\u0014J\u001f\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b=\u0010\u0016J\"\u0010>\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0086\u0002¢\u0006\u0004\b>\u0010\u0016J\u001f\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\b=\u0010BJ\"\u0010>\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010@H\u0086\u0002¢\u0006\u0004\b>\u0010BJ-\u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020D0C¢\u0006\u0004\bE\u0010FJ-\u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020D0C¢\u0006\u0004\bE\u0010GJ-\u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020D0C¢\u0006\u0004\bE\u0010HJ/\u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020D0C¢\u0006\u0004\bE\u0010IJ/\u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020D0C¢\u0006\u0004\bE\u0010JJ/\u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00002\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020D0C¢\u0006\u0004\bE\u0010KJ/\u0010E\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010@2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020D0C¢\u0006\u0004\bE\u0010LJ\u000f\u0010M\u001a\u00020\nH\u0004¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010P¨\u0006R"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "name", "", "value", "Ljn0/h0;", "setBoolProperty", "(Ljava/lang/String;Z)V", "", "setDoubleProperty", "(Ljava/lang/String;D)V", "setStringProperty", "(Ljava/lang/String;Ljava/lang/String;)V", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "setJSValueProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;)V", "setJSObjectProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "unsetProperty", "(Ljava/lang/String;)V", "", "options", "defineBoolProperty", "(Ljava/lang/String;ZI)V", "defineDoubleProperty", "(Ljava/lang/String;DI)V", "defineStringProperty", "(Ljava/lang/String;Ljava/lang/String;I)V", "defineJSValueProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;I)V", "defineJSObjectProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;I)V", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "deallocator", "defineNativeDeallocator", "(Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "isValid", "()Z", "hasProperty", "(Ljava/lang/String;)Z", "getProperty", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "get", "", "getPropertyNames", "()[Ljava/lang/String;", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "createWeak", "()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "Lkotlin/Function0;", "defineDeallocator$expo_modules_core_release", "(Lwn0/a;)V", "defineDeallocator", "size", "setExternalMemoryPressure", "(I)V", "setProperty", "set", "(Ljava/lang/String;I)V", "", Address.ADDRESS_NULL_PLACEHOLDER, "(Ljava/lang/String;Ljava/lang/Void;)V", "", "Lexpo/modules/kotlin/jni/JavaScriptObject$PropertyDescriptor;", "defineProperty", "(Ljava/lang/String;ZLjava/util/List;)V", "(Ljava/lang/String;ILjava/util/List;)V", "(Ljava/lang/String;DLjava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;Ljava/util/List;)V", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/Void;Ljava/util/List;)V", "finalize", "()V", "deallocate", "Lcom/facebook/jni/HybridData;", "PropertyDescriptor", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public class JavaScriptObject implements Destructible {

    @DoNotStrip
    private final HybridData mHybridData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptObject$PropertyDescriptor;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Configurable", "Enumerable", "Writable", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum PropertyDescriptor {
        Configurable(1),
        Enumerable(2),
        Writable(4);

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final int value;

        PropertyDescriptor(int i11) {
            this.value = i11;
        }

        public static EnumEntries<PropertyDescriptor> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @DoNotStrip
    public JavaScriptObject(HybridData mHybridData) {
        s.k(mHybridData, "mHybridData");
        this.mHybridData = mHybridData;
    }

    private final native void defineBoolProperty(String name, boolean value, int options);

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 defineDeallocator$lambda$0(wn0.a aVar, Object[] it) {
        s.k(it, "it");
        aVar.invoke();
        return h0.f84049a;
    }

    private final native void defineDoubleProperty(String name, double value, int options);

    private final native void defineJSObjectProperty(String name, JavaScriptObject value, int options);

    private final native void defineJSValueProperty(String name, JavaScriptValue value, int options);

    private final native void defineNativeDeallocator(JNIFunctionBody deallocator);

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, boolean z11, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i11 & 4) != 0) {
            list = v.m();
        }
        javaScriptObject.defineProperty(str, z11, (List<? extends PropertyDescriptor>) list);
    }

    private final native void defineStringProperty(String name, String value, int options);

    private final native void setBoolProperty(String name, boolean value);

    private final native void setDoubleProperty(String name, double value);

    private final native void setJSObjectProperty(String name, JavaScriptObject value);

    private final native void setJSValueProperty(String name, JavaScriptValue value);

    private final native void setStringProperty(String name, String value);

    private final native void unsetProperty(String name);

    public final native JavaScriptWeakObject createWeak();

    @Override // expo.modules.kotlin.jni.Destructible
    public void deallocate() {
        this.mHybridData.resetNative();
    }

    public final void defineDeallocator$expo_modules_core_release(final wn0.a<h0> deallocator) {
        s.k(deallocator, "deallocator");
        defineNativeDeallocator(new JNIFunctionBody() { // from class: expo.modules.kotlin.jni.b
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                return JavaScriptObject.defineDeallocator$lambda$0(deallocator, objArr);
            }
        });
    }

    public final void defineProperty(String name, boolean value, List<? extends PropertyDescriptor> options) {
        s.k(name, "name");
        s.k(options, "options");
        defineBoolProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    protected final void finalize() {
        deallocate();
    }

    public final JavaScriptValue get(String name) {
        s.k(name, "name");
        if (hasProperty(name)) {
            return getProperty(name);
        }
        return null;
    }

    public final native JavaScriptValue getProperty(String name);

    public final native String[] getPropertyNames();

    public final native boolean hasProperty(String name);

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public final void set(String name, boolean value) {
        s.k(name, "name");
        setBoolProperty(name, value);
    }

    public final native void setExternalMemoryPressure(int size);

    public final void setProperty(String name, boolean value) {
        s.k(name, "name");
        setBoolProperty(name, value);
    }

    public final void defineProperty(String name, int value, List<? extends PropertyDescriptor> options) {
        s.k(name, "name");
        s.k(options, "options");
        defineDoubleProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, int value) {
        s.k(name, "name");
        setDoubleProperty(name, value);
    }

    public final void setProperty(String name, int value) {
        s.k(name, "name");
        setDoubleProperty(name, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, int i11, List list, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i12 & 4) != 0) {
            list = v.m();
        }
        javaScriptObject.defineProperty(str, i11, (List<? extends PropertyDescriptor>) list);
    }

    public final void defineProperty(String name, double value, List<? extends PropertyDescriptor> options) {
        s.k(name, "name");
        s.k(options, "options");
        defineDoubleProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, double value) {
        s.k(name, "name");
        setDoubleProperty(name, value);
    }

    public final void setProperty(String name, double value) {
        s.k(name, "name");
        setDoubleProperty(name, value);
    }

    public final void defineProperty(String name, String value, List<? extends PropertyDescriptor> options) {
        s.k(name, "name");
        s.k(options, "options");
        defineStringProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, String value) {
        s.k(name, "name");
        setStringProperty(name, value);
    }

    public final void setProperty(String name, String value) {
        s.k(name, "name");
        setStringProperty(name, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, double d11, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i11 & 4) != 0) {
            list = v.m();
        }
        javaScriptObject.defineProperty(str, d11, (List<? extends PropertyDescriptor>) list);
    }

    public final void defineProperty(String name, JavaScriptValue value, List<? extends PropertyDescriptor> options) {
        s.k(name, "name");
        s.k(options, "options");
        defineJSValueProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, JavaScriptValue value) {
        s.k(name, "name");
        setJSValueProperty(name, value);
    }

    public final void setProperty(String name, JavaScriptValue value) {
        s.k(name, "name");
        setJSValueProperty(name, value);
    }

    public final void defineProperty(String name, JavaScriptObject value, List<? extends PropertyDescriptor> options) {
        s.k(name, "name");
        s.k(options, "options");
        defineJSObjectProperty(name, value, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, JavaScriptObject value) {
        s.k(name, "name");
        setJSObjectProperty(name, value);
    }

    public final void setProperty(String name, JavaScriptObject value) {
        s.k(name, "name");
        setJSObjectProperty(name, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, String str2, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i11 & 4) != 0) {
            list = v.m();
        }
        javaScriptObject.defineProperty(str, str2, (List<? extends PropertyDescriptor>) list);
    }

    public final void defineProperty(String name, Void r11, List<? extends PropertyDescriptor> options) {
        s.k(name, "name");
        s.k(options, "options");
        defineJSObjectProperty(name, null, JavaScriptObjectKt.toCppOptions(options));
    }

    public final void set(String name, Void r11) {
        s.k(name, "name");
        unsetProperty(name);
    }

    public final void setProperty(String name, Void r11) {
        s.k(name, "name");
        unsetProperty(name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, JavaScriptValue javaScriptValue, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i11 & 4) != 0) {
            list = v.m();
        }
        javaScriptObject.defineProperty(str, javaScriptValue, (List<? extends PropertyDescriptor>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, JavaScriptObject javaScriptObject2, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i11 & 4) != 0) {
            list = v.m();
        }
        javaScriptObject.defineProperty(str, javaScriptObject2, (List<? extends PropertyDescriptor>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, Void r11, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i11 & 4) != 0) {
            list = v.m();
        }
        javaScriptObject.defineProperty(str, r11, (List<? extends PropertyDescriptor>) list);
    }
}
