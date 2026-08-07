package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import co0.q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0018\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lexpo/modules/kotlin/types/MapTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Lco0/q;", "mapType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lco0/q;)V", "Lcom/facebook/react/bridge/ReadableMap;", "jsMap", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertFromReadableMap", "(Lcom/facebook/react/bridge/ReadableMap;Lexpo/modules/kotlin/AppContext;)Ljava/util/Map;", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;)Ljava/util/Map;", "", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Ljava/util/Map;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "", "isTrivial", "()Z", "Lco0/q;", "Lexpo/modules/kotlin/types/TypeConverter;", "valueConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapTypeConverter extends DynamicAwareTypeConverters<Map<?, ?>> {
    private final q mapType;
    private final TypeConverter<?> valueConverter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapTypeConverter(TypeConverterProvider converterProvider, q mapType) {
        super(mapType.getIsMarkedNullable());
        s.k(converterProvider, "converterProvider");
        s.k(mapType, "mapType");
        this.mapType = mapType;
        q qVarC = ((co0.s) v.o0(mapType.getArguments())).c();
        if (s.f(qVarC != null ? qVarC.getClassifier() : null, o0.b(String.class))) {
            co0.s sVar = (co0.s) v.r0(mapType.getArguments(), 1);
            q qVarC2 = sVar != null ? sVar.c() : null;
            if (qVarC2 == null) {
                throw new IllegalArgumentException("The map type should contain the key type.");
            }
            this.valueConverter = converterProvider.obtainTypeConverter(qVarC2);
            return;
        }
        throw new IllegalArgumentException(("The map key type should be String, but received " + v.o0(mapType.getArguments()) + ".").toString());
    }

    private final Map<?, ?> convertFromReadableMap(ReadableMap jsMap, AppContext context) {
        CodedException unexpectedException;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> entryIterator = jsMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            String key = next.getKey();
            DynamicFromObject dynamicFromObject = new DynamicFromObject(next.getValue());
            try {
                linkedHashMap.put(key, this.valueConverter.convert(dynamicFromObject, context));
                h0 h0Var = h0.f84049a;
                dynamicFromObject.recycle();
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
                    q qVar = this.mapType;
                    q qVarC = qVar.getArguments().get(1).c();
                    s.h(qVarC);
                    throw new CollectionElementCastException(qVar, qVarC, dynamicFromObject.getType(), unexpectedException);
                } catch (Throwable th3) {
                    dynamicFromObject.recycle();
                    throw th3;
                }
            }
        }
        return linkedHashMap;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.forMap(this.valueConverter.get$cppRequireType());
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return this.valueConverter.isTrivial();
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Map<?, ?> convertFromAny(Object value, AppContext context) throws CollectionElementCastException {
        CodedException unexpectedException;
        s.k(value, "value");
        if (this.valueConverter.isTrivial()) {
            return (Map) value;
        }
        Map map = (Map) value;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value2 = entry.getValue();
            try {
                linkedHashMap.put(key, this.valueConverter.convert(value2, context));
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
                q qVar = this.mapType;
                q qVarC = qVar.getArguments().get(1).c();
                s.h(qVarC);
                s.h(value2);
                throw new CollectionElementCastException(qVar, qVarC, (co0.d<?>) o0.b(value2.getClass()), unexpectedException);
            }
        }
        return linkedHashMap;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Map<?, ?> convertFromDynamic(Dynamic value, AppContext context) {
        s.k(value, "value");
        return convertFromReadableMap(value.asMap(), context);
    }
}
