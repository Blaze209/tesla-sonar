package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SimpleType f88871b;

    public DelegatingSimpleTypeImpl(SimpleType delegate) {
        s.k(delegate, "delegate");
        this.f88871b = delegate;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected SimpleType getDelegate() {
        return this.f88871b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z11) {
        return z11 == isMarkedNullable() ? this : getDelegate().makeNullableAsSpecified(z11).replaceAttributes(getAttributes());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        s.k(newAttributes, "newAttributes");
        return newAttributes != getAttributes() ? new t(this, newAttributes) : this;
    }
}
