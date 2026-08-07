package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
final class t extends DelegatingSimpleTypeImpl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TypeAttributes f89035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SimpleType delegate, TypeAttributes attributes) {
        super(delegate);
        s.k(delegate, "delegate");
        s.k(attributes, "attributes");
        this.f89035c = attributes;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t replaceDelegate(SimpleType delegate) {
        s.k(delegate, "delegate");
        return new t(delegate, getAttributes());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return this.f89035c;
    }
}
