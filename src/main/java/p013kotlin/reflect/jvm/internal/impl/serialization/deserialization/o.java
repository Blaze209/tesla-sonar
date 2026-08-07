package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class o implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeDeserializer f88819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Type f88820b;

    public o(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        this.f88819a = typeDeserializer;
        this.f88820b = type;
    }

    @Override // wn0.a
    public Object invoke() {
        return TypeDeserializer.o(this.f88819a, this.f88820b);
    }
}
