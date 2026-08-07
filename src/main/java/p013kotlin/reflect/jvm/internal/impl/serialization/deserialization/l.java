package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f88814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Property f88815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeserializedPropertyDescriptor f88816c;

    public l(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f88814a = memberDeserializer;
        this.f88815b = property;
        this.f88816c = deserializedPropertyDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return MemberDeserializer.v(this.f88814a, this.f88815b, this.f88816c);
    }
}
