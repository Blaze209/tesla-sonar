package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import co0.q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0018\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lexpo/modules/kotlin/types/ListTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Lco0/q;", "listType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lco0/q;)V", "Lcom/facebook/react/bridge/ReadableArray;", "jsArray", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertFromReadableArray", "(Lcom/facebook/react/bridge/ReadableArray;Lexpo/modules/kotlin/AppContext;)Ljava/util/List;", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;)Ljava/util/List;", "", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Ljava/util/List;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "", "isTrivial", "()Z", "Lco0/q;", "Lexpo/modules/kotlin/types/TypeConverter;", "elementConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ListTypeConverter extends DynamicAwareTypeConverters<List<?>> {
    private final TypeConverter<?> elementConverter;
    private final q listType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListTypeConverter(TypeConverterProvider converterProvider, q listType) {
        super(listType.getIsMarkedNullable());
        s.k(converterProvider, "converterProvider");
        s.k(listType, "listType");
        this.listType = listType;
        q qVarC = ((co0.s) v.o0(listType.getArguments())).c();
        if (qVarC == null) {
            throw new IllegalArgumentException("The list type should contain the type of elements.");
        }
        this.elementConverter = converterProvider.obtainTypeConverter(qVarC);
    }

    private final List<?> convertFromReadableArray(ReadableArray jsArray, AppContext context) {
        CodedException unexpectedException;
        int size = jsArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            Dynamic dynamic = jsArray.getDynamic(i11);
            try {
                Object objConvert = this.elementConverter.convert(dynamic, context);
                dynamic.recycle();
                arrayList.add(objConvert);
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
                    q qVar = this.listType;
                    q qVarC = ((co0.s) v.o0(qVar.getArguments())).c();
                    s.h(qVarC);
                    throw new CollectionElementCastException(qVar, qVarC, dynamic.getType(), unexpectedException);
                } catch (Throwable th3) {
                    dynamic.recycle();
                    throw th3;
                }
            }
        }
        return arrayList;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.forList(this.elementConverter.get$cppRequireType());
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return this.elementConverter.isTrivial();
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public List<?> convertFromAny(Object value, AppContext context) throws CollectionElementCastException {
        CodedException unexpectedException;
        s.k(value, "value");
        if (this.elementConverter.isTrivial()) {
            return (List) value;
        }
        List list = (List) value;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (Object obj : list) {
            try {
                arrayList.add(this.elementConverter.convert(obj, context));
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
                q qVar = this.listType;
                q qVarC = ((co0.s) v.o0(qVar.getArguments())).c();
                s.h(qVarC);
                s.h(obj);
                throw new CollectionElementCastException(qVar, qVarC, (co0.d<?>) o0.b(obj.getClass()), unexpectedException);
            }
        }
        return arrayList;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public List<?> convertFromDynamic(Dynamic value, AppContext context) throws CollectionElementCastException {
        CodedException unexpectedException;
        s.k(value, "value");
        if (value.getType() == ReadableType.Array) {
            return convertFromReadableArray(value.asArray(), context);
        }
        try {
            return v.e(this.elementConverter.convert(value, context));
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
            q qVar = this.listType;
            q qVarC = ((co0.s) v.o0(qVar.getArguments())).c();
            s.h(qVarC);
            throw new CollectionElementCastException(qVar, qVarC, (co0.d<?>) o0.b(value.getClass()), unexpectedException);
        }
    }
}
