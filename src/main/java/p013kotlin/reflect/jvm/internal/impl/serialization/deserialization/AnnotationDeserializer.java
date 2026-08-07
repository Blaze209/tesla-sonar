package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bo0.n;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Pair;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class AnnotationDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f88583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotFoundClasses f88584b;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AnnotationDeserializer(ModuleDescriptor module, NotFoundClasses notFoundClasses) {
        s.k(module, "module");
        s.k(notFoundClasses, "notFoundClasses");
        this.f88583a = module;
        this.f88584b = notFoundClasses;
    }

    private final boolean a(ConstantValue<?> constantValue, KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value) {
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 10) {
            ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
            ClassDescriptor classDescriptor = classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor : null;
            return classDescriptor == null || KotlinBuiltIns.isKClass(classDescriptor);
        }
        if (i11 != 13) {
            return s.f(constantValue.getType(this.f88583a), kotlinType);
        }
        if (!(constantValue instanceof ArrayValue) || ((ArrayValue) constantValue).getValue().size() != value.getArrayElementList().size()) {
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + constantValue).toString());
        }
        KotlinType arrayElementType = b().getArrayElementType(kotlinType);
        s.j(arrayElementType, "getArrayElementType(...)");
        ArrayValue arrayValue = (ArrayValue) constantValue;
        Iterable iterableN = v.n(arrayValue.getValue());
        if ((iterableN instanceof Collection) && ((Collection) iterableN).isEmpty()) {
            return true;
        }
        Iterator it = iterableN.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            ConstantValue<?> constantValue2 = arrayValue.getValue().get(iNextInt);
            ProtoBuf.Annotation.Argument.Value arrayElement = value.getArrayElement(iNextInt);
            s.j(arrayElement, "getArrayElement(...)");
            if (!a(constantValue2, arrayElementType, arrayElement)) {
                return false;
            }
        }
        return true;
    }

    private final KotlinBuiltIns b() {
        return this.f88583a.getBuiltIns();
    }

    private final Pair<Name, ConstantValue<?>> c(ProtoBuf.Annotation.Argument argument, Map<Name, ? extends ValueParameterDescriptor> map, NameResolver nameResolver) {
        ValueParameterDescriptor valueParameterDescriptor = map.get(NameResolverUtilKt.getName(nameResolver, argument.getNameId()));
        if (valueParameterDescriptor == null) {
            return null;
        }
        Name name = NameResolverUtilKt.getName(nameResolver, argument.getNameId());
        KotlinType type = valueParameterDescriptor.getType();
        s.j(type, "getType(...)");
        ProtoBuf.Annotation.Argument.Value value = argument.getValue();
        s.j(value, "getValue(...)");
        return new Pair<>(name, e(type, value, nameResolver));
    }

    private final ClassDescriptor d(ClassId classId) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.f88583a, classId, this.f88584b);
    }

    private final ConstantValue<?> e(KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value, NameResolver nameResolver) {
        ConstantValue<?> constantValueResolveValue = resolveValue(kotlinType, value, nameResolver);
        if (!a(constantValueResolveValue, kotlinType, value)) {
            constantValueResolveValue = null;
        }
        if (constantValueResolveValue != null) {
            return constantValueResolveValue;
        }
        return ErrorValue.Companion.create("Unexpected argument value: actual type " + value.getType() + " != expected type " + kotlinType);
    }

    public final AnnotationDescriptor deserializeAnnotation(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        ClassDescriptor classDescriptorD = d(NameResolverUtilKt.getClassId(nameResolver, proto.getId()));
        Map mapI = v0.i();
        if (proto.getArgumentCount() != 0 && !ErrorUtils.isError(classDescriptorD) && DescriptorUtils.isAnnotationClass(classDescriptorD)) {
            Collection<ClassConstructorDescriptor> constructors = classDescriptorD.getConstructors();
            s.j(constructors, "getConstructors(...)");
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) v.V0(constructors);
            if (classConstructorDescriptor != null) {
                List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
                s.j(valueParameters, "getValueParameters(...)");
                List<ValueParameterDescriptor> list = valueParameters;
                LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((ValueParameterDescriptor) obj).getName(), obj);
                }
                List<ProtoBuf.Annotation.Argument> argumentList = proto.getArgumentList();
                s.j(argumentList, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument argument : argumentList) {
                    s.h(argument);
                    Pair<Name, ConstantValue<?>> pairC = c(argument, linkedHashMap, nameResolver);
                    if (pairC != null) {
                        arrayList.add(pairC);
                    }
                }
                mapI = v0.y(arrayList);
            }
        }
        return new AnnotationDescriptorImpl(classDescriptorD.getDefaultType(), mapI, SourceElement.NO_SOURCE);
    }

    public final ConstantValue<?> resolveValue(KotlinType expectedType, ProtoBuf.Annotation.Argument.Value value, NameResolver nameResolver) {
        s.k(expectedType, "expectedType");
        s.k(value, "value");
        s.k(nameResolver, "nameResolver");
        Boolean bool = Flags.IS_UNSIGNED.get(value.getFlags());
        s.j(bool, "get(...)");
        boolean zBooleanValue = bool.booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                byte intValue = (byte) value.getIntValue();
                return zBooleanValue ? new UByteValue(intValue) : new ByteValue(intValue);
            case 2:
                return new CharValue((char) value.getIntValue());
            case 3:
                short intValue2 = (short) value.getIntValue();
                return zBooleanValue ? new UShortValue(intValue2) : new ShortValue(intValue2);
            case 4:
                int intValue3 = (int) value.getIntValue();
                return zBooleanValue ? new UIntValue(intValue3) : new IntValue(intValue3);
            case 5:
                long intValue4 = value.getIntValue();
                return zBooleanValue ? new ULongValue(intValue4) : new LongValue(intValue4);
            case 6:
                return new FloatValue(value.getFloatValue());
            case 7:
                return new DoubleValue(value.getDoubleValue());
            case 8:
                return new BooleanValue(value.getIntValue() != 0);
            case 9:
                return new StringValue(nameResolver.getString(value.getStringValue()));
            case 10:
                return new KClassValue(NameResolverUtilKt.getClassId(nameResolver, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new EnumValue(NameResolverUtilKt.getClassId(nameResolver, value.getClassId()), NameResolverUtilKt.getName(nameResolver, value.getEnumValueId()));
            case 12:
                ProtoBuf.Annotation annotation = value.getAnnotation();
                s.j(annotation, "getAnnotation(...)");
                return new AnnotationValue(deserializeAnnotation(annotation, nameResolver));
            case 13:
                ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                List<ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                s.j(arrayElementList, "getArrayElementList(...)");
                List<ProtoBuf.Annotation.Argument.Value> list = arrayElementList;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                for (ProtoBuf.Annotation.Argument.Value value2 : list) {
                    SimpleType anyType = b().getAnyType();
                    s.j(anyType, "getAnyType(...)");
                    s.h(value2);
                    arrayList.add(resolveValue(anyType, value2, nameResolver));
                }
                return constantValueFactory.createArrayValue(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + expectedType + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
    }
}
