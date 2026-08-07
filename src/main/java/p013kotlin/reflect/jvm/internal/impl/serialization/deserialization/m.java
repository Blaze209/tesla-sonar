package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeDeserializer f88817a;

    public m(TypeDeserializer typeDeserializer) {
        this.f88817a = typeDeserializer;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return TypeDeserializer.f(this.f88817a, ((Number) obj).intValue());
    }
}
