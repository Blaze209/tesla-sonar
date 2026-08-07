package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f88755a;

    public b(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f88755a = deserializedClassDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedClassDescriptor.p(this.f88755a);
    }
}
