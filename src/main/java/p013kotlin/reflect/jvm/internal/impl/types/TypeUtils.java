package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p013kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public class TypeUtils {
    public static final SimpleType DONT_CARE = ErrorUtils.createErrorType(ErrorTypeKind.DONT_CARE, new String[0]);
    public static final SimpleType CANNOT_INFER_FUNCTION_PARAM_TYPE = ErrorUtils.createErrorType(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);
    public static final SimpleType NO_EXPECTED_TYPE = new SpecialType("NO_EXPECTED_TYPE");
    public static final SimpleType UNIT_EXPECTED_TYPE = new SpecialType("UNIT_EXPECTED_TYPE");

    public static class SpecialType extends DelegatingSimpleType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f88941b;

        public SpecialType(String str) {
            this.f88941b = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        private static /* synthetic */ void b(int i11) {
            String str = (i11 == 1 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 4) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i11 == 2) {
                objArr[0] = "delegate";
            } else if (i11 == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i11 != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i11 == 1) {
                objArr[1] = "toString";
            } else if (i11 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i11 == 3) {
                    objArr[2] = "refine";
                } else if (i11 != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i11 != 1 && i11 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        protected SimpleType getDelegate() {
            throw new IllegalStateException(this.f88941b);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
        public SpecialType refine(KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner == null) {
                b(3);
            }
            return this;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        public DelegatingSimpleType replaceDelegate(SimpleType simpleType) {
            if (simpleType == null) {
                b(2);
            }
            throw new IllegalStateException(this.f88941b);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.SimpleType
        public String toString() {
            String str = this.f88941b;
            if (str == null) {
                b(1);
            }
            return str;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public SimpleType makeNullableAsSpecified(boolean z11) {
            throw new IllegalStateException(this.f88941b);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public SimpleType replaceAttributes(TypeAttributes typeAttributes) {
            if (typeAttributes == null) {
                b(0);
            }
            throw new IllegalStateException(this.f88941b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        if (i11 != 4 && i11 != 9 && i11 != 11 && i11 != 15 && i11 != 17 && i11 != 19 && i11 != 26 && i11 != 35 && i11 != 48 && i11 != 53 && i11 != 6 && i11 != 7) {
            switch (i11) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i11 != 4 && i11 != 9 && i11 != 11 && i11 != 15 && i11 != 17 && i11 != 19 && i11 != 26 && i11 != 35 && i11 != 48 && i11 != 53 && i11 != 6 && i11 != 7) {
            switch (i11) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i12 = 2;
                    break;
                default:
                    i12 = 3;
                    break;
            }
        } else {
            i12 = 2;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i11 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i11 == 11 || i11 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i11 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i11 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i11 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i11 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i11 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i11 != 53) {
            if (i11 != 6 && i11 != 7) {
                switch (i11) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i11) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 4 && i11 != 9 && i11 != 11 && i11 != 15 && i11 != 17 && i11 != 19 && i11 != 26 && i11 != 35 && i11 != 48 && i11 != 53 && i11 != 6 && i11 != 7) {
            switch (i11) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean acceptsNullable(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(28);
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        return FlexibleTypesKt.isFlexible(kotlinType) && acceptsNullable(FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound());
    }

    private static boolean b(KotlinType kotlinType, l<UnwrappedType, Boolean> lVar, SmartSet<KotlinType> smartSet) {
        if (lVar == null) {
            a(44);
        }
        if (kotlinType == null) {
            return false;
        }
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (noExpectedType(kotlinType)) {
            return lVar.invoke(unwrappedTypeUnwrap).booleanValue();
        }
        if (smartSet != null && smartSet.contains(kotlinType)) {
            return false;
        }
        if (lVar.invoke(unwrappedTypeUnwrap).booleanValue()) {
            return true;
        }
        if (smartSet == null) {
            smartSet = SmartSet.create();
        }
        smartSet.add(kotlinType);
        FlexibleType flexibleType = unwrappedTypeUnwrap instanceof FlexibleType ? (FlexibleType) unwrappedTypeUnwrap : null;
        if (flexibleType != null && (b(flexibleType.getLowerBound(), lVar, smartSet) || b(flexibleType.getUpperBound(), lVar, smartSet))) {
            return true;
        }
        if ((unwrappedTypeUnwrap instanceof DefinitelyNotNullType) && b(((DefinitelyNotNullType) unwrappedTypeUnwrap).getOriginal(), lVar, smartSet)) {
            return true;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            Iterator<KotlinType> it = ((IntersectionTypeConstructor) constructor).getSupertypes().iterator();
            while (it.hasNext()) {
                if (b(it.next(), lVar, smartSet)) {
                    return true;
                }
            }
            return false;
        }
        for (TypeProjection typeProjection : kotlinType.getArguments()) {
            if (!typeProjection.isStarProjection() && b(typeProjection.getType(), lVar, smartSet)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(KotlinType kotlinType, l<UnwrappedType, Boolean> lVar) {
        if (lVar == null) {
            a(43);
        }
        return b(kotlinType, lVar, null);
    }

    public static KotlinType createSubstitutedSupertype(KotlinType kotlinType, KotlinType kotlinType2, TypeSubstitutor typeSubstitutor) {
        if (kotlinType == null) {
            a(20);
        }
        if (kotlinType2 == null) {
            a(21);
        }
        if (typeSubstitutor == null) {
            a(22);
        }
        KotlinType kotlinTypeSubstitute = typeSubstitutor.substitute(kotlinType2, Variance.INVARIANT);
        if (kotlinTypeSubstitute != null) {
            return makeNullableIfNeeded(kotlinTypeSubstitute, kotlinType.isMarkedNullable());
        }
        return null;
    }

    public static ClassDescriptor getClassDescriptor(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(30);
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor;
        }
        return null;
    }

    public static List<TypeProjection> getDefaultTypeProjections(List<TypeParameterDescriptor> list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new TypeProjectionImpl(it.next().getDefaultType()));
        }
        List<TypeProjection> listM1 = v.m1(arrayList);
        if (listM1 == null) {
            a(17);
        }
        return listM1;
    }

    public static List<KotlinType> getImmediateSupertypes(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(18);
        }
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(kotlinType);
        Collection<KotlinType> supertypes = kotlinType.getConstructor().getSupertypes();
        ArrayList arrayList = new ArrayList(supertypes.size());
        Iterator<KotlinType> it = supertypes.iterator();
        while (it.hasNext()) {
            KotlinType kotlinTypeCreateSubstitutedSupertype = createSubstitutedSupertype(kotlinType, it.next(), typeSubstitutorCreate);
            if (kotlinTypeCreateSubstitutedSupertype != null) {
                arrayList.add(kotlinTypeCreateSubstitutedSupertype);
            }
        }
        return arrayList;
    }

    public static TypeParameterDescriptor getTypeParameterDescriptorOrNull(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(63);
        }
        if (kotlinType.getConstructor().mo500getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
            return (TypeParameterDescriptor) kotlinType.getConstructor().mo500getDeclarationDescriptor();
        }
        return null;
    }

    public static boolean hasNullableSuperType(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(29);
        }
        if (kotlinType.getConstructor().mo500getDeclarationDescriptor() instanceof ClassDescriptor) {
            return false;
        }
        Iterator<KotlinType> it = getImmediateSupertypes(kotlinType).iterator();
        while (it.hasNext()) {
            if (isNullableType(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDontCarePlaceholder(KotlinType kotlinType) {
        return kotlinType != null && kotlinType.getConstructor() == DONT_CARE.getConstructor();
    }

    public static boolean isNullableType(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(27);
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        if (FlexibleTypesKt.isFlexible(kotlinType) && isNullableType(FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound())) {
            return true;
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            return false;
        }
        if (isTypeParameter(kotlinType)) {
            return hasNullableSuperType(kotlinType);
        }
        if (kotlinType instanceof AbstractStubType) {
            TypeParameterDescriptor originalTypeParameter = ((AbstractStubType) kotlinType).getOriginalTypeVariable().getOriginalTypeParameter();
            return originalTypeParameter == null || hasNullableSuperType(originalTypeParameter.getDefaultType());
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            Iterator<KotlinType> it = constructor.getSupertypes().iterator();
            while (it.hasNext()) {
                if (isNullableType(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isTypeParameter(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(60);
        }
        return getTypeParameterDescriptorOrNull(kotlinType) != null || (kotlinType.getConstructor() instanceof NewTypeVariableConstructor);
    }

    public static KotlinType makeNotNullable(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(2);
        }
        return makeNullableAsSpecified(kotlinType, false);
    }

    public static KotlinType makeNullable(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(1);
        }
        return makeNullableAsSpecified(kotlinType, true);
    }

    public static KotlinType makeNullableAsSpecified(KotlinType kotlinType, boolean z11) {
        if (kotlinType == null) {
            a(3);
        }
        UnwrappedType unwrappedTypeMakeNullableAsSpecified = kotlinType.unwrap().makeNullableAsSpecified(z11);
        if (unwrappedTypeMakeNullableAsSpecified == null) {
            a(4);
        }
        return unwrappedTypeMakeNullableAsSpecified;
    }

    public static SimpleType makeNullableIfNeeded(SimpleType simpleType, boolean z11) {
        if (simpleType == null) {
            a(5);
        }
        if (!z11) {
            if (simpleType == null) {
                a(7);
            }
            return simpleType;
        }
        SimpleType simpleTypeMakeNullableAsSpecified = simpleType.makeNullableAsSpecified(true);
        if (simpleTypeMakeNullableAsSpecified == null) {
            a(6);
        }
        return simpleTypeMakeNullableAsSpecified;
    }

    public static TypeProjection makeStarProjection(TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null) {
            a(45);
        }
        return new StarProjectionImpl(typeParameterDescriptor);
    }

    public static SimpleType makeUnsubstitutedType(ClassifierDescriptor classifierDescriptor, MemberScope memberScope, l<KotlinTypeRefiner, SimpleType> lVar) {
        if (!ErrorUtils.isError(classifierDescriptor)) {
            return makeUnsubstitutedType(classifierDescriptor.getTypeConstructor(), memberScope, lVar);
        }
        ErrorType errorTypeCreateErrorType = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, classifierDescriptor.toString());
        if (errorTypeCreateErrorType == null) {
            a(11);
        }
        return errorTypeCreateErrorType;
    }

    public static boolean noExpectedType(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(0);
        }
        return kotlinType == NO_EXPECTED_TYPE || kotlinType == UNIT_EXPECTED_TYPE;
    }

    public static TypeProjection makeStarProjection(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        if (typeParameterDescriptor == null) {
            a(46);
        }
        return erasureTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE ? new TypeProjectionImpl(StarProjectionImplKt.starProjectionType(typeParameterDescriptor)) : new StarProjectionImpl(typeParameterDescriptor);
    }

    public static KotlinType makeNullableIfNeeded(KotlinType kotlinType, boolean z11) {
        if (kotlinType == null) {
            a(8);
        }
        if (z11) {
            return makeNullable(kotlinType);
        }
        if (kotlinType == null) {
            a(9);
        }
        return kotlinType;
    }

    public static SimpleType makeUnsubstitutedType(TypeConstructor typeConstructor, MemberScope memberScope, l<KotlinTypeRefiner, SimpleType> lVar) {
        if (typeConstructor == null) {
            a(12);
        }
        if (memberScope == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        SimpleType simpleTypeSimpleTypeWithNonTrivialMemberScope = KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), typeConstructor, getDefaultTypeProjections(typeConstructor.getParameters()), false, memberScope, lVar);
        if (simpleTypeSimpleTypeWithNonTrivialMemberScope == null) {
            a(15);
        }
        return simpleTypeSimpleTypeWithNonTrivialMemberScope;
    }
}
