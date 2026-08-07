package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class b0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.OptimizedImplementation f88756a;

    public b0(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        this.f88756a = optimizedImplementation;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return DeserializedMemberScope.OptimizedImplementation.p(this.f88756a, (Name) obj);
    }
}
