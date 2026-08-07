package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f88763a;

    public e(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f88763a = deserializedClassDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedClassDescriptor.u(this.f88763a);
    }
}
