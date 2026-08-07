package expo.modules.kotlin.sharedobjects;

import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vn0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObjectId;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "toNativeObject", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "runtimeContext", "Lexpo/modules/kotlin/RuntimeContext;", "toNativeObject-impl", "(ILexpo/modules/kotlin/RuntimeContext;)Lexpo/modules/kotlin/sharedobjects/SharedObject;", "toNativeObjectOrNull", "toNativeObjectOrNull-impl", "toJavaScriptObjectNull", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "toJavaScriptObjectNull-impl", "(ILexpo/modules/kotlin/RuntimeContext;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "toWeakJavaScriptObjectNull", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "toWeakJavaScriptObjectNull-impl", "(ILexpo/modules/kotlin/RuntimeContext;)Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@b
public final class SharedObjectId {
    private final int value;

    private /* synthetic */ SharedObjectId(int i11) {
        this.value = i11;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SharedObjectId m165boximpl(int i11) {
        return new SharedObjectId(i11);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m166constructorimpl(int i11) {
        return i11;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m167equalsimpl(int i11, Object obj) {
        return (obj instanceof SharedObjectId) && i11 == ((SharedObjectId) obj).m175unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m168equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m169hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* JADX INFO: renamed from: toJavaScriptObjectNull-impl, reason: not valid java name */
    public static final JavaScriptObject m170toJavaScriptObjectNullimpl(int i11, RuntimeContext runtimeContext) {
        s.k(runtimeContext, "runtimeContext");
        SharedObject sharedObjectM172toNativeObjectOrNullimpl = m172toNativeObjectOrNullimpl(i11, runtimeContext);
        if (sharedObjectM172toNativeObjectOrNullimpl == null) {
            return null;
        }
        return runtimeContext.getSharedObjectRegistry().toJavaScriptObjectOrNull$expo_modules_core_release(sharedObjectM172toNativeObjectOrNullimpl);
    }

    /* JADX INFO: renamed from: toNativeObject-impl, reason: not valid java name */
    public static final SharedObject m171toNativeObjectimpl(int i11, RuntimeContext runtimeContext) {
        s.k(runtimeContext, "runtimeContext");
        return runtimeContext.getSharedObjectRegistry().m180toNativeObjectkyJHjyY$expo_modules_core_release(i11);
    }

    /* JADX INFO: renamed from: toNativeObjectOrNull-impl, reason: not valid java name */
    public static final SharedObject m172toNativeObjectOrNullimpl(int i11, RuntimeContext runtimeContext) {
        s.k(runtimeContext, "runtimeContext");
        return runtimeContext.getSharedObjectRegistry().m181toNativeObjectOrNullkyJHjyY$expo_modules_core_release(i11);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m173toStringimpl(int i11) {
        return "SharedObjectId(value=" + i11 + ")";
    }

    /* JADX INFO: renamed from: toWeakJavaScriptObjectNull-impl, reason: not valid java name */
    public static final JavaScriptWeakObject m174toWeakJavaScriptObjectNullimpl(int i11, RuntimeContext runtimeContext) {
        s.k(runtimeContext, "runtimeContext");
        SharedObject sharedObjectM172toNativeObjectOrNullimpl = m172toNativeObjectOrNullimpl(i11, runtimeContext);
        if (sharedObjectM172toNativeObjectOrNullimpl == null) {
            return null;
        }
        return runtimeContext.getSharedObjectRegistry().toWeakJavaScriptObjectOrNull$expo_modules_core_release(sharedObjectM172toNativeObjectOrNullimpl);
    }

    public boolean equals(Object obj) {
        return m167equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m169hashCodeimpl(this.value);
    }

    public String toString() {
        return m173toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m175unboximpl() {
        return this.value;
    }
}
