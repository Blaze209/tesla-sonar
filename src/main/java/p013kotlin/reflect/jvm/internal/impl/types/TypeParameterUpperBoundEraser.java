package p013kotlin.reflect.jvm.internal.impl.types;

import bo0.n;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import jn0.m;
import jn0.x;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import p013kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeParameterUpperBoundEraser {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ErasureProjectionComputer f88929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeParameterErasureOptions f88930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LockBasedStorageManager f88931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f88932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<a, KotlinType> f88933e;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:57:0x013a  */
        /* JADX WARN: Code duplicated, block: B:88:0x01d5  */
        public final KotlinType replaceArgumentsOfUpperBound(KotlinType kotlinType, TypeSubstitutor substitutor, Set<? extends TypeParameterDescriptor> set, boolean z11) {
            UnwrappedType unwrappedTypeReplace$default;
            KotlinType type;
            KotlinType type2;
            KotlinType type3;
            s.k(kotlinType, "<this>");
            s.k(substitutor, "substitutor");
            UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
            if (unwrappedTypeUnwrap instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
                SimpleType lowerBound = flexibleType.getLowerBound();
                if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo500getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                    s.j(parameters, "getParameters(...)");
                    List<TypeParameterDescriptor> list = parameters;
                    ArrayList arrayList = new ArrayList(v.y(list, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor : list) {
                        TypeProjection starProjectionImpl = (TypeProjection) v.r0(kotlinType.getArguments(), typeParameterDescriptor.getIndex());
                        if (!z11 || starProjectionImpl == null || (type3 = starProjectionImpl.getType()) == null || TypeUtilsKt.containsTypeParameter(type3)) {
                            boolean z12 = set != null && set.contains(typeParameterDescriptor);
                            if (starProjectionImpl == null || z12) {
                                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                            } else {
                                TypeSubstitution substitution = substitutor.getSubstitution();
                                KotlinType type4 = starProjectionImpl.getType();
                                s.j(type4, "getType(...)");
                                if (substitution.mo503get(type4) == null) {
                                    starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                                }
                            }
                        }
                        arrayList.add(starProjectionImpl);
                    }
                    lowerBound = TypeSubstitutionKt.replace$default(lowerBound, arrayList, null, 2, null);
                }
                SimpleType upperBound = flexibleType.getUpperBound();
                if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo500getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                    s.j(parameters2, "getParameters(...)");
                    List<TypeParameterDescriptor> list2 = parameters2;
                    ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor2 : list2) {
                        TypeProjection starProjectionImpl2 = (TypeProjection) v.r0(kotlinType.getArguments(), typeParameterDescriptor2.getIndex());
                        if (!z11 || starProjectionImpl2 == null || (type2 = starProjectionImpl2.getType()) == null || TypeUtilsKt.containsTypeParameter(type2)) {
                            boolean z13 = set != null && set.contains(typeParameterDescriptor2);
                            if (starProjectionImpl2 == null || z13) {
                                starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                            } else {
                                TypeSubstitution substitution2 = substitutor.getSubstitution();
                                KotlinType type5 = starProjectionImpl2.getType();
                                s.j(type5, "getType(...)");
                                if (substitution2.mo503get(type5) == null) {
                                    starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                                }
                            }
                        }
                        arrayList2.add(starProjectionImpl2);
                    }
                    upperBound = TypeSubstitutionKt.replace$default(upperBound, arrayList2, null, 2, null);
                }
                unwrappedTypeReplace$default = KotlinTypeFactory.flexibleType(lowerBound, upperBound);
            } else {
                if (!(unwrappedTypeUnwrap instanceof SimpleType)) {
                    throw new NoWhenBranchMatchedException();
                }
                SimpleType simpleType = (SimpleType) unwrappedTypeUnwrap;
                if (simpleType.getConstructor().getParameters().isEmpty() || simpleType.getConstructor().mo500getDeclarationDescriptor() == null) {
                    unwrappedTypeReplace$default = simpleType;
                } else {
                    List<TypeParameterDescriptor> parameters3 = simpleType.getConstructor().getParameters();
                    s.j(parameters3, "getParameters(...)");
                    List<TypeParameterDescriptor> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(v.y(list3, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor3 : list3) {
                        TypeProjection starProjectionImpl3 = (TypeProjection) v.r0(kotlinType.getArguments(), typeParameterDescriptor3.getIndex());
                        if (!z11 || starProjectionImpl3 == null || (type = starProjectionImpl3.getType()) == null || TypeUtilsKt.containsTypeParameter(type)) {
                            boolean z14 = set != null && set.contains(typeParameterDescriptor3);
                            if (starProjectionImpl3 == null || z14) {
                                starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                            } else {
                                TypeSubstitution substitution3 = substitutor.getSubstitution();
                                KotlinType type6 = starProjectionImpl3.getType();
                                s.j(type6, "getType(...)");
                                if (substitution3.mo503get(type6) == null) {
                                    starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                                }
                            }
                        }
                        arrayList3.add(starProjectionImpl3);
                    }
                    unwrappedTypeReplace$default = TypeSubstitutionKt.replace$default(simpleType, arrayList3, null, 2, null);
                }
            }
            KotlinType kotlinTypeSafeSubstitute = substitutor.safeSubstitute(TypeWithEnhancementKt.inheritEnhancement(unwrappedTypeReplace$default, unwrappedTypeUnwrap), Variance.OUT_VARIANCE);
            s.j(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
            return kotlinTypeSafeSubstitute;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TypeParameterDescriptor f88934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ErasureTypeAttributes f88935b;

        public a(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
            s.k(typeParameter, "typeParameter");
            s.k(typeAttr, "typeAttr");
            this.f88934a = typeParameter;
            this.f88935b = typeAttr;
        }

        public final ErasureTypeAttributes a() {
            return this.f88935b;
        }

        public final TypeParameterDescriptor b() {
            return this.f88934a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.f(aVar.f88934a, this.f88934a) && s.f(aVar.f88935b, this.f88935b);
        }

        public int hashCode() {
            int iHashCode = this.f88934a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f88935b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f88934a + ", typeAttr=" + this.f88935b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public TypeParameterUpperBoundEraser(ErasureProjectionComputer projectionComputer, TypeParameterErasureOptions options) {
        s.k(projectionComputer, "projectionComputer");
        s.k(options, "options");
        this.f88929a = projectionComputer;
        this.f88930b = options;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.f88931c = lockBasedStorageManager;
        this.f88932d = m.b(new v(this));
        MemoizedFunctionToNotNull<a, KotlinType> memoizedFunctionToNotNullCreateMemoizedFunction = lockBasedStorageManager.createMemoizedFunction(new w(this));
        s.j(memoizedFunctionToNotNullCreateMemoizedFunction, "createMemoizedFunction(...)");
        this.f88933e = memoizedFunctionToNotNullCreateMemoizedFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ErrorType c(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        return ErrorUtils.createErrorType(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, typeParameterUpperBoundEraser.toString());
    }

    private final KotlinType d(ErasureTypeAttributes erasureTypeAttributes) {
        KotlinType kotlinTypeReplaceArgumentsWithStarProjections;
        SimpleType defaultType = erasureTypeAttributes.getDefaultType();
        return (defaultType == null || (kotlinTypeReplaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) == null) ? g() : kotlinTypeReplaceArgumentsWithStarProjections;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType e(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, a aVar) {
        return typeParameterUpperBoundEraser.f(aVar.b(), aVar.a());
    }

    private final KotlinType f(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        TypeProjection typeProjectionComputeProjection;
        Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
        if (visitedTypeParameters != null && visitedTypeParameters.contains(typeParameterDescriptor.getOriginal())) {
            return d(erasureTypeAttributes);
        }
        SimpleType defaultType = typeParameterDescriptor.getDefaultType();
        s.j(defaultType, "getDefaultType(...)");
        Set<TypeParameterDescriptor> setExtractTypeParametersFromUpperBounds = TypeUtilsKt.extractTypeParametersFromUpperBounds(defaultType, visitedTypeParameters);
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(setExtractTypeParametersFromUpperBounds, 10)), 16));
        for (TypeParameterDescriptor typeParameterDescriptor2 : setExtractTypeParametersFromUpperBounds) {
            if (visitedTypeParameters == null || !visitedTypeParameters.contains(typeParameterDescriptor2)) {
                typeProjectionComputeProjection = this.f88929a.computeProjection(typeParameterDescriptor2, erasureTypeAttributes, this, getErasedUpperBound(typeParameterDescriptor2, erasureTypeAttributes.withNewVisitedTypeParameter(typeParameterDescriptor)));
            } else {
                typeProjectionComputeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor2, erasureTypeAttributes);
                s.j(typeProjectionComputeProjection, "makeStarProjection(...)");
            }
            Pair pairA = x.a(typeParameterDescriptor2.getTypeConstructor(), typeProjectionComputeProjection);
            linkedHashMap.put(pairA.e(), pairA.f());
        }
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(TypeConstructorSubstitution.Companion.createByConstructorsMap$default(TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
        s.j(typeSubstitutorCreate, "create(...)");
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        s.j(upperBounds, "getUpperBounds(...)");
        Set<KotlinType> setH = h(typeSubstitutorCreate, upperBounds, erasureTypeAttributes);
        if (setH.isEmpty()) {
            return d(erasureTypeAttributes);
        }
        if (!this.f88930b.getIntersectUpperBounds()) {
            if (setH.size() == 1) {
                return (KotlinType) v.T0(setH);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listM1 = v.m1(setH);
        ArrayList arrayList = new ArrayList(v.y(listM1, 10));
        Iterator it = listM1.iterator();
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).unwrap());
        }
        return IntersectionTypeKt.intersectTypes(arrayList);
    }

    private final ErrorType g() {
        return (ErrorType) this.f88932d.getValue();
    }

    private final Set<KotlinType> h(TypeSubstitutor typeSubstitutor, List<? extends KotlinType> list, ErasureTypeAttributes erasureTypeAttributes) {
        Set setB = d1.b();
        for (KotlinType kotlinType : list) {
            ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
            if (classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor) {
                setB.add(Companion.replaceArgumentsOfUpperBound(kotlinType, typeSubstitutor, erasureTypeAttributes.getVisitedTypeParameters(), this.f88930b.getLeaveNonTypeParameterTypes()));
            } else if (classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
                if (visitedTypeParameters == null || !visitedTypeParameters.contains(classifierDescriptorMo500getDeclarationDescriptor)) {
                    List<KotlinType> upperBounds = ((TypeParameterDescriptor) classifierDescriptorMo500getDeclarationDescriptor).getUpperBounds();
                    s.j(upperBounds, "getUpperBounds(...)");
                    setB.addAll(h(typeSubstitutor, upperBounds, erasureTypeAttributes));
                } else {
                    setB.add(d(erasureTypeAttributes));
                }
            }
            if (!this.f88930b.getIntersectUpperBounds()) {
                break;
            }
        }
        return d1.a(setB);
    }

    public final KotlinType getErasedUpperBound(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
        s.k(typeParameter, "typeParameter");
        s.k(typeAttr, "typeAttr");
        Object objInvoke = this.f88933e.invoke(new a(typeParameter, typeAttr));
        s.j(objInvoke, "invoke(...)");
        return (KotlinType) objInvoke;
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer, TypeParameterErasureOptions typeParameterErasureOptions, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(erasureProjectionComputer, (i11 & 2) != 0 ? new TypeParameterErasureOptions(false, false) : typeParameterErasureOptions);
    }
}
