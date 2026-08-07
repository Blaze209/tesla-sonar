package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class v implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.b f88783a;

    public v(DeserializedMemberScope.b bVar) {
        this.f88783a = bVar;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedMemberScope.b.A(this.f88783a);
    }
}
