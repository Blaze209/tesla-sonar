package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SubstitutingScope f88545a;

    public g(SubstitutingScope substitutingScope) {
        this.f88545a = substitutingScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return SubstitutingScope.a(this.f88545a);
    }
}
