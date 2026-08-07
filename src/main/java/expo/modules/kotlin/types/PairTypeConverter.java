package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import co0.q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lexpo/modules/kotlin/types/PairTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "Lkotlin/Pair;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Lco0/q;", "pairType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lco0/q;)V", "Lcom/facebook/react/bridge/ReadableArray;", "jsArray", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertFromReadableArray", "(Lcom/facebook/react/bridge/ReadableArray;Lexpo/modules/kotlin/AppContext;)Lkotlin/Pair;", "array", "", "index", "", "convertElement", "(Lexpo/modules/kotlin/AppContext;Lcom/facebook/react/bridge/ReadableArray;I)Ljava/lang/Object;", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;)Lkotlin/Pair;", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Lkotlin/Pair;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "", "isTrivial", "()Z", "Lco0/q;", "", "Lexpo/modules/kotlin/types/TypeConverter;", "converters", "Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PairTypeConverter extends DynamicAwareTypeConverters<Pair<?, ?>> {
    private final List<TypeConverter<? extends Object>> converters;
    private final q pairType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairTypeConverter(TypeConverterProvider converterProvider, q pairType) {
        super(pairType.getIsMarkedNullable());
        s.k(converterProvider, "converterProvider");
        s.k(pairType, "pairType");
        this.pairType = pairType;
        co0.s sVar = (co0.s) v.r0(pairType.getArguments(), 0);
        q qVarC = sVar != null ? sVar.c() : null;
        if (qVarC == null) {
            throw new IllegalArgumentException("The pair type should contain the type of the first parameter.");
        }
        TypeConverter<?> typeConverterObtainTypeConverter = converterProvider.obtainTypeConverter(qVarC);
        co0.s sVar2 = (co0.s) v.r0(pairType.getArguments(), 1);
        q qVarC2 = sVar2 != null ? sVar2.c() : null;
        if (qVarC2 == null) {
            throw new IllegalArgumentException("The pair type should contain the type of the second parameter.");
        }
        this.converters = v.p(typeConverterObtainTypeConverter, converterProvider.obtainTypeConverter(qVarC2));
    }

    private final Object convertElement(AppContext context, ReadableArray array, int index) {
        CodedException unexpectedException;
        Dynamic dynamic = array.getDynamic(index);
        try {
            Object objConvert = this.converters.get(index).convert(dynamic, context);
            dynamic.recycle();
            return objConvert;
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
                q qVar = this.pairType;
                q qVarC = qVar.getArguments().get(index).c();
                s.h(qVarC);
                throw new CollectionElementCastException(qVar, qVarC, dynamic.getType(), unexpectedException);
            } catch (Throwable th3) {
                dynamic.recycle();
                throw th3;
            }
        }
    }

    private final Pair<?, ?> convertFromReadableArray(ReadableArray jsArray, AppContext context) {
        return new Pair<>(convertElement(context, jsArray, 0), convertElement(context, jsArray, 1));
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return new ExpectedType(new SingleType(CppType.READABLE_ARRAY, null, 2, null));
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Pair<?, ?> convertFromAny(Object value, AppContext context) {
        s.k(value, "value");
        return value instanceof ReadableArray ? convertFromReadableArray((ReadableArray) value, context) : (Pair) value;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Pair<?, ?> convertFromDynamic(Dynamic value, AppContext context) {
        s.k(value, "value");
        return convertFromReadableArray(value.asArray(), context);
    }
}
