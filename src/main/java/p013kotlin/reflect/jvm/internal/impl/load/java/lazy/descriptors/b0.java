package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class b0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f87348a;

    public b0(LazyJavaScope lazyJavaScope) {
        this.f87348a = lazyJavaScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaScope.y(this.f87348a);
    }
}
