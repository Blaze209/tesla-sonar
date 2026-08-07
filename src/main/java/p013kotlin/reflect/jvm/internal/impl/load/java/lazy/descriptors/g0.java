package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class g0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f87358a;

    public g0(LazyJavaScope lazyJavaScope) {
        this.f87358a = lazyJavaScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaScope.N(this.f87358a);
    }
}
