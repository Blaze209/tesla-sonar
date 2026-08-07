package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor.b f88770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeserializedClassDescriptor f88771b;

    public k(DeserializedClassDescriptor.b bVar, DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f88770a = bVar;
        this.f88771b = deserializedClassDescriptor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return DeserializedClassDescriptor.b.f(this.f88770a, this.f88771b, (Name) obj);
    }
}
