package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class c0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.OptimizedImplementation f88758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeserializedMemberScope f88759b;

    public c0(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        this.f88758a = optimizedImplementation;
        this.f88759b = deserializedMemberScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedMemberScope.OptimizedImplementation.l(this.f88758a, this.f88759b);
    }
}
