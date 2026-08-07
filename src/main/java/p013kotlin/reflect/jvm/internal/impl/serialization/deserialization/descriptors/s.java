package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class s implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.b f88780a;

    public s(DeserializedMemberScope.b bVar) {
        this.f88780a = bVar;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedMemberScope.b.n(this.f88780a);
    }
}
