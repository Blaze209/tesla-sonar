package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class o implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope f88776a;

    public o(DeserializedMemberScope deserializedMemberScope) {
        this.f88776a = deserializedMemberScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedMemberScope.e(this.f88776a);
    }
}
