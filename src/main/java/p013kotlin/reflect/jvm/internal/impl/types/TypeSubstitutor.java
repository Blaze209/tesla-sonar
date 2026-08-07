package p013kotlin.reflect.jvm.internal.impl.types;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import p013kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import p013kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public class TypeSubstitutor {
    public static final TypeSubstitutor EMPTY = create(TypeSubstitution.EMPTY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeSubstitution f88939a;

    static class a implements l<FqName, Boolean> {
        a() {
        }

        private static /* synthetic */ void a(int i11) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(FqName fqName) {
            if (fqName == null) {
                a(0);
            }
            return Boolean.valueOf(!fqName.equals(StandardNames.FqNames.unsafeVariance));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88940a;

        static {
            int[] iArr = new int[d.values().length];
            f88940a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88940a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88940a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected TypeSubstitutor(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            a(7);
        }
        this.f88939a = typeSubstitution;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        if (i11 != 1 && i11 != 2 && i11 != 8 && i11 != 34 && i11 != 37) {
            switch (i11) {
                default:
                    switch (i11) {
                        default:
                            switch (i11) {
                                default:
                                    switch (i11) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i11 != 1 && i11 != 2 && i11 != 8 && i11 != 34 && i11 != 37) {
            switch (i11) {
                case 11:
                case 12:
                case 13:
                    i12 = 2;
                    break;
                default:
                    switch (i11) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i12 = 2;
                            break;
                        default:
                            switch (i11) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i12 = 2;
                                    break;
                                default:
                                    switch (i11) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i12 = 2;
                                            break;
                                        default:
                                            i12 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i12 = 2;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = CoreConstants.CONTEXT_SCOPE_VALUE;
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i11 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i11 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i11 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i11 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i11 != 37) {
            switch (i11) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i11) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i11) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i11) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i11) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 1 && i11 != 2 && i11 != 8 && i11 != 34 && i11 != 37) {
            switch (i11) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i11) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i11) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i11) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    private static void b(int i11, TypeProjection typeProjection, TypeSubstitution typeSubstitution) {
        if (i11 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + f(typeProjection) + "; substitution: " + f(typeSubstitution));
    }

    private static d c(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return d.OUT_IN_IN_POSITION;
        }
        return (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static Variance combine(Variance variance, TypeProjection typeProjection) {
        if (variance == null) {
            a(35);
        }
        if (typeProjection == null) {
            a(36);
        }
        if (!typeProjection.isStarProjection()) {
            return combine(variance, typeProjection.getProjectionKind());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 == null) {
            a(37);
        }
        return variance2;
    }

    public static TypeSubstitutor create(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            a(0);
        }
        return new TypeSubstitutor(typeSubstitution);
    }

    public static TypeSubstitutor createChainedSubstitutor(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            a(3);
        }
        if (typeSubstitution2 == null) {
            a(4);
        }
        return create(DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
    }

    private static Annotations d(Annotations annotations) {
        if (annotations == null) {
            a(33);
        }
        return !annotations.hasAnnotation(StandardNames.FqNames.unsafeVariance) ? annotations : new FilteredAnnotations(annotations, new a());
    }

    private static TypeProjection e(KotlinType kotlinType, TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, TypeProjection typeProjection2) {
        if (kotlinType == null) {
            a(26);
        }
        if (typeProjection == null) {
            a(27);
        }
        if (typeProjection2 == null) {
            a(28);
        }
        if (!kotlinType.getAnnotations().hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
            if (typeProjection == null) {
                a(29);
            }
            return typeProjection;
        }
        TypeConstructor constructor = typeProjection.getType().getConstructor();
        if (!(constructor instanceof NewCapturedTypeConstructor)) {
            return typeProjection;
        }
        TypeProjection projection = ((NewCapturedTypeConstructor) constructor).getProjection();
        Variance projectionKind = projection.getProjectionKind();
        d dVarC = c(typeProjection2.getProjectionKind(), projectionKind);
        d dVar = d.OUT_IN_IN_POSITION;
        if (dVarC == dVar) {
            return new TypeProjectionImpl(projection.getType());
        }
        return (typeParameterDescriptor != null && c(typeParameterDescriptor.getVariance(), projectionKind) == dVar) ? new TypeProjectionImpl(projection.getType()) : typeProjection;
    }

    private static String f(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (ExceptionUtilsKt.isProcessCanceledException(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    private TypeProjection g(TypeProjection typeProjection, int i11) {
        KotlinType type = typeProjection.getType();
        Variance projectionKind = typeProjection.getProjectionKind();
        if (type.getConstructor().mo500getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        SimpleType abbreviation = SpecialTypesKt.getAbbreviation(type);
        KotlinType kotlinTypeSubstitute = abbreviation != null ? replaceWithNonApproximatingSubstitution().substitute(abbreviation, Variance.INVARIANT) : null;
        KotlinType kotlinTypeReplace = TypeSubstitutionKt.replace(type, h(type.getConstructor().getParameters(), type.getArguments(), i11), this.f88939a.filterAnnotations(type.getAnnotations()));
        if ((kotlinTypeReplace instanceof SimpleType) && (kotlinTypeSubstitute instanceof SimpleType)) {
            kotlinTypeReplace = SpecialTypesKt.withAbbreviation((SimpleType) kotlinTypeReplace, (SimpleType) kotlinTypeSubstitute);
        }
        return new TypeProjectionImpl(projectionKind, kotlinTypeReplace);
    }

    private List<TypeProjection> h(List<TypeParameterDescriptor> list, List<TypeProjection> list2, int i11) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z11 = false;
        for (int i12 = 0; i12 < list.size(); i12++) {
            TypeParameterDescriptor typeParameterDescriptor = list.get(i12);
            TypeProjection typeProjection = list2.get(i12);
            TypeProjection typeProjectionI = i(typeProjection, typeParameterDescriptor, i11 + 1);
            int i13 = b.f88940a[c(typeParameterDescriptor.getVariance(), typeProjectionI.getProjectionKind()).ordinal()];
            if (i13 == 1 || i13 == 2) {
                typeProjectionI = TypeUtils.makeStarProjection(typeParameterDescriptor);
            } else if (i13 == 3) {
                Variance variance = typeParameterDescriptor.getVariance();
                Variance variance2 = Variance.INVARIANT;
                if (variance != variance2 && !typeProjectionI.isStarProjection()) {
                    typeProjectionI = new TypeProjectionImpl(variance2, typeProjectionI.getType());
                }
            }
            if (typeProjectionI != typeProjection) {
                z11 = true;
            }
            arrayList.add(typeProjectionI);
        }
        return !z11 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private TypeProjection i(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, int i11) throws c {
        if (typeProjection == null) {
            a(18);
        }
        b(i11, typeProjection, this.f88939a);
        if (!typeProjection.isStarProjection()) {
            KotlinType type = typeProjection.getType();
            if (type instanceof TypeWithEnhancement) {
                TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
                UnwrappedType origin = typeWithEnhancement.getOrigin();
                KotlinType enhancement = typeWithEnhancement.getEnhancement();
                TypeProjection typeProjectionI = i(new TypeProjectionImpl(typeProjection.getProjectionKind(), origin), typeParameterDescriptor, i11 + 1);
                return typeProjectionI.isStarProjection() ? typeProjectionI : new TypeProjectionImpl(typeProjectionI.getProjectionKind(), TypeWithEnhancementKt.wrapEnhancement(typeProjectionI.getType().unwrap(), substitute(enhancement, typeProjection.getProjectionKind())));
            }
            if (!DynamicTypesKt.isDynamic(type) && !(type.unwrap() instanceof RawType)) {
                TypeProjection typeProjectionMo503get = this.f88939a.mo503get(type);
                TypeProjection typeProjectionE = typeProjectionMo503get != null ? e(type, typeProjectionMo503get, typeParameterDescriptor, typeProjection) : null;
                Variance projectionKind = typeProjection.getProjectionKind();
                if (typeProjectionE == null && FlexibleTypesKt.isFlexible(type) && !TypeCapabilitiesKt.isCustomTypeParameter(type)) {
                    FlexibleType flexibleTypeAsFlexibleType = FlexibleTypesKt.asFlexibleType(type);
                    int i12 = i11 + 1;
                    TypeProjection typeProjectionI2 = i(new TypeProjectionImpl(projectionKind, flexibleTypeAsFlexibleType.getLowerBound()), typeParameterDescriptor, i12);
                    TypeProjection typeProjectionI3 = i(new TypeProjectionImpl(projectionKind, flexibleTypeAsFlexibleType.getUpperBound()), typeParameterDescriptor, i12);
                    Variance projectionKind2 = typeProjectionI2.getProjectionKind();
                    if (typeProjectionI2.getType() != flexibleTypeAsFlexibleType.getLowerBound() || typeProjectionI3.getType() != flexibleTypeAsFlexibleType.getUpperBound()) {
                        return new TypeProjectionImpl(projectionKind2, KotlinTypeFactory.flexibleType(TypeSubstitutionKt.asSimpleType(typeProjectionI2.getType()), TypeSubstitutionKt.asSimpleType(typeProjectionI3.getType())));
                    }
                } else if (!KotlinBuiltIns.isNothing(type) && !KotlinTypeKt.isError(type)) {
                    if (typeProjectionE != null) {
                        d dVarC = c(projectionKind, typeProjectionE.getProjectionKind());
                        if (!CapturedTypeConstructorKt.isCaptured(type)) {
                            int i13 = b.f88940a[dVarC.ordinal()];
                            if (i13 == 1) {
                                throw new c("Out-projection in in-position");
                            }
                            if (i13 == 2) {
                                return new TypeProjectionImpl(Variance.OUT_VARIANCE, type.getConstructor().getBuiltIns().getNullableAnyType());
                            }
                        }
                        CustomTypeParameter customTypeParameter = TypeCapabilitiesKt.getCustomTypeParameter(type);
                        if (typeProjectionE.isStarProjection()) {
                            return typeProjectionE;
                        }
                        KotlinType kotlinTypeSubstitutionResult = customTypeParameter != null ? customTypeParameter.substitutionResult(typeProjectionE.getType()) : TypeUtils.makeNullableIfNeeded(typeProjectionE.getType(), type.isMarkedNullable());
                        if (!type.getAnnotations().isEmpty()) {
                            kotlinTypeSubstitutionResult = TypeUtilsKt.replaceAnnotations(kotlinTypeSubstitutionResult, new CompositeAnnotations(kotlinTypeSubstitutionResult.getAnnotations(), d(this.f88939a.filterAnnotations(type.getAnnotations()))));
                        }
                        if (dVarC == d.NO_CONFLICT) {
                            projectionKind = combine(projectionKind, typeProjectionE.getProjectionKind());
                        }
                        return new TypeProjectionImpl(projectionKind, kotlinTypeSubstitutionResult);
                    }
                    typeProjection = g(typeProjection, i11);
                    if (typeProjection == null) {
                        a(25);
                    }
                }
            }
        }
        return typeProjection;
    }

    public TypeSubstitution getSubstitution() {
        TypeSubstitution typeSubstitution = this.f88939a;
        if (typeSubstitution == null) {
            a(8);
        }
        return typeSubstitution;
    }

    public boolean isEmpty() {
        return this.f88939a.isEmpty();
    }

    public TypeSubstitutor replaceWithNonApproximatingSubstitution() {
        TypeSubstitution typeSubstitution = this.f88939a;
        return ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.approximateContravariantCapturedTypes()) ? new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution) this.f88939a).getParameters(), ((IndexedParametersSubstitution) this.f88939a).getArguments(), false)) : this;
    }

    public KotlinType safeSubstitute(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            a(9);
        }
        if (variance == null) {
            a(10);
        }
        if (isEmpty()) {
            if (kotlinType == null) {
                a(11);
            }
            return kotlinType;
        }
        try {
            KotlinType type = i(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e11) {
            ErrorType errorTypeCreateErrorType = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e11.getMessage());
            if (errorTypeCreateErrorType == null) {
                a(13);
            }
            return errorTypeCreateErrorType;
        }
    }

    public KotlinType substitute(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            a(14);
        }
        if (variance == null) {
            a(15);
        }
        TypeProjection typeProjectionSubstitute = substitute(new TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (typeProjectionSubstitute == null) {
            return null;
        }
        return typeProjectionSubstitute.getType();
    }

    public TypeProjection substituteWithoutApproximation(TypeProjection typeProjection) {
        if (typeProjection == null) {
            a(17);
        }
        if (isEmpty()) {
            return typeProjection;
        }
        try {
            return i(typeProjection, null, 0);
        } catch (c unused) {
            return null;
        }
    }

    public static TypeSubstitutor create(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(6);
        }
        return create(TypeConstructorSubstitution.create(kotlinType.getConstructor(), kotlinType.getArguments()));
    }

    public static Variance combine(Variance variance, Variance variance2) {
        if (variance == null) {
            a(38);
        }
        if (variance2 == null) {
            a(39);
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 == null) {
                a(40);
            }
            return variance2;
        }
        if (variance2 == variance3) {
            if (variance == null) {
                a(41);
            }
            return variance;
        }
        if (variance == variance2) {
            if (variance2 == null) {
                a(42);
            }
            return variance2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    public TypeProjection substitute(TypeProjection typeProjection) {
        if (typeProjection == null) {
            a(16);
        }
        TypeProjection typeProjectionSubstituteWithoutApproximation = substituteWithoutApproximation(typeProjection);
        return (this.f88939a.approximateCapturedTypes() || this.f88939a.approximateContravariantCapturedTypes()) ? CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(typeProjectionSubstituteWithoutApproximation, this.f88939a.approximateContravariantCapturedTypes()) : typeProjectionSubstituteWithoutApproximation;
    }
}
