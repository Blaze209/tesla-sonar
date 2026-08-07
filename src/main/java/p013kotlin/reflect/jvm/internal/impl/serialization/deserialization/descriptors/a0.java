package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class a0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedMemberScope.OptimizedImplementation f88754a;

    public a0(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        this.f88754a = optimizedImplementation;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return DeserializedMemberScope.OptimizedImplementation.o(this.f88754a, (Name) obj);
    }
}
