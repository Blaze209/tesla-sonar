package expo.modules.kotlin.records;

import ch.qos.logback.core.CoreConstants;
import co0.d;
import co0.f;
import co0.o;
import co0.q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import eo0.c;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.allocators.ObjectConstructor;
import expo.modules.kotlin.allocators.ObjectConstructorFactory;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FieldCastException;
import expo.modules.kotlin.exception.FieldRequiredException;
import expo.modules.kotlin.exception.RecordCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.DynamicAwareTypeConverters;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.m;
import jn0.x;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00016B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013\"\b\b\u0001\u0010\u0002*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00182\u0012\u0010\u0017\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u0010\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R3\u00105\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0010\u0012\u0002\b\u00030\u0016\u0012\u0004\u0012\u0002000/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lexpo/modules/kotlin/records/RecordTypeConverter;", "Lexpo/modules/kotlin/records/Record;", "T", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Lco0/q;", "type", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;Lco0/q;)V", "Lcom/facebook/react/bridge/ReadableMap;", "jsMap", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertFromReadableMap", "(Lcom/facebook/react/bridge/ReadableMap;Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/records/Record;", "", "Lco0/d;", "clazz", "Lexpo/modules/kotlin/allocators/ObjectConstructor;", "getObjectConstructor", "(Lco0/d;)Lexpo/modules/kotlin/allocators/ObjectConstructor;", "Lco0/o;", "property", "", "Lexpo/modules/kotlin/records/FieldValidator;", "getValidators", "(Lco0/o;)Ljava/util/List;", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/records/Record;", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/records/Record;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "", "isTrivial", "()Z", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "Lco0/q;", "getType", "()Lco0/q;", "Lexpo/modules/kotlin/allocators/ObjectConstructorFactory;", "objectConstructorFactory", "Lexpo/modules/kotlin/allocators/ObjectConstructorFactory;", "", "Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;", "propertyDescriptors$delegate", "Lkotlin/Lazy;", "getPropertyDescriptors", "()Ljava/util/Map;", "propertyDescriptors", "PropertyDescriptor", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordTypeConverter<T extends Record> extends DynamicAwareTypeConverters<T> {
    private final TypeConverterProvider converterProvider;
    private final ObjectConstructorFactory objectConstructorFactory;

    /* JADX INFO: renamed from: propertyDescriptors$delegate, reason: from kotlin metadata */
    private final Lazy propertyDescriptors;
    private final q type;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0013\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\b\u0002\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u001b\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;", "", "typeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "fieldAnnotation", "Lexpo/modules/kotlin/records/Field;", "isRequired", "", "validators", "", "Lexpo/modules/kotlin/records/FieldValidator;", "<init>", "(Lexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/records/Field;ZLjava/util/List;)V", "getTypeConverter", "()Lexpo/modules/kotlin/types/TypeConverter;", "getFieldAnnotation", "()Lexpo/modules/kotlin/records/Field;", "()Z", "getValidators", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class PropertyDescriptor {
        private final Field fieldAnnotation;
        private final boolean isRequired;
        private final TypeConverter<?> typeConverter;
        private final List<FieldValidator<?>> validators;

        /* JADX WARN: Multi-variable type inference failed */
        public PropertyDescriptor(TypeConverter<?> typeConverter, Field fieldAnnotation, boolean z11, List<? extends FieldValidator<?>> validators) {
            s.k(typeConverter, "typeConverter");
            s.k(fieldAnnotation, "fieldAnnotation");
            s.k(validators, "validators");
            this.typeConverter = typeConverter;
            this.fieldAnnotation = fieldAnnotation;
            this.isRequired = z11;
            this.validators = validators;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PropertyDescriptor copy$default(PropertyDescriptor propertyDescriptor, TypeConverter typeConverter, Field field, boolean z11, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                typeConverter = propertyDescriptor.typeConverter;
            }
            if ((i11 & 2) != 0) {
                field = propertyDescriptor.fieldAnnotation;
            }
            if ((i11 & 4) != 0) {
                z11 = propertyDescriptor.isRequired;
            }
            if ((i11 & 8) != 0) {
                list = propertyDescriptor.validators;
            }
            return propertyDescriptor.copy(typeConverter, field, z11, list);
        }

        public final TypeConverter<?> component1() {
            return this.typeConverter;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Field getFieldAnnotation() {
            return this.fieldAnnotation;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public final List<FieldValidator<?>> component4() {
            return this.validators;
        }

        public final PropertyDescriptor copy(TypeConverter<?> typeConverter, Field fieldAnnotation, boolean isRequired, List<? extends FieldValidator<?>> validators) {
            s.k(typeConverter, "typeConverter");
            s.k(fieldAnnotation, "fieldAnnotation");
            s.k(validators, "validators");
            return new PropertyDescriptor(typeConverter, fieldAnnotation, isRequired, validators);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PropertyDescriptor)) {
                return false;
            }
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) other;
            return s.f(this.typeConverter, propertyDescriptor.typeConverter) && s.f(this.fieldAnnotation, propertyDescriptor.fieldAnnotation) && this.isRequired == propertyDescriptor.isRequired && s.f(this.validators, propertyDescriptor.validators);
        }

        public final Field getFieldAnnotation() {
            return this.fieldAnnotation;
        }

        public final TypeConverter<?> getTypeConverter() {
            return this.typeConverter;
        }

        public final List<FieldValidator<?>> getValidators() {
            return this.validators;
        }

        public int hashCode() {
            return (((((this.typeConverter.hashCode() * 31) + this.fieldAnnotation.hashCode()) * 31) + Boolean.hashCode(this.isRequired)) * 31) + this.validators.hashCode();
        }

        public final boolean isRequired() {
            return this.isRequired;
        }

        public String toString() {
            return "PropertyDescriptor(typeConverter=" + this.typeConverter + ", fieldAnnotation=" + this.fieldAnnotation + ", isRequired=" + this.isRequired + ", validators=" + this.validators + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordTypeConverter(TypeConverterProvider converterProvider, q type) {
        super(type.getIsMarkedNullable());
        s.k(converterProvider, "converterProvider");
        s.k(type, "type");
        this.converterProvider = converterProvider;
        this.type = type;
        this.objectConstructorFactory = new ObjectConstructorFactory();
        this.propertyDescriptors = m.b(new wn0.a() { // from class: expo.modules.kotlin.records.a
            @Override // wn0.a
            public final Object invoke() {
                return RecordTypeConverter.propertyDescriptors_delegate$lambda$1(this.f63385a);
            }
        });
    }

    private final T convertFromReadableMap(ReadableMap jsMap, AppContext context) throws FieldRequiredException {
        CodedException unexpectedException;
        f classifier = this.type.getClassifier();
        s.i(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        T tConstruct = getObjectConstructor((d) classifier).construct();
        for (Map.Entry<o<? extends Object, ?>, PropertyDescriptor> entry : getPropertyDescriptors().entrySet()) {
            o<? extends Object, ?> key = entry.getKey();
            PropertyDescriptor value = entry.getValue();
            String strKey = value.getFieldAnnotation().key();
            if (t.y0(strKey)) {
                strKey = null;
            }
            if (strKey == null) {
                strKey = key.getName();
            }
            if (jsMap.hasKey(strKey)) {
                Dynamic dynamic = jsMap.getDynamic(strKey);
                try {
                    java.lang.reflect.Field fieldB = c.b(key);
                    s.h(fieldB);
                    try {
                        Object objConvert = value.getTypeConverter().convert(dynamic, context);
                        if (objConvert != null) {
                            Iterator<T> it = value.getValidators().iterator();
                            while (it.hasNext()) {
                                FieldValidator fieldValidator = (FieldValidator) it.next();
                                s.i(fieldValidator, "null cannot be cast to non-null type expo.modules.kotlin.records.FieldValidator<kotlin.Any>");
                                fieldValidator.validate(objConvert);
                            }
                        }
                        fieldB.setAccessible(true);
                        fieldB.set(tConstruct, objConvert);
                        h0 h0Var = h0.f84049a;
                        dynamic.recycle();
                    } catch (Throwable th2) {
                        if (th2 instanceof CodedException) {
                            unexpectedException = (CodedException) th2;
                        } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                            String code = ((expo.modules.core.errors.CodedException) th2).getCode();
                            s.j(code, "getCode(...)");
                            unexpectedException = new CodedException(code, ((expo.modules.core.errors.CodedException) th2).getMessage(), ((expo.modules.core.errors.CodedException) th2).getCause());
                        } else {
                            unexpectedException = new UnexpectedException(th2);
                        }
                        throw new FieldCastException(key.getName(), key.getReturnType(), dynamic.getType(), unexpectedException);
                    }
                } catch (Throwable th3) {
                    dynamic.recycle();
                    throw th3;
                }
            } else if (value.isRequired()) {
                throw new FieldRequiredException(key);
            }
        }
        s.i(tConstruct, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter");
        return tConstruct;
    }

    private final <T> ObjectConstructor<T> getObjectConstructor(d<T> clazz) {
        return this.objectConstructorFactory.get(clazz);
    }

    private final Map<o<? extends Object, ?>, PropertyDescriptor> getPropertyDescriptors() {
        return (Map) this.propertyDescriptors.getValue();
    }

    private final List<FieldValidator<?>> getValidators(o<? extends Object, ?> property) {
        Pair pairA;
        Object next;
        List<Annotation> annotations = property.getAnnotations();
        ArrayList arrayList = new ArrayList(v.y(annotations, 10));
        for (Annotation annotation : annotations) {
            Iterator<T> it = vn0.a.a(annotation).getAnnotations().iterator();
            do {
                pairA = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Annotation) next) instanceof BindUsing));
            BindUsing bindUsing = (BindUsing) next;
            if (bindUsing != null) {
                pairA = x.a(annotation, bindUsing);
            }
            arrayList.add(pairA);
        }
        List<Pair> listL0 = v.l0(arrayList);
        ArrayList arrayList2 = new ArrayList(v.y(listL0, 10));
        for (Pair pair : listL0) {
            Annotation annotation2 = (Annotation) pair.a();
            Object objC = do0.c.c(o0.b(((BindUsing) pair.b()).binder()));
            s.i(objC, "null cannot be cast to non-null type expo.modules.kotlin.records.ValidationBinder");
            arrayList2.add(((ValidationBinder) objC).bind(annotation2, property.getReturnType()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map propertyDescriptors_delegate$lambda$1(RecordTypeConverter recordTypeConverter) {
        Object objA;
        Object next;
        f classifier = recordTypeConverter.type.getClassifier();
        s.i(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Collection<o<? extends Object, ?>> collectionE = do0.c.e((d) classifier);
        ArrayList arrayList = new ArrayList(v.y(collectionE, 10));
        for (o<? extends Object, ?> oVar : collectionE) {
            Iterator<T> it = oVar.getAnnotations().iterator();
            do {
                objA = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Annotation) next) instanceof Field));
            Field field = (Field) next;
            if (field != null) {
                TypeConverter<?> typeConverterObtainTypeConverter = recordTypeConverter.converterProvider.obtainTypeConverter(oVar.getReturnType());
                for (Object obj : oVar.getAnnotations()) {
                    if (((Annotation) obj) instanceof Required) {
                        objA = obj;
                        break;
                    }
                }
                objA = x.a(oVar, new PropertyDescriptor(typeConverterObtainTypeConverter, field, ((Required) objA) != null, recordTypeConverter.getValidators(oVar)));
            }
            arrayList.add(objA);
        }
        return v0.y(v.l0(arrayList));
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return new ExpectedType(CppType.READABLE_MAP);
    }

    public final q getType() {
        return this.type;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public T convertFromAny(Object value, AppContext context) {
        s.k(value, "value");
        return value instanceof ReadableMap ? (T) convertFromReadableMap((ReadableMap) value, context) : (T) value;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public T convertFromDynamic(Dynamic value, AppContext context) throws RecordCastException {
        CodedException unexpectedException;
        s.k(value, "value");
        try {
            return (T) convertFromReadableMap(value.asMap(), context);
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
            throw new RecordCastException(this.type, unexpectedException);
        }
    }
}
