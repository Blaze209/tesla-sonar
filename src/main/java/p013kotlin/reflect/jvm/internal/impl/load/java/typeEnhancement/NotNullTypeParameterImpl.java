package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class NotNullTypeParameterImpl extends DelegatingSimpleType implements NotNullTypeParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SimpleType f87434b;

    public NotNullTypeParameterImpl(SimpleType delegate) {
        s.k(delegate, "delegate");
        this.f87434b = delegate;
    }

    private final SimpleType b(SimpleType simpleType) {
        SimpleType simpleTypeMakeNullableAsSpecified = simpleType.makeNullableAsSpecified(false);
        return !TypeUtilsKt.isTypeParameter(simpleType) ? simpleTypeMakeNullableAsSpecified : new NotNullTypeParameterImpl(simpleTypeMakeNullableAsSpecified);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected SimpleType getDelegate() {
        return this.f87434b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        return true;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public KotlinType substitutionResult(KotlinType replacement) {
        s.k(replacement, "replacement");
        UnwrappedType unwrappedTypeUnwrap = replacement.unwrap();
        if (!TypeUtilsKt.isTypeParameter(unwrappedTypeUnwrap) && !TypeUtils.isNullableType(unwrappedTypeUnwrap)) {
            return unwrappedTypeUnwrap;
        }
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            return b((SimpleType) unwrappedTypeUnwrap);
        }
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
            return TypeWithEnhancementKt.wrapEnhancement(KotlinTypeFactory.flexibleType(b(flexibleType.getLowerBound()), b(flexibleType.getUpperBound())), TypeWithEnhancementKt.getEnhancement(unwrappedTypeUnwrap));
        }
        throw new IllegalStateException(("Incorrect type: " + unwrappedTypeUnwrap).toString());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z11) {
        return z11 ? getDelegate().makeNullableAsSpecified(true) : this;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public NotNullTypeParameterImpl replaceDelegate(SimpleType delegate) {
        s.k(delegate, "delegate");
        return new NotNullTypeParameterImpl(delegate);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public NotNullTypeParameterImpl replaceAttributes(TypeAttributes newAttributes) {
        s.k(newAttributes, "newAttributes");
        return new NotNullTypeParameterImpl(getDelegate().replaceAttributes(newAttributes));
    }
}
