package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import p013kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import p013kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p013kotlin.reflect.jvm.internal.impl.types.RawType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaTypeEnhancement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaResolverSettings f87423a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final KotlinType f87424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f87425b;

        public a(KotlinType kotlinType, int i11) {
            this.f87424a = kotlinType;
            this.f87425b = i11;
        }

        public final int a() {
            return this.f87425b;
        }

        public final KotlinType b() {
            return this.f87424a;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SimpleType f87426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f87427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f87428c;

        public b(SimpleType simpleType, int i11, boolean z11) {
            this.f87426a = simpleType;
            this.f87427b = i11;
            this.f87428c = z11;
        }

        public final boolean a() {
            return this.f87428c;
        }

        public final int b() {
            return this.f87427b;
        }

        public final SimpleType c() {
            return this.f87426a;
        }
    }

    public JavaTypeEnhancement(JavaResolverSettings javaResolverSettings) {
        s.k(javaResolverSettings, "javaResolverSettings");
        this.f87423a = javaResolverSettings;
    }

    private final b a(SimpleType simpleType, l<? super Integer, JavaTypeQualifiers> lVar, int i11, TypeComponentPosition typeComponentPosition, boolean z11, boolean z12) {
        TypeConstructor constructor;
        Boolean bool;
        a aVar;
        TypeProjection typeProjectionMakeStarProjection;
        l<? super Integer, JavaTypeQualifiers> lVar2 = lVar;
        boolean zShouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        boolean z13 = (z12 && z11) ? false : true;
        KotlinType kotlinType = null;
        if (!zShouldEnhance && simpleType.getArguments().isEmpty()) {
            return new b(null, 1, false);
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = simpleType.getConstructor().mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor == null) {
            return new b(null, 1, false);
        }
        JavaTypeQualifiers javaTypeQualifiersInvoke = lVar2.invoke(Integer.valueOf(i11));
        ClassifierDescriptor classifierDescriptorB = TypeEnhancementKt.b(classifierDescriptorMo500getDeclarationDescriptor, javaTypeQualifiersInvoke, typeComponentPosition);
        Boolean boolC = TypeEnhancementKt.c(javaTypeQualifiersInvoke, typeComponentPosition);
        if (classifierDescriptorB == null || (constructor = classifierDescriptorB.getTypeConstructor()) == null) {
            constructor = simpleType.getConstructor();
        }
        TypeConstructor typeConstructor = constructor;
        int iA = i11 + 1;
        List<TypeProjection> arguments = simpleType.getArguments();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        s.j(parameters, "getParameters(...)");
        List<TypeParameterDescriptor> list = parameters;
        Iterator<T> it = arguments.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(v.y(arguments, 10), v.y(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection = (TypeProjection) next;
            if (z13) {
                bool = boolC;
                if (!typeProjection.isStarProjection()) {
                    aVar = c(typeProjection.getType().unwrap(), lVar2, iA, z12);
                } else if (lVar2.invoke(Integer.valueOf(iA)).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    UnwrappedType unwrappedTypeUnwrap = typeProjection.getType().unwrap();
                    aVar = new a(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified(false), FlexibleTypesKt.upperIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                bool = boolC;
                aVar = new a(kotlinType, 0);
            }
            iA += aVar.a();
            if (aVar.b() != null) {
                KotlinType kotlinTypeB = aVar.b();
                Variance projectionKind = typeProjection.getProjectionKind();
                s.j(projectionKind, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(kotlinTypeB, projectionKind, typeParameterDescriptor);
            } else if (classifierDescriptorB == null || typeProjection.isStarProjection()) {
                typeProjectionMakeStarProjection = classifierDescriptorB != null ? TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
            } else {
                KotlinType type = typeProjection.getType();
                s.j(type, "getType(...)");
                Variance projectionKind2 = typeProjection.getProjectionKind();
                s.j(projectionKind2, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(type, projectionKind2, typeParameterDescriptor);
            }
            arrayList.add(typeProjectionMakeStarProjection);
            lVar2 = lVar;
            boolC = bool;
            kotlinType = null;
        }
        Boolean bool2 = boolC;
        int i12 = iA - i11;
        if (classifierDescriptorB == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((TypeProjection) it3.next()) == null);
            }
            return new b(null, i12, false);
        }
        Annotations annotations = simpleType.getAnnotations();
        e eVar = TypeEnhancementKt.f87456b;
        if (classifierDescriptorB == null) {
            eVar = null;
        }
        TypeAttributes defaultAttributes = TypeAttributesKt.toDefaultAttributes(TypeEnhancementKt.a(v.r(annotations, eVar, bool2 != null ? TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS() : null)));
        List<TypeProjection> arguments2 = simpleType.getArguments();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = arguments2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(v.y(arrayList, 10), v.y(arguments2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection2 = (TypeProjection) it5.next();
            TypeProjection typeProjection3 = (TypeProjection) next2;
            if (typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList2.add(typeProjection2);
        }
        SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList2, bool2 != null ? bool2.booleanValue() : simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
        if (javaTypeQualifiersInvoke.getDefinitelyNotNull()) {
            simpleTypeSimpleType$default = d(simpleTypeSimpleType$default);
        }
        return new b(simpleTypeSimpleType$default, i12, bool2 != null && javaTypeQualifiersInvoke.isNullabilityQualifierForWarning());
    }

    static /* synthetic */ b b(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, l lVar, int i11, TypeComponentPosition typeComponentPosition, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        if ((i12 & 16) != 0) {
            z12 = false;
        }
        return javaTypeEnhancement.a(simpleType, lVar, i11, typeComponentPosition, z11, z12);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    private final a c(UnwrappedType unwrappedType, l<? super Integer, JavaTypeQualifiers> lVar, int i11, boolean z11) {
        KotlinType kotlinTypeC;
        KotlinType kotlinTypeWrapEnhancement = null;
        if (KotlinTypeKt.isError(unwrappedType)) {
            return new a(null, 1);
        }
        if (!(unwrappedType instanceof FlexibleType)) {
            if (!(unwrappedType instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            b bVarB = b(this, (SimpleType) unwrappedType, lVar, i11, TypeComponentPosition.INFLEXIBLE, false, z11, 8, null);
            return new a(bVarB.a() ? TypeWithEnhancementKt.wrapEnhancement(unwrappedType, bVarB.c()) : bVarB.c(), bVarB.b());
        }
        boolean z12 = unwrappedType instanceof RawType;
        FlexibleType flexibleType = (FlexibleType) unwrappedType;
        b bVarA = a(flexibleType.getLowerBound(), lVar, i11, TypeComponentPosition.FLEXIBLE_LOWER, z12, z11);
        b bVarA2 = a(flexibleType.getUpperBound(), lVar, i11, TypeComponentPosition.FLEXIBLE_UPPER, z12, z11);
        bVarA.b();
        bVarA2.b();
        if (bVarA.c() != null || bVarA2.c() != null) {
            if (bVarA.a() || bVarA2.a()) {
                SimpleType simpleTypeC = bVarA2.c();
                if (simpleTypeC == null) {
                    kotlinTypeC = bVarA.c();
                    s.h(kotlinTypeC);
                } else {
                    SimpleType simpleTypeC2 = bVarA.c();
                    if (simpleTypeC2 == null) {
                        simpleTypeC2 = simpleTypeC;
                    }
                    kotlinTypeC = KotlinTypeFactory.flexibleType(simpleTypeC2, simpleTypeC);
                    if (kotlinTypeC == null) {
                        kotlinTypeC = bVarA.c();
                        s.h(kotlinTypeC);
                    }
                }
                kotlinTypeWrapEnhancement = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, kotlinTypeC);
            } else if (z12) {
                SimpleType simpleTypeC3 = bVarA.c();
                if (simpleTypeC3 == null) {
                    simpleTypeC3 = flexibleType.getLowerBound();
                }
                SimpleType simpleTypeC4 = bVarA2.c();
                if (simpleTypeC4 == null) {
                    simpleTypeC4 = flexibleType.getUpperBound();
                }
                kotlinTypeWrapEnhancement = new RawTypeImpl(simpleTypeC3, simpleTypeC4);
            } else {
                SimpleType simpleTypeC5 = bVarA.c();
                if (simpleTypeC5 == null) {
                    simpleTypeC5 = flexibleType.getLowerBound();
                }
                SimpleType simpleTypeC6 = bVarA2.c();
                if (simpleTypeC6 == null) {
                    simpleTypeC6 = flexibleType.getUpperBound();
                }
                kotlinTypeWrapEnhancement = KotlinTypeFactory.flexibleType(simpleTypeC5, simpleTypeC6);
            }
        }
        return new a(kotlinTypeWrapEnhancement, bVarA.b());
    }

    private final SimpleType d(SimpleType simpleType) {
        return this.f87423a.getCorrectNullabilityForNotNullTypeParameter() ? SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, true) : new NotNullTypeParameterImpl(simpleType);
    }

    public final KotlinType enhance(KotlinType kotlinType, l<? super Integer, JavaTypeQualifiers> qualifiers, boolean z11) {
        s.k(kotlinType, "<this>");
        s.k(qualifiers, "qualifiers");
        return c(kotlinType.unwrap(), qualifiers, 0, z11).b();
    }
}
