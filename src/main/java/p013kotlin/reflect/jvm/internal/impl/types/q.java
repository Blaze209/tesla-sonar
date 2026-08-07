package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
final class q extends DelegatingSimpleTypeImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(SimpleType delegate) {
        super(delegate);
        s.k(delegate, "delegate");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q replaceDelegate(SimpleType delegate) {
        s.k(delegate, "delegate");
        return new q(delegate);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }
}
