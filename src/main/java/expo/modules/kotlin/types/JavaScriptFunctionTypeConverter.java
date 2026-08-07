package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import co0.q;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/types/JavaScriptFunctionTypeConverter;", "", "T", "Lexpo/modules/kotlin/types/NullAwareTypeConverter;", "Lexpo/modules/kotlin/jni/JavaScriptFunction;", "Lco0/q;", "type", "<init>", "(Lco0/q;)V", "value", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertNonOptional", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/jni/JavaScriptFunction;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "", "isTrivial", "()Z", "Lco0/q;", "getType", "()Lco0/q;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaScriptFunctionTypeConverter<T> extends NullAwareTypeConverter<JavaScriptFunction<T>> {
    private final q type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaScriptFunctionTypeConverter(q type) {
        super(type.getIsMarkedNullable());
        s.k(type, "type");
        this.type = type;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return new ExpectedType(CppType.JS_FUNCTION);
    }

    public final q getType() {
        return this.type;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    @Override // expo.modules.kotlin.types.NullAwareTypeConverter
    public JavaScriptFunction<T> convertNonOptional(Object value, AppContext context) {
        s.k(value, "value");
        JavaScriptFunction<T> javaScriptFunction = (JavaScriptFunction) value;
        q qVarC = ((co0.s) v.o0(this.type.getArguments())).c();
        if (qVarC == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        javaScriptFunction.setReturnType(qVarC);
        return javaScriptFunction;
    }
}
