package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeSubstitutor f88544a;

    public f(TypeSubstitutor typeSubstitutor) {
        this.f88544a = typeSubstitutor;
    }

    @Override // wn0.a
    public Object invoke() {
        return SubstitutingScope.g(this.f88544a);
    }
}
