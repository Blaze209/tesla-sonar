package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* JADX INFO: loaded from: classes9.dex */
class a implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor f88753a;

    public a(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f88753a = deserializedClassDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedClassDescriptor.s(this.f88753a);
    }
}
