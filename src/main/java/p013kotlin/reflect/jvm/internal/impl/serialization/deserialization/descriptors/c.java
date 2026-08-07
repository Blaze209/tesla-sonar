package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f88757a;

    public c(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f88757a = deserializedClassDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedClassDescriptor.i(this.f88757a);
    }
}
