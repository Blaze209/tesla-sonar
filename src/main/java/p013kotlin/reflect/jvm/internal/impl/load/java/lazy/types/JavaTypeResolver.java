package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.IndexedValue;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p013kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import p013kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaTypeResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeParameterResolver f87402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RawProjectionComputer f87403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TypeParameterUpperBoundEraser f87404d;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeResolver(LazyJavaResolverContext c11, TypeParameterResolver typeParameterResolver) {
        s.k(c11, "c");
        s.k(typeParameterResolver, "typeParameterResolver");
        this.f87401a = c11;
        this.f87402b = typeParameterResolver;
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f87403c = rawProjectionComputer;
        this.f87404d = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(JavaClassifierType javaClassifierType, ClassDescriptor classDescriptor) {
        Variance variance;
        if (!JavaTypesKt.isSuperWildcard((JavaType) v.C0(javaClassifierType.getTypeArguments()))) {
            return false;
        }
        List<TypeParameterDescriptor> parameters = JavaToKotlinClassMapper.INSTANCE.convertReadOnlyToMutable(classDescriptor).getTypeConstructor().getParameters();
        s.j(parameters, "getParameters(...)");
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) v.C0(parameters);
        return (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null || variance == Variance.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    private final List<TypeProjection> c(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor) {
        boolean z11;
        if (!javaClassifierType.isRaw()) {
            if (javaClassifierType.getTypeArguments().isEmpty()) {
                List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
                s.j(parameters, "getParameters(...)");
                z11 = parameters.isEmpty() ? false : true;
            }
        }
        List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
        s.j(parameters2, "getParameters(...)");
        if (z11) {
            return d(javaClassifierType, parameters2, typeConstructor, javaTypeAttributes);
        }
        if (parameters2.size() != javaClassifierType.getTypeArguments().size()) {
            List<TypeParameterDescriptor> list = parameters2;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, ((TypeParameterDescriptor) it.next()).getName().asString())));
            }
            return v.m1(arrayList);
        }
        Iterable<IndexedValue> iterableT1 = v.t1(javaClassifierType.getTypeArguments());
        ArrayList arrayList2 = new ArrayList(v.y(iterableT1, 10));
        for (IndexedValue indexedValue : iterableT1) {
            int index = indexedValue.getIndex();
            JavaType javaType = (JavaType) indexedValue.b();
            parameters2.size();
            TypeParameterDescriptor typeParameterDescriptor = parameters2.get(index);
            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            s.h(typeParameterDescriptor);
            arrayList2.add(n(javaType, attributes$default, typeParameterDescriptor));
        }
        return v.m1(arrayList2);
    }

    private final List<TypeProjection> d(JavaClassifierType javaClassifierType, List<? extends TypeParameterDescriptor> list, TypeConstructor typeConstructor, JavaTypeAttributes javaTypeAttributes) {
        JavaClassifierType javaClassifierType2;
        TypeConstructor typeConstructor2;
        JavaTypeAttributes javaTypeAttributes2;
        TypeProjection typeProjectionComputeProjection;
        List<? extends TypeParameterDescriptor> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list2) {
            if (TypeUtilsKt.hasTypeParameterRecursiveBounds(typeParameterDescriptor, null, javaTypeAttributes.getVisitedTypeParameters())) {
                typeProjectionComputeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
                javaClassifierType2 = javaClassifierType;
                typeConstructor2 = typeConstructor;
                javaTypeAttributes2 = javaTypeAttributes;
            } else {
                javaClassifierType2 = javaClassifierType;
                typeConstructor2 = typeConstructor;
                javaTypeAttributes2 = javaTypeAttributes;
                typeProjectionComputeProjection = this.f87403c.computeProjection(typeParameterDescriptor, javaTypeAttributes2.markIsRaw(javaClassifierType2.isRaw()), this.f87404d, new LazyWrappedType(this.f87401a.getStorageManager(), new a(this, typeParameterDescriptor, javaTypeAttributes2, typeConstructor2, javaClassifierType2)));
            }
            arrayList.add(typeProjectionComputeProjection);
            javaTypeAttributes = javaTypeAttributes2;
            typeConstructor = typeConstructor2;
            javaClassifierType = javaClassifierType2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType e(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = javaTypeResolver.f87404d;
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = typeConstructor.mo500getDeclarationDescriptor();
        return typeParameterUpperBoundEraser.getErasedUpperBound(typeParameterDescriptor, javaTypeAttributes.withDefaultType(classifierDescriptorMo500getDeclarationDescriptor != null ? classifierDescriptorMo500getDeclarationDescriptor.getDefaultType() : null).markIsRaw(javaClassifierType.isRaw()));
    }

    private final SimpleType f(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        JavaClassifierType javaClassifierType2;
        TypeAttributes defaultAttributes;
        if (simpleType == null || (defaultAttributes = simpleType.getAttributes()) == null) {
            javaClassifierType2 = javaClassifierType;
            defaultAttributes = TypeAttributesKt.toDefaultAttributes(new LazyJavaAnnotations(this.f87401a, javaClassifierType2, false, 4, null));
        } else {
            javaClassifierType2 = javaClassifierType;
        }
        TypeAttributes typeAttributes = defaultAttributes;
        TypeConstructor typeConstructorG = g(javaClassifierType2, javaTypeAttributes);
        if (typeConstructorG == null) {
            return null;
        }
        boolean zJ = j(javaTypeAttributes);
        return (s.f(simpleType != null ? simpleType.getConstructor() : null, typeConstructorG) && !javaClassifierType2.isRaw() && zJ) ? simpleType.makeNullableAsSpecified(true) : KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructorG, c(javaClassifierType2, javaTypeAttributes, typeConstructorG), zJ, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    private final TypeConstructor g(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        TypeConstructor typeConstructor;
        JavaClassifier classifier = javaClassifierType.getClassifier();
        if (classifier == null) {
            return h(javaClassifierType);
        }
        if (!(classifier instanceof JavaClass)) {
            if (classifier instanceof JavaTypeParameter) {
                TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = this.f87402b.resolveTypeParameter((JavaTypeParameter) classifier);
                if (typeParameterDescriptorResolveTypeParameter != null) {
                    return typeParameterDescriptorResolveTypeParameter.getTypeConstructor();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + classifier);
        }
        JavaClass javaClass = (JavaClass) classifier;
        FqName fqName = javaClass.getFqName();
        if (fqName != null) {
            ClassDescriptor classDescriptorK = k(javaClassifierType, javaTypeAttributes, fqName);
            if (classDescriptorK == null) {
                classDescriptorK = this.f87401a.getComponents().getModuleClassResolver().resolveClass(javaClass);
            }
            return (classDescriptorK == null || (typeConstructor = classDescriptorK.getTypeConstructor()) == null) ? h(javaClassifierType) : typeConstructor;
        }
        throw new AssertionError("Class type should have a FQ name: " + classifier);
    }

    private final TypeConstructor h(JavaClassifierType javaClassifierType) {
        TypeConstructor typeConstructor = this.f87401a.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(ClassId.Companion.topLevel(new FqName(javaClassifierType.getClassifierQualifiedName())), v.e(0)).getTypeConstructor();
        s.j(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }

    private final boolean i(Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        return (typeParameterDescriptor.getVariance() == Variance.INVARIANT || variance == typeParameterDescriptor.getVariance()) ? false : true;
    }

    private final boolean j(JavaTypeAttributes javaTypeAttributes) {
        return (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
    }

    private final ClassDescriptor k(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, FqName fqName) {
        if (javaTypeAttributes.isForAnnotationParameter() && s.f(fqName, JavaTypeResolverKt.f87405a)) {
            return this.f87401a.getComponents().getReflectionTypes().getKClass();
        }
        JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
        ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper, fqName, this.f87401a.getModule().getBuiltIns(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            return null;
        }
        return (javaToKotlinClassMapper.isReadOnly(classDescriptorMapJavaToKotlin$default) && (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE || b(javaClassifierType, classDescriptorMapJavaToKotlin$default))) ? javaToKotlinClassMapper.convertReadOnlyToMutable(classDescriptorMapJavaToKotlin$default) : classDescriptorMapJavaToKotlin$default;
    }

    private final KotlinType l(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        boolean z11 = (javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
        boolean zIsRaw = javaClassifierType.isRaw();
        if (!zIsRaw && !z11) {
            SimpleType simpleTypeF = f(javaClassifierType, javaTypeAttributes, null);
            return simpleTypeF != null ? simpleTypeF : m(javaClassifierType);
        }
        SimpleType simpleTypeF2 = f(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (simpleTypeF2 == null) {
            return m(javaClassifierType);
        }
        SimpleType simpleTypeF3 = f(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), simpleTypeF2);
        if (simpleTypeF3 == null) {
            return m(javaClassifierType);
        }
        return zIsRaw ? new RawTypeImpl(simpleTypeF2, simpleTypeF3) : KotlinTypeFactory.flexibleType(simpleTypeF2, simpleTypeF3);
    }

    private static final ErrorType m(JavaClassifierType javaClassifierType) {
        return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
    }

    private final TypeProjection n(JavaType javaType, JavaTypeAttributes javaTypeAttributes, TypeParameterDescriptor typeParameterDescriptor) {
        if (!(javaType instanceof JavaWildcardType)) {
            return new TypeProjectionImpl(Variance.INVARIANT, transformJavaType(javaType, javaTypeAttributes));
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        JavaType bound = javaWildcardType.getBound();
        Variance variance = javaWildcardType.isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
        if (bound == null || i(variance, typeParameterDescriptor)) {
            TypeProjection typeProjectionMakeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
            s.j(typeProjectionMakeStarProjection, "makeStarProjection(...)");
            return typeProjectionMakeStarProjection;
        }
        AnnotationDescriptor annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard = UtilsKt.extractNullabilityAnnotationOnBoundedWildcard(this.f87401a, javaWildcardType);
        KotlinType kotlinTypeTransformJavaType = transformJavaType(bound, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
        if (annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard != null) {
            kotlinTypeTransformJavaType = TypeUtilsKt.replaceAnnotations(kotlinTypeTransformJavaType, Annotations.Companion.create(v.O0(kotlinTypeTransformJavaType.getAnnotations(), annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard)));
        }
        return TypeUtilsKt.createProjection(kotlinTypeTransformJavaType, variance, typeParameterDescriptor);
    }

    public static /* synthetic */ KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z11);
    }

    public final KotlinType transformArrayType(JavaArrayType arrayType, JavaTypeAttributes attr, boolean z11) {
        s.k(arrayType, "arrayType");
        s.k(attr, "attr");
        JavaType componentType = arrayType.getComponentType();
        JavaPrimitiveType javaPrimitiveType = componentType instanceof JavaPrimitiveType ? (JavaPrimitiveType) componentType : null;
        PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.f87401a, arrayType, true);
        if (type != null) {
            SimpleType primitiveArrayKotlinType = this.f87401a.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type);
            s.h(primitiveArrayKotlinType);
            KotlinType kotlinTypeReplaceAnnotations = TypeUtilsKt.replaceAnnotations(primitiveArrayKotlinType, new CompositeAnnotations(primitiveArrayKotlinType.getAnnotations(), lazyJavaAnnotations));
            s.i(kotlinTypeReplaceAnnotations, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            SimpleType simpleType = (SimpleType) kotlinTypeReplaceAnnotations;
            return attr.isForAnnotationParameter() ? simpleType : KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        }
        KotlinType kotlinTypeTransformJavaType = transformJavaType(componentType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, attr.isForAnnotationParameter(), false, null, 6, null));
        if (attr.isForAnnotationParameter()) {
            SimpleType arrayType2 = this.f87401a.getModule().getBuiltIns().getArrayType(z11 ? Variance.OUT_VARIANCE : Variance.INVARIANT, kotlinTypeTransformJavaType, lazyJavaAnnotations);
            s.j(arrayType2, "getArrayType(...)");
            return arrayType2;
        }
        SimpleType arrayType3 = this.f87401a.getModule().getBuiltIns().getArrayType(Variance.INVARIANT, kotlinTypeTransformJavaType, lazyJavaAnnotations);
        s.j(arrayType3, "getArrayType(...)");
        return KotlinTypeFactory.flexibleType(arrayType3, this.f87401a.getModule().getBuiltIns().getArrayType(Variance.OUT_VARIANCE, kotlinTypeTransformJavaType, lazyJavaAnnotations).makeNullableAsSpecified(true));
    }

    public final KotlinType transformJavaType(JavaType javaType, JavaTypeAttributes attr) {
        KotlinType kotlinTypeTransformJavaType;
        s.k(attr, "attr");
        if (javaType instanceof JavaPrimitiveType) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            SimpleType primitiveKotlinType = type != null ? this.f87401a.getModule().getBuiltIns().getPrimitiveKotlinType(type) : this.f87401a.getModule().getBuiltIns().getUnitType();
            s.h(primitiveKotlinType);
            return primitiveKotlinType;
        }
        if (javaType instanceof JavaClassifierType) {
            return l((JavaClassifierType) javaType, attr);
        }
        if (javaType instanceof JavaArrayType) {
            return transformArrayType$default(this, (JavaArrayType) javaType, attr, false, 4, null);
        }
        if (javaType instanceof JavaWildcardType) {
            JavaType bound = ((JavaWildcardType) javaType).getBound();
            if (bound != null && (kotlinTypeTransformJavaType = transformJavaType(bound, attr)) != null) {
                return kotlinTypeTransformJavaType;
            }
            SimpleType defaultBound = this.f87401a.getModule().getBuiltIns().getDefaultBound();
            s.j(defaultBound, "getDefaultBound(...)");
            return defaultBound;
        }
        if (javaType == null) {
            SimpleType defaultBound2 = this.f87401a.getModule().getBuiltIns().getDefaultBound();
            s.j(defaultBound2, "getDefaultBound(...)");
            return defaultBound2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + javaType);
    }
}
