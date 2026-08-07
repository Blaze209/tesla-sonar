package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class k implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f88811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f88812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f88813c;

    public k(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f88811a = memberDeserializer;
        this.f88812b = property;
        this.f88813c = deserializedPropertyDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return MemberDeserializer.t(this.f88811a, this.f88812b, this.f88813c);
    }
}
