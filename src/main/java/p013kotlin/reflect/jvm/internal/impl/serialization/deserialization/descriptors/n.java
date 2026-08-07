package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f88775a;

    public n(a aVar) {
        this.f88775a = aVar;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedMemberScope.d(this.f88775a);
    }
}
