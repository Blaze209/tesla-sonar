package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeAliasExpander {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TypeAliasExpander f88906c = new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeAliasExpansionReportStrategy f88907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f88908b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(int i11, TypeAliasDescriptor typeAliasDescriptor) {
            if (i11 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAliasDescriptor.getName());
        }

        private Companion() {
        }
    }

    public TypeAliasExpander(TypeAliasExpansionReportStrategy reportStrategy, boolean z11) {
        s.k(reportStrategy, "reportStrategy");
        this.f88907a = reportStrategy;
        this.f88908b = z11;
    }

    private final void a(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getFqName());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.getFqName())) {
                this.f88907a.repeatedAnnotation(annotationDescriptor);
            }
        }
    }

    private final void b(KotlinType kotlinType, KotlinType kotlinType2) {
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(kotlinType2);
        s.j(typeSubstitutorCreate, "create(...)");
        int i11 = 0;
        for (Object obj : kotlinType2.getArguments()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (!typeProjection.isStarProjection()) {
                KotlinType type = typeProjection.getType();
                s.j(type, "getType(...)");
                if (!TypeUtilsKt.containsTypeAliasParameters(type)) {
                    TypeProjection typeProjection2 = kotlinType.getArguments().get(i11);
                    TypeParameterDescriptor typeParameterDescriptor = kotlinType.getConstructor().getParameters().get(i11);
                    if (this.f88908b) {
                        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.f88907a;
                        KotlinType type2 = typeProjection2.getType();
                        s.j(type2, "getType(...)");
                        KotlinType type3 = typeProjection.getType();
                        s.j(type3, "getType(...)");
                        s.h(typeParameterDescriptor);
                        typeAliasExpansionReportStrategy.boundsViolationInSubstitution(typeSubstitutorCreate, type2, type3, typeParameterDescriptor);
                    }
                }
            }
            i11 = i12;
        }
    }

    private final DynamicType c(DynamicType dynamicType, TypeAttributes typeAttributes) {
        return dynamicType.replaceAttributes(h(dynamicType, typeAttributes));
    }

    private final SimpleType d(SimpleType simpleType, TypeAttributes typeAttributes) {
        return KotlinTypeKt.isError(simpleType) ? simpleType : TypeSubstitutionKt.replace$default(simpleType, null, h(simpleType, typeAttributes), 1, null);
    }

    private final SimpleType e(SimpleType simpleType, KotlinType kotlinType) {
        SimpleType simpleTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(simpleType, kotlinType.isMarkedNullable());
        s.j(simpleTypeMakeNullableIfNeeded, "makeNullableIfNeeded(...)");
        return simpleTypeMakeNullableIfNeeded;
    }

    private final SimpleType f(SimpleType simpleType, KotlinType kotlinType) {
        return d(e(simpleType, kotlinType), kotlinType.getAttributes());
    }

    private final SimpleType g(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z11) {
        TypeConstructor typeConstructor = typeAliasExpansion.getDescriptor().getTypeConstructor();
        s.j(typeConstructor, "getTypeConstructor(...)");
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, typeAliasExpansion.getArguments(), z11, MemberScope.Empty.INSTANCE);
    }

    private final TypeAttributes h(KotlinType kotlinType, TypeAttributes typeAttributes) {
        return KotlinTypeKt.isError(kotlinType) ? kotlinType.getAttributes() : typeAttributes.add(kotlinType.getAttributes());
    }

    private final TypeProjection i(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, int i11) {
        UnwrappedType unwrappedTypeUnwrap = typeProjection.getType().unwrap();
        if (!DynamicTypesKt.isDynamic(unwrappedTypeUnwrap)) {
            SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap);
            if (!KotlinTypeKt.isError(simpleTypeAsSimpleType) && TypeUtilsKt.requiresTypeAliasExpansion(simpleTypeAsSimpleType)) {
                TypeConstructor constructor = simpleTypeAsSimpleType.getConstructor();
                ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = constructor.mo500getDeclarationDescriptor();
                constructor.getParameters().size();
                simpleTypeAsSimpleType.getArguments().size();
                if (!(classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                    if (!(classifierDescriptorMo500getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
                        SimpleType simpleTypeL = l(simpleTypeAsSimpleType, typeAliasExpansion, i11);
                        b(simpleTypeAsSimpleType, simpleTypeL);
                        return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeL);
                    }
                    TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorMo500getDeclarationDescriptor;
                    if (typeAliasExpansion.isRecursion(typeAliasDescriptor)) {
                        this.f88907a.recursiveTypeAlias(typeAliasDescriptor);
                        return new TypeProjectionImpl(Variance.INVARIANT, ErrorUtils.createErrorType(ErrorTypeKind.RECURSIVE_TYPE_ALIAS, typeAliasDescriptor.getName().toString()));
                    }
                    List<TypeProjection> arguments = simpleTypeAsSimpleType.getArguments();
                    ArrayList arrayList = new ArrayList(v.y(arguments, 10));
                    int i12 = 0;
                    for (Object obj : arguments) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            v.x();
                        }
                        arrayList.add(k((TypeProjection) obj, typeAliasExpansion, constructor.getParameters().get(i12), i11 + 1));
                        i12 = i13;
                    }
                    SimpleType simpleTypeJ = j(TypeAliasExpansion.Companion.create(typeAliasExpansion, typeAliasDescriptor, arrayList), simpleTypeAsSimpleType.getAttributes(), simpleTypeAsSimpleType.isMarkedNullable(), i11 + 1, false);
                    SimpleType simpleTypeL2 = l(simpleTypeAsSimpleType, typeAliasExpansion, i11);
                    if (!DynamicTypesKt.isDynamic(simpleTypeJ)) {
                        simpleTypeJ = SpecialTypesKt.withAbbreviation(simpleTypeJ, simpleTypeL2);
                    }
                    return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeJ);
                }
            }
        }
        return typeProjection;
    }

    private final SimpleType j(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z11, int i11, boolean z12) {
        TypeProjection typeProjectionK = k(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.getDescriptor().getUnderlyingType()), typeAliasExpansion, null, i11);
        KotlinType type = typeProjectionK.getType();
        s.j(type, "getType(...)");
        SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(type);
        if (KotlinTypeKt.isError(simpleTypeAsSimpleType)) {
            return simpleTypeAsSimpleType;
        }
        typeProjectionK.getProjectionKind();
        a(simpleTypeAsSimpleType.getAnnotations(), AnnotationsTypeAttributeKt.getAnnotations(typeAttributes));
        SimpleType simpleTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(d(simpleTypeAsSimpleType, typeAttributes), z11);
        s.j(simpleTypeMakeNullableIfNeeded, "let(...)");
        return z12 ? SpecialTypesKt.withAbbreviation(simpleTypeMakeNullableIfNeeded, g(typeAliasExpansion, typeAttributes, z11)) : simpleTypeMakeNullableIfNeeded;
    }

    private final TypeProjection k(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i11) {
        Variance variance;
        Variance variance2;
        Variance variance3;
        Companion.a(i11, typeAliasExpansion.getDescriptor());
        if (typeProjection.isStarProjection()) {
            s.h(typeParameterDescriptor);
            TypeProjection typeProjectionMakeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor);
            s.j(typeProjectionMakeStarProjection, "makeStarProjection(...)");
            return typeProjectionMakeStarProjection;
        }
        KotlinType type = typeProjection.getType();
        s.j(type, "getType(...)");
        TypeProjection replacement = typeAliasExpansion.getReplacement(type.getConstructor());
        if (replacement == null) {
            return i(typeProjection, typeAliasExpansion, i11);
        }
        if (replacement.isStarProjection()) {
            s.h(typeParameterDescriptor);
            TypeProjection typeProjectionMakeStarProjection2 = TypeUtils.makeStarProjection(typeParameterDescriptor);
            s.j(typeProjectionMakeStarProjection2, "makeStarProjection(...)");
            return typeProjectionMakeStarProjection2;
        }
        UnwrappedType unwrappedTypeUnwrap = replacement.getType().unwrap();
        Variance projectionKind = replacement.getProjectionKind();
        s.j(projectionKind, "getProjectionKind(...)");
        Variance projectionKind2 = typeProjection.getProjectionKind();
        s.j(projectionKind2, "getProjectionKind(...)");
        if (projectionKind2 != projectionKind && projectionKind2 != (variance3 = Variance.INVARIANT)) {
            if (projectionKind == variance3) {
                projectionKind = projectionKind2;
            } else {
                this.f88907a.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
            }
        }
        if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
            variance = Variance.INVARIANT;
        }
        if (variance != projectionKind && variance != (variance2 = Variance.INVARIANT)) {
            if (projectionKind == variance2) {
                projectionKind = variance2;
            } else {
                this.f88907a.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
            }
        }
        a(type.getAnnotations(), unwrappedTypeUnwrap.getAnnotations());
        return new TypeProjectionImpl(projectionKind, unwrappedTypeUnwrap instanceof DynamicType ? c((DynamicType) unwrappedTypeUnwrap, type.getAttributes()) : f(TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap), type));
    }

    private final SimpleType l(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i11) {
        TypeConstructor constructor = simpleType.getConstructor();
        List<TypeProjection> arguments = simpleType.getArguments();
        ArrayList arrayList = new ArrayList(v.y(arguments, 10));
        int i12 = 0;
        for (Object obj : arguments) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                v.x();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection typeProjectionK = k(typeProjection, typeAliasExpansion, constructor.getParameters().get(i12), i11 + 1);
            if (!typeProjectionK.isStarProjection()) {
                typeProjectionK = new TypeProjectionImpl(typeProjectionK.getProjectionKind(), TypeUtils.makeNullableIfNeeded(typeProjectionK.getType(), typeProjection.getType().isMarkedNullable()));
            }
            arrayList.add(typeProjectionK);
            i12 = i13;
        }
        return TypeSubstitutionKt.replace$default(simpleType, arrayList, null, 2, null);
    }

    public final SimpleType expand(TypeAliasExpansion typeAliasExpansion, TypeAttributes attributes) {
        s.k(typeAliasExpansion, "typeAliasExpansion");
        s.k(attributes, "attributes");
        return j(typeAliasExpansion, attributes, false, 0, true);
    }
}
