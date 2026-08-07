package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor.DeserializedClassMemberScope f88768a;

    public i(DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope) {
        this.f88768a = deserializedClassMemberScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedClassDescriptor.DeserializedClassMemberScope.A(this.f88768a);
    }
}
