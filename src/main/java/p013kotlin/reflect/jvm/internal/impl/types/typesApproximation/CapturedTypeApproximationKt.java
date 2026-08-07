package p013kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class CapturedTypeApproximationKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ApproximationBounds<KotlinType> approximateCapturedTypes(KotlinType type) {
        Object objE;
        s.k(type, "type");
        if (FlexibleTypesKt.isFlexible(type)) {
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes = approximateCapturedTypes(FlexibleTypesKt.lowerIfFlexible(type));
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes2 = approximateCapturedTypes(FlexibleTypesKt.upperIfFlexible(type));
            return new ApproximationBounds<>(TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getLower()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getLower())), type), TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getUpper()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getUpper())), type));
        }
        TypeConstructor constructor = type.getConstructor();
        if (CapturedTypeConstructorKt.isCaptured(type)) {
            s.i(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            TypeProjection projection = ((CapturedTypeConstructor) constructor).getProjection();
            KotlinType type2 = projection.getType();
            s.j(type2, "getType(...)");
            KotlinType kotlinTypeB = b(type2, type);
            int i11 = WhenMappings.$EnumSwitchMapping$0[projection.getProjectionKind().ordinal()];
            if (i11 == 2) {
                return new ApproximationBounds<>(kotlinTypeB, TypeUtilsKt.getBuiltIns(type).getNullableAnyType());
            }
            if (i11 == 3) {
                SimpleType nothingType = TypeUtilsKt.getBuiltIns(type).getNothingType();
                s.j(nothingType, "getNothingType(...)");
                return new ApproximationBounds<>(b(nothingType, type), kotlinTypeB);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + projection);
        }
        if (type.getArguments().isEmpty() || type.getArguments().size() != constructor.getParameters().size()) {
            return new ApproximationBounds<>(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> arguments = type.getArguments();
        List<TypeParameterDescriptor> parameters = constructor.getParameters();
        s.j(parameters, "getParameters(...)");
        for (Pair pair : v.v1(arguments, parameters)) {
            TypeProjection typeProjection = (TypeProjection) pair.a();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.b();
            s.h(typeParameterDescriptor);
            b bVarG = g(typeProjection, typeParameterDescriptor);
            if (typeProjection.isStarProjection()) {
                arrayList.add(bVarG);
                arrayList2.add(bVarG);
            } else {
                ApproximationBounds<b> approximationBoundsD = d(bVarG);
                b bVarComponent1 = approximationBoundsD.component1();
                b bVarComponent2 = approximationBoundsD.component2();
                arrayList.add(bVarComponent1);
                arrayList2.add(bVarComponent2);
            }
        }
        boolean z11 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((b) it.next()).d()) {
                    z11 = true;
                    break;
                }
            }
        }
        if (z11) {
            objE = TypeUtilsKt.getBuiltIns(type).getNothingType();
            s.j(objE, "getNothingType(...)");
        } else {
            objE = e(type, arrayList);
        }
        return new ApproximationBounds<>(objE, e(type, arrayList2));
    }

    public static final TypeProjection approximateCapturedTypesIfNecessary(TypeProjection typeProjection, boolean z11) {
        if (typeProjection == null) {
            return null;
        }
        if (!typeProjection.isStarProjection()) {
            KotlinType type = typeProjection.getType();
            s.j(type, "getType(...)");
            if (TypeUtils.contains(type, a.f89042a)) {
                Variance projectionKind = typeProjection.getProjectionKind();
                s.j(projectionKind, "getProjectionKind(...)");
                if (projectionKind == Variance.OUT_VARIANCE) {
                    return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getUpper());
                }
                return z11 ? new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getLower()) : f(typeProjection);
            }
        }
        return typeProjection;
    }

    private static final KotlinType b(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinType kotlinTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(kotlinType, kotlinType2.isMarkedNullable());
        s.j(kotlinTypeMakeNullableIfNeeded, "makeNullableIfNeeded(...)");
        return kotlinTypeMakeNullableIfNeeded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean c(UnwrappedType unwrappedType) {
        s.h(unwrappedType);
        return Boolean.valueOf(CapturedTypeConstructorKt.isCaptured(unwrappedType));
    }

    private static final ApproximationBounds<b> d(b bVar) {
        ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes = approximateCapturedTypes(bVar.a());
        KotlinType kotlinTypeComponent1 = approximationBoundsApproximateCapturedTypes.component1();
        KotlinType kotlinTypeComponent2 = approximationBoundsApproximateCapturedTypes.component2();
        ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes2 = approximateCapturedTypes(bVar.b());
        return new ApproximationBounds<>(new b(bVar.c(), kotlinTypeComponent2, approximationBoundsApproximateCapturedTypes2.component1()), new b(bVar.c(), kotlinTypeComponent1, approximationBoundsApproximateCapturedTypes2.component2()));
    }

    private static final KotlinType e(KotlinType kotlinType, List<b> list) {
        kotlinType.getArguments().size();
        list.size();
        List<b> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(h((b) it.next()));
        }
        return TypeSubstitutionKt.replace$default(kotlinType, arrayList, null, null, 6, null);
    }

    private static final TypeProjection f(TypeProjection typeProjection) {
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            public TypeProjection get(TypeConstructor key) {
                s.k(key, "key");
                CapturedTypeConstructor capturedTypeConstructor = key instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) key : null;
                if (capturedTypeConstructor == null) {
                    return null;
                }
                return capturedTypeConstructor.getProjection().isStarProjection() ? new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.getProjection().getType()) : capturedTypeConstructor.getProjection();
            }
        });
        s.j(typeSubstitutorCreate, "create(...)");
        return typeSubstitutorCreate.substituteWithoutApproximation(typeProjection);
    }

    private static final b g(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
        if (i11 == 1) {
            KotlinType type = typeProjection.getType();
            s.j(type, "getType(...)");
            KotlinType type2 = typeProjection.getType();
            s.j(type2, "getType(...)");
            return new b(typeParameterDescriptor, type, type2);
        }
        if (i11 == 2) {
            KotlinType type3 = typeProjection.getType();
            s.j(type3, "getType(...)");
            SimpleType nullableAnyType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
            s.j(nullableAnyType, "getNullableAnyType(...)");
            return new b(typeParameterDescriptor, type3, nullableAnyType);
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        SimpleType nothingType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
        s.j(nothingType, "getNothingType(...)");
        KotlinType type4 = typeProjection.getType();
        s.j(type4, "getType(...)");
        return new b(typeParameterDescriptor, nothingType, type4);
    }

    private static final TypeProjection h(b bVar) {
        bVar.d();
        if (!s.f(bVar.a(), bVar.b())) {
            Variance variance = bVar.c().getVariance();
            Variance variance2 = Variance.IN_VARIANCE;
            if (variance != variance2) {
                if (!KotlinBuiltIns.isNothing(bVar.a()) || bVar.c().getVariance() == variance2) {
                    return KotlinBuiltIns.isNullableAny(bVar.b()) ? new TypeProjectionImpl(i(bVar, variance2), bVar.a()) : new TypeProjectionImpl(i(bVar, Variance.OUT_VARIANCE), bVar.b());
                }
                return new TypeProjectionImpl(i(bVar, Variance.OUT_VARIANCE), bVar.b());
            }
        }
        return new TypeProjectionImpl(bVar.a());
    }

    private static final Variance i(b bVar, Variance variance) {
        return variance == bVar.c().getVariance() ? Variance.INVARIANT : variance;
    }
}
