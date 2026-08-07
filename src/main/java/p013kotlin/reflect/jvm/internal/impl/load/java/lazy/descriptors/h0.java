package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class h0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f87360a;

    public h0(LazyJavaScope lazyJavaScope) {
        this.f87360a = lazyJavaScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaScope.n(this.f87360a);
    }
}
