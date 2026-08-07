package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f88793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f88794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f88795c;

    public f(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f88793a = memberDeserializer;
        this.f88794b = property;
        this.f88795c = deserializedPropertyDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return MemberDeserializer.u(this.f88793a, this.f88794b, this.f88795c);
    }
}
