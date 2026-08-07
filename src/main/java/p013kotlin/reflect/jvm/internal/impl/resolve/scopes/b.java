package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f88540a;

    public b(a aVar) {
        this.f88540a = aVar;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyScopeAdapter.c(this.f88540a);
    }
}
