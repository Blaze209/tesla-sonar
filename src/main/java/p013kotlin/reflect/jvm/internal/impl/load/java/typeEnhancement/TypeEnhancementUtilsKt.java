package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import p013kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeEnhancementUtilsKt {
    private static final NullabilityQualifier a(JavaTypeQualifiers javaTypeQualifiers) {
        if (javaTypeQualifiers.isNullabilityQualifierForWarning()) {
            return null;
        }
        return javaTypeQualifiers.getNullability();
    }

    private static final <T> T b(Set<? extends T> set, T t11, T t12, T t13, boolean z11) {
        Set<? extends T> setR1;
        T t14;
        if (!z11) {
            if (t13 != null && (setR1 = v.r1(d1.o(set, t13))) != null) {
                set = setR1;
            }
            return (T) v.V0(set);
        }
        if (set.contains(t11)) {
            t14 = t11;
        } else {
            t14 = set.contains(t12) ? t12 : null;
        }
        if (s.f(t14, t11) && s.f(t13, t12)) {
            return null;
        }
        return t13 == null ? t14 : t13;
    }

    private static final NullabilityQualifier c(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z11) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) b(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z11);
    }

    public static final JavaTypeQualifiers computeQualifiersForOverride(JavaTypeQualifiers javaTypeQualifiers, Collection<JavaTypeQualifiers> superQualifiers, boolean z11, boolean z12, boolean z13) {
        NullabilityQualifier nullabilityQualifierC;
        boolean z14;
        s.k(javaTypeQualifiers, "<this>");
        s.k(superQualifiers, "superQualifiers");
        Collection<JavaTypeQualifiers> collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            NullabilityQualifier nullabilityQualifierA = a((JavaTypeQualifiers) it.next());
            if (nullabilityQualifierA != null) {
                arrayList.add(nullabilityQualifierA);
            }
        }
        NullabilityQualifier nullabilityQualifierC2 = c(v.r1(arrayList), a(javaTypeQualifiers), z11);
        if (nullabilityQualifierC2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullability = ((JavaTypeQualifiers) it2.next()).getNullability();
                if (nullability != null) {
                    arrayList2.add(nullability);
                }
            }
            nullabilityQualifierC = c(v.r1(arrayList2), javaTypeQualifiers.getNullability(), z11);
        } else {
            nullabilityQualifierC = nullabilityQualifierC2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier mutability = ((JavaTypeQualifiers) it3.next()).getMutability();
            if (mutability != null) {
                arrayList3.add(mutability);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) b(v.r1(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.getMutability(), z11);
        NullabilityQualifier nullabilityQualifier = null;
        if (nullabilityQualifierC != null && !z13 && (!z12 || nullabilityQualifierC != NullabilityQualifier.NULLABLE)) {
            nullabilityQualifier = nullabilityQualifierC;
        }
        boolean z15 = false;
        if (nullabilityQualifier != NullabilityQualifier.NOT_NULL) {
            z14 = false;
        } else {
            if (!javaTypeQualifiers.getDefinitelyNotNull()) {
                if (!collection.isEmpty()) {
                    Iterator<T> it4 = collection.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((JavaTypeQualifiers) it4.next()).getDefinitelyNotNull()) {
                            }
                        }
                    }
                }
                z14 = false;
            }
            z14 = true;
        }
        if (nullabilityQualifier != null && nullabilityQualifierC2 != nullabilityQualifierC) {
            z15 = true;
        }
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z14, z15);
    }

    public static final boolean hasEnhancedNullability(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker type) {
        s.k(typeSystemCommonBackendContext, "<this>");
        s.k(type, "type");
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        s.j(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext.hasAnnotation(type, ENHANCED_NULLABILITY_ANNOTATION);
    }
}
