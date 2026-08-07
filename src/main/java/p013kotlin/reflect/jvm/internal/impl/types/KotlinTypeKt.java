package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* JADX INFO: loaded from: classes9.dex */
public final class KotlinTypeKt {
    public static final boolean isError(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof ErrorType) {
            return true;
        }
        return (unwrappedTypeUnwrap instanceof FlexibleType) && (((FlexibleType) unwrappedTypeUnwrap).getDelegate() instanceof ErrorType);
    }

    public static final boolean isNullable(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        return TypeUtils.isNullableType(kotlinType);
    }
}
