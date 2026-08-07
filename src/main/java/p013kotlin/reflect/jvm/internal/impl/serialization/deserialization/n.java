package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeDeserializer f88818a;

    public n(TypeDeserializer typeDeserializer) {
        this.f88818a = typeDeserializer;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return TypeDeserializer.r(this.f88818a, ((Number) obj).intValue());
    }
}
