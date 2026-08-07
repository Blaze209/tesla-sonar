package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import expo.modules.core.interfaces.DoNotStrip;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0018\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u001a\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u001b\u0010\rJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0086 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b\u001f\u0010\u0010J\u0010\u0010!\u001a\u00020 H\u0086 ¢\u0006\u0004\b!\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00000#H\u0086 ¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&H\u0086 ¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b)\u0010\nJ$\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\f\b\u0000\u0010*\u0018\u0001*\u0004\u0018\u00010\u0006H\u0086\b¢\u0006\u0004\b+\u0010\nJ\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\bH\u0007¢\u0006\u0004\b-\u0010\nJ\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\r\u00105\u001a\u000204¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020,H\u0004¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020,H\u0016¢\u0006\u0004\b9\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:¨\u0006;"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptValue;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "T", "Lexpo/modules/kotlin/jni/JavaScriptFunction;", "jniGetFunction", "()Lexpo/modules/kotlin/jni/JavaScriptFunction;", "", "isValid", "()Z", "", "kind", "()Ljava/lang/String;", "isNull", "isUndefined", "isBool", "isNumber", "isString", "isSymbol", "isFunction", "isArray", "isTypedArray", "isObject", "getBool", "", "getDouble", "()D", "getString", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "getObject", "()Lexpo/modules/kotlin/jni/JavaScriptObject;", "", "getArray", "()[Lexpo/modules/kotlin/jni/JavaScriptValue;", "Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", "getTypedArray", "()Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", "internalJniGetFunction", "ReturnType", "getFunction", "Ljn0/h0;", "getVoidFunction", "", "getInt", "()I", "", "getLong", "()J", "", "getFloat", "()F", "finalize", "()V", "deallocate", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class JavaScriptValue implements Destructible {

    @DoNotStrip
    private final HybridData mHybridData;

    @DoNotStrip
    private JavaScriptValue(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private final native <T> JavaScriptFunction<T> jniGetFunction();

    @Override // expo.modules.kotlin.jni.Destructible
    public void deallocate() {
        this.mHybridData.resetNative();
    }

    protected final void finalize() {
        deallocate();
    }

    public final native JavaScriptValue[] getArray();

    public final native boolean getBool();

    public final native double getDouble();

    public final float getFloat() {
        return (float) getDouble();
    }

    public final /* synthetic */ <ReturnType> JavaScriptFunction<ReturnType> getFunction() {
        JavaScriptFunction<ReturnType> javaScriptFunctionInternalJniGetFunction = internalJniGetFunction();
        s.q(6, "ReturnType");
        javaScriptFunctionInternalJniGetFunction.setReturnType(null);
        return javaScriptFunctionInternalJniGetFunction;
    }

    public final int getInt() {
        return (int) getDouble();
    }

    public final long getLong() {
        return (long) getDouble();
    }

    public final native JavaScriptObject getObject();

    public final native String getString();

    public final native JavaScriptTypedArray getTypedArray();

    public final JavaScriptFunction<h0> getVoidFunction() {
        JavaScriptFunction<h0> javaScriptFunctionInternalJniGetFunction = internalJniGetFunction();
        javaScriptFunctionInternalJniGetFunction.setReturnType(o0.o(h0.class));
        return javaScriptFunctionInternalJniGetFunction;
    }

    public final <T> JavaScriptFunction<T> internalJniGetFunction() {
        return jniGetFunction();
    }

    public final native boolean isArray();

    public final native boolean isBool();

    public final native boolean isFunction();

    public final native boolean isNull();

    public final native boolean isNumber();

    public final native boolean isObject();

    public final native boolean isString();

    public final native boolean isSymbol();

    public final native boolean isTypedArray();

    public final native boolean isUndefined();

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public final native String kind();
}
