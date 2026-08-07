package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f88790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f88791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f88792c;

    public e(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f88790a = memberDeserializer;
        this.f88791b = property;
        this.f88792c = deserializedPropertyDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return MemberDeserializer.s(this.f88790a, this.f88791b, this.f88792c);
    }
}
