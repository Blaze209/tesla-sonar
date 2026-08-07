package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import co0.q;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.TypeCastException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\r\u001a\u0004\u0018\u00010\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u001c\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "value", "", "wasConverted", "Lexpo/modules/kotlin/types/TypeConverter;", "typeConverter", "Lexpo/modules/kotlin/jni/ExpectedType;", "expectedType", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/kotlin/types/DeferredValue;", "createDeferredValue", "(Ljava/lang/Object;ZLexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/types/DeferredValue;", "tryToConvert", "(Lexpo/modules/kotlin/types/TypeConverter;Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "list", "Lco0/q;", "typeList", "createDeferredValues", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EitherTypeConverterKt {
    private static final DeferredValue createDeferredValue(Object obj, boolean z11, TypeConverter<?> typeConverter, ExpectedType expectedType, AppContext appContext) {
        Object objTryToConvert;
        for (SingleType singleType : expectedType.getInnerPossibleTypes()) {
            if (z11) {
                return new UnconvertedValue(obj, typeConverter, appContext);
            }
            if ((singleType.getExpectedCppType().getClazz().j(obj) || (obj instanceof Dynamic)) && (objTryToConvert = tryToConvert(typeConverter, obj, appContext)) != null) {
                return new ConvertedValue(objTryToConvert);
            }
        }
        return IncompatibleValue.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<DeferredValue> createDeferredValues(Object obj, AppContext appContext, List<? extends Pair<ExpectedType, ? extends TypeConverter<?>>> list, List<? extends q> list2) {
        List<? extends Pair<ExpectedType, ? extends TypeConverter<?>>> list3 = list;
        ArrayList arrayList = new ArrayList(v.y(list3, 10));
        Iterator<T> it = list3.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            DeferredValue deferredValueCreateDeferredValue = createDeferredValue(obj, z11, (TypeConverter) pair.b(), (ExpectedType) pair.a(), appContext);
            if (deferredValueCreateDeferredValue instanceof ConvertedValue) {
                z11 = true;
            }
            arrayList.add(deferredValueCreateDeferredValue);
        }
        if (z11) {
            return arrayList;
        }
        throw new TypeCastException("Cannot cast '" + obj + "' to 'Either<" + v.y0(list2, ", ", null, null, 0, null, new l() { // from class: expo.modules.kotlin.types.b
            @Override // wn0.l
            public final Object invoke(Object obj2) {
                return EitherTypeConverterKt.createDeferredValues$lambda$1((q) obj2);
            }
        }, 30, null) + ">'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence createDeferredValues$lambda$1(q it) {
        s.k(it, "it");
        return it.toString();
    }

    private static final Object tryToConvert(TypeConverter<?> typeConverter, Object obj, AppContext appContext) {
        try {
            return (!typeConverter.isTrivial() || (obj instanceof Dynamic)) ? typeConverter.convert(obj, appContext) : obj;
        } catch (Throwable unused) {
            return null;
        }
    }
}
