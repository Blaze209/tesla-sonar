package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class e0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedTypeParameterDescriptor f88764a;

    public e0(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        this.f88764a = deserializedTypeParameterDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedTypeParameterDescriptor.e(this.f88764a);
    }
}
