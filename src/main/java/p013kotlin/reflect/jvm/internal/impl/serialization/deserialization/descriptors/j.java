package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f88769a;

    public j(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f88769a = deserializedClassDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedClassDescriptor.a.D(this.f88769a);
    }
}
