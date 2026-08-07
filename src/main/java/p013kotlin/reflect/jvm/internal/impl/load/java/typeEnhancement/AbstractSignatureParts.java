package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p013kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import p013kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final KotlinTypeMarker f87420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JavaTypeQualifiersByElementType f87421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TypeParameterMarker f87422c;

        public a(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, TypeParameterMarker typeParameterMarker) {
            this.f87420a = kotlinTypeMarker;
            this.f87421b = javaTypeQualifiersByElementType;
            this.f87422c = typeParameterMarker;
        }

        public final JavaTypeQualifiersByElementType a() {
            return this.f87421b;
        }

        public final KotlinTypeMarker b() {
            return this.f87420a;
        }

        public final TypeParameterMarker c() {
            return this.f87422c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaTypeQualifiers d(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr, int i11) {
        Map<Integer, JavaTypeQualifiers> map;
        JavaTypeQualifiers javaTypeQualifiers;
        if (typeEnhancementInfo == null || (map = typeEnhancementInfo.getMap()) == null || (javaTypeQualifiers = map.get(Integer.valueOf(i11))) == null) {
            return (i11 < 0 || i11 >= javaTypeQualifiersArr.length) ? JavaTypeQualifiers.Companion.getNONE() : javaTypeQualifiersArr[i11];
        }
        return javaTypeQualifiers;
    }

    private final JavaTypeQualifiersByElementType e(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType) {
        return getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType, getAnnotations(kotlinTypeMarker));
    }

    private final JavaTypeQualifiers f(KotlinTypeMarker kotlinTypeMarker) {
        NullabilityQualifier nullabilityQualifierM;
        NullabilityQualifier nullabilityQualifierM2 = m(kotlinTypeMarker);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifierM2 == null) {
            KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker);
            nullabilityQualifierM = enhancedForWarnings != null ? m(enhancedForWarnings) : null;
        } else {
            nullabilityQualifierM = nullabilityQualifierM2;
        }
        TypeSystemContext typeSystem = getTypeSystem();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (javaToKotlinClassMap.isReadOnly(getFqNameUnsafe(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (javaToKotlinClassMap.isMutable(getFqNameUnsafe(typeSystem.upperBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        return new JavaTypeQualifiers(nullabilityQualifierM, mutabilityQualifier, getTypeSystem().isDefinitelyNotNullType(kotlinTypeMarker) || isNotNullTypeParameterCompat(kotlinTypeMarker), nullabilityQualifierM != nullabilityQualifierM2);
    }

    private final JavaTypeQualifiers g(a aVar) {
        List listM;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusK;
        KotlinTypeMarker kotlinTypeMarkerB;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        if (aVar.b() == null) {
            TypeSystemContext typeSystem = getTypeSystem();
            TypeParameterMarker typeParameterMarkerC = aVar.c();
            if ((typeParameterMarkerC != null ? typeSystem.getVariance(typeParameterMarkerC) : null) == TypeVariance.IN) {
                return JavaTypeQualifiers.Companion.getNONE();
            }
        }
        boolean z11 = false;
        boolean z12 = aVar.c() == null;
        KotlinTypeMarker kotlinTypeMarkerB2 = aVar.b();
        if (kotlinTypeMarkerB2 == null || (listM = getAnnotations(kotlinTypeMarkerB2)) == null) {
            listM = v.m();
        }
        TypeSystemContext typeSystem2 = getTypeSystem();
        KotlinTypeMarker kotlinTypeMarkerB3 = aVar.b();
        TypeParameterMarker typeParameterClassifier = (kotlinTypeMarkerB3 == null || (typeConstructorMarkerTypeConstructor = typeSystem2.typeConstructor(kotlinTypeMarkerB3)) == null) ? null : typeSystem2.getTypeParameterClassifier(typeConstructorMarkerTypeConstructor);
        boolean z13 = getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z12) {
            if (z13 || !getEnableImprovementsInStrictMode() || (kotlinTypeMarkerB = aVar.b()) == null || !isArrayOrPrimitiveArray(kotlinTypeMarkerB)) {
                listM = v.N0(getContainerAnnotations(), listM);
            } else {
                Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : containerAnnotations) {
                    if (!getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                listM = v.P0(arrayList, listM);
            }
        }
        MutabilityQualifier mutabilityQualifierExtractMutability = getAnnotationTypeQualifierResolver().extractMutability(listM);
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusExtractNullability = getAnnotationTypeQualifierResolver().extractNullability(listM, new p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a(this, aVar));
        if (nullabilityQualifierWithMigrationStatusExtractNullability != null) {
            NullabilityQualifier qualifier = nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier();
            if (nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier() == NullabilityQualifier.NOT_NULL && typeParameterClassifier != null) {
                z11 = true;
            }
            return new JavaTypeQualifiers(qualifier, mutabilityQualifierExtractMutability, z11, nullabilityQualifierWithMigrationStatusExtractNullability.isForWarningOnly());
        }
        AnnotationQualifierApplicabilityType containerApplicabilityType = (z12 || z13) ? getContainerApplicabilityType() : AnnotationQualifierApplicabilityType.TYPE_USE;
        JavaTypeQualifiersByElementType javaTypeQualifiersByElementTypeA = aVar.a();
        JavaDefaultQualifiers javaDefaultQualifiers = javaTypeQualifiersByElementTypeA != null ? javaTypeQualifiersByElementTypeA.get(containerApplicabilityType) : null;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusK2 = typeParameterClassifier != null ? k(typeParameterClassifier) : null;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusL = l(nullabilityQualifierWithMigrationStatusK2, javaDefaultQualifiers);
        boolean z14 = (nullabilityQualifierWithMigrationStatusK2 != null ? nullabilityQualifierWithMigrationStatusK2.getQualifier() : null) == NullabilityQualifier.NOT_NULL || !(typeParameterClassifier == null || javaDefaultQualifiers == null || !javaDefaultQualifiers.getDefinitelyNotNull());
        TypeParameterMarker typeParameterMarkerC2 = aVar.c();
        if (typeParameterMarkerC2 == null || (nullabilityQualifierWithMigrationStatusK = k(typeParameterMarkerC2)) == null) {
            nullabilityQualifierWithMigrationStatusK = null;
        } else if (nullabilityQualifierWithMigrationStatusK.getQualifier() == NullabilityQualifier.NULLABLE) {
            nullabilityQualifierWithMigrationStatusK = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusK, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusN = n(nullabilityQualifierWithMigrationStatusK, nullabilityQualifierWithMigrationStatusL);
        NullabilityQualifier qualifier2 = nullabilityQualifierWithMigrationStatusN != null ? nullabilityQualifierWithMigrationStatusN.getQualifier() : null;
        if (nullabilityQualifierWithMigrationStatusN != null && nullabilityQualifierWithMigrationStatusN.isForWarningOnly()) {
            z11 = true;
        }
        return new JavaTypeQualifiers(qualifier2, mutabilityQualifierExtractMutability, z14, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(AbstractSignatureParts abstractSignatureParts, a aVar, Object extractNullability) {
        s.k(extractNullability, "$this$extractNullability");
        return abstractSignatureParts.forceWarning(extractNullability, aVar.b());
    }

    private final <T> List<T> i(T t11, l<? super T, ? extends Iterable<? extends T>> lVar) {
        ArrayList arrayList = new ArrayList(1);
        j(t11, arrayList, lVar);
        return arrayList;
    }

    private final <T> void j(T t11, List<T> list, l<? super T, ? extends Iterable<? extends T>> lVar) {
        list.add(t11);
        Iterable<? extends T> iterableInvoke = lVar.invoke(t11);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                j(it.next(), list, lVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:3: B:46:0x00b3->B:72:?, LOOP_END, SYNTHETIC] */
    private final NullabilityQualifierWithMigrationStatus k(TypeParameterMarker typeParameterMarker) {
        List<KotlinTypeMarker> arrayList;
        List<KotlinTypeMarker> list;
        Iterator<T> it;
        NullabilityQualifier nullabilityQualifier;
        boolean z11;
        TypeSystemContext typeSystem = getTypeSystem();
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        List<KotlinTypeMarker> list2 = upperBounds;
        boolean z12 = list2 instanceof Collection;
        if (!z12 || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!typeSystem.isError((KotlinTypeMarker) it2.next())) {
                    if (!z12 || !list2.isEmpty()) {
                        Iterator<T> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (m((KotlinTypeMarker) it3.next()) != null) {
                                    arrayList = upperBounds;
                                }
                            }
                            list = arrayList;
                            if ((list instanceof Collection) && list.isEmpty()) {
                                nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                break;
                            }
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                    break;
                                }
                                if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                    nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                    break;
                                }
                            }
                            if (arrayList != upperBounds) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z11);
                        }
                    }
                    if (!z12 || !list2.isEmpty()) {
                        Iterator<T> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            if (getEnhancedForWarnings((KotlinTypeMarker) it4.next()) != null) {
                                arrayList = new ArrayList<>();
                                Iterator<T> it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings((KotlinTypeMarker) it5.next());
                                    if (enhancedForWarnings != null) {
                                        arrayList.add(enhancedForWarnings);
                                    }
                                }
                                list = arrayList;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                            break;
                                        }
                                        if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                            break;
                                        }
                                        if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                if (arrayList != upperBounds) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z11);
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        return null;
    }

    private final NullabilityQualifier m(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    private final NullabilityQualifierWithMigrationStatus n(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
        if (nullabilityQualifierWithMigrationStatus == null) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        return (nullabilityQualifierWithMigrationStatus2 != null && ((nullabilityQualifierWithMigrationStatus.isForWarningOnly() && !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) || ((nullabilityQualifierWithMigrationStatus.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) && (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) < 0 || nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) <= 0)))) ? nullabilityQualifierWithMigrationStatus2 : nullabilityQualifierWithMigrationStatus;
    }

    private final List<a> o(KotlinTypeMarker kotlinTypeMarker) {
        return i(new a(kotlinTypeMarker, e(kotlinTypeMarker, getContainerDefaultTypeQualifiers()), null), new c(this, getTypeSystem()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable p(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext, a it) {
        KotlinTypeMarker kotlinTypeMarkerB;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        List<TypeParameterMarker> parameters;
        a aVar;
        KotlinTypeMarker kotlinTypeMarkerB2;
        s.k(it, "it");
        if ((abstractSignatureParts.getSkipRawTypeArguments() && (kotlinTypeMarkerB2 = it.b()) != null && typeSystemContext.isRawType(kotlinTypeMarkerB2)) || (kotlinTypeMarkerB = it.b()) == null || (typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(kotlinTypeMarkerB)) == null || (parameters = typeSystemContext.getParameters(typeConstructorMarkerTypeConstructor)) == null) {
            return null;
        }
        List<TypeParameterMarker> list = parameters;
        List<TypeArgumentMarker> arguments = typeSystemContext.getArguments(it.b());
        Iterator<T> it2 = list.iterator();
        Iterator<T> it3 = arguments.iterator();
        ArrayList arrayList = new ArrayList(Math.min(v.y(list, 10), v.y(arguments, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) it3.next();
            TypeParameterMarker typeParameterMarker = (TypeParameterMarker) next;
            if (typeSystemContext.isStarProjection(typeArgumentMarker)) {
                aVar = new a(null, it.a(), typeParameterMarker);
            } else {
                KotlinTypeMarker type = typeSystemContext.getType(typeArgumentMarker);
                aVar = new a(type, abstractSignatureParts.e(type, it.a()), typeParameterMarker);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final l<Integer, JavaTypeQualifiers> computeIndexedQualifiers(KotlinTypeMarker kotlinTypeMarker, Iterable<? extends KotlinTypeMarker> overrides, TypeEnhancementInfo typeEnhancementInfo, boolean z11) {
        int size;
        KotlinTypeMarker kotlinTypeMarkerB;
        s.k(kotlinTypeMarker, "<this>");
        s.k(overrides, "overrides");
        List<a> listO = o(kotlinTypeMarker);
        ArrayList arrayList = new ArrayList(v.y(overrides, 10));
        Iterator<? extends KotlinTypeMarker> it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(o(it.next()));
        }
        if (getForceOnlyHeadTypeConstructor()) {
            size = 1;
        } else {
            if (isCovariant() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
                Iterator<? extends KotlinTypeMarker> it2 = overrides.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!isEqual(kotlinTypeMarker, it2.next())) {
                            size = 1;
                        }
                    }
                }
            }
            size = listO.size();
        }
        JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[size];
        int i11 = 0;
        while (i11 < size) {
            JavaTypeQualifiers javaTypeQualifiersG = g(listO.get(i11));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar = (a) v.r0((List) it3.next(), i11);
                JavaTypeQualifiers javaTypeQualifiersF = (aVar == null || (kotlinTypeMarkerB = aVar.b()) == null) ? null : f(kotlinTypeMarkerB);
                if (javaTypeQualifiersF != null) {
                    arrayList2.add(javaTypeQualifiersF);
                }
            }
            javaTypeQualifiersArr[i11] = TypeEnhancementUtilsKt.computeQualifiersForOverride(javaTypeQualifiersG, arrayList2, i11 == 0 && isCovariant(), i11 == 0 && getContainerIsVarargParameter(), z11);
            i11++;
        }
        return new b(typeEnhancementInfo, javaTypeQualifiersArr);
    }

    public abstract boolean forceWarning(TAnnotation tannotation, KotlinTypeMarker kotlinTypeMarker);

    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    public abstract Iterable<TAnnotation> getAnnotations(KotlinTypeMarker kotlinTypeMarker);

    public abstract Iterable<TAnnotation> getContainerAnnotations();

    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    public abstract boolean getEnableImprovementsInStrictMode();

    public abstract KotlinTypeMarker getEnhancedForWarnings(KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    public abstract FqNameUnsafe getFqNameUnsafe(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean getSkipRawTypeArguments();

    public abstract TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(TypeParameterMarker typeParameterMarker);

    public boolean isNotNullTypeParameterCompat(KotlinTypeMarker kotlinTypeMarker) {
        s.k(kotlinTypeMarker, "<this>");
        return false;
    }

    protected abstract NullabilityQualifierWithMigrationStatus l(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers);
}
