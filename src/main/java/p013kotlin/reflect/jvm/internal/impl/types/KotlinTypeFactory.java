package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class KotlinTypeFactory {
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l<KotlinTypeRefiner, SimpleType> f88891a = a.f88892a;

    static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f88892a = new a();

        a() {
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(KotlinTypeRefiner kotlinTypeRefiner) {
            s.k(kotlinTypeRefiner, "<unused var>");
            return null;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SimpleType f88893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TypeConstructor f88894b;

        public b(SimpleType simpleType, TypeConstructor typeConstructor) {
            this.f88893a = simpleType;
            this.f88894b = typeConstructor;
        }

        public final SimpleType a() {
            return this.f88893a;
        }

        public final TypeConstructor b() {
            return this.f88894b;
        }
    }

    private KotlinTypeFactory() {
    }

    private final MemberScope c(TypeConstructor typeConstructor, List<? extends TypeProjection> list, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = typeConstructor.mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return ((TypeParameterDescriptor) classifierDescriptorMo500getDeclarationDescriptor).getDefaultType().getMemberScope();
        }
        if (classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtilsKt.getModule(classifierDescriptorMo500getDeclarationDescriptor));
            }
            return list.isEmpty() ? ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor, TypeConstructorSubstitution.Companion.create(typeConstructor, list), kotlinTypeRefiner);
        }
        if (classifierDescriptorMo500getDeclarationDescriptor instanceof TypeAliasDescriptor) {
            return ErrorUtils.createErrorScope(ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE, true, ((TypeAliasDescriptor) classifierDescriptorMo500getDeclarationDescriptor).getName().toString());
        }
        if (typeConstructor instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) typeConstructor).createScopeForKotlinType();
        }
        throw new IllegalStateException("Unsupported classifier: " + classifierDescriptorMo500getDeclarationDescriptor + " for constructor: " + typeConstructor);
    }

    public static final SimpleType computeExpandedType(TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> arguments) {
        s.k(typeAliasDescriptor, "<this>");
        s.k(arguments, "arguments");
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).expand(TypeAliasExpansion.Companion.create(null, typeAliasDescriptor, arguments), TypeAttributes.Companion.getEmpty());
    }

    private final b d(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List<? extends TypeProjection> list) {
        ClassifierDescriptor classifierDescriptorRefineDescriptor;
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = typeConstructor.mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor == null || (classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(classifierDescriptorMo500getDeclarationDescriptor)) == null) {
            return null;
        }
        if (classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor) {
            return new b(computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, list), null);
        }
        TypeConstructor typeConstructorRefine = classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner);
        s.j(typeConstructorRefine, "refine(...)");
        return new b(null, typeConstructorRefine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType e(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z11, KotlinTypeRefiner refiner) {
        s.k(refiner, "refiner");
        b bVarD = INSTANCE.d(typeConstructor, refiner, list);
        if (bVarD == null) {
            return null;
        }
        SimpleType simpleTypeA = bVarD.a();
        if (simpleTypeA != null) {
            return simpleTypeA;
        }
        TypeConstructor typeConstructorB = bVarD.b();
        s.h(typeConstructorB);
        return simpleType(typeAttributes, typeConstructorB, (List<? extends TypeProjection>) list, z11, refiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType f(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z11, MemberScope memberScope, KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        b bVarD = INSTANCE.d(typeConstructor, kotlinTypeRefiner, list);
        if (bVarD == null) {
            return null;
        }
        SimpleType simpleTypeA = bVarD.a();
        if (simpleTypeA != null) {
            return simpleTypeA;
        }
        TypeConstructor typeConstructorB = bVarD.b();
        s.h(typeConstructorB);
        return simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructorB, list, z11, memberScope);
    }

    public static final UnwrappedType flexibleType(SimpleType lowerBound, SimpleType upperBound) {
        s.k(lowerBound, "lowerBound");
        s.k(upperBound, "upperBound");
        return s.f(lowerBound, upperBound) ? lowerBound : new FlexibleTypeImpl(lowerBound, upperBound);
    }

    public static final SimpleType integerLiteralType(TypeAttributes attributes, IntegerLiteralTypeConstructor constructor, boolean z11) {
        s.k(attributes, "attributes");
        s.k(constructor, "constructor");
        return simpleTypeWithNonTrivialMemberScope(attributes, constructor, v.m(), z11, ErrorUtils.createErrorScope(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    public static final SimpleType simpleNotNullType(TypeAttributes attributes, ClassDescriptor descriptor, List<? extends TypeProjection> arguments) {
        s.k(attributes, "attributes");
        s.k(descriptor, "descriptor");
        s.k(arguments, "arguments");
        TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        s.j(typeConstructor, "getTypeConstructor(...)");
        return simpleType$default(attributes, typeConstructor, (List) arguments, false, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static final SimpleType simpleType(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z11) {
        s.k(attributes, "attributes");
        s.k(constructor, "constructor");
        s.k(arguments, "arguments");
        return simpleType$default(attributes, constructor, arguments, z11, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z11, KotlinTypeRefiner kotlinTypeRefiner, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return simpleType(typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z11, kotlinTypeRefiner);
    }

    public static final SimpleType simpleTypeWithNonTrivialMemberScope(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z11, MemberScope memberScope) {
        s.k(attributes, "attributes");
        s.k(constructor, "constructor");
        s.k(arguments, "arguments");
        s.k(memberScope, "memberScope");
        s sVar = new s(constructor, arguments, z11, memberScope, new o(constructor, arguments, attributes, z11, memberScope));
        return attributes.isEmpty() ? sVar : new t(sVar, attributes);
    }

    public static final SimpleType simpleType(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z11, KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(attributes, "attributes");
        s.k(constructor, "constructor");
        s.k(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z11 || constructor.mo500getDeclarationDescriptor() == null) {
            return simpleTypeWithNonTrivialMemberScope(attributes, constructor, arguments, z11, INSTANCE.c(constructor, arguments, kotlinTypeRefiner), new n(constructor, arguments, attributes, z11));
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = constructor.mo500getDeclarationDescriptor();
        s.h(classifierDescriptorMo500getDeclarationDescriptor);
        SimpleType defaultType = classifierDescriptorMo500getDeclarationDescriptor.getDefaultType();
        s.j(defaultType, "getDefaultType(...)");
        return defaultType;
    }

    public static /* synthetic */ SimpleType simpleType$default(SimpleType simpleType, TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        if ((i11 & 4) != 0) {
            typeConstructor = simpleType.getConstructor();
        }
        if ((i11 & 8) != 0) {
            list = simpleType.getArguments();
        }
        if ((i11 & 16) != 0) {
            z11 = simpleType.isMarkedNullable();
        }
        return simpleType(simpleType, typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z11);
    }

    public static final SimpleType simpleType(SimpleType baseType, TypeAttributes annotations, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z11) {
        s.k(baseType, "baseType");
        s.k(annotations, "annotations");
        s.k(constructor, "constructor");
        s.k(arguments, "arguments");
        return simpleType$default(annotations, constructor, arguments, z11, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static final SimpleType simpleTypeWithNonTrivialMemberScope(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z11, MemberScope memberScope, l<? super KotlinTypeRefiner, ? extends SimpleType> refinedTypeFactory) {
        s.k(attributes, "attributes");
        s.k(constructor, "constructor");
        s.k(arguments, "arguments");
        s.k(memberScope, "memberScope");
        s.k(refinedTypeFactory, "refinedTypeFactory");
        s sVar = new s(constructor, arguments, z11, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? sVar : new t(sVar, attributes);
    }
}
