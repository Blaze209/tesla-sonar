package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeCapabilitiesKt {
    public static final CustomTypeParameter getCustomTypeParameter(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        Object objUnwrap = kotlinType.unwrap();
        CustomTypeParameter customTypeParameter = objUnwrap instanceof CustomTypeParameter ? (CustomTypeParameter) objUnwrap : null;
        if (customTypeParameter == null || !customTypeParameter.isTypeParameter()) {
            return null;
        }
        return customTypeParameter;
    }

    public static final boolean isCustomTypeParameter(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        Object objUnwrap = kotlinType.unwrap();
        CustomTypeParameter customTypeParameter = objUnwrap instanceof CustomTypeParameter ? (CustomTypeParameter) objUnwrap : null;
        if (customTypeParameter != null) {
            return customTypeParameter.isTypeParameter();
        }
        return false;
    }
}
