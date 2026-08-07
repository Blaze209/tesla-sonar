package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class y implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.b f88787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeserializedMemberScope f88788b;

    public y(DeserializedMemberScope.b bVar, DeserializedMemberScope deserializedMemberScope) {
        this.f88787a = bVar;
        this.f88788b = deserializedMemberScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedMemberScope.b.L(this.f88787a, this.f88788b);
    }
}
