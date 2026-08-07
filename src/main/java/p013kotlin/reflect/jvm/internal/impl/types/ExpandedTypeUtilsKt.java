package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class ExpandedTypeUtilsKt {
    private static final KotlinTypeMarker a(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, HashSet<TypeConstructorMarker> hashSet) {
        KotlinTypeMarker kotlinTypeMarkerA;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker);
        if (!hashSet.add(typeConstructorMarkerTypeConstructor)) {
            return null;
        }
        TypeParameterMarker typeParameterClassifier = typeSystemCommonBackendContext.getTypeParameterClassifier(typeConstructorMarkerTypeConstructor);
        if (typeParameterClassifier != null) {
            KotlinTypeMarker representativeUpperBound = typeSystemCommonBackendContext.getRepresentativeUpperBound(typeParameterClassifier);
            KotlinTypeMarker kotlinTypeMarkerA2 = a(typeSystemCommonBackendContext, representativeUpperBound, hashSet);
            if (kotlinTypeMarkerA2 == null) {
                return null;
            }
            boolean z11 = typeSystemCommonBackendContext.isInlineClass(typeSystemCommonBackendContext.typeConstructor(representativeUpperBound)) || ((representativeUpperBound instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) representativeUpperBound));
            if ((kotlinTypeMarkerA2 instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) kotlinTypeMarkerA2) && typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) && z11) {
                return typeSystemCommonBackendContext.makeNullable(representativeUpperBound);
            }
            return (typeSystemCommonBackendContext.isNullableType(kotlinTypeMarkerA2) || !typeSystemCommonBackendContext.isMarkedNullable(kotlinTypeMarker)) ? kotlinTypeMarkerA2 : typeSystemCommonBackendContext.makeNullable(kotlinTypeMarkerA2);
        }
        if (typeSystemCommonBackendContext.isInlineClass(typeConstructorMarkerTypeConstructor)) {
            KotlinTypeMarker unsubstitutedUnderlyingType = typeSystemCommonBackendContext.getUnsubstitutedUnderlyingType(kotlinTypeMarker);
            if (unsubstitutedUnderlyingType == null || (kotlinTypeMarkerA = a(typeSystemCommonBackendContext, unsubstitutedUnderlyingType, hashSet)) == null) {
                return null;
            }
            if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker)) {
                return kotlinTypeMarkerA;
            }
            if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarkerA) && (!(kotlinTypeMarkerA instanceof SimpleTypeMarker) || !typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) kotlinTypeMarkerA))) {
                return typeSystemCommonBackendContext.makeNullable(kotlinTypeMarkerA);
            }
        }
        return kotlinTypeMarker;
    }

    public static final KotlinTypeMarker computeExpandedTypeForInlineClass(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker inlineClassType) {
        s.k(typeSystemCommonBackendContext, "<this>");
        s.k(inlineClassType, "inlineClassType");
        return a(typeSystemCommonBackendContext, inlineClassType, new HashSet());
    }
}
