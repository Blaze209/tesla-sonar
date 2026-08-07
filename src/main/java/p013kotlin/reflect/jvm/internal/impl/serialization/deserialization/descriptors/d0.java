package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class d0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.OptimizedImplementation f88761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeserializedMemberScope f88762b;

    public d0(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        this.f88761a = optimizedImplementation;
        this.f88762b = deserializedMemberScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedMemberScope.OptimizedImplementation.q(this.f88761a, this.f88762b);
    }
}
