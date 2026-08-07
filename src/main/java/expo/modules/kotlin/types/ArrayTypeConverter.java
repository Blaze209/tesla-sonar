package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import co0.f;
import co0.q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0018\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lexpo/modules/kotlin/types/ArrayTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Lco0/q;", "arrayType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lco0/q;)V", "", "size", "", "createTypedArray", "(I)[Ljava/lang/Object;", "Lcom/facebook/react/bridge/Dynamic;", "value", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;)[Ljava/lang/Object;", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)[Ljava/lang/Object;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "", "isTrivial", "()Z", "Lco0/q;", "Lexpo/modules/kotlin/types/TypeConverter;", "arrayElementConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArrayTypeConverter extends DynamicAwareTypeConverters<Object[]> {
    private final TypeConverter<?> arrayElementConverter;
    private final q arrayType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayTypeConverter(TypeConverterProvider converterProvider, q arrayType) {
        super(arrayType.getIsMarkedNullable());
        s.k(converterProvider, "converterProvider");
        s.k(arrayType, "arrayType");
        this.arrayType = arrayType;
        q qVarC = ((co0.s) v.o0(arrayType.getArguments())).c();
        if (qVarC == null) {
            throw new IllegalArgumentException("The array type should contain the type of the elements.");
        }
        this.arrayElementConverter = converterProvider.obtainTypeConverter(qVarC);
    }

    private final Object[] createTypedArray(int size) {
        q qVarC = ((co0.s) v.o0(this.arrayType.getArguments())).c();
        s.h(qVarC);
        f classifier = qVarC.getClassifier();
        s.i(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Object objNewInstance = Array.newInstance((Class<?>) vn0.a.b((co0.d) classifier), size);
        s.i(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return (Object[]) objNewInstance;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.forPrimitiveArray(this.arrayElementConverter.get$cppRequireType());
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return this.arrayElementConverter.isTrivial();
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Object[] convertFromAny(Object value, AppContext context) throws CollectionElementCastException {
        CodedException unexpectedException;
        s.k(value, "value");
        if (this.arrayElementConverter.isTrivial()) {
            return (Object[]) value;
        }
        Object[] objArr = (Object[]) value;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            try {
                arrayList.add(this.arrayElementConverter.convert(obj, context));
            } catch (Throwable th2) {
                if (th2 instanceof CodedException) {
                    unexpectedException = (CodedException) th2;
                } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th2;
                    String code = codedException.getCode();
                    s.j(code, "getCode(...)");
                    unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th2);
                }
                q qVar = this.arrayType;
                q qVarC = ((co0.s) v.o0(qVar.getArguments())).c();
                s.h(qVarC);
                s.h(obj);
                throw new CollectionElementCastException(qVar, qVarC, (co0.d<?>) o0.b(obj.getClass()), unexpectedException);
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Object[] convertFromDynamic(Dynamic value, AppContext context) {
        CodedException unexpectedException;
        s.k(value, "value");
        ReadableArray readableArrayAsArray = value.asArray();
        Object[] objArrCreateTypedArray = createTypedArray(readableArrayAsArray.size());
        int size = readableArrayAsArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            Dynamic dynamic = readableArrayAsArray.getDynamic(i11);
            try {
                Object objConvert = this.arrayElementConverter.convert(dynamic, context);
                dynamic.recycle();
                objArrCreateTypedArray[i11] = objConvert;
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof CodedException) {
                        unexpectedException = (CodedException) th2;
                    } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                        String code = ((expo.modules.core.errors.CodedException) th2).getCode();
                        s.j(code, "getCode(...)");
                        unexpectedException = new CodedException(code, ((expo.modules.core.errors.CodedException) th2).getMessage(), ((expo.modules.core.errors.CodedException) th2).getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th2);
                    }
                    q qVar = this.arrayType;
                    q qVarC = ((co0.s) v.o0(qVar.getArguments())).c();
                    s.h(qVarC);
                    throw new CollectionElementCastException(qVar, qVarC, dynamic.getType(), unexpectedException);
                } catch (Throwable th3) {
                    dynamic.recycle();
                    throw th3;
                }
            }
        }
        return objArrCreateTypedArray;
    }
}
