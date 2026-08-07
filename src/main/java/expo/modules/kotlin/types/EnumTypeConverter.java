package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import co0.h;
import co0.l;
import com.facebook.react.bridge.Dynamic;
import expo.modules.core.logging.Logger;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.ReadableTypeExtensionsKt;
import expo.modules.kotlin.exception.EnumNoSuchValueException;
import expo.modules.kotlin.exception.IncompatibleArgTypeException;
import expo.modules.kotlin.jni.ExpectedType;
import java.lang.reflect.Field;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!RH\u0010\f\u001a6\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \"*\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0002 \"*\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0002\b\u0003 \"*\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u00020\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u001e\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lexpo/modules/kotlin/types/EnumTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "", "Lco0/d;", "enumClass", "", "isOptional", "<init>", "(Lco0/d;Z)V", "", "stringRepresentation", "", "enumConstants", "convertEnumWithoutParameter", "(Ljava/lang/String;[Ljava/lang/Enum;)Ljava/lang/Enum;", "", "jsValue", "parameterName", "convertEnumWithParameter", "(Ljava/lang/Object;[Ljava/lang/Enum;Ljava/lang/String;)Ljava/lang/Enum;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "()Z", "Lcom/facebook/react/bridge/Dynamic;", "value", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Enum;", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Enum;", "Lco0/d;", "kotlin.jvm.PlatformType", "[Ljava/lang/Enum;", "Lco0/h;", "primaryConstructor", "Lco0/h;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EnumTypeConverter extends DynamicAwareTypeConverters<Enum<?>> {
    private final co0.d<Enum<?>> enumClass;
    private final Enum<?>[] enumConstants;
    private final h<Enum<?>> primaryConstructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumTypeConverter(co0.d<Enum<?>> enumClass, boolean z11) {
        super(z11);
        s.k(enumClass, "enumClass");
        this.enumClass = enumClass;
        Object[] enumConstants = vn0.a.b(enumClass).getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalArgumentException("Passed type is not an enum type");
        }
        Enum<?>[] enumArr = (Enum[]) enumConstants;
        if (enumArr.length == 0) {
            throw new IllegalArgumentException("Passed enum type is empty");
        }
        this.enumConstants = enumArr;
        h<Enum<?>> hVarF = do0.c.f(enumClass);
        if (hVarF == null) {
            throw new IllegalArgumentException("Cannot convert js value to enum without the primary constructor");
        }
        this.primaryConstructor = hVarF;
        if (Enumerable.class.isAssignableFrom(vn0.a.b(enumClass))) {
            return;
        }
        Logger.error$default(CoreLoggerKt.getLogger(), "Enum '" + enumClass + "' should inherit from " + o0.b(Enumerable.class) + ".", null, 2, null);
    }

    private final Enum<?> convertEnumWithParameter(Object jsValue, Enum<?>[] enumConstants, String parameterName) throws NoSuchFieldException {
        int iIntValue;
        Object objValueOf;
        Enum<?> r11;
        Field declaredField = vn0.a.b(this.enumClass).getDeclaredField(parameterName);
        if (declaredField == null) {
            throw new IllegalArgumentException(("Cannot find a property for " + parameterName + " parameter").toString());
        }
        declaredField.setAccessible(true);
        Class<?> type = declaredField.getType();
        if (jsValue instanceof Dynamic) {
            objValueOf = s.f(type, String.class) ? ((Dynamic) jsValue).asString() : Integer.valueOf(((Dynamic) jsValue).asInt());
        } else if (s.f(type, String.class)) {
            s.i(jsValue, "null cannot be cast to non-null type kotlin.String");
            objValueOf = (String) jsValue;
        } else {
            if (jsValue instanceof Double) {
                iIntValue = (int) ((Number) jsValue).doubleValue();
            } else {
                s.i(jsValue, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) jsValue).intValue();
            }
            objValueOf = Integer.valueOf(iIntValue);
        }
        int length = enumConstants.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                r11 = null;
                break;
            }
            r11 = enumConstants[i11];
            if (s.f(declaredField.get(r11), objValueOf)) {
                break;
            }
            i11++;
        }
        if (r11 != null) {
            return r11;
        }
        throw new IllegalArgumentException(("Couldn't convert '" + jsValue + "' to " + this.enumClass.l() + " where " + parameterName + " is the enum parameter").toString());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    private final Enum<?> convertEnumWithoutParameter(String stringRepresentation, Enum<?>[] enumConstants) throws EnumNoSuchValueException {
        for (Enum<?> r11 : enumConstants) {
            if (s.f(r11.name(), stringRepresentation)) {
                if (r11 != null) {
                    return r11;
                }
                throw new EnumNoSuchValueException(this.enumClass, enumConstants, stringRepresentation);
            }
        }
        r11 = null;
        if (r11 != null) {
            return r11;
        }
        throw new EnumNoSuchValueException(this.enumClass, enumConstants, stringRepresentation);
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.forEnum();
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Enum<?> convertFromAny(Object value, AppContext context) throws IncompatibleArgTypeException {
        s.k(value, "value");
        if (this.primaryConstructor.getParameters().isEmpty()) {
            return convertEnumWithoutParameter((String) value, this.enumConstants);
        }
        if (this.primaryConstructor.getParameters().size() != 1) {
            throw new IncompatibleArgTypeException(do0.d.c(o0.b(value.getClass()), null, false, null, 7, null), do0.d.c(this.enumClass, null, false, null, 7, null), null, 4, null);
        }
        Enum<?>[] enumArr = this.enumConstants;
        String name = ((l) v.o0(this.primaryConstructor.getParameters())).getName();
        s.h(name);
        return convertEnumWithParameter(value, enumArr, name);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Enum<?> convertFromDynamic(Dynamic value, AppContext context) throws IncompatibleArgTypeException {
        s.k(value, "value");
        if (this.primaryConstructor.getParameters().isEmpty()) {
            return convertEnumWithoutParameter(value.asString(), this.enumConstants);
        }
        if (this.primaryConstructor.getParameters().size() != 1) {
            throw new IncompatibleArgTypeException(ReadableTypeExtensionsKt.toKType(value.getType()), do0.d.c(this.enumClass, null, false, null, 7, null), null, 4, null);
        }
        Enum<?>[] enumArr = this.enumConstants;
        String name = ((l) v.o0(this.primaryConstructor.getParameters())).getName();
        s.h(name);
        return convertEnumWithParameter(value, enumArr, name);
    }
}
