package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor.b f88772a;

    public l(DeserializedClassDescriptor.b bVar) {
        this.f88772a = bVar;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedClassDescriptor.b.h(this.f88772a);
    }
}
