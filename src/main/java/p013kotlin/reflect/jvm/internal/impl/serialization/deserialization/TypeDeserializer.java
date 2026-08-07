package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ch.qos.logback.core.CoreConstants;
import co0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.e0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import p013kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import p013kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializationContext f88656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeDeserializer f88657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f88658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f88659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l<Integer, ClassifierDescriptor> f88660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l<Integer, ClassifierDescriptor> f88661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, TypeParameterDescriptor> f88662g;

    public TypeDeserializer(DeserializationContext c11, TypeDeserializer typeDeserializer, List<ProtoBuf.TypeParameter> typeParameterProtos, String debugName, String containerPresentableName) {
        Map<Integer, TypeParameterDescriptor> linkedHashMap;
        s.k(c11, "c");
        s.k(typeParameterProtos, "typeParameterProtos");
        s.k(debugName, "debugName");
        s.k(containerPresentableName, "containerPresentableName");
        this.f88656a = c11;
        this.f88657b = typeDeserializer;
        this.f88658c = debugName;
        this.f88659d = containerPresentableName;
        this.f88660e = c11.getStorageManager().createMemoizedFunctionWithNullableValues(new m(this));
        this.f88661f = c11.getStorageManager().createMemoizedFunctionWithNullableValues(new n(this));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = v0.i();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i11 = 0;
            for (ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f88656a, typeParameter, i11));
                i11++;
            }
        }
        this.f88662g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassifierDescriptor f(TypeDeserializer typeDeserializer, int i11) {
        return typeDeserializer.g(i11);
    }

    private final ClassifierDescriptor g(int i11) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f88656a.getNameResolver(), i11);
        return classId.isLocal() ? this.f88656a.getComponents().deserializeClass(classId) : FindClassInModuleKt.findClassifierAcrossModuleDependencies(this.f88656a.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType h(int i11) {
        if (NameResolverUtilKt.getClassId(this.f88656a.getNameResolver(), i11).isLocal()) {
            return this.f88656a.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    private final ClassifierDescriptor i(int i11) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f88656a.getNameResolver(), i11);
        if (classId.isLocal()) {
            return null;
        }
        return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(this.f88656a.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType j(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        List listJ0 = v.j0(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
        ArrayList arrayList = new ArrayList(v.y(listJ0, 10));
        Iterator it = listJ0.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayList, null, kotlinType2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }

    private final SimpleType k(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z11) {
        List<? extends TypeProjection> list2;
        SimpleType simpleTypeL;
        int size;
        int size2 = typeConstructor.getParameters().size() - list.size();
        if (size2 != 0) {
            simpleTypeL = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                TypeConstructor typeConstructor2 = typeConstructor.getBuiltIns().getSuspendFunction(size).getTypeConstructor();
                s.j(typeConstructor2, "getTypeConstructor(...)");
                list2 = list;
                simpleTypeL = KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor2, list2, z11, (KotlinTypeRefiner) null, 16, (Object) null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            simpleTypeL = l(typeAttributes, typeConstructor, list2, z11);
        }
        return simpleTypeL == null ? ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list2, typeConstructor, new String[0]) : simpleTypeL;
    }

    private final SimpleType l(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z11) {
        SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor, list, z11, (KotlinTypeRefiner) null, 16, (Object) null);
        if (FunctionTypesKt.isFunctionType(simpleTypeSimpleType$default)) {
            return q(simpleTypeSimpleType$default);
        }
        return null;
    }

    private final TypeParameterDescriptor m(int i11) {
        TypeParameterDescriptor typeParameterDescriptor = this.f88662g.get(Integer.valueOf(i11));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.f88657b;
        if (typeDeserializer != null) {
            return typeDeserializer.m(i11);
        }
        return null;
    }

    private static final List<ProtoBuf.Type.Argument> n(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        s.j(argumentList, "getArgumentList(...)");
        List<ProtoBuf.Type.Argument> list = argumentList;
        ProtoBuf.Type typeOuterType = ProtoTypeTableUtilKt.outerType(type, typeDeserializer.f88656a.getTypeTable());
        List<ProtoBuf.Type.Argument> listN = typeOuterType != null ? n(typeOuterType, typeDeserializer) : null;
        if (listN == null) {
            listN = v.m();
        }
        return v.P0(list, listN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        return typeDeserializer.f88656a.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations(type, typeDeserializer.f88656a.getNameResolver());
    }

    private final TypeAttributes p(List<? extends TypeAttributeTranslator> list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List<? extends TypeAttributeTranslator> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).toAttributes(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.Companion.create(v.A(arrayList));
    }

    private final SimpleType q(KotlinType kotlinType) {
        KotlinType type;
        TypeProjection typeProjection = (TypeProjection) v.C0(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType));
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = type.getConstructor().mo500getDeclarationDescriptor();
        FqName fqNameSafe = classifierDescriptorMo500getDeclarationDescriptor != null ? DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo500getDeclarationDescriptor) : null;
        if (type.getArguments().size() != 1 || (!s.f(fqNameSafe, StandardNames.CONTINUATION_INTERFACE_FQ_NAME) && !s.f(fqNameSafe, TypeDeserializerKt.f88664a))) {
            return (SimpleType) kotlinType;
        }
        KotlinType type2 = ((TypeProjection) v.U0(type.getArguments())).getType();
        s.j(type2, "getType(...)");
        DeclarationDescriptor containingDeclaration = this.f88656a.getContainingDeclaration();
        CallableDescriptor callableDescriptor = containingDeclaration instanceof CallableDescriptor ? (CallableDescriptor) containingDeclaration : null;
        return s.f(callableDescriptor != null ? DescriptorUtilsKt.fqNameOrNull(callableDescriptor) : null, SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? j(kotlinType, type2) : j(kotlinType, type2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassifierDescriptor r(TypeDeserializer typeDeserializer, int i11) {
        return typeDeserializer.i(i11);
    }

    private final TypeProjection s(TypeParameterDescriptor typeParameterDescriptor, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
            return typeParameterDescriptor == null ? new StarProjectionForAbsentTypeParameter(this.f88656a.getComponents().getModuleDescriptor().getBuiltIns()) : new StarProjectionImpl(typeParameterDescriptor);
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
        s.j(projection, "getProjection(...)");
        Variance variance = protoEnumFlags.variance(projection);
        ProtoBuf.Type type = ProtoTypeTableUtilKt.type(argument, this.f88656a.getTypeTable());
        return type == null ? new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString())) : new TypeProjectionImpl(variance, type(type));
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return typeDeserializer.simpleType(type, z11);
    }

    private final TypeConstructor t(ProtoBuf.Type type) {
        ClassifierDescriptor classifierDescriptorInvoke;
        Object next;
        if (type.hasClassName()) {
            classifierDescriptorInvoke = this.f88660e.invoke(Integer.valueOf(type.getClassName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = u(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            classifierDescriptorInvoke = m(type.getTypeParameter());
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(type.getTypeParameter()), this.f88659d);
            }
        } else if (type.hasTypeParameterName()) {
            String string = this.f88656a.getNameResolver().getString(type.getTypeParameterName());
            Iterator<T> it = getOwnTypeParameters().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.f(((TypeParameterDescriptor) next).getName().asString(), string));
            classifierDescriptorInvoke = (TypeParameterDescriptor) next;
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f88656a.getContainingDeclaration().toString());
            }
        } else {
            if (!type.hasTypeAliasName()) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            classifierDescriptorInvoke = this.f88661f.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = u(this, type, type.getTypeAliasName());
            }
        }
        TypeConstructor typeConstructor = classifierDescriptorInvoke.getTypeConstructor();
        s.j(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }

    private static final ClassDescriptor u(TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i11) {
        ClassId classId = NameResolverUtilKt.getClassId(typeDeserializer.f88656a.getNameResolver(), i11);
        List<Integer> listD0 = ho0.l.d0(ho0.l.U(ho0.l.q(type, new p(typeDeserializer)), q.f88822a));
        int iB = ho0.l.B(ho0.l.q(classId, new e0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.a
            @Override // co0.o
            public Object get(Object obj) {
                return ((ClassId) obj).getOuterClassId();
            }

            @Override // p013kotlin.jvm.internal.f, co0.c
            public String getName() {
                return "outerClassId";
            }

            @Override // p013kotlin.jvm.internal.f
            public g getOwner() {
                return o0.b(ClassId.class);
            }

            @Override // p013kotlin.jvm.internal.f
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }));
        while (listD0.size() < iB) {
            listD0.add(0);
        }
        return typeDeserializer.f88656a.getComponents().getNotFoundClasses().getClass(classId, listD0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoBuf.Type v(TypeDeserializer typeDeserializer, ProtoBuf.Type it) {
        s.k(it, "it");
        return ProtoTypeTableUtilKt.outerType(it, typeDeserializer.f88656a.getTypeTable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(ProtoBuf.Type it) {
        s.k(it, "it");
        return it.getArgumentCount();
    }

    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return v.m1(this.f88662g.values());
    }

    public final SimpleType simpleType(ProtoBuf.Type proto, boolean z11) {
        SimpleType simpleTypeMakeDefinitelyNotNull$default;
        SimpleType simpleTypeWithAbbreviation;
        s.k(proto, "proto");
        SimpleType simpleTypeH = proto.hasClassName() ? h(proto.getClassName()) : proto.hasTypeAliasName() ? h(proto.getTypeAliasName()) : null;
        if (simpleTypeH != null) {
            return simpleTypeH;
        }
        TypeConstructor typeConstructorT = t(proto);
        if (ErrorUtils.isError(typeConstructorT.mo500getDeclarationDescriptor())) {
            return ErrorUtils.INSTANCE.createErrorType(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructorT, typeConstructorT.toString());
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.f88656a.getStorageManager(), new o(this, proto));
        TypeAttributes typeAttributesP = p(this.f88656a.getComponents().getTypeAttributeTranslators(), deserializedAnnotations, typeConstructorT, this.f88656a.getContainingDeclaration());
        List<ProtoBuf.Type.Argument> listN = n(proto, this);
        ArrayList arrayList = new ArrayList(v.y(listN, 10));
        int i11 = 0;
        for (Object obj : listN) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            List<TypeParameterDescriptor> parameters = typeConstructorT.getParameters();
            s.j(parameters, "getParameters(...)");
            arrayList.add(s((TypeParameterDescriptor) v.r0(parameters, i11), (ProtoBuf.Type.Argument) obj));
            i11 = i12;
        }
        List<? extends TypeProjection> listM1 = v.m1(arrayList);
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = typeConstructorT.mo500getDeclarationDescriptor();
        if (z11 && (classifierDescriptorMo500getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            SimpleType simpleTypeComputeExpandedType = KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorMo500getDeclarationDescriptor, listM1);
            simpleTypeMakeDefinitelyNotNull$default = simpleTypeComputeExpandedType.makeNullableAsSpecified(KotlinTypeKt.isNullable(simpleTypeComputeExpandedType) || proto.getNullable()).replaceAttributes(p(this.f88656a.getComponents().getTypeAttributeTranslators(), Annotations.Companion.create(v.N0(deserializedAnnotations, simpleTypeComputeExpandedType.getAnnotations())), typeConstructorT, this.f88656a.getContainingDeclaration()));
        } else if (Flags.SUSPEND_TYPE.get(proto.getFlags()).booleanValue()) {
            simpleTypeMakeDefinitelyNotNull$default = k(typeAttributesP, typeConstructorT, listM1, proto.getNullable());
        } else {
            SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(typeAttributesP, typeConstructorT, listM1, proto.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
            if (Flags.DEFINITELY_NOT_NULL_TYPE.get(proto.getFlags()).booleanValue()) {
                simpleTypeMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleTypeSimpleType$default, true, false, 4, null);
                if (simpleTypeMakeDefinitelyNotNull$default == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeSimpleType$default + CoreConstants.SINGLE_QUOTE_CHAR).toString());
                }
            } else {
                simpleTypeMakeDefinitelyNotNull$default = simpleTypeSimpleType$default;
            }
        }
        ProtoBuf.Type typeAbbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(proto, this.f88656a.getTypeTable());
        return (typeAbbreviatedType == null || (simpleTypeWithAbbreviation = SpecialTypesKt.withAbbreviation(simpleTypeMakeDefinitelyNotNull$default, simpleType(typeAbbreviatedType, false))) == null) ? simpleTypeMakeDefinitelyNotNull$default : simpleTypeWithAbbreviation;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f88658c);
        if (this.f88657b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f88657b.f88658c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final KotlinType type(ProtoBuf.Type proto) {
        s.k(proto, "proto");
        if (!proto.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(proto, true);
        }
        String string = this.f88656a.getNameResolver().getString(proto.getFlexibleTypeCapabilitiesId());
        SimpleType simpleTypeSimpleType$default = simpleType$default(this, proto, false, 2, null);
        ProtoBuf.Type typeFlexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(proto, this.f88656a.getTypeTable());
        s.h(typeFlexibleUpperBound);
        return this.f88656a.getComponents().getFlexibleTypeDeserializer().create(proto, string, simpleTypeSimpleType$default, simpleType$default(this, typeFlexibleUpperBound, false, 2, null));
    }
}
