package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f88766a;

    public g(List list) {
        this.f88766a = list;
    }

    @Override // wn0.a
    public Object invoke() {
        return DeserializedClassDescriptor.DeserializedClassMemberScope.t(this.f88766a);
    }
}
