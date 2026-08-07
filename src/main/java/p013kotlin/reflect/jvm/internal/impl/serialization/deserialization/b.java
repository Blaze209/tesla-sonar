package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassDeserializer f88666a;

    public b(ClassDeserializer classDeserializer) {
        this.f88666a = classDeserializer;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return ClassDeserializer.b(this.f88666a, (ClassDeserializer.a) obj);
    }
}
