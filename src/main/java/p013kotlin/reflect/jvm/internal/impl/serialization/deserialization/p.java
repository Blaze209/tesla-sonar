package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeDeserializer f88821a;

    public p(TypeDeserializer typeDeserializer) {
        this.f88821a = typeDeserializer;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return TypeDeserializer.v(this.f88821a, (ProtoBuf.Type) obj);
    }
}
