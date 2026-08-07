package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class q implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.b f88778a;

    public q(DeserializedMemberScope.b bVar) {
        this.f88778a = bVar;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedMemberScope.b.y(this.f88778a);
    }
}
