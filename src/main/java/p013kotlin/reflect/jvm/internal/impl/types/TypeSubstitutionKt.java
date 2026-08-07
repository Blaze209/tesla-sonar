package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeSubstitutionKt {
    public static final SimpleType asSimpleType(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        SimpleType simpleType = unwrappedTypeUnwrap instanceof SimpleType ? (SimpleType) unwrappedTypeUnwrap : null;
        if (simpleType != null) {
            return simpleType;
        }
        throw new IllegalStateException(("This is should be simple type: " + kotlinType).toString());
    }

    public static final KotlinType replace(KotlinType kotlinType, List<? extends TypeProjection> newArguments, Annotations newAnnotations) {
        s.k(kotlinType, "<this>");
        s.k(newArguments, "newArguments");
        s.k(newAnnotations, "newAnnotations");
        return replace$default(kotlinType, newArguments, newAnnotations, null, 4, null);
    }

    public static /* synthetic */ KotlinType replace$default(KotlinType kotlinType, List list, Annotations annotations, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = kotlinType.getArguments();
        }
        if ((i11 & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        if ((i11 & 4) != 0) {
            list2 = list;
        }
        return replace(kotlinType, list, annotations, list2);
    }

    public static final KotlinType replace(KotlinType kotlinType, List<? extends TypeProjection> newArguments, Annotations newAnnotations, List<? extends TypeProjection> newArgumentsForUpperBound) {
        s.k(kotlinType, "<this>");
        s.k(newArguments, "newArguments");
        s.k(newAnnotations, "newAnnotations");
        s.k(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == kotlinType.getArguments()) && newAnnotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        TypeAttributes attributes = kotlinType.getAttributes();
        if ((newAnnotations instanceof FilteredAnnotations) && ((FilteredAnnotations) newAnnotations).isEmpty()) {
            newAnnotations = Annotations.Companion.getEMPTY();
        }
        TypeAttributes typeAttributesReplaceAnnotations = TypeAttributesKt.replaceAnnotations(attributes, newAnnotations);
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
            return KotlinTypeFactory.flexibleType(replace(flexibleType.getLowerBound(), newArguments, typeAttributesReplaceAnnotations), replace(flexibleType.getUpperBound(), newArgumentsForUpperBound, typeAttributesReplaceAnnotations));
        }
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            return replace((SimpleType) unwrappedTypeUnwrap, newArguments, typeAttributesReplaceAnnotations);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ SimpleType replace$default(SimpleType simpleType, List list, TypeAttributes typeAttributes, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = simpleType.getArguments();
        }
        if ((i11 & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        return replace(simpleType, (List<? extends TypeProjection>) list, typeAttributes);
    }

    public static final SimpleType replace(SimpleType simpleType, List<? extends TypeProjection> newArguments, TypeAttributes newAttributes) {
        s.k(simpleType, "<this>");
        s.k(newArguments, "newArguments");
        s.k(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == simpleType.getAttributes()) {
            return simpleType;
        }
        if (newArguments.isEmpty()) {
            return simpleType.replaceAttributes(newAttributes);
        }
        if (simpleType instanceof ErrorType) {
            return ((ErrorType) simpleType).replaceArguments(newArguments);
        }
        return KotlinTypeFactory.simpleType$default(newAttributes, simpleType.getConstructor(), newArguments, simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
