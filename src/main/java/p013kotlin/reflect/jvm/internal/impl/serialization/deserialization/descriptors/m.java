package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class m implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f88773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProtoBuf.EnumEntry f88774b;

    public m(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
        this.f88773a = deserializedClassDescriptor;
        this.f88774b = enumEntry;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedClassDescriptor.b.g(this.f88773a, this.f88774b);
    }
}
