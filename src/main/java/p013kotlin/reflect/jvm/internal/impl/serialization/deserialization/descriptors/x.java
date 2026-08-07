package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class x implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.b f88785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeserializedMemberScope f88786b;

    public x(DeserializedMemberScope.b bVar, DeserializedMemberScope deserializedMemberScope) {
        this.f88785a = bVar;
        this.f88786b = deserializedMemberScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedMemberScope.b.z(this.f88785a, this.f88786b);
    }
}
